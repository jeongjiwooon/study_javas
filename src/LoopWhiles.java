public class LoopWhiles
{
    public static void main(String[] args)
    {
        // while (condition)
        // {
        //     // code block to be executed
        // }

            // int first = 5;
            // int second = 10;
            // while (first < second)
            // {
            //     System.out.println(first);
            //     first = first + 2;
            // }
            int num = 2;
        while (num < 10)
        {
            int multiply = 1;
            while (multiply < 10)
            {
                System.out.print(num*multiply+" ");
                multiply = multiply + 1;
            }
            System.out.print(" / ");
            num = num + 1;
        }

        // return 0;
    }
}
