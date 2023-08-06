import java.util.Arrays;

public class Sum{
    public static void main(String[] args){

        int[] numbers = {2,4,5,6,7,8,2};
        System.out.println(Arrays.toString(runningSum(numbers)));
    }

    public static int[] runningSum(int[] arr){
        int[] sumArray = new int[arr.length];
        Arrays.fill(sumArray,0);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                sumArray[i] += arr[j];
            }
        }

        return sumArray;
    }

}