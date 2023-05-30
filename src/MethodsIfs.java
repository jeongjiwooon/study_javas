import java.util.Scanner;

public class MethodsIfs
{
    public int day(int time)
    {
        int result = 0;

        try
        {
            while (time <= 24 || time >= 0)
            {
                if (time < 12)
                {
                    System.out.println(time+"시는 오전입니다.");
                    time = time + 6;
                    System.out.println("입력한 시간으로부터 6시간이 흘러서 "+time+"시입니다.");
                }
                else if (time < 18)
                {
                    System.out.println(time+"시는 오후입니다.");
                    time = time + 6;
                    System.out.println("입력한 시간으로부터 6시간이 흘러서 "+time+"시입니다.");
                }
                else
                {
                    System.out.println(time+"시는 밤입니다.");
                    time = time + 6;
                    System.out.println("입력한 시간으로부터 6시간이 흘러서 "+time+"시입니다.");
                    break;
                }
            }
        }
        catch (Exception e)
        {
            
        }
        return result;
    }

    public static void main(String[] args)
    {
        try
        {
            Scanner myObj = new Scanner(System.in);
            System.out.println("시간은 0시부터 24시까지만 입력 가능합니다.");
            System.out.println("시간을 입력하시오.: ");
            int time = myObj.nextInt();
            MethodsIfs methodifs = new MethodsIfs();
            int result = methodifs.day(time);
            System.out.println(result);
        }
        catch (Exception e)
        {
            
        }
        // return 0;
    }
}
