package org.example.quizapp;

import org.example.quizapp.models.Score;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    // Save score to database
    public static boolean saveScore(Score score) {
        String sql = "INSERT INTO quiz_scores (name, email, q1_score, q2_score, q3_score, q4_score, q5_score, total_score) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, score.getName());
            pstmt.setString(2, score.getEmail());
            pstmt.setInt(3, score.getQ1Score());
            pstmt.setInt(4, score.getQ2Score());
            pstmt.setInt(5, score.getQ3Score());
            pstmt.setInt(6, score.getQ4Score());
            pstmt.setInt(7, score.getQ5Score());
            pstmt.setInt(8, score.getTotalScore());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get all scores from database
    public static List<Score> getAllScores() {
        List<Score> scores = new ArrayList<>();
        String sql = "SELECT * FROM quiz_scores ORDER BY total_score DESC, created_at DESC";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Score score = new Score();
                score.setId(rs.getInt("id"));
                score.setName(rs.getString("name"));
                score.setEmail(rs.getString("email"));
                score.setQ1Score(rs.getInt("q1_score"));
                score.setQ2Score(rs.getInt("q2_score"));
                score.setQ3Score(rs.getInt("q3_score"));
                score.setQ4Score(rs.getInt("q4_score"));
                score.setQ5Score(rs.getInt("q5_score"));
                score.setTotalScore(rs.getInt("total_score"));
                score.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());

                scores.add(score);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return scores;
    }
}