package com.aws.practice.elastic_beanstalk.model;

import java.util.Date;
import java.util.List;

public class Quiz {
    private String name;
    private String theme;
    private Date duration;
    private List<Question> questions;
    private QuizType quizType;
    private int points;

    public Quiz() {
    }

    public Quiz(String name, String theme, Date duration, List<Question> questions, QuizType quizType, int points) {
        this.name = name;
        this.theme = theme;
        this.duration = duration;
        this.questions = questions;
        this.quizType = quizType;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public QuizType getQuizType() {
        return quizType;
    }

    public void setQuizType(QuizType quizType) {
        this.quizType = quizType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}