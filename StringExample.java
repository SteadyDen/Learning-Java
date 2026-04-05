public class StringExample {
    public static void main(String[] args) {
        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

        String str = "안녕하세요!"; // 문자열 리터럴
        String str_2 = new String("안녕하세요!"); // 생성자
        String str_3 = "안녕하세요!";

        if(str == str_2) {
            System.out.println("str == str_2");
        }

        // 생성자의 경우 기존에 존재하는 값인지는 상관 없이 힙 메모리에
        // 새로운 공간을 할당하기에 주소값이 다를수밖에 없음

        if (str == str_3) {
            System.out.println("str == str_3");
        }
        
        // 문자열 리터럴은 기존에 존재하는 값인지 확인하고 만약 존재한다면 그 기존의 할당된 메모리 공간의
        // 주소값을 똑같이 가지게 됨.
        
        if (str.equals(str_2)) {
            System.out.println("str.equals(str_2)");
        }

        // 메소드 .equals()를 사용한다면 주소와는 상관없이 저장된 값 자체가 같은지를 판단가능

        
    }

}
