public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;

        try {
            num1 = 1;
            num2 = 0;
            int result = num1 / num2;
        } catch (ArithmeticException e) {
           System.out.println("Нельзя делить цифру на ноль!");
        }
       System.out.println("Программа продолжает свою работу.");
        System.out.println("----------------------------------");



        String s = null;

        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("s нуловый!");
        }
        System.out.println("Программа продолжает свою работу.");
        System.out.println("-----------------------------------");


        int[] m = new int[2];

        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого индекса не существует!");
        }
        System.out.println("Программа продолжает свою работу.");
    }
}
