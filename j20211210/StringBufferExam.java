package j20211210;

public class StringBufferExam {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb.substring(0,4));     



        // // String Buffer - 문자열을 수정/변경할 때 사용

        // StringBuffer sb = new StringBuffer();
        
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("World!!!");

        // String result = sb.toString();
        // System.out.println(result);

        // String result="";

        // result += "hello"; // "" + "hello" 객체 두 개째 생성
        // result += " "; // "" + "hello" + " " 객체 세 개째 생성
        // result += "World!!!"; // "" + "hello" + " " + "World!!!" 객체 네 개째 생성 >> 메모리를 많이 차지함.
        //                       // StringBuffer는 수정의 개념 >> 메모리 덜 차지함. 

        // System.out.println(result);

        // 첫 번째 예제 StringBuffer는 객체가 한 번만 생성된다.
        // 반면, 두 번째 String 예제는 자료형에 + 연산이 사용 될 때 마다
        // 계속 새로운 객체가 추가되어 생성된다. (새로운 객체를 만들어낸다.)

        // String 자료형은 한 번 만들게 되면 수정이 불가능하다. 
        // 그 값 자체를 변경할 수 없다. : immutable 라고 표현.
        // toUpperCase 와 같은 매서드의 경우도 문자열이 변경되는 것 처럼
        // 보일 수는 있지만, 매서드 수행시 또 다른 객체를 생성하여 return하는 것이다.

        // 그렇다면 무조건 StringBuffer()를 사용하는 것이 좋은가!!!
        
        // 상황에 따라 다르다. StringBuffer()는 기본적으로 String보다 무겁다.
        // 기본적인 메모리 사용량도 크고 속도도 느리다.
        // 문자열 추가나 변경이 많을 경우에만 StringBuffer를 사용하고
        // 변경/수정 작업이 거의 없는 경우에는 그냥 String을 사용하자.


    }
    
}
