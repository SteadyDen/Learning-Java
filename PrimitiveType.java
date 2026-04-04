public class PrimitiveType {
    public static void main(String[] args) {
        
        // 정수형
        // 1. byte (1 byte = 8 bits) 
        // 2^8 -> -2^7 ~ 2^7-1 (-128 ~ 127)

        // 2. short (2 bytes = 16 bits)
        // 2^16 -> -2^15 ~ 2^15-1 (-32768 ~ 32767)

        // 3. int (4 bytes = 32 bits)
        // 2^32 -> -2^31 ~ 2^31-1 

        // 4. long (8 bytes = 64 bits)
        // 2^64 -> -2^63 ~ 2^63-1 

        // 실수형
        // 1. double (8 bytes) - 소수점 이하 15자리
        // 2. float (4 bytes) - 7자리
        double a = 1.23;
        float b = 9.45f;

        System.out.println(a + b);

        // 문자형
        // char (2 bytes)
        // 아스키, 유니코드 사용 가능
        char char_1 = 'a';
        char char_2 = 97;
        char char_3 = 43;
        char char_4 = 0x61;

        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);
        System.out.println(char_4);

        // 논리형
        // boolean(1 byte)
        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100<0);
        
    }
    
}
