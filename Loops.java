public class Loops {
    public static void main(String[] args) {
        
        // 반복문
        // 1. for
        // 초기화 된 변수, 조건식, 증감식

        // int i = 0;

        // for (i = 1; i<10; i++) {
        //     System.out.println(i);
        // }

        // 2. while

        int b = 10;

        while (b>0) {
            System.out.println(b);
            --b;
        }

        do { // do while문 : 일단 한번 조건 실행하고 그 다음부터 do 아래 있는 조건 while문으로 실행
            System.out.println(b);
            --b;
        } while (b>0);
    }
}
