
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        Random random = new Random();
        for (int t = 0; t < 3; ++t)
        {
            for (int i = 0; i < 4; ++i)
            {
                nums[t][i] = random.nextInt(100);
            }
        }
        for (int t = 0; t < 3; ++t)
        {
            for (int i = 0; i < 4; ++i)
            {
                System.out.print(nums[t][i] + " ");
            }
            System.out.println();
        }
        int min = nums[0][0];
        for (int t = 0; t < 4; ++t)
        {
            for (int i = 0; i < 3; ++i)
            {
                if (nums[i][t] <= min) min = nums[i][t];
            }
            for (int i = 0; i < 3; ++i)
            {
                nums[i][t] *= min;
            }
            if(t < 3) min = nums[0][t + 1];
        }
        for (int t = 0; t < 3; ++t)
        {
            for (int i = 0; i < 4; ++i)
            {
                System.out.print(nums[t][i] + " ");
            }
            System.out.println();
        }

    }
}

// Задание 4 вариант 21