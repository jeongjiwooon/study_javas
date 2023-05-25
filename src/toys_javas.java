import java.util.Scanner;


public class toys_javas
{
    public static void main(String[] args)
    {
        Scanner myName = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = myName.nextLine();
        System.out.println("이름) "+name);

        String[] first = {"", "(1)전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우 그렇다"};
        String[] second = {"", "(1)전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우 그렇다"};
        String[] third = {"", "(1)전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우 그렇다"};
        String[] fourth = {"", "(1)전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우 그렇다"};

        String[] ft = {"", "(1)", "(2)", "(3)", "(4)"};
        String[] sd = {"", "(1)", "(2)", "(3)", "(4)"};
        String[] td = {"", "(1)", "(2)", "(3)", "(4)"};
        String[] fh = {"", "(1)", "(2)", "(3)", "(4)"};
        
        Scanner answer = new Scanner(System.in);

        System.out.println("1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?");
        System.out.println("(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우 그렇다");
        int firstanswer = answer.nextInt();
        System.out.println("답) "+first[firstanswer]);

        System.out.println("2. 강의의 내용은 체계적이고 성의있게 구성되었는가?");
        System.out.println("(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우 그렇다");
        int secondanswer = answer.nextInt();
        System.out.println("답) "+second[secondanswer]);

        System.out.println("3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?");
        System.out.println("(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우 그렇다");
        int thirdanswer = answer.nextInt();
        System.out.println("답) "+third[thirdanswer]);

        System.out.println("4. 강의 진행 속도는 적절하였는가?");
        System.out.println("(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우 그렇다");
        int fourthanswer = answer.nextInt();
        System.out.println("답) "+fourth[fourthanswer]);

        System.out.println("설문 종료");
        System.out.println("설문 결과");
        System.out.println("1. "+ft[firstanswer]+", "+"2. "+sd[secondanswer]+", "+"3. "+td[thirdanswer]+", "+"4. "+fh[fourthanswer]);

        // return 0;
    }
}
