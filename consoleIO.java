import java.util.Scanner;

public class consoleIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : "); // println은 무조건 줄바꿈을 포함함
        String userName = sc.nextLine();

        System.out.print("생년월일을 입력하세요 : ");
        int birthDate = sc.nextInt();

        System.out.printf("%s\n%d", userName, birthDate);
    }
}
