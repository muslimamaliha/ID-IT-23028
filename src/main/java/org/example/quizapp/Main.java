package org.example.quizapp;

import org.example.quizapp.controllers.QuizController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        showLoginScene();
        primaryStage.setTitle("বাংলা কুইজ গেম");
        primaryStage.show();
    }

    public static void showLoginScene() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/org/example/quizapp/views/login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showQuizScene(String name, String email) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/org/example/quizapp/views/quiz.fxml"));
            Parent root = loader.load();

            QuizController controller = loader.getController();
            controller.initializeWithUser(name, email);

            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showScoresScene() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/org/example/quizapp/views/scores.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}