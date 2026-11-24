/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labgrade;

public class Labgradeblueprint {
    private final String studentName;
    private int quizScore;
    private int labScore;

    public Labgradeblueprint(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;
        this.quizScore = isValidScore(quizScore) ? quizScore : 0;
        this.labScore = isValidScore(labScore) ? labScore : 0;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public boolean updateScores(int quizScore, int labScore) {
        if (!isValidScore(quizScore) || !isValidScore(labScore)) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;
        return true;
    }

    public double getFinalGrade() {
        return (this.quizScore * 40 + this.labScore * 60) / 100.0;
    }

    public boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    private static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
}

