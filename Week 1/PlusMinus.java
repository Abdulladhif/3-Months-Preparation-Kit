import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int total = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Count positive, negative, and zero numbers
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate ratios
        double positiveRatio = (double) positiveCount / total;
        double negativeRatio = (double) negativeCount / total;
        double zeroRatio = (double) zeroCount / total;

        // Print ratios with required precision
        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }
}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
