package j20211210;

public class TernaryExam {

    public static void main(String[] args) {
        
        int b1 = ( 5 > 4 ) ? 50 : 40;

        System.out.println(b1);



        // * Variable 
        // 1) global variable; 전역변수
        // 코드 전체에 영향을 미치기 때문에 예상치 못한 오류 발생 가능

        int b2 = 0;

        if ( 5 > 4 ) {
            b2 = 50;
        } else {
            b2 = 40;
        }

        System.out.println(b2);


        // 2) local variable; 지역변수
        // 추천

        if ( 5 > 4 ) {
            int c = 50;
        } else {
            int c = 40;
        }

        // System.out.println(c); 
        // c가 지역(if)변수라 인식 X
        // 매서드를 따로 만들어서 return만 가지고 나오도록 짜는 게 good

    }
    
}
