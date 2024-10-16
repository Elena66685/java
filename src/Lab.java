import static java.lang.Math.*;

public class Lab {
    public static void main(String[] args)
    {
        int a = 8;
        int b = 3;
        int x = 2;
        int d = (int) (((int) Math.max(a, b) - pow(2, x) * (int) Math.min(a, b)) / sin(2) + (int) Math.max(a, b) / Math.min(a, b));
        System.out.println(d);
    }
}

// Lab2
