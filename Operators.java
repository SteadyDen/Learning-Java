public class Operators {
    public static void main(String[] args) {
        
        // 산술 연산자

        // int a = 10;
        // int b = 20;
        // String c = "abc";
        // double d = 10;
        // double e = 20;

        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b); // 몫을 반환하는 연산기호 ㅋㅋ; 계산 결과를 반환하려면 double 자료형을 쓰기
        // System.out.println(d / e); 
        // System.out.println(a % b);

        // System.out.println(a + c); // 문자열이 아닌것을 문자열과 더하면 그냥 문자열로 바뀌어서 문자열끼리 더한것이 됨

        // // 비교 연산자
        
        // int a = 5;
        // int b = 8;
        
        // System.out.println(a > b);
        // System.out.println(a < b);

        // System.out.println(a >= b);
        // System.out.println(a <= b);

        // System.out.println(a == b);
        // System.out.println(a != b);

        // 논리 연산자

        int a=3;
        int b=3;
        int c=5;
        
        // and => &&
        
        System.out.println(c > a && c > b);

        // or => ||

        System.out.println(c > a || c < b);

        // not => !

        System.out.println(!true);

        // 증감 연산자
        a++; // a = a + 1

        System.out.println(a++); // 기존 a값인 4(바로 위에서 1 더해서) 출력 why? a를 함수의 인자로 넘겨준 다음 +1을 수행함
        System.err.println(a); // 1이 더해져 5임을 확인 가능
        System.out.println(++a); // 이렇게 쓰면 1을 더한 뒤 인자로 넘겨줌

        b+=1; //이것도 되네 ++순서로
        System.out.println(b);
    }   
}
