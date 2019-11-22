import java.util.Scanner;
public class Cao2{
//求解汉诺塔问题
public static void hanNuota(int i,char a,char b,char c){
      if(i==1){
          System.out.println("从"+a+"移动"+i+"号到"+c);
      }
      else{
          hanNuota(i-1,a,c,b);
          System.out.println("从"+a+"移动"+i+"号到"+c);
          hanNuota(i-1,b,a,c);
      }

}
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第几个数：");
        int i=scanner.nextInt();
        //System.out.println(fibonacci(i));
        hanNuota(i,'A','B','C');

    }
}