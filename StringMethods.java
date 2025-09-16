public class StringMethods {
    public static void main(String[] args) {
        String s = " Hello Java ";
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(1,6));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace("Java","World"));
        System.out.println(s.equals("hello"));
        System.out.println(s.equalsIgnoreCase(" hello java "));
    }
}