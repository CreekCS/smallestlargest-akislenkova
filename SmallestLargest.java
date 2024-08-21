//Anna Kislenkova
import java.util.Random;
public class SmallestLargest{
    public static void main(String[] args){
        int[] ranNums = new int[10];
        for(int i=0; i<ranNums.length; i++){
            Random ranNum = new Random();
            ranNums[i]= ranNum.nextInt(100);
            
        }
        System.out.println(smallestValue(ranNums));
        System.out.print(largestValue(ranNums));

    }
    public static int smallestValue(int[] ranNums){
        int small = ranNums[0];
        for(int i=1; i<ranNums.length; i++){
            if (ranNums[i] < ranNums[i-1]){
                small = ranNums[i];
            }
        }
        return small;
    }
    public static int largestValue(int[] ranNums){
        int larg = ranNums[0];
        for(int i=1; i<ranNums.length; i++){
            if (ranNums[i] > ranNums[i-1]){
                larg = ranNums[i];
            }
        }
        return larg;
    }
}