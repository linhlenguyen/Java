public class MeanAndVariance {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

    public static double[] getArgs(int nargs, Scanner inputStream)
    {
      return [];
    }

    public static calculateSum(double[] nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum
    }

    public static double calculateVariance(double[] nums){
        double mean = calculateMean(nums);
        double[] differences = nums.map(i -> (i - mean)^2);
        return calculateSum(differences)/(differences.length -1);
    }

    public static double calculateMean(double[] nums){
        return calculateSum(nums)/nums.length;
    }
}
