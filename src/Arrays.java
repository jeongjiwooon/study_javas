public class Arrays
{
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        for (int first = 0; first < 4; first = first + 1)
        {
            System.out.print(cars[first]+" "); // Volvo BMW Ford Mazda
        }
            // return 0;
    }
}
