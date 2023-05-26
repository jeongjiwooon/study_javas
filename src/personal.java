import java.util.Scanner;

public class personal
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int b = 5;
        int c = 1;
        String[] answers = { "1", "2", "3", "4" };
        int count = 0;
        String[][] a = {{ "(1)Hello" },
                {"C++", "JAVA", "Python", "C#", "HTML"},
                {"(2)Hello" },
                {"C++", "JAVA", "Python", "C#", "HTML"},
                {"(3)Hello" },
                {"C++", "JAVA", "Python", "C#", "HTML"},
                {"(4)Hello" },
                {"C++", "JAVA", "Python", "C#", "HTML"}};

        for (int i = 0; i < a.length; i = i + 2)
        {
            System.out.println(a[i][0]);
            for (int j = 0; j < b; j++)
            {
                System.out.print(a[c][j] + " ");
            }
            System.out.println();
            answers[count] = myObj.nextLine();
            System.out.println("답) " + answers[count]);
        }
    }
}
