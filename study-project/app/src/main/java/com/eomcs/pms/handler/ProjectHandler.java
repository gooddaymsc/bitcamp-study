package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  static final int LENGTH = 1000;

  static Project projects[] = new Project[LENGTH];
  static int size = 0;

  public static void add() {

    Project project = new Project();

    System.out.println("[프로젝트 등록]");

    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");
    project.owner = Prompt.inputString("만든이? ");
    project.members = Prompt.inputString("팀원? ");

    projects[size++] = project;
  }

  public static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          projects[i].no,
          projects[i].title,
          projects[i].startDate,
          projects[i].endDate,
          projects[i].owner);
    }
  }
}
