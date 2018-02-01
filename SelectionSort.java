public class SelectionSort {
    public static void main(String []args){
        int [] arr={1,3,2,45,65,33,12};
        System.out.println("Before change");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            int k=i;
            for(int j=k+1;j<arr.length-1;j++){
                if(arr[j]<arr[k])
                    k=j;
            }
        if(i!=k){
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
