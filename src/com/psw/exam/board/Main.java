package com.psw.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c = 0;

    while(true){
      c++;
      System.out.printf("명령)");
      String cmd = sc.nextLine();
      if(cmd.equals("/user/article/write")){
        System.out.printf("title)");
        cmd = sc.nextLine();
        System.out.printf("내용)");
        cmd = sc.nextLine();
        System.out.printf("%d번 게시물이 등록 되었습니다.\n", c);
      }
    }

    //sc.close();
  }
}