package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

//1) 변경 준비
//2) 사용자에게 명령 프롬프트 출력
//3) 사용자의 명령을 입력받아 출력
//4) 명령어 입력 받아 출력하는 것을 무한 반복
//5) exit나 quit 명령을 입력하면 반복 실행 중지
//6) /member/add와 /member/list 생성
//7) /member/add 명령처리
//8) /member/list 명령처리
//9) /project/add 명령처리
//10) /project/list 명령처리
//11) /project/add 명령처리
//12) /project/list 명령처리
public class App {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);


    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];
    int size = 0;

    final int PLENGTH = 100;

    int[] pno = new int[PLENGTH];
    String[] ptitle = new String[PLENGTH];
    String[] pcontent = new String[PLENGTH];
    Date[] pstartDate = new Date[PLENGTH];
    Date[] pendDate = new Date[PLENGTH];
    String[] powner = new String[PLENGTH];
    String[] pmembers = new String[PLENGTH];

    int psize = 0;

    final int TLENGTH = 100;

    int[] tno = new int[TLENGTH];
    String[] tcontent = new String[TLENGTH];
    Date[] tdeadline = new Date[TLENGTH];
    String[] towner = new String[TLENGTH];
    int[] tstatus = new int[TLENGTH];

    int tsize = 0;

    while (true) {
      System.out.print("명령> ");
      String input = keyboardScan.nextLine();
      System.out.println(input);

      if(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
        System.out.println("안녕!");
        break;
      } 
      else if (input.equals("/member/add")) {
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

        registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

        size++;

      } 
      else if (input.equals("/member/list")) {
        System.out.println("[회원 목록]");
        for (int i = 0; i < size; i++) {
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              no[i], name[i], email[i], tel[i], registeredDate[i]);
        }
      } 
      else if (input.equals("/project/add")) {
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
        System.out.println();

      } 
      else if (input.equals("/project/list")) {
        System.out.println("[프로젝트 목록]");
        for (int i = 0; i < psize; i++) {
          // 번호, 프로젝트명, 시작일, 종료일, 만든이
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              pno[psize], ptitle[psize], pstartDate[psize], pendDate[psize], powner[psize]);
        }
      }
      else if(input.equals("/task/add")) {
        System.out.println("[작업 등록]");
        System.out.print("번호? ");
        no[tsize] = Integer.parseInt(keyboardScan.nextLine());

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
        System.out.println(); // 빈 줄 출력

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        String str = keyboardScan.nextLine();
        if (!str.equalsIgnoreCase("y")) {
          break;
        }
        System.out.println(); // 빈 줄 출력
      }
      else if (input.equals("/task/list")) {
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
          // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
        }
        break;
      }
      else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }
    keyboardScan.close();
  }
}



