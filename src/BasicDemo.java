import java.util.ArrayList;

class BasicsDemo {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println();                 // Print empty line
        System.out.print("Hello, world!!");   // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" ");                // Print a space
        System.out.print("world!!");
    }

    static void primitives() {
        System.out.println("\n\nInside primitives ...");
        // literals demo
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);
        int intBinary = 0b01000001;
        System.out.println("intBinary: " + intBinary);
        int intChar = 'A'; // holds decimal equivalent, which is 65
        System.out.println("intChar: " + intChar);
        int intUnderscore = 1_23_456;
        System.out.println("intUnderscore: " + intUnderscore);

        char charA = 'A';
        System.out.println("charA: " + charA);
        char charInt = 65;
        System.out.println("charInt: " + charInt);
        char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
        System.out.println("charUnicode1: " + charUnicode1);
        char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
        System.out.println("charUnicode2: " + charUnicode2);
        char charBinary = 0b01000001; // binary corresponding to decimal 65
        System.out.println("charBinary: " + charBinary);
    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit casting
        long y = 42;
        //int x = y;
        int x = (int)y;

        // Information loss due to out-of-range assignment
        byte narrowdByte = (byte)123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);
    }

    static void arrays() {
        System.out.println("\nInside arrays ...");
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length: " + myArray.length);
        System.out.println("myArray[1]: " + myArray[1]);
        System.out.println("myArray[7]: " + myArray[7]);
    }

    static void threeDimensionalArrays() {
        System.out.println("\nInside threeDimensionalArrays ...");
        int[][][] unitsSold = new int[][][]{
                { // New York
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,850,0,0}// Apr
                },
                { // San Francisco
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,0,0,0}  // Apr
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                }
        };

        System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
    }

    static void varargsOverload(boolean b, int i, int j, int k){
        System.out.println("\nInside varargsOverload without varargs ...");
    }
    static void varargsOverload(boolean b, int... list){
        System.out.println("\nInside varargsOverload with varargs ...");
        System.out.println("list.length: " + list.length);
    }


    static void preAndPost() {
        System.out.println("\nInside preAndPost ...");

        int x = 5;

        --x;
        //System.out.println("x: " + x);

        //int y = x--;
        //System.out.println("y: " + y + ", x: " +  x);

        int index = 0;
        int[] array = new int[3];
        array[index++] = 10;
        array[index++] = 20;
        array[index++] = 30;

        System.out.println(index);
    }

    static void compoundArithmeticAssignment() {
        int x = 100;

        System.out.println("x += 5: " + (x += 5));
        System.out.println("x -= 5: " + (x -= 5));
        System.out.println("x *= 5: " + (x *= 5));
        System.out.println("x /= 5: " + (x /= 5));
        System.out.println("x %= 5: " + (x %= 5));

        // Invalid
        System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x = +5
        System.out.println("x =- 5: " + (x =- 5)); // Unary minus ~ x = -5
	/*  System.out.println("x =* 5: " + (x =* 5));
		System.out.println("x =/ 5: " + (x =/ 5));
		System.out.println("x =% 5: " + (x =% 5));
	*/
    }

    static void isOddOrEven(int num) {
        System.out.println(num % 2);
    }

    // Comparison or Relational operators
    static void comparisonOperators() {
        System.out.println("\nInside comparisonOperators ...");
        int age = 20;
	    /*if (age > 21) {
			System.out.println("Graduate student");
		}*/
        System.out.println("age > 21: " + (age > 21));
        System.out.println("age >= 21: " + (age >= 21));
        System.out.println("age < 21: " + (age < 21));
        System.out.println("age <= 21: " + (age <= 21));
        System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
        System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)

        boolean isInternational = true;
        //System.out.println("isInternational <= true: " + (isInternational <= true));
        System.out.println("isInternational == true: " + (isInternational == true));
        System.out.println("isInternational != true: " + (isInternational != true));

