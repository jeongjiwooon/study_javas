public class SetAndGetVariable
{
    public static void main(String[] args)
    {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int notB = 5;
        int notD = 5;
        int notA = 30;
        int correctB = 10;
        int correctD = 200;
        int correctA = 50;

        A = 1;
        B = 3;
        C = 5;
        D = 7;

        System.out.println(A+" "+B+" "+C+" "+D);

        if (B == 3)
        {
            A = correctB;
        }
        else
        {
            C = notB;
        }

        System.out.println(A+" "+B+" "+C+" "+D);

        if (D != 9)
        {
            B = notD;
        }
        else
        {
            B = correctD;
        }

        System.out.println(A+" "+B+" "+C+" "+D);

        if (A == 10)
        {
            C = correctA;
        }
        else
        {
            D = notA;
        }

        System.out.println(A+" "+B+" "+C+" "+D);
        // return 0;
    }
}
