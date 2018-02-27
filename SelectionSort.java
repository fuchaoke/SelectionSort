public class SelectionSort {
    public static void main(String []args){
        int [] arr={1,3,2,45,65,33,12};
        System.out.println("Before change");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            int k=i;//将当前下标定义为最小值下标
            for(int j=k+1;j<arr.length-1;j++){//循环之后的数据
                if(arr[j]<arr[k])//如果有小于当前最小值的关键字
                    k=j;//将此关键字的下标赋值给k
            }
        if(i!=k){//如果最小值下标不等于i，说明找到最小值，交换
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
        }
        }
        System.out.println();
        System.out.println("After change:");
        for(int num:arr){
            System.out.print(num+" ");
        }


    }
}
