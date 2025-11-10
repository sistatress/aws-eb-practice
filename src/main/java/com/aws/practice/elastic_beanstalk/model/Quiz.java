package com.aws.practice.elastic_beanstalk.model;

import lombok.Builder;
import lombok.Data;

import java.time.Duration;
import java.util.List;

@Builder
@Data
public class Quiz {
    private String name;
    private String theme;
    private Duration duration;
    private List<Question> questions;
    private QuizType quizType;
    private int points;
}