package pkg01_branch;

public class Class01_if {

  public static void method1() {
    
    /*
     * if
     * 1. 조건식을 만족하는 경우에만 실행한다.
     * 2. 실행문은 중괄호 {}로 묶는다.
     * 3. 실행문이 하나인 경우 {}는 생략할 수 있다.
     */
    
    int n = 6;
    
    //n의 배수 : n으로 나눈 나머지가 0인 수
    
    if(n % 3 == 0) {
      System.out.println("3의 배수");
    }
    
    if(n % 3 != 0) {
      System.out.println("3의 배수 아님");
    }
  }
  
  public static void method2() {

    
    /*
     * else if
     * 1. if 이후에 추가 가능한 선택 구문이다.
     * 2. if로 처리하지 못한 대상들에 새로운 조건식을 지정할 수 있다.
     * 3. 원하는 만큼 계속 추가할 수 있다.
     */
    
    int age = 6;
    
    if(age <= 7) {
      System.out.println("미취학아동");
    } else if(age <= 13) {
      System.out.println("초등학생");
    } else if(age <= 16) {
      System.out.println("중학생");
    } else if(age <= 19) {
      System.out.println("고등학생");
    }
    
  }
  
  public static void method3() {
    
    /*
     * else
     * 1. if 또는 else if 이후 마지막에 한 번 나타날 수 있는 선택 구문이다.
     * 2. 지금까지 작성된 모든 조건식을 만족하지 않는 경우를 의미한다.
     * 3. 조건식을 작성하지 않는다.
     */
    
    int age = 130;
    
    if(age < 0 || age > 120) {
      System.out.println("잘못된 나이");
    } else {
      if(age <= 7) {
        System.out.println("미취학아동");
      } else if(age <= 13) {
        System.out.println("초등학생");
      } else if(age <= 16) {
        System.out.println("중학생");
      } else if(age <= 19) {
        System.out.println("고등학생");
      } else {
        System.out.println("성인");
      }
    }
    
    
    
  }
  
  public static void method4() {

   
    // 월에 따른 계절 출력하기
    int month = 10;
    String season;
    
    int mod = month % 12;
    
    if(mod <= 2) {
      season = "겨울";
    } else if(mod <= 5) {
      season = "봄";
    } else if(mod <= 8) {
      season = "여름";
    } else {
      season = "가을";
    }
    System.out.println(season);
  }
  
  public static void method5() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 70;  // 점수
    int grade = 5;   // 학년
    
    // 합격 점수
    int pass = 0;
    if(grade >= 1 && grade <= 3) {
      pass = 60;
    }else if(grade >= 4 && grade <= 6) {
      pass = 70;
    }
    
    // 합격/불합격
    String result = null;
    if(score >= pass) {
      result = "합격";
    } else {
      result = "불합격";
    }
    System.out.println(result);
    
  
  }
  
  public static void method6() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    // day의 nDay일 후 
    day += nDay;
    
    // day를 7로 나눈 나머지
    int mod = day % 7;
    if(mod == 0) 
      weekName = "일";
    else if(mod == 1)
      weekName = "월";
    else if(mod == 2)
      weekName = "화";
    else if(mod == 3)
      weekName = "수";
    else if(mod == 4)
      weekName = "목";
    else if(mod == 5)
      weekName = "금";
    else 
      weekName = "토";
    
    System.out.println(weekName);
   
  }
  
  
  public static void main(String[] args) {
    method6();

  }

}
