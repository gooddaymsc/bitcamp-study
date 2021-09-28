package com.eomcs.pms.listener;

import java.sql.Date;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

public class AppInitListener implements ApplicationContextListener{
  @Override
  public void contextInitialized(Map<String,Object> params) {
    System.out.println("************************************");   
    System.out.println("* 미니 프로젝트 관리시스템 ver 1.0 *");
    System.out.println("*       (C)Copyright BitCamp       *");
    System.out.println("************************************");  
  }

  @Override
  public void contextDestroyed(Map<String,Object> params) {
    System.out.println("*********************************");   
    System.out.println("* 미니 프로젝트 관리시스템 종료 *");
    System.out.printf("*  마지막 실행일 : %s   *\n", new Date(System.currentTimeMillis()));
    System.out.println("*********************************"); 
  }
}
