import java.util.Scanner;

public class main {
    public static void main(String[] args) {

            Scanner inp=new Scanner(System.in);

            System.out.print("enter the number :");
            int number= inp.nextInt();
            int total=0;
            int number1=0,number2=1,number3;

            for(int i=2;i<=number;i++){
                number3=number1+number2;
                System.out.print(number1 + " + " +number2 + " = "+number3);
                number1=number2;
                number2=number3;
                System.out.println();
            }


        }
    }
