import java.util.Scanner;

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


        for (int i = 0; i < 100; i++) {
            System.out.println("Index: " + i);
        }



        int[][] my2DArray = {{1,2,4,7},{11,12,13,14},{22,23,24,5}};

        System.out.println("This is an element of row index=2 and column index=3: " + my2DArray[2][3]);

        // Traverse 2D array
        // Nested loop
        for (int i = 0; i < 3 ; i++) {

            // Some code can be executed before traversing the line below

            for (int j = 0; j < 4; j++) {
                System.out.println("Indexes: i - " + i + "; j - " + j + "; value = " + my2DArray[i][j] );
            }
            // Some code can be executed after traversing the line below
            System.out.println();
        }


        // FOR EACH EXAMPLE

        int[] forLoopArray = {5, 6, 7, 1, 1};

        for ( int internalValue : forLoopArray ) {
            System.out.println("For loop element: " + internalValue);
        }

        int[][] complex2DArray = {{5,6},{7,8}};

        for (int[] singleRow: complex2DArray  ) {
            for( int singleElement : singleRow ) {
                System.out.println(" Just a single element from 2D array " + singleElement );
            }
        }


        // WHILE LOOP EXAMPLE

        int clockTime = 0;

        while( clockTime <= 24 ){
            System.out.println("The time is " + clockTime + " o'clock" );
            clockTime += 3;
        }


        // More complex example
        boolean runWhileLoop = true;

        while ( runWhileLoop ) {
            System.out.println(" variable runWhile Loop is still set to true. Therefore i am running ");

            if(clockTime > 100) {
                runWhileLoop = false;
            }
            clockTime++;
        }

        // MENU EXAMPLE using while loop
        int menuItem = 101;

        Scanner scanner = new Scanner(System.in);

        while ( menuItem != 0) {
            System.out.println("Please select an action you want to do:");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write that you are pretty");
            System.out.println("3 - write that you are the best!");
            System.out.println("0 - Exit the application ( but you are still the best ) ");
            menuItem = scanner.nextInt();

            if( menuItem == 1 ){
                System.out.println(" You are smart!");
            } else if( menuItem == 2) {
                System.out.println("You are pretty!");
            } else if ( menuItem == 3 ) {
                System.out.println("You are the best!");
            } else {
                System.out.println("There is no such option!");
            }
        }


        int initialValue = 10;

        // Will not run at all!
        while ( initialValue < 5 ) {
            System.out.println("WHILE LOOP. INITIAL VALUE < 5");
        }


        // Will run only once
        do {
            System.out.println("DO WHILE LOOP. INITIAL VALUE < 5");
        } while( initialValue < 5 );

    }
}
