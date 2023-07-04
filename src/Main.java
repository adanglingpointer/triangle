public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15,
                8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,
                3, 3);
        // findArea() is an instance method,
        //   also referred to as non-static methods,
        //   so we call it with a Triangle instance.
        //   example: triangleA.findArea();
        //   studentFirstName.charAt(0);
        // pow() and abs are static methods,
        //   also called class methods,
        //   so we call them using the class name
        //   example: int expNum = Math.pow(2, 3);
        double triangleAArea = triangleA.findArea();
        System.out.println("params: " + triangleA.base + "," + triangleA.height + "," + triangleA.sideLenOne + "," + triangleA.sideLenTwo + "," + triangleA.sideLenThree);
        System.out.println(triangleAArea);
        double triangleBArea = triangleB.findArea();
        System.out.println("params: " + triangleB.base + "," + triangleB.height + "," + triangleB.sideLenOne + "," + triangleB.sideLenTwo + "," + triangleB.sideLenThree);
        System.out.println(triangleBArea);

        // Base and height are non-static instance variables
        //   Their values are not the same for every triangle
        //   Their values change depending on the Triangle instance
        // Static class variables do not change per instance
        //   They hold a value for the whole class to use

        System.out.println(Triangle.numOfSides);
    }
}