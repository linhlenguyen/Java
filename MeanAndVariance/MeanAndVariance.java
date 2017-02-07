import java.io.*;
import java.util.*;

public class MeanAndVariance {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(new File("myNumbers.in"));){
          List<Double> nums = getArgs(scanner);
          scanner.close();
          System.out.println("Input = " + listToString(nums));
          System.out.println("Mean = " + Double.toString(calculateMean(nums)));
          System.out.println("Variances = " + Double.toString(calculateVariance(nums)));
      } catch (FileNotFoundException e){
          System.out.println("File not found!");
      }
    }

    public static List<Double> getArgs(Scanner inputStream)
    {
      List<Double> nums = new ArrayList<Double>();
      while (inputStream.hasNextDouble()){
        nums.add(inputStream.nextDouble());
      }
      return nums;
    }

    public static String listToString(List<Double> nums){
        String r = "";
        for (int i = 0; i < nums.size(); i++){
          r += Double.toString(nums.get(i)) + " ";
        }
        return r;
    }

    public static Double calculateSum(List<Double> nums){
        Double sum = 0.0;
        for (int i = 0; i < nums.size(); i++){
          sum += nums.get(i);
        }
        return sum;
    }

    public static Double calculateVariance(List<Double> nums){
        Double mean = calculateMean(nums);
        for (int i = 0; i < nums.size(); i++){
            nums.set(i,Math.pow((nums.get(i) - mean),2));
        }
        return calculateSum(nums)/(nums.size() -1);
    }

    public static Double calculateMean(List<Double> nums){
        return calculateSum(nums)/nums.size();
    }
}
