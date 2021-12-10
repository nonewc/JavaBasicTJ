package j20211210;

import java.util.HashMap;

public class MapExam {

    public static void main(String[] args) {
        
        // 파이썬의 딕셔너리, JS의 json, pandas의 Series와 같은
        // key 와 value 쌍으로 이루어진 자료형
        // 오직 key값으로 value값을 얻는다. 순서 (index) 의 개념이 없다.

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("people","person");
        map.put("baseball","ball");

        System.out.println(map.get("people"));
        System.out.println(map.size());


    }
    
}
