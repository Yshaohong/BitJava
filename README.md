# BitJavapackage method;

import java.util.Arrays;
public class Lianxi {
    //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
   /* public static void jiOu(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if(Lianxi.ouShu(arr[left])){
                left++;
            }
            else if(Lianxi.jiShu(arr[right])){
                right--;
            }
            else{
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }

        }
    }
    //判断是否为偶数
    public static boolean ouShu(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    //判断是否为奇数
    public static boolean jiShu(int num){
        if(num%2!=0){
            return true;
        }
        return false;
    }*/


    //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
   public static void jiOu(int[] arr){
       int left=0;
       int right=arr.length-1;
       while(left<right){
           //找到第一个奇数
           while(arr[left]%2==0&&left<right){
               left++;
           }
           //找到第一个偶数
           while(arr[right]%2!=0&&left<right){
               right--;
           }
           //第一个奇数与第一个偶数交换
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
       }
   }
   //数组逆序
    public static void niXu(int[] arr){
       int left=0;
       int right=arr.length-1;
       while(left<right){
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
       }
    }
   //打印数组
    public static void print(int[] arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //jiOu(arr);
        //System.out.println(Arrays.toString(arr));
        //jiOu(arr);
        //print(arr);
        niXu(arr);
        print(arr);


    }
}
