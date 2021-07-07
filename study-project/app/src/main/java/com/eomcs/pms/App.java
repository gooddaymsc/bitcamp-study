package com.eomcs.pms;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    

    System.out.println("[회원]");

    System.out.print("번호 : ");
    int no = scan.nextInt();
    System.out.print(scan.nextLine());

    System.out.print("이름 : ");
    String name = scan.nextLine();

    System.out.print("이메일 : ");
    String email = scan.nextLine();

    System.out.print("암호 : ");
    String password = scan.nextLine();

    System.out.print("사진 : ");
    String photo = scan.nextLine();

    System.out.print("전화 : ");
    String tel = scan.nextLine();

    System.out.print("가입일 : ");
    java.sql.Date resisterdDate = new java.sql.Date(System.currentTimeMillis());

    scan.close();

    System.out.println("--------------------------");

    System.out.printf("번호 : %d\n", no);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("이메일 %s\n: ", email);
    System.out.printf("암호 : %s\n", password);
    System.out.printf("사진 : %s\n", photo);
    System.out.printf("전화 : %s\n", tel);
    System.out.printf("가입일 : %s\n", resisterdDate);


  }
}