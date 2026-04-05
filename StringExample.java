public class StringExample {
    public static void main(String[] args) {

        // 필요한 부분 CTRL + K + C로 해제해서 보기

        // // String => 문자열 객체
        // // 객체 => 힙 메모리 영역
        // // 변수 => 힙 메모리 영역의 주소

        // String str = "안녕하세요!"; // 문자열 리터럴
        // String str_2 = new String("안녕하세요!"); // 생성자
        // String str_3 = "안녕하세요!";

        // if(str == str_2) {
        //     System.out.println("str == str_2");
        // }

        // // 생성자의 경우 기존에 존재하는 값인지는 상관 없이 힙 메모리에
        // // 새로운 공간을 할당하기에 주소값이 다를수밖에 없음

        // if (str == str_3) {
        //     System.out.println("str == str_3");
        // }
        
        // // 문자열 리터럴은 기존에 존재하는 값인지 확인하고 만약 존재한다면 그 기존의 할당된 메모리 공간의
        // // 주소값을 똑같이 가지게 됨.
        
        // if (str.equals(str_2)) {
        //     System.out.println("str.equals(str_2)");
        // }

        // // 메소드 .equals()를 사용한다면 주소와는 상관없이 저장된 값 자체가 같은지를 판단가능

        // // 문자열 병합

        // // 1. '+' 연산자

        // String str1 = "Hello,";
        // String str2 = "World";

        // System.out.println(str1+" "+str2);

        // // 2. StringBuilder (String보다 더 큰 메모리를 미리 잡아두고 계속 바꿔가며 쓸 수 있는 자료형)
        // // 일종의 중간 작업대 같은 느낌의 자료형으로 담아둔 문자열을 자유롭게 변경 가능하지만 스트링 형태로 써야할 때가
        // // 많기 때문에 문자열을 바꾸고 난 후에는 꼭 스트링 형태로 바꿔줘야 함

        // StringBuilder strBdr_1 = new StringBuilder("Hello,");
        // strBdr_1.append(" ");
        // strBdr_1.append("World!"); // 스트링빌더 자료형에서만 가능한 메소드 (스트링은 문자열 변경이 불가능)
        // System.out.println(strBdr_1.toString()); // 스트링빌더 -> 스트링으로 바꿔쓰는법. 쓸때마다 이런식으로 바꿔
        //                                          // 쓸 수 있음. 계속 스트링으로 쓰고싶으면 새 스트링 함수로 정의해
        // String test = strBdr_1.toString(); // 이런식으로

        // // 문자열 슬라이스

        // String str_1 = "이름: 김자바";
        // System.out.println(str_1.indexOf("이"));
        // System.out.println(str_1.indexOf("름"));
        // String str_name = str_1.substring(4, 7);
        // System.out.println(str_name);

        // // 문자열 대소문자 변환

        // String str_1 = "abc";
        // String str_2 = "ABC";

        // str_1 = str_1.toUpperCase();
        // str_2 = str_2.toLowerCase();

        // System.out.println(str_1);
        // System.out.println(str_2);

        // if (str_1.equals(str_2)) {
        //     System.out.println("둘이 같음");
        // }

        // if (str_1.equalsIgnoreCase(str_2)) { // 대소문자 구분 없이 문자만 같은지를 비교
        //     System.out.println("둘이 같음11");
        // }

        // // 문자열 공백 제거

        // // 1. 양쪽 끝 공백
        // String str_1 = "    hello  ";
        // str_1 = str_1.trim();
        // System.out.println(str_1);

        // // 2. 문자열 중간 공백
        // String str_2 = "hell      o";
        // str_2 = str_2.replace(" ", "");
        // System.out.println(str_2);
    }

}
