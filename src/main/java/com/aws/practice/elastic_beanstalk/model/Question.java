package com.aws.practice.elastic_beanstalk.model;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private String name;
    private int questionNumber;
    List<Answers> answers;
}
