public class ArraysExample {
    public static void main(String[] args) {

        // 배열 (arrays)

        int[] test3 = new int[5]; // 생성자를 사용해 만들면 크기지정 가능
        int[] test = {132, 321, 534, 654};
        String[] test2 = {"1"};

        System.out.println(test[0]);

        System.out.println(test); // 배열은 참조 자료형이기 때문에 출력시 주소값이 나옴

        System.out.println(test.length);

        for (int i = 0; i < test.length; ++i) {
            System.out.println(test[i]);
        }
    }
}
