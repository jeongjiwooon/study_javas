public class MethodsIfs
{
    public int day(int time)
    {
        int result = 0;

        try
        {
            while (time != 0)
            {
                time = time + 6;
                if (time < 12)
                {
                    System.out.println("오전입니다.");
                }
                else if (time < 18)
                {
                    System.out.println("오후입니다.");
                }
                else
                {
                    System.out.println("밤입니다.");
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
            int time = 1;
            MethodsIfs methodifs = new MethodsIfs();
            int returnResult = methodifs.day(time);
            System.out.println(returnResult);
        }
        catch (Exception e)
        {
            
        }
        // return 0;
    }
}
