import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("type a number");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        } else if (num<0) {
            System.out.println("The number is negative");
        } else if (num == 0) {
            System.out.println("The value equals 0");

        }


    }
    }
