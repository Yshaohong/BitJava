/**import java.util.Scanner;
//根据年龄, 来打印出当前年龄
public class A1{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Age");
        int i=scanner.nextInt();
        if(i<=18){
            System.out.println("Children");
        }
        if(i>18&&i<=28){
            System.out.println("Yong man");
        }
        if(i>28&&i<=55){
            System.out.println("Middle age");
        }
        if(i>=56){
            System.out.println("Old people");
        }
    }
}*/

/**import java.util.Scanner;
public class A1{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Number");
        int a=scanner.nextInt();
        int num=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                num++;
            }
        }
        if(num==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}*/

/**public class A1{
    public static void main(String[] agrs){
        int i=0;
        for(i=1;i<=100;i++){
            int count=0;
            int j=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                } 
            }
            if(count==2){
                System.out.println(i);
            }

        }

    }
}*/

/**public class A1{
    public static void main(String[] agrs){
        int i=0;
        int sum=0;
        for(i=1000;i<=2000;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                sum=i;
                System.out.println(sum);
                continue;
            }
            
        }
    }
}*/

/**public class A1{
    public static void main(String[] args){
        int i=0;
        int j=0;
        for(i=1;i<10;i++){
            for(j=1;j<=i;j++){
                int sum=0;
                sum=i*j;
                System.out.print(j+"*"+i+"="+sum+" ");
            }
            System.out.println();
        }
    }
}*/

public class A1{
    public static void main(String[] args){
        
    }
}