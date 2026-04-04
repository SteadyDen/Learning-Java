public class ReferenceType {
    public static void main(String[] args) {
        
        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값
        
            String a = new String("Hello!");
            System.out.println(a);

            String b = "Hello!";
            String c = "Hello!";

            /* new로 객채를 생성하는 방법이 있고 직접 변수에
               대입해서 생성하는 방식이 있는데 
               후자는 힙 메모리에 똑같은 값이 존재하는지를
               판단해서 존재한다면 해당 주소를 다시 받아와서
               저장하도록 만들어져 있다. */

            if (c == b) {
                System.out.println("a");
            }
    }
}
