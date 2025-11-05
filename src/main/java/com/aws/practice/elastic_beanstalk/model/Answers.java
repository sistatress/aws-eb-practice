package com.aws.practice.elastic_beanstalk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Answers {
    private String name;
    private boolean isWrong;
}
