public class MakingGamebyOneHand
{
    public static void main(String[] args)
    {
        int A = 0;
        int B = 0;
        int C = 0;

        int C1 = 1;
        int C2 = 2;

        System.out.println("빈 공간 A, B, C를 만든다. "+A+""+B+""+C);

        A = C1;
        C = C2;

        System.out.println("A에 숫자 1, C에 숫자 2를 놓는다. "+A+""+B+""+C);

        B = C2;
        C = 0;

        System.out.println("C에 있는 숫자 2를 B로 옮긴다. "+A+""+B+""+C);

        C = C1;
        A = 0;

        System.out.println("A에 있는 숫자 1을 C로 옮긴다. "+A+""+B+""+C);

        A = C2;
        B = 0;

        System.out.println("B에 있는 숫자 2를 A로 옮긴다. "+A+""+B+""+C);

        // return 0;
    }
}
