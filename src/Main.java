import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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

//           6. Find the maximum value in a List<Integer>
             maxFromList();

//           7. Find the minimum value in a List<Integer>
             minFromList();

//            8. List of Strings to Upper
             stringToUpper();

//            9 . Collect Odd number to new List
              collectOdd();

//              10. Remove duplicates from a List using Streams.
              removeDuplicates();

//             11. Convert an array of `int` to a Stream and print elements.
               convertArrayOfInt();

//             12. Filter negative Number from int array
               removeNegativeNumbers();

//            13. Compute the average of a `double` array.
               doubleAverage();

//            14. Find the sum of an `int` array using Streams.
               sumOfIntArray();

//            15. Count elements greater than 10 in an `int` array.
               countElementsGreaterThanTen();

//            16. Convert a `String` array to a `List` using Streams.
               convertStringArrayToList();

//            17. Find all strings that start with "A" in a `String` array.
               findStringsStartingWithA();

//            18. Sort an `int` array in ascending order using Streams.
               sortIntArrayAscending();

//            19. Sort a `double` array in descending order using Streams.
               sortDoubleArrayDescending();

//            20. Check if all elements in an `int` array are positive.
               checkAllElementsPositive();

//            21. Count vowels in a string using Streams.
               countVowelsInString();

//            22. Find the first repeated character in a string.
               findFirstRepeatedCharacter();

//            23. Find the first non-repeated character in a string.
               findFirstNonRepeatedCharacter();

//            24. Convert a string to a `List<Character>`.
               convertStringToCharList();

//            25. Count the frequency of each character in a string.
               countCharacterFrequency();

//            26. Reverse a string using Streams.
               reverseStringUsingStreams();

//            27. Check if all characters in a string are digits.
               checkAllCharactersAreDigits();

//            28. Convert all words in a sentence to uppercase.
               convertWordsToUppercase();

//            29. Remove duplicate characters from a string.
               removeDuplicateCharacters();

//            30. Count words that start with a vowel in a sentence.
               countWordsStartingWithVowel();

//            31. Convert a `Map`'s keys to a `List` using Streams.
               convertMapKeysToList();

//            32. Convert a `Map`'s values to a `List`.
               convertMapValuesToList();

//            33. Filter entries with values > 100.
               filterEntriesGreaterThan100();

//            34. Find the entry with the maximum value.
               findEntryWithMaxValue();

//            35. Find the entry with the minimum value.
               findEntryWithMinValue();

//            36. Sum all values in a `Map`.
               sumAllMapValues();

//            37. Convert a `Map` to a `List<String>` like "key=value".
               convertMapToKeyValueList();

//            38. Group a list of objects by a field into a `Map`.
               groupObjectsByField();

//            39. Count occurrences of words in a `List` using a `Map`.
               countWordOccurrences();

//            40. Partition a `Map` into two groups based on a value condition.
               partitionMapByCondition();

//            41. Flatten a `List<List<T>>` using `flatMap()`.
               flattenListOfLists();

//            42. Find the top 3 highest numbers in a `List`.
               findTop3HighestNumbers();

//            43. Find the top 3 longest strings in a `List`.
               findTop3LongestStrings();

//            44. Skip the first 5 elements in a Stream.
               skipFirst5Elements();

//            45. Limit a Stream to the first 10 elements.
               limitToFirst10Elements();

//            46. Find the second highest number in a `List`.
               findSecondHighestNumber();

//            47. Check if any element matches a condition.
               checkAnyElementMatches();

//            48. Check if all elements satisfy a condition.
               checkAllElementsSatisfy();

//            49. Check if no element satisfies a condition.
               checkNoElementSatisfies();

//            50. Use `peek()` to debug intermediate Stream values.
               usePeekForDebugging();

//            51. Find first element in a `List` using `findFirst()`.
               findFirstElement();

//            52. Find any element in a `List` using `findAny()`.
               findAnyElement();

//            53. Find the maximum element safely using `Optional`.
               findMaxElementWithOptional();

//            54. Find the minimum element safely using `Optional`.
               findMinElementWithOptional();

//            55. Get the first string starting with "J" or return "N/A".
               findFirstStringStartingWithJ();

