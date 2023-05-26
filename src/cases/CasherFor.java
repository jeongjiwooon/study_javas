package cases;

import java.util.Scanner;

public class CasherFor
{
    public static void main(String[] args)
    {
        try
        {
            Scanner myObj = new Scanner(System.in);
            System.out.println("장바구니에는 5가지만 넣을 수 있습니다.");
            // 입력 중 0원이면 입력되었던 값 합산
            // 100원 이하로 입력 제한, 이상 시 0원 적용
            // 장바구니 물건 종류는 1, 2, 3, 4 입력

            int[] bucketlist = {40, 140, 5, 0};
            int total = 0;
            String[] bucket = {"", "", "", "", ""};

            System.out.println("--- 계산 시작 ---");

            for (int first = 0; first < bucket.length; first++)
            {
                int count = 1;
                System.out.println((first+1)+"번째 물건을 골라주십시오.");
                int counter = myObj.nextInt();

                if (counter == 2)
                {
                    System.out.println("100원 초과 시 0원 적용");
                    counter = 4;
                }

                System.out.println((first+1)+"번째 가격: "+(bucketlist[counter-count]));

                total = bucketlist[counter-count]+total;
            }

            System.out.println("--- 담은 총합 ---");
            System.out.println("합계: "+total);
            System.out.println();
            System.out.println("--- 계산 종료 ---");

        }
        catch (Exception e)
        {

        }
        finally
        {

        }

        // return 0;
    }
}