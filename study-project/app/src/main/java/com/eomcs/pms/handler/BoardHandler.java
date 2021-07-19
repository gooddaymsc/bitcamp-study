package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int MAX_LENGTH = 5;

  Board[] boards =  new Board[MAX_LENGTH];
  int size = 0;

  public static void add(BoardHandler that) {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("이름? ");
    board.content = Prompt.inputString("이메일? ");
    board.writer = Prompt.inputString("암호? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    that.boards[that.size++] = board;
  }

  public static void list(BoardHandler that) {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < that.size; i++) {
      System.out.printf("%d, %s, %s, %s, %d\n", 
          that.boards[i].no, 
          that.boards[i].title, 
          that.boards[i].writer,
          that.boards[i].registeredDate,
          that.boards[i].viewCount);
    }
  }
}
