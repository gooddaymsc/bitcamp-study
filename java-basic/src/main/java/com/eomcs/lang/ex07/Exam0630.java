package com.eomcs.lang.ex07;

// # JVM 아규먼트 응용 II
//
public class Exam0630 {

  public static void main(String[] 변수명은상관없다) {
    // JVM에 기본으로 설정되어 있는 프로퍼티를 모두 출력하라!
    //
    // JVM의 전체 프로퍼티 목록 가져오기
    java.util.Properties props = System.getProperties();

    // 1) Properties 객체에 저장되어 있는 값의 이름(key)을 알아낸다.
    java.util.Set keySet = props.keySet();

    // 이름 목록에서 한 개의 이름을 가져와서 그 이름으로 저장된 값을 꺼낸다.
    // => 이름 목록에서 ~~~~

    for (Object key : keySet) {
      String value = System.getProperty((String) key);
      System.out.printf("%s = %s\n", key, value);
    }
  }
}


