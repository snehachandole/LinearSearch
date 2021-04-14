public class LinearSearch {
    public static void main(String[] args) {
        int value = 5;
        int inputData[] = {1, 2, 3, 4, 5};
        boolean found = false;

        for (int i = 0; i < 5; i++) {

            if (inputData[i] == value) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
