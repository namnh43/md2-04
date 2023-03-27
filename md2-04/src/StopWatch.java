import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class StopWatch {
    private java.util.Date startTime;
    private java.util.Date endTime;

    public StopWatch() {
        startTime = new Date();
    }
    public void printStartTime() {
        System.out.println("Start Time: "+startTime.toString());
    }
    public void printStopTime() {
        System.out.println("Stop Time: "+endTime.toString());
    }
    public void start() {
        startTime = new Date();
    }
    public void stop() {
        endTime = new Date();
    }
    public long getElapsedTime() {
        return (endTime.getTime() - startTime.getTime());
    }

    static void sort(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    static void random(int[] arr) {
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
//            System.out.println(arr[i]); // printing each array element
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        StopWatch watch = new StopWatch();
        watch.printStartTime();
        random(arr);
        sort(arr);
        watch.stop();
        watch.printStopTime();
        long elapsed = watch.getElapsedTime();
        System.out.printf("ElapsedTime of sort function is(in miliseconds): %d\n", elapsed);
        ///
        watch.start();
        watch.printStartTime();
        random(arr);
        sort(arr);
        watch.stop();
        watch.printStopTime();
        elapsed = watch.getElapsedTime();
        System.out.printf("Second ElapsedTime of sort function is(in miliseconds): %d\n", elapsed);
    }
}
