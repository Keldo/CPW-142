// YOUR NAME
// 01/25/2017
// CPW 142
// Assignment #2: Rocket Ship
//
// This program will draw a rocket ship

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
        // your code goes here.
        for (int line = 1; line <= (ROCKET_SIZE * 2 - 1); line++) {
			System.out.print(" ");
			for (int spaces = 1; spaces <= (ROCKET_SIZE * 2 - 1) - line; spaces++){
				System.out.print(" ");
			}
			for (int slashes = 1; slashes <= line; slashes++) {
				System.out.print("/");
			}
			System.out.print("**");
			for (int slashes = 1; slashes <= line; slashes++) {
				System.out.print("\\");
			}
			System.out.println(" ");
}
    }
    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();
                
        printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        // your code goes here.
        for (int line = 1; line <= ROCKET_SIZE; line++) {
			System.out.print("|");
			for (int repeat = 1; repeat <= 2; repeat++) {
				for (int dots = 1; dots <= ROCKET_SIZE - line; dots++) {
					System.out.print(".");
				}
				for (int points = 1; points <= line; points++) {
					System.out.print("/\\");
				}
				for (int dots = 1; dots <= ROCKET_SIZE - line; dots++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
         }
    }
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // your code goes here.
        for (int line = ROCKET_SIZE; line >= 1; line--) {
			System.out.print("|");
			for (int repeat = 1; repeat <= 2; repeat++) {
				for (int dots = 1; dots <= ROCKET_SIZE - line; dots++) {
					System.out.print(".");
				}
				for (int points = 1; points <= line; points++) {
					System.out.print("\\/");
				}
				for (int dots = 1; dots <= ROCKET_SIZE - line; dots++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
         }
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // your code goes here.
        System.out.print("+");
		for (int i = 1; i <= ROCKET_SIZE * 2; i++) {
			System.out.print("=*");
		}
      System.out.println("+");
      }
}
