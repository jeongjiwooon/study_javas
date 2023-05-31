import cases.ClassSeconds;

public class ClassMains
{
    public static void main(String[] args)
    {
        try
        {
            ClassFirsts classFirst = new ClassFirsts();
            ClassFirsts classFirstWithVar = new ClassFirsts(5);
            int second = classFirstWithVar.getSecond();
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();
        }
        catch (Exception e)
        {
            
        }
    }
    // return 0;
}