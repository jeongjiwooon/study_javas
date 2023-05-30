public class Methods
{
    public int add(int first, int second)
    {
        int result = 0;

        try
        {
            result = first + second;
        }
        catch (Exception e)
        {
            
        }

        return result;
    }

    public int minus(int first, int second)
    {
        int result = 0;

        try
        {
            result = first - second;
        }
        catch (Exception e)
        {
            
        }

        return result;
    }

    public static void main(String[] ags)
    {
        // - 인스턴스는 1회
        // - 초기값은 2를 넘지 않음
        // - main 결과값은 17
        try
        {
            int second = 2;
            Methods method = new Methods();
            
            for (int first = 2; first <= 18; first++)
            {
                first = method.add(first, second);
                if (first >= 18)
                {
                    second = method.minus(first, second);
                }
            }
            
        }
        catch (Exception e)
        {

        }
        System.out.println();
        // return 0;
    }
}
