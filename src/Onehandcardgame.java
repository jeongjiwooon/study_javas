public class Onehandcardgame
{
    public static void main(String[] args)
    {
        int A = 0;
        int B = 0;
        int C = 0;

        int C1 = 1;
        int C2 = 2;

        System.out.println(A+""+B+""+C);

        A = C1;
        C = C2;

        System.out.println(A+""+B+""+C);

        B = C2;
        C = 0;

        System.out.println(A+""+B+""+C);

        C = C1;
        A = 0;

        System.out.println(A+""+B+""+C);

        A = C2;
        B = 0;

        System.out.println(A+""+B+""+C);
    }
}
