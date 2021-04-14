public class LinearSearch {
    public static void main(String[] args) {
        int value = 52;
        int inputData[] = {11, 12, 13, 14, 15};
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
