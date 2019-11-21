// 稍微多一点的猜数字游戏
import java.util.Scanner;
import java.util.Random;
public class Cao2{

public static void caiShuzi(){
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int guess = random.nextInt(100);
    while(true){
        System.out.println("请输入一个数(1~100):");
        int i=scanner.nextInt();
        if(i<guess){
            System.out.println("猜小了");
        }
        else if(i>guess){
            System.out.println("猜大了");
        }
        else if(i==guess){
            System.out.println("恭喜你，猜对了");
            break;
        }
        }
}

public static void main(String[] agrs){
    Scanner scanner = new Scanner(System.in);
    System.out.println("*************************");
    System.out.println("**1.开始游戏  2.退出游戏**");
    System.out.println("*************************");
    System.out.println("请选择：");
    int a=scanner.nextInt();
    int count=3;
    while(true){
    if(a==1){
        caiShuzi();
        break;
    }
    else if(a==2){
        System.out.println("BYEBYE");
        break;
    }
    else if(a!=1&&a!=2){
       
            System.out.println("输入有误！请重新输入！");
            break;
    }
    }

    }

}