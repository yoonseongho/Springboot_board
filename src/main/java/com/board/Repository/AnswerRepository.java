package com.board.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.Entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}