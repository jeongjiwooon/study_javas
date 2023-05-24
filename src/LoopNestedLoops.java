public class LoopNestedLoops
{
    public static void main(String[] args)
    {
        //for/ for / if / else / break
        for (int first = 1; first < 5; first = first + 1)
        {
            System.out.println("for " +  first);
            for (int second = 1; second < 5; second = second + 1)
            {
                if (second <= first)
                {
                    System.out.print("_?");   
                }
                else
                {
                 break;
                }
            }
            System.out.println();
        }
        System.out.println("end");

        //for for
        for (int first = 1; first < 5; first = first + 1)
        {
            System.out.println("for " +  first);
            for (int second = 1; second <= first; second = second + 1)
            {
                System.out.print("_?");
            }
            System.out.println();
        }
        System.out.println("end");

        // return 0;
    }   
}
