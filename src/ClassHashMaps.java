import java.util.HashMap;

public class ClassHashMaps
{
    public static void main(String[] args)
    {
        try
        {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); // null
            hashMap.put("second", 2); // null
            hashMap.put("third", 3); // null
            hashMap.get("third"); // Integer@49 "3"
            hashMap.size(); // 3
            hashMap.remove("second"); // Integer@461 "5"
            hashMap.keySet(); // HashMap$KeySet@465 size=2
            hashMap.values(); // HashMap$Values@466 size=2
            hashMap.clear(); // (void)

            System.out.println();
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
}
