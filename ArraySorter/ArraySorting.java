public class ArraySorting {
    public static void main(String[] args) {
        double [] randArr = {3.6, 8.1, 5.4, 9.0, 4.1, 5.19, 12.1, 1.25, 1.26, 7.35};
        double [] sortedArray = arrSorter(randArr, false);
        for (int i = 0; i < sortedArray.length; i++) {
            if (i == (sortedArray.length-1)) {
                System.out.print(sortedArray[i] + "]");
            }
            else if (i == 0) {
                System.out.print("Sorted Array = [" + sortedArray[i] + ", ");
            }
            else {
                System.out.print(sortedArray[i] + ", ");
            }
        }
    }
    public static double[] arrSorter(double [] arr, boolean incremental) {
        int arrLen = arr.length;
        double buffer=1.0;
        if (incremental) {
            while (buffer!=0) {
                buffer = 0.0;
                for (int i = 0; i < arrLen-1; i++) {
                    if (arr[i]>arr[i+1]) {
                        buffer = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buffer;
                    }
                }
            }
        }
        else {
            while (buffer!=0) {
                buffer = 0.0;
                for (int i = 0; i < arrLen-1; i++) {
                    if (arr[i]<arr[i+1]) {
                        buffer = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buffer;
                    }
                }
            }
        }
        return arr;
    }
}