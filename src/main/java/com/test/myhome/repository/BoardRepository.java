package com.test.myhome.repository;

import com.test.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository  extends JpaRepository<Board, Long> {

}
