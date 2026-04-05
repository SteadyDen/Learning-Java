public class conditional {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 100;

        // 다중 조건의 경우 조건을 만족하는 최초의 분기만 실행. 아래에선 a==b만 실행됨을 알 수잇ㅇ므
        if (a == b) {
            System.out.println("a==b");
        } else if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a!=b");
        }

        switch (a + 5) {
            // default -> System.out.println("default"); 이런 형식으로 break 포함한 문법도 있음. 한꺼번에 쓰는건 안되니 주의
            default:
                System.out.println("default");
                break;
            case 3:
                System.out.println("a+1 == 3");
                break;
            case 4:
                System.out.println("a+1 == 4");
                break;
            case 2:
                System.out.println("a+1 == 2");
                break;
        }
    }
}
