public class MethodBasics
{
    public int F(int x)
    {
        int result = x + 1;
        return result;
    }
    public static void main(String[] args)
    {
        try
        {
            int x = 9;
            int y;
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            System.out.println(y);
        }

        catch (Exception e)
        {
            
        }
        System.out.println();
        // return 0;
    }
}
