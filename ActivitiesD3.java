import java.util.Arrays;

public class ActivitiesD3 {
    public static void main(String[] args) {
        int[] tan2 = { 0, 0, 0 };
        gen101(tan2);
    }

    static void gen101(int[] tan2) {
        System.out.println(Arrays.toString(tan2));

        if (tan2[0] == 1 && tan2[1] == 1 && tan2[2] == 1)
            return;

        tan2[2]++;

        if (tan2[2] > 1) {
            tan2[2] = 0;
            tan2[1]++;
        }

        if (tan2[1] > 1) {
            tan2[1] = 0;
            tan2[0]++;
        }

        gen101(tan2);
    }
}