import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//       1.Print all elements of a List using Streams.
         printListElements();

//         2. Filter all even numbers from a List of Integers.
           filterEvenNumbers();

//         3. Square all numbers in a List using map().
           squareNumber();

//          4. Find the sum of all elements in a List of Integers.
            sumOfAllIntegers();

//          5.Count the number of strings with length > 3 in a List.
            lengthGreaterThanThree();
    }

    public static  void lengthGreaterThanThree() {
        System.out.println("---------------------------");
        System.out.println(" 5.Count the number of strings with length > 3 in a List.");

        List<String> listOfNames = List.of("Sohail", "Athiya", "Suraiya", "Nayera","tes", "one", "two");

        long countOfNames = listOfNames.stream()
                        .filter(n -> n.length() > 3)
                        .count();

        System.out.println(countOfNames);
        System.out.println("---------------------------");
    }

    public  static  void sumOfAllIntegers() {
        System.out.println("---------------------------");
        System.out.println("4. Find the sum of all elements in a List of Integers.");
        List<Integer> oneMoreList = List.of(1,2,4,5,6,7);

       int result = oneMoreList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);

        /*
        //.mapToInt(n-> n)     //or you can use this
        */
        System.out.println("---------------------------");
    }

    public  static  void squareNumber() {
        System.out.println("---------------------------");
        System.out.println("Square all numbers in a List using map().");
        List<Integer> newList = List.of(1,2,4,5,6,7);
        newList.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    public  static void filterEvenNumbers() {
        System.out.println("---------------------------");
        System.out.println("Filter all even numbers from a List of Integers");
        List<Integer> numbers = List.of(100,200,203,10,4,3,8,9, 15);
        numbers.stream()
                .filter(n -> n %2 == 0)
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    public static void  printListElements() {
        System.out.println("---------------------------");
        System.out.println("1.Print All elements in List");
        List<Integer> asimpleList = List.of(1,2,3,4,5);
        asimpleList.stream()
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

}