//            56. Count elements greater than 50 and return `Optional`.
               countElementsGreaterThan50();

//            57. Find the first number divisible by 7.
               findFirstNumberDivisibleBy7();

//            58. Find first string containing "abc" using `Optional`.
               findFirstStringContainingAbc();

//            59. Find the longest string using `Optional`.
               findLongestStringWithOptional();

//            60. Handle `Optional` value using `orElse()` and `orElseGet()`.
               handleOptionalWithOrElse();

//            61. Sum all numbers in an `IntStream`.
               sumIntStream();

//            62. Compute average of an `IntStream`.
               computeIntStreamAverage();

//            63. Find max in a `DoubleStream`.
               findMaxInDoubleStream();

//            64. Filter all even numbers in an `IntStream`.
               filterEvenNumbersInIntStream();

//            65. Convert `IntStream` to `List<Integer>`.
               convertIntStreamToList();

//            66. Generate first 10 natural numbers using `IntStream.range()`.
               generateFirst10NaturalNumbers();

//            67. Square numbers in an `IntStream`.
               squareNumbersInIntStream();

//            68. Compute sum of squares of numbers in `IntStream`.
               sumOfSquaresInIntStream();

//            69. Count numbers divisible by 5 in `IntStream`.
               countNumbersDivisibleBy5();

//            70. Find first number greater than 50 in `IntStream`.
               findFirstNumberGreaterThan50();

//            71. Collect `List` elements to a `Set`.
               collectListToSet();

//            72. Join a `List<String>` with comma using `Collectors.joining()`.
               joinListWithComma();

//            73. Partition a list of integers into even and odd numbers.
               partitionIntoEvenAndOdd();

//            74. Group a list of strings by their length.
               groupStringsByLength();

//            75. Count frequency of each string in a `List`.
               countStringFrequency();

//            76. Sum of all integers in a `List` using `Collectors.summingInt()`.
               sumIntegersUsingCollectors();

//            77. Average of all integers using `Collectors.averagingInt()`.
               averageIntegersUsingCollectors();

//            78. Find max integer using `Collectors.maxBy()`.
               findMaxUsingCollectors();

//            79. Find min integer using `Collectors.minBy()`.
               findMinUsingCollectors();

//            80. Convert a list of strings to uppercase and collect to a `List`.
               convertToUppercaseAndCollect();

//            81. Sum numbers from 1 to 1_000_000 using parallel Stream.
               sumNumbersParallel();

//            82. Count all even numbers in a large list using parallel Stream.
               countEvenNumbersParallel();

//            83. Filter and collect all strings starting with "A" in parallel.
               filterStringsStartingWithAParallel();

//            84. Find max value in an `int` array using parallel Stream.
               findMaxValueParallel();

//            85. Convert a `List` of objects to `List` of names using parallel Stream.
               convertObjectsToNamesParallel();

//            86. Count words longer than 5 letters in parallel.
               countWordsLongerThan5Parallel();

//            87. Find all distinct elements in parallel Stream.
               findDistinctElementsParallel();

//            88. Flatten a `List<List<T>>` in parallel Stream.
               flattenListsParallel();

//            89. Group elements by a property using parallel Stream.
               groupElementsByPropertyParallel();

//            90. Sum squares of numbers in parallel.
               sumSquaresParallel();

//            91. Find the top 3 most frequent words in a `List`.
               findTop3MostFrequentWords();

//            92. Find all prime numbers in a `List` using Streams.
               findAllPrimeNumbers();

//            93. Find all palindromes in a `List<String>`.
               findAllPalindromes();

//            94. Merge two `List`s and remove duplicates using Streams.
               mergeTwoListsRemoveDuplicates();

//            95. Sort a `Map` by values in descending order.
               sortMapByValuesDescending();

//            96. Find all strings containing at least 2 vowels.
               findStringsWithAtLeast2Vowels();

//            97. Count distinct characters across all strings in a `List`.
               countDistinctCharactersAcrossStrings();

//            98. Group employees by department and find average salary.
               groupEmployeesByDepartment();

//            99. Partition numbers into prime and non-prime.
               partitionIntoPrimeAndNonPrime();

