import java.util.Scanner;

public class toys_javas3
{
    public static void main(String[] args)
    {
        Scanner keyword = new Scanner(System.in);
        int firstkey, secondkey, thirdkey, fourthkey;
        String[] answer = {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."};

        Scanner myName = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = myName.nextLine();
        System.out.println("이름) "+name);

        System.out.println("1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        firstkey = keyword.nextInt();
        System.out.println("답) "+answer[firstkey]);

        System.out.println("2. 강의의 내용은 체계적이고 성의있게 구성되었는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        secondkey = keyword.nextInt();
        System.out.println("답) "+answer[secondkey]);

        System.out.println("3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        thirdkey = keyword.nextInt();
        System.out.println("답) "+answer[thirdkey]);

        System.out.println("4. 강의 진행 속도는 적절하였는가?");
        System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        fourthkey = keyword.nextInt();
        System.out.println("답) "+answer[fourthkey]);

        System.out.println("설문 종료");
        System.out.println("설문 결과");
        System.out.println("1. "+answer[firstkey]+" "+"2. "+answer[secondkey]+" "+"3. "+answer[thirdkey]+" "+"4. "+answer[fourthkey]);
    }
}
