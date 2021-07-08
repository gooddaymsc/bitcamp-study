package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App_a {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);

    final int MAX_LENGTH = 1000;

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registerdDate = new Date[MAX_LENGTH];

    int size = 0;

    final int PMAX_LENGTH = 100;

    int[] pno = new int[PMAX_LENGTH];
    String[] ptitle = new String[PMAX_LENGTH];
    String[] pcontent = new String[PMAX_LENGTH];
    Date[] pstartDate = new Date[PMAX_LENGTH];
    Date[] pendDate = new Date[PMAX_LENGTH];
    String[] powner = new String[PMAX_LENGTH];
    String[] pmembers = new String[PMAX_LENGTH];

    int psize = 0;

    final int TMAX_LENGTH = 100;

    int[] tno = new int[TMAX_LENGTH];
    String[] tcontent = new String[TMAX_LENGTH];
    Date[] tdeadline = new Date[TMAX_LENGTH];
    int[] tstatus = new int[TMAX_LENGTH];
    String[] towner = new String[TMAX_LENGTH];

    int tsize = 0;


    loop:
      while (true) {
        System.out.print("명령> ");
        String command = keyboardScan.nextLine();

        switch (command) {
          case "/member/add":
            System.out.println("[회원 등록]");

            System.out.print("번호? ");
            no[size] = Integer.parseInt(keyboardScan.nextLine());

            System.out.print("이름? ");
            name[size] = keyboardScan.nextLine();

            System.out.print("이메일? ");
            email[size] = keyboardScan.nextLine();

            System.out.print("암호? ");
            password[size] = keyboardScan.nextLine();

            System.out.print("사진? ");
            photo[size] = keyboardScan.nextLine();

            System.out.print("전화? ");
            tel[size] = keyboardScan.nextLine();

            registerdDate[size] = new Date(System.currentTimeMillis());

            size++;
            break;

          case "/member/list":
            System.out.println("[회원 목록]");
            for (int i = 0; i < size; i++) {
              System.out.printf("%d, %s, %s, %s, %s\n", 
                  no[i], name[i], email[i], tel[i], registerdDate[i]);
            }
            break;

          case "/project/add":
            System.out.println("[프로젝트 등록]");

            System.out.print("번호? ");
            pno[psize] = Integer.valueOf(keyboardScan.nextLine());

            System.out.print("프로젝트명? ");
            ptitle[psize] = keyboardScan.nextLine();

            System.out.print("내용? ");
            pcontent[psize] = keyboardScan.nextLine();

            System.out.print("시작일? ");
            pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

            System.out.print("종료일? ");
            pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

            System.out.print("만든이? ");
            powner[psize] = keyboardScan.nextLine();

            System.out.print("팀원? ");
            pmembers[psize] = keyboardScan.nextLine();

            psize++;
            break;

          case "/project/list":
            System.out.println("[프로젝트 목록]");

            for (int i = 0; i < psize; i++) {
              System.out.printf("%d, %s, %s, %s, %s\n", 
                  pno[i], ptitle[i], pstartDate[i], pendDate[i], pmembers[i]);
            }
            break;

          case "/task/add":
            System.out.println("[작업 등록]");

            System.out.print("번호? ");
            tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

            System.out.print("내용? ");
            tcontent[tsize] = keyboardScan.nextLine();

            System.out.print("마감일? ");
            tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

            System.out.println("상태?");
            System.out.println("0: 신규");
            System.out.println("1: 진행중");
            System.out.println("2: 완료");
            System.out.print("> ");
            tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

            System.out.print("담당자? ");
            towner[tsize] = keyboardScan.nextLine();

            tsize++;
            break;

          case "/task/list":
            System.out.println("[작업 목록]");

            for (int i = 0; i < tsize; i++) {

              String stateLabel = null;
              switch (tstatus[i]) {
                case 1:
                  stateLabel = "진행중";
                  break;
                case 2:
                  stateLabel = "완료";
                  break;
                default:
                  stateLabel = "신규";
              }
              System.out.printf("%s, %s, %s, %s, %s\n", 
                  tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
            }
            break;

          case "exit":
          case "quit":
            System.out.println("안녕!");
            break loop;

          default:
            System.out.println("실행할 수 없는 명력입니다.");
        }
        System.out.println();
      }

    keyboardScan.close();
  }
}