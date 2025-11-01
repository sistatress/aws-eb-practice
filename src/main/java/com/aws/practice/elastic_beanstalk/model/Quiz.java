package com.aws.practice.elastic_beanstalk.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class Quiz {
    private String name;
    private String theme;
    private Date duration;
    private List<Question> questions;
    private QuizType quizType;
    private int points;
}