public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    /*public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter++;
        } 
        System.out.print("/n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int counter = 0;
        while (counter < amount) {
            System.out.print(" ");
            counter++;
        } 
    }

    public static void printTriangle(int size) {
        // 40.2
        int counter = 1;
        while (counter < size+1) {
            printWhitespaces(size-(counter));
            printStars(counter);
            counter++;
        } 
    }

    public static void xmasTree(int height) {
        // 40.3
        int whitespace = height - 1;
        int stars = 1;
        int counter = 0;
        while(counter < height) {
            printWhitespaces(whitespace);
            printStars(stars);
            stars += 2;
            whitespace--;
            counter++;
        }
        whitespace = height -2;
        printWhitespaces(whitespace);
        printStars(3);
        printWhitespaces(whitespace);
        printStars(3);
    }*/
    
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;  //this is to count the start
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 0;
        while (i < height) {
            printWhitespaces(height - (i + 1));
            printStars(2 * i + 1);
            i++;
        }
        int n = 1;
        for (n = 1; n < 3; n++) {
            printWhitespaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
