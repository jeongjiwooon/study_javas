public class personal
{   
    public static void main(String[] args)
    {
        int x = 5;
        int y;
        personal math = new personal();
        y = math.F(x);
        System.out.println(y);
    }

    public int F(int x)
    {
        int result = x + 1;
        return result;
    }
}