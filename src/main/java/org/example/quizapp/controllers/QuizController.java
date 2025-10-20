package org.example.quizapp.controllers;

import org.example.quizapp.Main;
import org.example.quizapp.DatabaseService;
import org.example.quizapp.models.Score;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class QuizController {

    @FXML private Label questionLabel;
    @FXML private VBox optionsContainer;
    @FXML private Button nextButton;
    @FXML private Label scoreLabel;

    private ToggleGroup optionsGroup;
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int[] scores = new int[5];
    private String userName;
    private String userEmail;

    private class Question {
        String questionText;
        String[] options;
        int correctAnswerIndex;

        Question(String questionText, String[] options, int correctAnswerIndex) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }
    }

    public void initializeWithUser(String name, String email) {
        this.userName = name;
        this.userEmail = email;
        initializeQuestions();
        loadQuestion();
    }

    private void initializeQuestions() {
        questions = new ArrayList<>();

        // Question 1
        questions.add(new Question(
                "বাংলাদেশের রাজধানীর নাম কি?",
                new String[]{"চট্টগ্রাম", "ঢাকা", "রাজশাহী", "খুলনা"},
                1
        ));

        // Question 2
        questions.add(new Question(
                "বাংলাদেশের জাতীয় ফুল কি?",
                new String[]{"গোলাপ", "শাপলা", "বেলি", "চন্দ্রমল্লিকা"},
                1
        ));

        // Question 3
        questions.add(new Question(
                "বাংলাদেশের মুক্তিযুদ্ধ কত সালে হয়েছিল?",
                new String[]{"১৯৭০", "১৯৭১", "১৯৭২", "১৯৬৯"},
                1
        ));

        // Question 4
        questions.add(new Question(
                "সুন্দরবন কোথায় অবস্থিত?",
                new String[]{"ভারত", "বাংলাদেশ", "উভয় দেশে", "মায়ানমার"},
                2
        ));

        // Question 5
        questions.add(new Question(
                "বাংলাদেশের জাতীয় পশু কি?",
                new String[]{"হাতি", "বাঘ", "ময়ূর", "রয়েল বেঙ্গল টাইগার"},
                3
        ));
    }

    private void loadQuestion() {
        if (currentQuestionIndex >= questions.size()) {
            endQuiz();
            return;
        }

        Question currentQuestion = questions.get(currentQuestionIndex);
        questionLabel.setText("প্রশ্ন " + (currentQuestionIndex + 1) + ": " + currentQuestion.questionText);

        optionsContainer.getChildren().clear();
        optionsGroup = new ToggleGroup();

        for (int i = 0; i < currentQuestion.options.length; i++) {
            RadioButton radioButton = new RadioButton(currentQuestion.options[i]);
            radioButton.setToggleGroup(optionsGroup);
            radioButton.setUserData(i);
            radioButton.setStyle("-fx-font-size: 14;");
            optionsContainer.getChildren().add(radioButton);
        }

        if (currentQuestionIndex == questions.size() - 1) {
            nextButton.setText("সমাপ্ত করুন");
        }
    }

    @FXML
    private void handleNextQuestion() {
        if (optionsGroup.getSelectedToggle() == null) {
            showAlert("সতর্কতা", "দয়া করে একটি উত্তর নির্বাচন করুন");
            return;
        }

        int selectedAnswer = (int) optionsGroup.getSelectedToggle().getUserData();
        Question currentQuestion = questions.get(currentQuestionIndex);

        // Score calculation (2 points per correct answer)
        if (selectedAnswer == currentQuestion.correctAnswerIndex) {
            scores[currentQuestionIndex] = 2;
        } else {
            scores[currentQuestionIndex] = 0;
        }

        currentQuestionIndex++;

        if (currentQuestionIndex < questions.size()) {
            loadQuestion();
            updateScoreDisplay();
        } else {
            endQuiz();
        }
    }

    private void updateScoreDisplay() {
        int currentTotal = 0;
        for (int i = 0; i < currentQuestionIndex; i++) {
            currentTotal += scores[i];
        }
        scoreLabel.setText("বর্তমান স্কোর: " + currentTotal);
    }

    private void endQuiz() {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        // Save to database
        Score score = new Score(userName, userEmail, scores[0], scores[1],
                scores[2], scores[3], scores[4], totalScore);

        boolean saved = DatabaseService.saveScore(score);

        // Show result
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("কুইজ সমাপ্ত");
        alert.setHeaderText("অভিনন্দন! কুইজ সম্পন্ন হয়েছে");
        alert.setContentText("আপনার মোট স্কোর: " + totalScore + "/10\n" +
                (saved ? "স্কোর সংরক্ষণ করা হয়েছে!" : "স্কোর সংরক্ষণে সমস্যা!"));
        alert.showAndWait();

        // Return to login
        Main.showLoginScene();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}