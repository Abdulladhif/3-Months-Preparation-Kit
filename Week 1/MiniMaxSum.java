import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
    
  class Result{

    public static void miniMaxSum(List<Integer> arr) {
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            long sum = 0;
            
            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
                min = Math.min(min, arr.get(i));
                max = Math.max(max, arr.get(i));
            }
                
        // Calculate the minimum and maximum sums
        long minSum = sum - max; // Subtracting the largest element
        long maxSum = sum - min; // Subtracting the smallest element
        
        System.out.println(minSum + " " + maxSum);
    }
  }
}
