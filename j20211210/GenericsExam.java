package j20211210;

import java.util.ArrayList;

public class GenericsExam {

    public static void main(String[] args) {
  
       //제네릭스는 입력되는 자료형을 강제한다.
       
       ArrayList<String> alist = new ArrayList<String>();

       alist.add("Hello");
       //alist.add(22222);
       alist.add("22222");

       //제네릭스를 선언하면 형변환과 같은 불필요한 코딩과 잘못된 형변환
       // 등의 오류를 사전에 방지 할 수 있다.

    }
    
}
