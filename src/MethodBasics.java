public class MethodBasics
{
    // x에 + 1
    // public int F(int x)
    // {
    //     int result = x + 1;
        
    //     return result;
    // }

    public int F(int x)
    {
        int result = x + 1;
        return result;
    }

    public static void main(String[] args)
    {
        try
        {
            // int x = 4;
            int x = 8;
            int y = 3;
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            // y = methodBasics.F(x);
            y = y + 1; // 변수에 + 1
            System.out.println(y);
        }

        catch (Exception e)
        {
            
        }
        System.out.println();
        // return 0;
    }
}
