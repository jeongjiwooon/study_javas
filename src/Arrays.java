public class Arrays
{
    public static void main(String[] args)
    {
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        // System.out.println(cars.length);
        // for (int first = 0; first < cars.length; first = first + 1)
        // {
        //     System.out.print(cars[first]+" "); // Volvo BMW Ford Mazda
        // }
        String[][] numbers = {{"10", "20", "30", "40"}, {"50", "60", "70"}};

        for (int second = 0; second < numbers.length; second ++)
        {
            for (int third = 0; third < numbers[second].length; third ++)
            {
                System.out.print(numbers[second][third]+" ");
            }
            System.out.println();
        }

        System.out.println();

            // return 0;
    }
}