//            100. Find all pairs in a `List` that sum to a target value.
               findPairsSumToTarget();

    }

    public static void  printListElements() {
        System.out.println("---------------------------");
        System.out.println("1.Print All elements in List");
        List<Integer> asimpleList = List.of(1,2,3,4,5);
        asimpleList.stream()
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

    public  static  void squareNumber() {
        System.out.println("---------------------------");
        System.out.println("Square all numbers in a List using map().");
        List<Integer> newList = List.of(1,2,4,5,6,7);
        newList.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
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

    public static void maxFromList() {
        System.out.println("---------------------------");
        System.out.println(" 6. Find the maximum value in a List<Integer>");
        List<Integer> intList = List.of(1,5,6,9,0,3,2,4,11,65,111,444,4,33,676);
       int result =  intList.stream()
                .reduce((a,b) -> a > b ? a : b)
               .orElse(0);

       System.out.print(result);
       System.out.println("---------------------------");
    }

    public static void minFromList() {
        System.out.println("---------------------------");
        System.out.println(" 7. Find the minimum value in a List<Integer>");
        List<Integer> minList = List.of(33,44,33,1,2,3);

        int result = minList.stream()
                .reduce((a,b) -> a < b ? a : b)
                .orElse(0);

        // the other way using lambda
        int max = minList.stream()
                .max(Integer::compare).orElse(0);

        int min = minList.stream()
                .min(Integer::compare).orElse(0);

        System.out.print(result);
        System.out.println("---------------------------");
    }

    public static void stringToUpper() {
        System.out.println("---------------------------");
        System.out.println(" 8. List of Strings to Upper");
        List<String> strList = List.of("sohail", "rahman", "gowher", "athiya", "suraiya", "nayera");
        strList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    public static void collectOdd() {
        System.out.println("---------------------------");
        System.out.println("9. Collect Odd number to List");
        List<Integer> numbers = List.of(33,44,33,1,2,3,5,11,23,24);
        List<Integer> oddnumbers  = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
//              .collect(Collectors.toList());    can use this too
        System.out.println(oddnumbers);
        System.out.println("---------------------------");
    }

    public static void removeDuplicates() {
        System.out.println("---------------------------");
        System.out.println(" 10. Remove duplicates from a List using Streams.");
        List<Integer> numbers = List.of(33,2,44,33,1,2,3,5,11,1,23,24,23);
        List<Integer> unique  = numbers.stream()
                .distinct()
                .toList();
        System.out.println(unique);
        System.out.println("---------------------------");
    }

    public static void convertArrayOfInt() {
        System.out.println("---------------------------");
        System.out.println("11. Convert an array of `int` to a Stream and print elements.");
        int [] arr = {1,2,3,4,5};
         Arrays.stream(arr)
                 .forEach(System.out::println);
        System.out.println("---------------------------");

    }

    public static void removeNegativeNumbers() {
        System.out.println("---------------------------");
        System.out.println("12. Filter negative Number from int array");

        int [] arrayOne = {1,-2,4,-3,5,-6,9};
        Arrays.stream(arrayOne)
                .filter(n -> n > 0)
                .forEach(System.out::println);
        System.out.println("---------------------------");

    }

    public static void doubleAverage() {
        System.out.println("---------------------------");
        System.out.println("13. Compute the average of a `double` array.");
         double [] dobArray = {10,20,30,400,1000};
       OptionalDouble result = Arrays.stream(dobArray)
                .average();
       System.out.print(result);
       System.out.println("---------------------------");

    }

    public static void sumOfIntArray() {
        System.out.println("---------------------------");
        System.out.println("14. Find the sum of an `int` array using Streams.");
        int [] intArray = {1,2,3,4,5,6};
       OptionalInt result = Arrays.stream(intArray)
                .reduce(Integer::sum);
        if (result.isPresent()) {
            System.out.println(result.getAsInt());
        } else {
            System.out.println("Result not present");
        }
        System.out.println("---------------------------");
    }

    public static void countElementsGreaterThanTen() {
        System.out.println("---------------------------");
        System.out.println("15. Count elements greater than 10 in an `int` array.");
        int [] intArray = {11,2,3,4,52,46};
        long count = Arrays.stream(intArray)
                .filter(n -> n > 10)
                .count();
        System.out.println(count);
        System.out.println("---------------------------");
    }

    public static void convertStringArrayToList() {
        System.out.println("---------------------------");
        System.out.println("16. Convert a `String` array to a `List` using Streams.");
        String [] newString = {"Sohail", "Ramdhas", "Micheal", "Prabhakar", "Manoj", "Senthil"};

        List<String> friendsList = Arrays.stream(newString)
                .toList();
        System.out.println(friendsList);
        System.out.println("---------------------------");
        // important info : to modify list use .collect(collector.toList())
    }

    public static void findStringsStartingWithA() {
        System.out.println("---------------------------");
        System.out.println("17. Find all strings that start with \"A\" in a `String` array.");
        String [] newString = {"Amritsar", "All", "Made", "Pass", "Madness", "Aura"};
        Arrays.stream(newString)
                .filter(n -> n.startsWith("A"))
        .forEach(System.out::println);
    }

    public static void sortIntArrayAscending() {
        System.out.println("---------------------------");
        System.out.println("18. Sort an `int` array in ascending order using Streams.");
        int [] intArr = {9,7,4,1,4,5};
        Arrays.stream(intArr)
                .sorted()
                .forEach(System.out::println);
    }

    public static void sortDoubleArrayDescending() {
        System.out.println("---------------------------");
        System.out.println("19. Sort a `double` array in descending order using Streams.");
        double [] doubleArr = {9,7,4,1,4,5};
        Arrays.stream(doubleArr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("---------------------------");
    }

    public static void checkAllElementsPositive() {
        System.out.println("---------------------------");
        System.out.println("20. Check if all elements in an `int` array are positive.");
        int [] intArr = {9,7,4,1,4,5};
        boolean result = Arrays.stream(intArr)
                .allMatch(n-> n>0);
        System.out.println(result);
        System.out.println("---------------------------");
    }

    public static void countVowelsInString() {
        System.out.println("---------------------------");
        System.out.println("21. Count vowels in a string using Streams.");
        String name = "SohailUrRahman";
        //{a,e,i,o,u}
        long count = name.chars()
                .mapToObj(c -> (char) c)
                .filter(n -> "aeiouAEIOU".indexOf(n) != -1)
                .count();
        System.out.println(count);
        System.out.println("---------------------------");
    }

    public static void findFirstRepeatedCharacter() {
        System.out.println("---------------------------");
        System.out.println("22. Find the first repeated character in a string.");

        String someString = "There is one beautiful butterfly";
        Set<Character> seen = new HashSet<>();

        Optional<Character> firstRepeated =  someString.chars()
                .mapToObj(c -> (char) c )
                .filter(c -> !seen.add(c))
                .findFirst();
        if (firstRepeated.isPresent()) {
            System.out.println("First repeated character: " + firstRepeated.get());
        } else {
            System.out.println("No repeated characters found.");
        }
        System.out.println("---------------------------");

    }

    public static void findFirstNonRepeatedCharacter() {
        System.out.println("---------------------------");
        System.out.println("Find the first non-repeated character in a string.");
        String str = "There is one beautiful butterfly";
        Map<Character, Long> frequencyMap = str.chars()                      // IntStream
                .mapToObj(c -> (char)c)         // Stream<Character>
                .collect(Collectors.groupingBy( // group by character
                        Function.identity(),
                        LinkedHashMap::new,       // keep insertion order
                        Collectors.counting()     // count occurrences
                ));

        Optional<Character> firstNonRepeated = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1) // only count 1
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstNonRepeated.isPresent()) {
            System.out.println("First non-repeated character: " + firstNonRepeated.get());
        } else {
            System.out.println("No non-repeated characters found.");
        }

        System.out.println("---------------------------");
    }

    public static void convertStringToCharList() {
        System.out.println("---------------------------");
        System.out.println("24. Convert a string to a `List<Character>`.");

        String str = "Lorem ipsum dolor";

        List<Character> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(toList());
        System.out.println(result);
        System.out.println("---------------------------");
    }

    public static void countCharacterFrequency() {
        System.out.println("---------------------------");
        System.out.println("25. Count the frequency of each character in a string.");
        String str = "SohailUrRahmanShaik";
        Map<Character, Long> result =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()
                        ));

        System.out.println(result.get('a'));

    }

    public static void reverseStringUsingStreams() {
        System.out.println("-------------NU--------------");
        System.out.println("26. Reverse a string using Streams.");
        String str = "SohailUrRahmanShaik";

        String reversed =
                IntStream.range(0, str.length())
                        .mapToObj(i -> str.charAt(str.length() - 1 - i))
                        .map(String::valueOf)
                        .collect(Collectors.joining());

        System.out.println(reversed);
        System.out.println("-------------NU-------------");

    }

    public static void checkAllCharactersAreDigits() {
        System.out.println("---------------------------");
        System.out.println("27. Check if all characters in a string are digits.");
        String dig = "123456";
        boolean isaNumberDigit = dig.chars()
                .allMatch(Character::isDigit);
        System.out.println(isaNumberDigit);
    }

    public static void convertWordsToUppercase() {
        System.out.println("---------------------------");
        System.out.println("28. Convert all words in a sentence to uppercase.");

            String sentence = "java streams are powerful";

            String result = Arrays.stream(sentence.split(" "))
                    .map(String::toUpperCase)
                    .collect(Collectors.joining(" "));

            System.out.println(result);

    }

    public static void removeDuplicateCharacters() {
        System.out.println("---------------------------");
        System.out.println("29. Remove duplicate characters from a string.");
        String allChar = "ThereWere some cat in";
        Set<String> someSet = new HashSet<>();
        allChar.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> someSet.add(String.valueOf(c)))
                .forEach(System.out::println);