//          Student s1 = new Student(1000, "Dheeru");
//          Student s2 = new Student(1000, "Dheeru");
//        System.out.println("s1 == s2: " + (s1 == s2)); // See object class
//        System.out.println("s1 != s2: " + (s1 != s2));
//
//        update(s1, "John");
    }

//   static boolean update(Student s, String name) {
//        if (s == null) {
//            return false;
//        }
//
//        s.name = name;
//        return true;
//    }

    static void logicalOperators() {
        System.out.println("\nInside logicalOperators ...");
        int age = 37;
        int salary = 85000;
        boolean hasBadCredit = false;

        // 1. Core (AND, OR, NOT & Operator Chaining)

        if (age > 35 && salary > 90000 || !hasBadCredit) {
            System.out.println("Loan approved!");
        } else {
            System.out.println("Loan not approved!");
        }

//         2.
//            (a) Left-associative ~ Order of grouping
//            (b) Associativity (a && b) && c = a && (b && c)
//            Applies to both && and ||


        // 3.
        //    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)

        // Other Examples: A && B || C && D = (A && B) || (C && D)
        //                 A && B && C || D = ((A && B) && C) || D


        //    (b) Operator Precedence across logical, comparison and arithmetic
        //          ! > arithmetic > comparison > &&, ||
        //    See resources section for complete precedence rules

        // ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules

        // 4. Use && to avoid NullPointerException
      //  Student s1 = new Student(1001, "Raj");
     //   update(s1, "Dheeru");
    }


    static void bitwiseOperators() {
        System.out.println("\nInside bitwiseOperators ...");
        int x = 1;
        int y = 3;

        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("true & false: " + (true & false));

        char c1 = 'a'; // U+0061 --> 0110 0001
        char c2 = 'b'; // U+0062 --> 0110 0010
        System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

      //   Since bitwise work only on Integer types, following will not compile
//        double d1 = 3.14;
//        double d2 = 5.15;
//        System.out.println("d1 | d2: " + (d1 | d2));
    }

    static void switchExample() {
        System.out.println("\nInside switchExample ...");
        int month = 3;
        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            default: System.out.println("April");
        }
    }

    static boolean ifStatement() {
        boolean approved = false;

        int age = 57;
        int salary = 70000;
        boolean hasBadCredit = false;

        if (age >= 25 && age <= 35 && salary >= 50000) {
            //approved = true;

            System.out.println("age >= 25 && age <= 35 && salary >= 50000");
            return true;
        } else if (age > 35 && age <= 45 && salary >= 70000) {
            //approved = true;
            System.out.println("age > 35 && age <= 45 && salary >= 70000");
            return true;
        } else if (age > 45 && age <= 55 && salary >= 90000) {
            //approved = true;
            System.out.println("age > 45 && age <= 55 && salary >= 90000");
            return true;
        } else {
            if (age > 55 && !hasBadCredit) {
                //approved = true;
                System.out.println("age > 55 && !hasBadCredit");
                return true;
            }
            //System.out.println("else block");
            return false;
        }


        //System.out.println("outside if");
        //return approved;
    }
    public static int BinarySearch(int[] a, int l, int h, int key) {
        if (l == h) {
            if (key == a[l]) {
                return l;
            } else {
                return -1;
            }
        }
        int mid = (l + h) / 2;
        if (key == a[mid]) {
            return mid;
        } else if (key > a[mid]) {
            return BinarySearch(a, mid+1, h, key);
        } else {
            return BinarySearch(a, l, mid-1, key);
        }
    }
    public BasicsDemo(){
        System.out.println("Inside Instance Initializer");
    }
    public BasicsDemo(int id) {
        System.out.println("Inside Constructor with id ...");
    }
    {
        System.out.println("Inside Instance Initializer");
    }
    public static void main(String[] args) {
  /*      String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                "<average_rating>3.79</average_rating>" +
                "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" +
                "<title>Walden</title>" +
                "<author>" +
                "<id type=\"integer\">10264</id>" +
                "<name>Henry David Thoreau</name>" +
                "</author>" +
                "<image_url>" +
                "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                "</image_url>" +
                "<small_image_url>" +
                "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                "</small_image_url>" +
                "</best_book>" +
                "</work>";

        String start = "<id type=\"integer\">";
        String endChar = "<";

           int indexOfStart = response.indexOf(start);
           int theLength = start.length();
           int indexOfLastRule = response.indexOf(endChar, indexOfStart);
           int lastIndexOfStartRule = indexOfStart+theLength;
            System.out.println("index of start : "+indexOfStart);
            System.out.println("the length "+ theLength);
            System.out.println("index of last char "+indexOfLastRule);
            System.out.println("string to return "+ response.substring(lastIndexOfStartRule, indexOfLastRule));
    */        //String m = response.substring(lastIndexOf, mm);
           // System.out.println(m);
//        start.subSequence(7,9);
//        System.out.println(start.length());
//        System.out.println(start.length() +response.indexOf(end));
      //   String[] s = response.split(end);
//        for (int i = 0; i < s.length; i++) {
//
//        }

//            for (String ss : s){
//                String[] innerr = ss.split("\">");
////                String m = innerr[0];
//                System.out.println(m);
//                System.out.println();

//                for (String in : innerr){
//                    System.out.print(in +"   ");
//
//
//                }

 //       }

//        BasicsDemo bs = new BasicsDemo(1);
//        int[] a = {11, 22, 33,44, 55, 66, 77, 88, 99};
//        int bSearch = BinarySearch(a, 0, a.length-1, 11);
//        System.out.println("index " + bSearch +" and the element is "+ a[bSearch]);


        // Language Basics 1
        //print();
        primitives();
        typeCasting();
        //arrays();
        //threeDimensionalArrays();
   /*   varargsOverload(true, 1, 2, 3);
        varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
        varargsOverload(true);*/

      //  preAndPost();
       // compoundArithmeticAssignment();
        //isOddOrEven(51);

        //comparisonOperators();
        //logicalOperators();

        //bitwiseOperators();
        //switchExample();

        //ifStatement();

//        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = iArray.length-1; i >= 0; i--) {
//            System.out.println(iArray[i] + " ");
//        }


//        System.out.println("\n\nReversing Array ... ");
//        for (int i = 0, j = iArray.length-1, middle = iArray.length >>> 1; i < middle; i++, j--) {
//            int temp = iArray[i];
//            iArray[i] = iArray[j];
//            iArray[j] = temp;
//        }
//
//        for (int i = 0; i < iArray.length; i++) {
//            System.out.print(iArray[i] + " ");
//        }
//
//        System.out.println("\n\nCounting divisors ...");
//        int x = 24;
//        int divisorCount = 0;
//        for (int i = 1; i <= x; i++) {
//            if (x % i == 0) {
//                System.out.print(i + " ");
//                divisorCount++;
//            }
//        }
//        System.out.println("\nDivisor Count: " + divisorCount);
//
//        System.out.println("\nDisplaying Student Grades ...");
//        int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};
//        for (int i = 0; i < studentGrades.length; i++) {
//            System.out.print("\nDisplaying grades of students from class " + i + ": ");
//            int max = 0;
//            for (int j = 0; j < studentGrades[i].length; j++) {
//                if (studentGrades[i][j] > max) {
//                    max = studentGrades[i][j];
//                }
//                System.out.print(studentGrades[i][j] + " ");
//            }
//            System.out.println("\nmax: " + max);
//        }


        // for each loop convenient iteration (cleaner syntax)
//        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i <  iArray.length; i++) {
//            System.out.print(iArray[i] + " ");
//        }
//        System.out.println();
//        for(int i : iArray){
//            System.out.print(i + " ");
//        }


//        System.out.println("\n \n Printing rolls of dice ... ");
//        int[] dice1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] dice2 = {1, 2, 3, 4, 5, 6, 7};

//        for (int i = 0; i < dice1.length; i++){
//            for (int j = 0; j < dice2.length; j++){
//                System.out.print(dice1[i] +"  "+ dice2[j]);
//            }
//        }

//        for (int i : dice1){
//            for (int j : dice2){
//                System.out.print(i +"  "+ j);
//
//            }
//        }
//     when would we prefer traditional for : need access to index
//        1. transform array
//        2. parallel iteration
//        for (int i = 0, j = 0; i < dice1.length && j < dice2.length; i++, j++){
//            System.out.print(dice1[i] +" \n "+ dice2[j]);
//        }
//       3. Backward iteration



    //  mathDemo();
    //    boxedPrimitive();
    }

    private static void boxedPrimitive() {
       Integer boxedInt = Integer.valueOf(8); //static factory
       Boolean boxedBoolean = Boolean.valueOf(true);
       Character boxedChar = Character.valueOf('c');
       Double boxedDouble = Double.valueOf(25.5);

//        System.out.println(boxedInt);
////        System.out.println(boxedBoolean);
//        System.out.println(boxedChar);
//        System.out.println(boxedDouble);
//        System.out.println(boxedDouble);
//        Integer boxedIntt = Integer.valueOf("8");
//      Integer invalid= Integer.valueOf("eight");
//        Integer boxedint2 =  new Integer(8);

        //unwrap: typeValue
//        int primitiveInt = boxedInt.intValue();
//        Boolean primitiveBoolean = boxedBoolean.booleanValue();
//        char primitiveChar = boxedChar.charValue();

//        System.out.println(primitiveInt);
//        System.out.println(primitiveChar);


        //1. parsing string: parseType
        String data = "4004  Effective java programming language guide  2001  T  4.50";
        String[] items = data.split("  ");

        long id = Long.parseLong(items[0]);
        String title = items[1];
        int year = Integer.parseInt(items[2]);
        char gender = items[3].charAt(0);
        double rating = Double.parseDouble(items[4]);

        Integer boxedYear = Integer.valueOf(items[2]);
        System.out.println(boxedYear);

        System.out.print(id+" "+title+" "+year+" "+gender+" "+rating +"\n");
        //2. MIN && MAX


        //3. utility method
        Boolean isLetter =   Character.isLetter(gender);
        Boolean isDigit =     Character.isDigit(gender);
        Boolean isLetterOrDigit =     Character.isLetterOrDigit(gender);
        Boolean isUpper =     Character.isUpperCase(gender);

        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isLetterOrDigit);
        System.out.println(isUpper);

        boolean isNan = Double.isNaN(0.0/0.1);
        System.out.println(isNan);

        String binary = Integer.toBinaryString(8);
        System.out.println(binary);

        //populated data structure
        ArrayList idList = new ArrayList();
        idList.add(Long.valueOf(id));
        idList.add(id); // java 5 - auto-boxeng

        //Generic - parameterized type
        ArrayList<Double> ratingList = new ArrayList<>();
        ratingList.add(8.0);


    }

    private static void mathDemo() {
        // Lottery [1, 100]
        double random = Math.random(); // [0.0, 1.0)
        int winner = (int) (random * 100) + 1;

        System.out.println(random);
        System.out.println(winner);

        // round ~ rounding floating point to nearest integers
        long distance1 = Math.round(24.45);
        int distance2 = Math.round(24.5f);

        System.out.println(distance1);
        System.out.println(distance2);

        // ceil ~ round-up
        double ceil1 = Math.ceil(24.45);
        double ceil2 = Math.ceil(25.0);

        System.out.println(ceil1);
        System.out.println(ceil2);

        // floor ~ round down
        double floor1 = Math.floor(24.45);
        double floor2 = Math.floor(25.0);

        System.out.println(floor1);
        System.out.println(floor2);

        double max = Math.max(24.45, 24.5);
        System.out.println(max);

        double abs = Math.abs(-24.45);
        System.out.println(abs);

        double pow = Math.pow(2.0, 4.0);
        System.out.println(pow);

        double nan = 0.0/0.0;
        double sqrt = Math.sqrt(nan);
        System.out.println(nan);
        // Intro to Machine learning ~ "deep learning"
        double idf = Math.log(100/8);
        System.out.println(idf);

        //Math math = new Math();
    }


}
  
