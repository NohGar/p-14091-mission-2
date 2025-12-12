package com.back.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    //제목으로 찾기
    Question findBySubject(String subject);

    //제목 & 내용으로 찾기
    Question findBySubjectAndContent(String subject, String content);

    //특정 문자열로 찾기
    List<Question> findBySubjectLike(String subject);
}
