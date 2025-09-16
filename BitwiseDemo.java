public class BitwiseDemo {
    public static void main(String[] args) {
        int num = 8; 
        System.out.println("Original: " + num);
        System.out.println("Left shift: " + (num << 1));
        System.out.println("Right shift: " + (num >> 1));
        System.out.println("Unsigned Right shift: " + (num >>> 1));
    }
}