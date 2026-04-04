public class TypeCasting {
    public static void main(String[] args) {
        
        // 형변환
        // byte < short < int < long <<< float < double

        // 큰 자료형에서 작은 자료형으로의 형변환
        // int의 값이 될 수 있는 수는 short의 최댓값을
        // 넘어가기에 원하는 값이 출력되지 않는
        // 오버플로우 오류가 일어날 수 있음
        // 따라서 이는 코더가 직접 오류가 날 수 있음을
        // 인지하고 변환하겠다는 직접적 표시를 해줘야 함
        // 이를 "강제 형변환" 이라고 함.

        int a = 128;
        short b = (short) a;
        byte c = (byte) a;
        System.out.println(c); // 오버플로우 예시

        // 작은 자료형에서 큰 자료형으로의 형변환
        // 변수에 short로써의 가장 큰 값이 들어왔다고 해도
        // int가 여유롭게 수용 가능하기에 변환이 자유로움
        // 이를 "자동 형변환" 이라고 함

        short x = 10;
        int y = x;

        // 정수 -> 실수
        // 실수형이 경우의 수가 훨씬 크거나 같기에
        // 자동 형변환이 무리없이 이루어짐

        int m = 80;
        double n = m;

        // 실수 -> 정수
        // 딱 해당하는 정수부분까지만 짜름

        double exam = 5.8;
        int exam2 = (int) exam;
        System.out.println(exam2);

        // 가능한 범위의 수를 벗어나면 그냥 최댓값이
        // 나옴을 확인 가능

        exam = 123012939012531.4;
        exam2 = (int) exam;
        System.out.println(exam2);

        // 실수끼리의 형변환
        // 소수점 자리수의 제한이 있기에 정밀도가
        // 떨어질 수 있음

        double h = 10.324215213215;
        float d = (float) h;
        System.out.println(d);

        // 변수를 더해서 정의할때?

        int e = 10;
        short f = 20;

        short g = (short) (e + f); 
        // 이렇게 더할때는 보통
        // "더 큰 자료형 따라서" 변한 뒤
        // 연산됨. 즉 e + f는 현재 int형임
        // 이를 묶어서 short형 처리 해줄 수 있음

    }
}
