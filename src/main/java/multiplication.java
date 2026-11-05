public class multiplication {

    public static int[] mul(int n) {
        int[] result = new int[10];

        for (int i = 1; i <= 10; i++) {
            result[i - 1] = n * i;
        }

        return result;
    }
}