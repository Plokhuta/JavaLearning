
public class OneCycle {
    public static void main(String[] args)
    {
       two: for (int i = 0; i < 3; i++)
        {
            System.out.print(i + " Строка: ");
            for (int j = 0; j < 10; j++)
            {
                if (i == 1)break two;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
