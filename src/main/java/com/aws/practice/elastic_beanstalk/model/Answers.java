package com.aws.practice.elastic_beanstalk.model;

public class Answers {
    private String name;
    private boolean isWrong;

    public Answers() {
    }

    public Answers(String name, boolean isWrong) {
        this.name = name;
        this.isWrong = isWrong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWrong() {
        return isWrong;
    }

    public void setWrong(boolean wrong) {
        isWrong = wrong;
    }
}
