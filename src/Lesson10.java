public class Lesson10 {

    public static void main(String[] args) {
        // Application that counts how many coffees we drink over the week

        int[] coffeeArray = new int[7];

        coffeeArray[0] = 3;
        coffeeArray[1] = 4;
        coffeeArray[2] = 12;
        coffeeArray[3] = 2;
        coffeeArray[4] = 1;
        coffeeArray[5] = 0;
        coffeeArray[6] = 1;


        // this is how humans are calculating
//        int totalCoffees = coffeeArray[0] + coffeeArray[1] + ....;

        int coffeeCounter = 0;

        // Loops will help us to iterate over all elements in an Array
        for (int i = 0; i < coffeeArray.length ; i++) {
            coffeeCounter += coffeeArray[i];
            // coffeeCounter = coffeeCounter + coffeeArray[i];
        }

        System.out.println("Total # of coffees during the week: " + coffeeCounter);



        int[][] my2DArray = {{1,2,4,7},{11,12,13,14},{22,23,24,5}};

        System.out.println("This is an element of row index=2 and column index=3: " + my2DArray[2][3]);

        for (int i = 0; i < 100; i++) {
            System.out.println("Index: " + i);
        }
    }
}
