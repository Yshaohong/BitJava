// ??1??
/*import java.util.Scanner;
public class Homework1{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a numbers");
        int i=scanner.nextInt();
        int count=0;
        while(i>0){
            if(i%2==1){
                count++;
            }
            i/=2;
        }
        System.out.println(count);    
    }
}*/

// ????
import java.util.Scanner;
public class Homework1{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num=scanner.nextInt();
        int i=0;
        while(num>0){
            i=num%10;
            System.out.println(i);
            num/=10;
        }
    }
}