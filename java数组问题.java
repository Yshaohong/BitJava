public class Test {

    //写一个方法，使数组中的每一个元素都*2(1)
    public static void shuZuc2(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i]*2;
            System.out.print(arr2[i]+" ");
        }
    }

    //写一个方法，使数组中的每一个元素都*2(2)
    public static int[] shuZuc3(int[] arr){//创建一个新数组使原数组*2的值拷贝，原数组值不变
        int[] arr3=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr3[i]=arr[i]*2;
        }
        return arr3;
    }
    public static void printc3(int[] arr){//写一个将将数组输出的方法
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //数组转成字符串
    public static String stringShuzu(int[] arr){//转换成字符串类型只需要与任意字符串进行"+"操作
        String ret="[";
        for (int i = 0; i <arr.length ; i++) {
            ret=ret+arr[i];//ret=ret+arr[i]表示变为[23456
            if(i!=arr.length-1) {
                ret += ", ";
            }
        }
        ret+="]";
        return ret;
    }

    //数组的拷贝
    public static int[] shuZucp(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }
    public static void printcp(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");;
        }
    }
    //找数组中的最大元素
    public static void shuZumax(int[] arr){
        int[] arr2=new int[arr.length];
        int j=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>j) {
                j = arr[i];
            }
        }
        System.out.print(j);
    }

    // 求数组中元素的平均值
    public static double shuZuavg(int[] arr){//平均值是double类型
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    //查找数组中指定元素(顺序查找)
    public static int shuZusx(int[] arr,int a){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==a) {
                return i;
            }
        }
        return -1;
    }

    //查找数组中指定元素(二分查找)
    public static int shuZuef(int[] arr,int a){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;//取数组中间的一个元素
            if(a<arr[mid]){
                right=mid-1;
            }
            else if(a>arr[mid]){
                left=mid+1;
            }
            else if(a==arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    //检查数组的有序性(升序)
    public static boolean shuZuyx(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //数组排序(冒泡排序)
    public static void maoPao(int[] arr){
        //外层循环遍历数组元素
        for (int i = 0; i <arr.length ; i++) {
            //内层循环将数组范围缩小，已排列的在最后
            for (int j = arr.length-1; j >i; j--) {
                //判断是否需要交换位置
                if(arr[j-1]>arr[j]){
                    int tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    





public static void main(String[] args){
        //int[] arr={3,4,5,6,7};
        //shuZuc2(arr);//使数组中元素*2（1）
        //int[] ret=shuZuc3(arr);//保存*2后的数组
        //printc3(arr);//打印原数组
        //System.out.println();
        //printc3(ret);//打印*2后的数组
        //System.out.println(stringShuzu(arr));//数组转换为字符串
        //int[] ret=shuZucp(arr);//数组拷贝
        //printcp(arr);
        //shuZumax(arr);//找出数组中最大元素
        //System.out.println(shuZuavg(arr));//数组求平均值
        //System.out.println(shuZusx(arr,4));//顺序查找指定元素
        //System.out.println(shuZuef(arr,3));//二分查找指定元素
        //System.out.println(shuZuyx(arr));//检查数组是否为升序
        //maoPao(arr);//冒泡排序
        


}

}