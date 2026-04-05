import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {
        
        // map
        // 키 - 값 쌍을 요소로 가지는 데이터의 모음. 순서구분 X
        // 키는 중복 불가, 값은 중복 허용
        // HashMap

        HashMap map = new HashMap();
        map.put("ages", 30);
        map.put("MBTI", "ISTJ");

        System.out.println(map.get("ages"));
    }    
}
