import java.util.Scanner;

public class toys_javas2
{
    public static void main(String[] args)
    {
        Scanner myName = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = myName.nextLine();
        System.out.println("이름) "+name);
        
        Scanner keyword = new Scanner(System.in);
        String[][] firstanswer = {{"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
                             {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}};
        String[][] secondanswer = {{"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
                             {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}};
        String[][] thirdanswer = {{"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
                             {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}};
        String[][] fourthanswer = {{"4. 강의 진행 속도는 적절하였는가?"},
                             {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}};

        String[] answer = {"", "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다."};
                             

        for (int first = 0; first < firstanswer.length; first ++)
        {
            for (int second = 0; second < firstanswer[first].length; second ++)
            {
                System.out.print(firstanswer[first][second]+" ");
            } 
            System.out.println();
        }
        int firstkey;
        firstkey = keyword.nextInt();
        System.out.println("답) "+firstanswer[1][firstkey]);

        for (int first = 0; first < secondanswer.length; first ++)
        {
            for (int second = 0; second < secondanswer[first].length; second ++)
            {
                System.out.print(secondanswer[first][second]+" ");
            } 
            System.out.println();
        }
        int secondkey;
        secondkey = keyword.nextInt();
        System.out.println("답) "+secondanswer[1][secondkey]);

        for (int first = 0; first < thirdanswer.length; first ++)
        {
            for (int second = 0; second < thirdanswer[first].length; second ++)
            {
                System.out.print(thirdanswer[first][second]+" ");
            } 
            System.out.println();
        }
        int thirdkey;
        thirdkey = keyword.nextInt();
        System.out.println("답) "+thirdanswer[1][thirdkey]);

        for (int first = 0; first < fourthanswer.length; first ++)
        {
            for (int second = 0; second < fourthanswer[first].length; second ++)
            {
                System.out.print(fourthanswer[first][second]+" ");
            } 
            System.out.println();
        }
        int fourthkey;
        fourthkey = keyword.nextInt();
        System.out.println("답) "+fourthanswer[1][fourthkey]);

        System.out.println("설문 종료");
        System.out.println("설문 결과");
        System.out.println("1. "+answer[firstkey]+", "+"2. "+answer[secondkey]+", "+"3. "+answer[thirdkey]+", "+"4. "+answer[fourthkey]);

    }
}
