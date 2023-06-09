import java.util.ArrayList;

public class ClassArrayLists
{
    public static void main(String[] args)
    {
        try
        {
            int[] numbers = {1, 2, 3};

            ArrayList arrayList = new ArrayList();

            arrayList.add(1); // true
            arrayList.add(2); // true
            arrayList.add(3); // true
            arrayList.size(); // 3
            arrayList.get(2);
            // int val = arrayList.get(2) Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from Object to int.
            arrayList.set(1, 5); // Integer 37 "2"
            arrayList.remove(0); // Integer@34 "1"
            // arrayList.clear(); // (void)

            System.out.println();
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
}
