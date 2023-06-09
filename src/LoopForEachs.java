import java.util.ArrayList;
import java.util.HashMap;

public class LoopForEachs
{
    public static void main(String[] args)
    {
                    // for (type variableName : arrayName)
            // {
            //     // code block to be executed
            // }
        try
        {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            for (String car : cars)
            {
                System.out.println(car);
            }

            ArrayList<HashMap> carList = new ArrayList<HashMap>();
            HashMap<String, String> carSpec = new HashMap<String, String>();
            carSpec.put("Carcompany", "Ford");
            carSpec.put("CarName", "Mustang");
            carSpec.put("Year", "2022");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Toyota");
            carSpec.put("CarName", "Camry");
            carSpec.put("Year", "2021");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Chevolet");
            carSpec.put("CarName", "Silverlado");
            carSpec.put("Year", "2023");
            carList.add(carSpec);

            for (HashMap <String, String> car : carList)
            {
                System.out.println(car.get("CarCompany")+car.get("CarName")+car.get("Year"));
            }
            
            System.out.println();
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }    
}
