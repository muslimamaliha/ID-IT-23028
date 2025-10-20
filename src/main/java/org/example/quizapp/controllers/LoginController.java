package org.example.quizapp.controllers;

import org.example.quizapp.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private Button startButton;
    @FXML private Button viewScoresButton;

    @FXML
    private void initialize() {
        // Initialization code if needed
    }

    @FXML
    private void handleStartQuiz() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();

        if (name.isEmpty() || email.isEmpty()) {
            showAlert("ত্রুটি", "দয়া করে নাম এবং ইমেইল ঠিকানা লিখুন");
            return;
        }

        if (!isValidEmail(email)) {
            showAlert("ত্রুটি", "দয়া করে সঠিক ইমেইল ঠিকানা লিখুন");
            return;
        }

        // Pass user data to quiz scene
        Main.showQuizScene(name, email);
    }

    @FXML
    private void handleViewScores() {
        Main.showScoresScene();
    }

    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}