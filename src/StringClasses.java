public class StringClasses
{
    public static void main(String[] args)
    {
        try
        {
            String name = "Ji woon Jeong";

            name.equalsIgnoreCase("Ji woon Jeong"); // true
            name.equalsIgnoreCase("Ji woon"); // false

            String name_second = new String("Mi rae Jeon");

            name_second.equals("Mi rae Jeon"); // true
            name_second.length(); // 11
            String[] arrays = name_second.split(" ");

            System.out.println();
        }
        catch (Exception e)
        {
            
        }
        System.out.println();
        // return 0;
    }
}
