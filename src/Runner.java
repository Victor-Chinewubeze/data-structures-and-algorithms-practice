public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] original = {20, 35, -15, 7, 55, 1, -22};
        int largestIndex;

        for (int unsortedPartitionIndex = original.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            largestIndex = 0;
            for(int i = 1; i <= unsortedPartitionIndex; i++ ){
                if (original[i] > original[largestIndex]){
                    largestIndex = i;
                }
            }
            swap(original, unsortedPartitionIndex, largestIndex);
        }

        for(int i = 0; i < original.length; i++){
            System.out.println(original[i]);
        }

    }

    public static void swap(int[] array, int a, int b) {
        if (a != b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
}
