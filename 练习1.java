/**public class Cao2{
    public static void main(String[] agrs){
        int i=0;
        int j=0;
        double sum=0;
        double sum1=0;
        double sum2=0;
        for(i=1;i<100;i+=2){
            sum1=sum1+1.0/i;
        }
        for(j=2;j<=100;j+=2){
            sum2=sum2+1.0/j;
        }
        sum=sum1-sum2;
        System.out.println(sum);
    }
}*/

public class Cao2{
    public static void main(String[] args){
        int i=0;
        int count=0;
        for(i=1;i<=100;i++){
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}

/**public class Cao2{
    public static void main(String[] agrs){
        int i=0;
        int j=0;
        int sum=0;
        if(i<100){
            for(i=0;i<100;i++){
                int x=i/10;
                int y=i/10%10;
                if(x*x+y*y==i){
                    System.out.println(i);
                }
            }
        }
        if(i>=100){
            for(;i<1000;i++){
            int x=i/100;
            int y=i/10%10;
            int z=i%10;
            if(x*x*x+y*y*y+z*z*z==i){
                System.out.println(i);
            }
        }
        }
    }
}*/