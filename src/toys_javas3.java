import java.util.Scanner;

public class toys_javas3
{
    public static void main(String[] args)
    {
        Scanner keyword = new Scanner(System.in);
        int firstkey = 0;
        int secondkey = 0;
        int thirdkey = 0;
        int fourthkey = 0;

        Scanner myName = new Scanner(System.in);
        String[] answer = {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."};
        System.out.println("이름을 입력하세요: ");
        String name = myName.nextLine();
        System.out.println("이름) "+name);

        System.out.println("1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        firstkey = keyword.nextInt();
        if (firstkey == 1)
        {
            System.out.println("답) (1)전혀 아니다.");
        }
        else if (firstkey == 2)
        {
            System.out.println("답) (2)아니다.");
        }
        else if (firstkey == 3)
        {
            System.out.println("답) (3)그렇다.");
        }
        else
        {
            System.out.println("답) (4)매우 그렇다.");
        }

        System.out.println("2. 강의의 내용은 체계적이고 성의있게 구성되었는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        secondkey = keyword.nextInt();
        if (secondkey == 1)
        {
            System.out.println("답) (1)전혀 아니다.");
        }
        else if (secondkey == 2)
        {
            System.out.println("답) (2)아니다.");
        }
        else if (secondkey == 3)
        {
            System.out.println("답) (3)그렇다.");
        }
        else
        {
            System.out.println("답) (4)매우 그렇다.");
        }

        System.out.println("3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        thirdkey = keyword.nextInt();
        if (thirdkey == 1)
        {
            System.out.println("답) (1)전혀 아니다.");
        }
        else if (thirdkey == 2)
        {
            System.out.println("답) (2)아니다.");
        }
        else if (thirdkey == 3)
        {
            System.out.println("답) (3)그렇다.");
        }
        else
        {
            System.out.println("답) (4)매우 그렇다.");
        }

        System.out.println("4. 강의 진행 속도는 적절하였는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        fourthkey = keyword.nextInt();
        if (fourthkey == 1)
        {
            System.out.println("답) (1)전혀 아니다.");
        }
        else if (fourthkey == 2)
        {
            System.out.println("답) (2)아니다.");
        }
        else if (fourthkey == 3)
        {
            System.out.println("답) (3)그렇다.");
        }
        else
        {
            System.out.println("답) (4)매우 그렇다.");
        }

        System.out.println("설문 종료");
        System.out.println("설문 결과");
        System.out.println("1. "+answer[firstkey]+" "+"2. "+answer[secondkey]+" "+"3. "+answer[thirdkey]+" "+"4. "+answer[fourthkey]);

        // return 0;

    }
}