// Another solution below :: IMPORTANT
//        String result = allChar.chars()
//                .distinct()
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());

    }

    public static void countWordsStartingWithVowel() {
        System.out.println("---------------------------");
        System.out.println("30. Count words that start with a vowel in a sentence.");

        String sentence = "An elephant is under a umbrella";

            long count = Arrays.stream(sentence.split("\\s+"))
                    .filter(word -> !word.isEmpty())
                    .filter(word ->
                            "aeiouAEIOU".indexOf(word.charAt(0)) != -1)
                    .count();

            System.out.println(count);



    }

    public static void convertMapKeysToList() {
        System.out.println("---------------------------");
        System.out.println("31. Convert a `Map`'s keys to a `List` using Streams.");
        Map<String, Integer> aMap = Map.of(
                "Alice", 85,
                "Bob", 92,
                "Charlie", 78,
                "Diana", 95
        );

       List<String> keyStrings =  aMap.keySet().stream()
               .toList();
        System.out.println(keyStrings);
        System.out.println("---------------------------");

    }

    public static void convertMapValuesToList() {
        System.out.println("---------------------------");
        System.out.println("32. Convert a `Map`'s values to a `List`.");

        Map<String, Integer> someMap = Map.of(
          "sohail",36,
          "ramdhas",35,
          "pawan", 37
        );

       List<Integer> allValues =  someMap.values().stream()
                .toList();
        System.out.println(allValues);
        System.out.println("---------------------------");

    }

    public static void filterEntriesGreaterThan100() {
        System.out.println("---------------------------");
        System.out.println("33. Filter entries with values > 100.");
        Map<String, Integer> map = Map.of(
                "Apple", 150,
                "Banana", 80,
                "Orange", 200,
                "Grapes", 50
        );
        map.values().stream()
                .filter(n -> n > 100)
                .forEach(System.out::println);

    }

    public static void findEntryWithMaxValue() {
        System.out.println("---------------------------");
        System.out.println("34. Find the entry with the maximum value.");

        Map<String, Integer> map = Map.of(
                "Apple", 150,
                "Banana", 80,
                "Orange", 200,
                "Grapes", 50
        );
        Optional<Map.Entry<String, Integer>> maxEntry =  map.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(maxEntry);
    }

    public static void findEntryWithMinValue() {
        System.out.println("---------------------------");
        System.out.println("35. Find the entry with the minimum value.");
        Map<String, Integer> map = Map.of(
                "Apple", 150,
                "Banana", 80,
                "Orange", 200,
                "Grapes", 50
        );
        Optional<Map.Entry<String, Integer>> maxEntry =  map.entrySet().stream()
                .min(Map.Entry.comparingByValue());

        System.out.println(maxEntry);
    }

    public static void sumAllMapValues() {
        System.out.println("---------------------------");
        System.out.println("36. Sum all values in a `Map`.");
        Map<String, Integer> map = Map.of(
                "Apple", 150,
                "Banana", 80,
                "Orange", 200,
                "Grapes", 50
        );
        Integer result =  map.values()
                .stream().reduce(Integer::sum)
                        .orElse(0);
        System.out.println(result);
        System.out.println("---------------------------");

    }

    public static void convertMapToKeyValueList() {
        System.out.println("---------------------------");
        System.out.println("37. Convert a `Map` to a `List<String>` like \"key=value\".");
        Map<String, Integer> map = Map.of(
                "Apple", 150,
                "Banana", 80,
                "Orange", 200,
                "Grapes", 50
        );

        List<String> result = map.entrySet().stream()
                .map(n -> n.getKey() + "=" + n.getValue())
                .toList();

        System.out.println(result);

    }

    public static void groupObjectsByField() {
        System.out.println("---------------------------");
        System.out.println("38. Group a list of objects by a field into a `Map`.");

        List<Employee> e = List.of(new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"));


        Map<String, List<Employee>> someList = e.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(someList);
    }

    public static void countWordOccurrences() {
        System.out.println("---------------------------");
        System.out.println("39. Count occurrences of words in a `List` using a `Map`.");
        List<String> words = List.of(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape", "orange"
        );

        Map<String,Long> result =  words.stream()
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(result);
    }

    public static void partitionMapByCondition() {
        System.out.println("---------------------------");
        System.out.println("40. Partition a `Map` into two groups based on a value condition.");
        Map<String, Integer> marks = Map.of(
                "Sohail", 50,
                "Ramdas", 100,
                "Manoj", 49,
                "Sentil", 4
        );

        Map<Boolean, List<Map.Entry<String, Integer>>> result = marks.entrySet().stream()
                .collect(Collectors.groupingBy(n-> n.getValue() >= 50));

        System.out.println(result);

    }

    public static void flattenListOfLists() {
        System.out.println("---------------------------");
        System.out.println("41. Flatten a `List<List<T>>` using `flatMap()`.");
        List<List<String>> nestedWords = List.of(
                List.of("apple", "banana"),
                List.of("cat", "dog", "elephant"),
                List.of("fish")
        );
        List<String> someString = nestedWords.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(someString);
    }

    public static void findTop3HighestNumbers() {
        System.out.println("---------------------------");
        System.out.println("42. Find the top 3 highest numbers in a `List`.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }

    public static void findTop3LongestStrings() {
        System.out.println("---------------------------");
        System.out.println("43. Find the top 3 longest strings in a `List`.");
        List<String> strings = List.of("apple", "banana", "cat", "dog", "elephant", "fish");
        strings.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    public static void skipFirst5Elements() {
        System.out.println("---------------------------");
        System.out.println("44. Skip the first 5 elements in a Stream.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);
    }

    public static void limitToFirst10Elements() {
        System.out.println("---------------------------");
        System.out.println("45. Limit a Stream to the first 10 elements.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .limit(10)
                .forEach(System.out::println);
    }

    public static void findSecondHighestNumber() {
        System.out.println("---------------------------");
        System.out.println("46. Find the second highest number in a `List`.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void checkAnyElementMatches() {
        System.out.println("---------------------------");
        System.out.println("47. Check if any element matches a condition.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean result = numbers.stream()
                .anyMatch(n -> n > 5);
        System.out.println(result);
    }

    public static void checkAllElementsSatisfy() {
        System.out.println("---------------------------");
        System.out.println("48. Check if all elements satisfy a condition.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean result = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(result);
    }

    public static void checkNoElementSatisfies() {
        System.out.println("---------------------------");
        System.out.println("49. Check if no element satisfies a condition.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean result = numbers.stream()
                .noneMatch(n -> n > 10);
        System.out.println(result);
    }

    public static void usePeekForDebugging() {
        System.out.println("---------------------------");
        System.out.println("50. Use `peek()` to debug intermediate Stream values.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .peek(System.out::println)
                .forEach(System.out::println);
    }

    public static void findFirstElement() {
        System.out.println("---------------------------");
        System.out.println("51. Find first element in a `List` using `findFirst()`.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       List<Integer> someValue = numbers.stream()
                .findFirst()
                .stream().toList();
        System.out.println(someValue);
    }

    public static void findAnyElement() {
        System.out.println("---------------------------");
        System.out.println("52. Find any element in a `List` using `findAny()`.");
    }

    public static void findMaxElementWithOptional() {
        System.out.println("---------------------------");
        System.out.println("53. Find the maximum element safely using `Optional`.");
    }

    public static void findMinElementWithOptional() {
        System.out.println("---------------------------");
        System.out.println("54. Find the minimum element safely using `Optional`.");
    }

    public static void findFirstStringStartingWithJ() {
        System.out.println("---------------------------");
        System.out.println("55. Get the first string starting with \"J\" or return \"N/A\".");
    }

    public static void countElementsGreaterThan50() {
        System.out.println("---------------------------");
        System.out.println("56. Count elements greater than 50 and return `Optional`.");
    }

    public static void findFirstNumberDivisibleBy7() {
        System.out.println("---------------------------");
        System.out.println("57. Find the first number divisible by 7.");
    }

    public static void findFirstStringContainingAbc() {
        System.out.println("---------------------------");
        System.out.println("58. Find first string containing \"abc\" using `Optional`.");
    }

    public static void findLongestStringWithOptional() {
        System.out.println("---------------------------");
        System.out.println("59. Find the longest string using `Optional`.");
    }

    public static void handleOptionalWithOrElse() {
        System.out.println("---------------------------");
        System.out.println("60. Handle `Optional` value using `orElse()` and `orElseGet()`.");
    }

    public static void sumIntStream() {
        System.out.println("---------------------------");
        System.out.println("61. Sum all numbers in an `IntStream`.");
    }

    public static void computeIntStreamAverage() {
        System.out.println("---------------------------");
        System.out.println("62. Compute average of an `IntStream`.");
    }

    public static void findMaxInDoubleStream() {
        System.out.println("---------------------------");
        System.out.println("63. Find max in a `DoubleStream`.");
    }

    public static void filterEvenNumbersInIntStream() {
        System.out.println("---------------------------");
        System.out.println("64. Filter all even numbers in an `IntStream`.");
    }

    public static void convertIntStreamToList() {
        System.out.println("---------------------------");
        System.out.println("65. Convert `IntStream` to `List<Integer>`.");
    }

    public static void generateFirst10NaturalNumbers() {
        System.out.println("---------------------------");
        System.out.println("66. Generate first 10 natural numbers using `IntStream.range()`.");
    }

    public static void squareNumbersInIntStream() {
        System.out.println("---------------------------");
        System.out.println("67. Square numbers in an `IntStream`.");
    }

    public static void sumOfSquaresInIntStream() {
        System.out.println("---------------------------");
        System.out.println("68. Compute sum of squares of numbers in `IntStream`.");
    }

    public static void countNumbersDivisibleBy5() {
        System.out.println("---------------------------");
        System.out.println("69. Count numbers divisible by 5 in `IntStream`.");
    }

    public static void findFirstNumberGreaterThan50() {
        System.out.println("---------------------------");
        System.out.println("70. Find first number greater than 50 in `IntStream`.");
    }

    public static void collectListToSet() {
        System.out.println("---------------------------");
        System.out.println("71. Collect `List` elements to a `Set`.");
    }

    public static void joinListWithComma() {
        System.out.println("---------------------------");
        System.out.println("72. Join a `List<String>` with comma using `Collectors.joining()`.");
    }

    public static void partitionIntoEvenAndOdd() {
        System.out.println("---------------------------");
        System.out.println("73. Partition a list of integers into even and odd numbers.");
    }

    public static void groupStringsByLength() {
        System.out.println("---------------------------");
        System.out.println("74. Group a list of strings by their length.");
    }

    public static void countStringFrequency() {
        System.out.println("---------------------------");
        System.out.println("75. Count frequency of each string in a `List`.");
    }

    public static void sumIntegersUsingCollectors() {
        System.out.println("---------------------------");
        System.out.println("76. Sum of all integers in a `List` using `Collectors.summingInt()`.");
    }

    public static void averageIntegersUsingCollectors() {
        System.out.println("---------------------------");
        System.out.println("77. Average of all integers using `Collectors.averagingInt()`.");
    }

    public static void findMaxUsingCollectors() {
        System.out.println("---------------------------");
        System.out.println("78. Find max integer using `Collectors.maxBy()`.");
    }

    public static void findMinUsingCollectors() {
        System.out.println("---------------------------");
        System.out.println("79. Find min integer using `Collectors.minBy()`.");
    }

    public static void convertToUppercaseAndCollect() {
        System.out.println("---------------------------");
        System.out.println("80. Convert a list of strings to uppercase and collect to a `List`.");
    }

    public static void sumNumbersParallel() {
        System.out.println("---------------------------");
        System.out.println("81. Sum numbers from 1 to 1_000_000 using parallel Stream.");
    }

    public static void countEvenNumbersParallel() {
        System.out.println("---------------------------");
        System.out.println("82. Count all even numbers in a large list using parallel Stream.");
    }

    public static void filterStringsStartingWithAParallel() {
        System.out.println("---------------------------");
        System.out.println("83. Filter and collect all strings starting with \"A\" in parallel.");
    }

    public static void findMaxValueParallel() {
        System.out.println("---------------------------");
        System.out.println("84. Find max value in an `int` array using parallel Stream.");
    }

    public static void convertObjectsToNamesParallel() {
        System.out.println("---------------------------");
        System.out.println("85. Convert a `List` of objects to `List` of names using parallel Stream.");
    }

    public static void countWordsLongerThan5Parallel() {
        System.out.println("---------------------------");
        System.out.println("86. Count words longer than 5 letters in parallel.");
    }

    public static void findDistinctElementsParallel() {
        System.out.println("---------------------------");
        System.out.println("87. Find all distinct elements in parallel Stream.");
    }

    public static void flattenListsParallel() {
        System.out.println("---------------------------");
        System.out.println("88. Flatten a `List<List<T>>` in parallel Stream.");
    }

    public static void groupElementsByPropertyParallel() {
        System.out.println("---------------------------");
        System.out.println("89. Group elements by a property using parallel Stream.");
    }

    public static void sumSquaresParallel() {
        System.out.println("---------------------------");
        System.out.println("90. Sum squares of numbers in parallel.");
    }

    public static void findTop3MostFrequentWords() {
        System.out.println("---------------------------");
        System.out.println("91. Find the top 3 most frequent words in a `List`.");
    }

    public static void findAllPrimeNumbers() {
        System.out.println("---------------------------");
        System.out.println("92. Find all prime numbers in a `List` using Streams.");
    }

    public static void findAllPalindromes() {
        System.out.println("---------------------------");
        System.out.println("93. Find all palindromes in a `List<String>`.");
    }

    public static void mergeTwoListsRemoveDuplicates() {
        System.out.println("---------------------------");
        System.out.println("94. Merge two `List`s and remove duplicates using Streams.");
    }

    public static void sortMapByValuesDescending() {
        System.out.println("---------------------------");
        System.out.println("95. Sort a `Map` by values in descending order.");
    }

    public static void findStringsWithAtLeast2Vowels() {
        System.out.println("---------------------------");
        System.out.println("96. Find all strings containing at least 2 vowels.");
    }

    public static void countDistinctCharactersAcrossStrings() {
        System.out.println("---------------------------");
        System.out.println("97. Count distinct characters across all strings in a `List`.");
    }

    public static void groupEmployeesByDepartment() {
        System.out.println("---------------------------");
        System.out.println("98. Group employees by department and find average salary.");
    }

    public static void partitionIntoPrimeAndNonPrime() {
        System.out.println("---------------------------");
        System.out.println("99. Partition numbers into prime and non-prime.");
    }

    public static void findPairsSumToTarget() {
        System.out.println("---------------------------");
        System.out.println("100. Find all pairs in a `List` that sum to a target value.");
    }

}