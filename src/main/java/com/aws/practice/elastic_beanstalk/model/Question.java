package com.aws.practice.elastic_beanstalk.model;

import java.util.List;

public class Question {
    private String name;
    List<Answers> answers;

    public Question() {
    }

    public Question(String name, List<Answers> answers) {
        this.name = name;
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}
