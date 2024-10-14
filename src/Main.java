import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }*/
        int length = 10;
        int nums[] = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++)
        {
            nums[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        int min = nums[0];
        for (int i = 1; i < 10; i++)
        {
            if (nums[i] <= min)
            {
                min = nums[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < length; i++)
        {
            nums[i] -= min;
        }
        System.out.println(Arrays.toString(nums));

    }
}