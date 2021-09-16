import java.util.Scanner;

public class Tamrin {
    public static void main(String[] args) {
        System.out.println("ali");
        Scanner s = new Scanner(System.in);
        int a=0;
        String input = s.next();
<<<<<<< HEAD
        int a =18;
=======
>>>>>>> dev2



    }

    public static String substring(String input, int number) {
        for (int i = 5; i <= input.length() - number; i++) {
            String str = input.substring(i, i + number - 1);
            String reverse = new StringBuilder(str).reverse().toString();
            if (str == reverse) {
                return (reverse);
            }


        }
    }


}
