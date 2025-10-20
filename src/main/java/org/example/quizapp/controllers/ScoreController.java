package org.example.quizapp.controllers;

import org.example.quizapp.Main;
import org.example.quizapp.DatabaseService;
import org.example.quizapp.models.Score;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;

public class ScoreController {

    @FXML private VBox scoresContainer;

    @FXML
    private void initialize() {
        loadScores();
    }

    private void loadScores() {
        List<Score> scores = DatabaseService.getAllScores();
        scoresContainer.getChildren().clear();

        if (scores.isEmpty()) {
            Label noScoresLabel = new Label("কোন স্কোর পাওয়া যায়নি");
            noScoresLabel.setStyle("-fx-font-size: 14; -fx-text-fill: #7f8c8d;");
            scoresContainer.getChildren().add(noScoresLabel);
            return;
        }

        for (int i = 0; i < scores.size(); i++) {
            Score score = scores.get(i);
            Label scoreLabel = new Label(
                    (i + 1) + ". " + score.getName() + " - " + score.getTotalScore() + "/10\n" +
                            "ইমেইল: " + score.getEmail() + " | তারিখ: " + score.getCreatedAt().toLocalDate()
            );

            scoreLabel.setStyle("-fx-font-size: 12; -fx-padding: 5; -fx-background-color: #ecf0f1; -fx-background-radius: 5;");
            scoreLabel.setWrapText(true);

            scoresContainer.getChildren().add(scoreLabel);
        }
    }

    @FXML
    private void handleBackToLogin() {
        Main.showLoginScene();
    }
}