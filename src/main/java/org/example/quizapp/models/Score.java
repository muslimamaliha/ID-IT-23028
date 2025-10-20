package org.example.quizapp.models;

import java.time.LocalDateTime;

public class Score {
    private int id;
    private String name;
    private String email;
    private int q1Score;
    private int q2Score;
    private int q3Score;
    private int q4Score;
    private int q5Score;
    private int totalScore;
    private LocalDateTime createdAt;

    // Constructors
    public Score() {}

    public Score(String name, String email, int q1Score, int q2Score, int q3Score,
                 int q4Score, int q5Score, int totalScore) {
        this.name = name;
        this.email = email;
        this.q1Score = q1Score;
        this.q2Score = q2Score;
        this.q3Score = q3Score;
        this.q4Score = q4Score;
        this.q5Score = q5Score;
        this.totalScore = totalScore;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getQ1Score() { return q1Score; }
    public void setQ1Score(int q1Score) { this.q1Score = q1Score; }

    public int getQ2Score() { return q2Score; }
    public void setQ2Score(int q2Score) { this.q2Score = q2Score; }

    public int getQ3Score() { return q3Score; }
    public void setQ3Score(int q3Score) { this.q3Score = q3Score; }

    public int getQ4Score() { return q4Score; }
    public void setQ4Score(int q4Score) { this.q4Score = q4Score; }

    public int getQ5Score() { return q5Score; }
    public void setQ5Score(int q5Score) { this.q5Score = q5Score; }

    public int getTotalScore() { return totalScore; }
    public void setTotalScore(int totalScore) { this.totalScore = totalScore; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}