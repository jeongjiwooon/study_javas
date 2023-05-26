import java.util.Scanner;

public class toys_javas
{
    public static void main(String[] args)
    {
        {
            Scanner myObj = new Scanner(System.in);
            String answer = "";
            String[] finalally = {"(1)", "(2)", "(3)", "(4)"};
            String[] answers = {"", "", "", ""};
            String[][] polls =
            {   
                {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"}, 
                {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다. ", "(4)매우 그렇다."},
                {"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
                {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다. ", "(4)매우 그렇다."},
                {"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"}, 
                {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다. ", "(4)매우 그렇다."},
                {"4. 강의 진행 속도는 적절하였는가?"},
                {"(1)전혀 아니다.", "(2)아니다.", "(3)그렇다. ", "(4)매우 그렇다."},
            };
    
            int count = 0;
            for (int second=0; second < polls.length; second=second+2)
            {
                int third = 0;
                System.out.println(polls[second][0]);
                boolean bool = true;
                while (bool)
                {
                    System.out.print(polls[1][third]);
                    if (third < 3)
                    {
                        third++;
                    }
                    else
                    {
                        System.out.println();
                        break;
                    }
                }
                System.out.print("답) ");
                answers[count] = myObj.nextLine();
                count = count + 1;
                System.out.println();

            }
    
            for (int first=0; first < answers.length; first=first+1)
            {
                System.out.print(finalally[first]+" "+answers[first]+" ");
            }
            System.out.println();
            // return 0;
        }
    }
}
