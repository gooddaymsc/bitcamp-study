package com.eomcs.pms.dao;

import java.util.List;
import com.eomcs.pms.domain.Board;

public interface BoardDao {
  void insert(Board board) throws Exception;
  List<Board> findAll() throws Exception;
  List<Board> findByKeyword(String keyword) throws Exception;
  Board findByNo(int no) throws Exception;
  void update(Board board) throws Exception;
  void delete(int no) throws Exception;
}
