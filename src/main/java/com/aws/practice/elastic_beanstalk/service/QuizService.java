package com.aws.practice.elastic_beanstalk.service;

import com.aws.practice.elastic_beanstalk.model.Answers;
import com.aws.practice.elastic_beanstalk.model.Question;
import com.aws.practice.elastic_beanstalk.model.Quiz;
import com.aws.practice.elastic_beanstalk.model.QuizType;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QuizService {

    public Quiz getQuizByName(String name) {
        Answers answersA = Answers.builder()
                .name(name)
                .isWrong(true)
                .build();
        Answers answersB = Answers.builder()
                .name("Déployer automatiquement des applications sans gérer l’infrastructure sous-jacente")
                .isWrong(false)
                .build();
        Answers answersC = Answers.builder()
                .name("Fournir un service de base de données entièrement géré")
                .isWrong(true)
                .build();
        Answers answersD = Answers.builder()
                .name("Héberger uniquement des applications conteneurisées")
                .isWrong(true)
                .build();

        List<Answers> answers = Arrays.asList(answersA,answersB,answersC,answersD);

        Question question = Question.builder()
                .name("Quel est le principal avantage d’utiliser AWS Elastic Beanstalk ?")
                .questionNumber(1)
                .answers(answers)
                .build();

        List<Question> questions = Collections.singletonList(question);

        return Quiz.builder()
                .name("Aws developper associate certification")
                .theme("")
                .duration(Duration.ofSeconds(30))
                .questions(questions)
                .quizType(QuizType.CERTIFICATION)
                .points(2)
                .build();
    }
}
