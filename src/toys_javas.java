import java.util.Scanner;

public class toys_javas
{
    public static void main(String[] args)
    {   // Array + Scanner
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

        // return 0;

        // Array + Scanner + for

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
        System.out.println("1. "+answer[firstkey]+" "+"2. "+answer[secondkey]+" "+"3. "+answer[thirdkey]+" "+"4. "+answer[fourthkey]);

        // return 0;

        // Array + Scanner + if else

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
