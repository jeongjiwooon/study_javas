package cases;

import java.util.Scanner;

public class PollsWhile
{
    public static void main(String[] args)
    {
        try
        {
            Scanner myObj = new Scanner(System.in);
            String[] information = {"(E)xit : 종료", "(P)oll : 설문 시작", "(S)tatistic : 설문 통계"};

            System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("------ 작동 key ------");
            for (int first = 0; first < information.length; first++)
            {
                System.out.println(information[first]);
            }
            boolean loops = true;
            while (loops)
            {
                System.out.print("입력하세요. : ");
                String answer = myObj.nextLine();
                if (answer.equals("P") || answer.equals("p") || answer.equals("Poll"))
                {
                    System.out.println("----- 설문 시작 ------");
                }
                else if(answer.equals("S") || answer.equals("s") || answer.equals("Statistic"))
                {
                    System.out.println("----- 설문 통계 ------");
                }
                else if(answer.equals("E") || answer.equals("e") || answer.equals("Exit"))
                {
                    System.out.println("----- 설문 종료 ------");
                    break;
                }
                else
                {
                    System.out.println("----- 잘못 입력하셨습니다. ------");
                    for (int first = 0; first < information.length; first++)
                    {
                        System.out.println(information[first]);
                    }
                }
            }
        }
            catch (Exception e)
            {
                System.out.println();
            }
            finally
            {
                System.out.println();
            }

            System.out.println();

            // return 0;

    }
}