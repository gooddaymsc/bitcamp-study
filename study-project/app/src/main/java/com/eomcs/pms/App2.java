package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

//1) 회원 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addMember() 메서드 정의 및 회원 등록 코드를 가져오기
//   => main()과 addMember()가 서로 공유하는 변수는 클래스 변수로 만든다.
//2) 입력된 회원 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listMembers() 메서드 정의 및 관련된 코드를 가져오기

//3) 프로젝트 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addProject() 메서드 정의 및 관련 코드를 가져오기
//   => main()과 addProject()가 서로 공유하는 변수는 클래스 변수로 만든다.
//4) 입력된 프로젝트 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listProjects() 메서드 정의 및 관련된 코드를 가져오기

//5) 작업 데이터를 입력 받는 코드를 별도의 메서드로 분리한다.
//   => addTask() 메서드 정의 및 관련 코드를 가져오기
//   => main()과 addTask()가 서로 공유하는 변수는 클래스 변수로 만든다.
//6) 입력된 작업 데이터의 목록을 출력하는 코드를 별도의 메서드로 분리한다.
//   => listTasks() 메서드 정의 및 관련된 코드를 가져오기

//7) 사용자로부터 명령어를 입력 받는 코드를 별도의 메서드로 분리한다.
//  => prompt() 메서드를 정의하고 관련된 코드를 가져오기\
//8) 명령어 뿐만 아니라 사용자로부터 입력을 받는 기능을 모두 prompt()를 사용하여 처리한다.
//   => prompt()를 호출할 때 사용자에게 출력할 프롬프트 메시지를 아규먼트로 넘긴다.
//   => prompt()는 호출할 때 넘어온 프롬프트 메시지 값을 파라미터로 받는다.
//9) prompt() 가 작업한 결과를 클래스 변수에 담지 말고 호출자에게 리턴한다.
//   => prompt()를 실행한 후 사용자가 입력한 문자열을 리턴한다.
//10) prompt()의 기능을 더 세분화한다.
//   => promptString() : 사용자로부터 문자열을 입력 받아 리턴한다.
//   => promptInt() : 사용자로부터 숫자를 입력 받아 리턴한다.
//   => promptDate() : 사용자로부터 날짜를 입력 받아 리턴한다.

//11) promtString(), promptInt(), promptDate() 메서드의 코드를 정리한다.

public class App2 {

  static Scanner keyboardScan = new Scanner(System.in);

  // 회원 데이터
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];

  static int size = 0;

  // 프로젝트 데이터
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];

  static int psize = 0;

  // 작업 데이터
  static final int TLENGTH = 100;

  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tdeadline = new Date[TLENGTH];
  static String[] towner = new String[TLENGTH];
  static int[] tstatus = new int[TLENGTH];

  static int tsize = 0;

  public static void main(String[] args) {

    loop:
      while (true) {
        String input = promptString("명령> ");

        switch (input) {
          case "/member/add":
            addMember();
            break;
          case "/member/list":
            listMembers();
            break;
          case "/project/add":
            addProject();
            break;
          case "/project/list":
            listProjects();
            break;
          case "/task/add":
            addTask();
            break;
          case "/task/list":
            listTasks();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    keyboardScan.close();
  }

  static void addMember() {
    System.out.println("[회원 등록]");

    no[size] = promptInt("번호? ");

    name[size] = promptString("이름? ");

    email[size] = promptString("이메일? ");

    password[size] = promptString("암호? ");

    photo[size] = promptString("사진? ");

    tel[size] = promptString("전화? ");

    registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

    size++;
  }

  static void listMembers() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pno[psize] = Integer.valueOf(promptInt("번호? "));

    ptitle[psize] = promptString("프로젝트명? ");

    pcontent[psize] = promptString("내용? ");

    pstartDate[psize] = promptDate("시작일? ");

    pendDate[psize] = promptDate("종료일? ");

    powner[psize] = promptString("만든이? ");

    pmembers[psize] = promptString("팀원? ");

    psize++;
  }

  static void listProjects() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    tno[tsize] = promptInt("번호? ");

    tcontent[tsize] = promptString("내용? ");

    tdeadline[tsize] = promptDate("마감일? ");

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstatus[tsize] = promptInt("> ");

    promptString("담당자? ");
    towner[tsize] = promptString("담당자? ");

    tsize++;
  }

  static void listTasks() {
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
  }

  static String promptString(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }

}
