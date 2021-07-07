package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    System.out.printf("[%s]\n", "작업");

    Scanner scan = new Scanner(System.in);

    System.out.print("프로젝트? ");
    String project = scan.nextLine();

    System.out.print("번호? ");
    int no = Integer.parseInt(scan.nextLine());

    System.out.print("내용? ");
    String content = scan.nextLine();

    System.out.print("완료일? ");
    Date deadline = Date.valueOf(scan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("위 번호를 선택하시오 : ");
    int status = Integer.valueOf(scan.nextLine());

    System.out.print("담당자: ");
    String owner = scan.nextLine();

    scan.close();

    System.out.println("---------------------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", deadline);

    switch (status) {
      case 1:
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태: 완료");
        break;
      default:
        System.out.println("상태: 신규");
    }

    System.out.printf("담당자: %s\n", owner);
  }
}