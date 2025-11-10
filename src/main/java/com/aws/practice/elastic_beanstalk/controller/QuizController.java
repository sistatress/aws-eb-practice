package com.aws.practice.elastic_beanstalk.controller;

import com.aws.practice.elastic_beanstalk.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/quiz/{name}")
    public String getQuiz(@PathVariable String name){
        return quizService.getQuizByName(name).getName();
    }
}
