# Java Streams Practice Questions

## 1. Stream Basics with Lists (10 Questions)

1. Print all elements of a `List` using Streams.
2. Filter all even numbers from a `List<Integer>`.
3. Square all numbers in a `List` using `map()`.
4. Find the sum of all elements in a `List<Integer>`.
5. Count the number of strings with length > 3 in a `List<String>`.
6. Find the maximum value in a `List<Integer>`.
7. Find the minimum value in a `List<Integer>`.
8. Convert all strings in a `List` to uppercase.
9. Collect all odd numbers from a `List` into a new `List`.
10. Remove duplicates from a `List` using Streams.

---

## 2. Stream Operations with Arrays (10 Questions)

11. Convert an array of `int` to a Stream and print elements.
12. Filter out negative numbers from an `int` array.
13. Compute the average of a `double` array.
14. Find the sum of an `int` array using Streams.
15. Count elements greater than 10 in an `int` array.
16. Convert a `String` array to a `List` using Streams.
17. Find all strings that start with “A” in a `String` array.
18. Sort an `int` array in ascending order using Streams.
19. Sort a `double` array in descending order using Streams.
20. Check if all elements in an `int` array are positive.

---

## 3. Stream Operations with Strings (10 Questions)

21. Count vowels in a string using Streams.
22. Find the first repeated character in a string.
23. Find the first non-repeated character in a string.
24. Convert a string to a `List<Character>`.
25. Count the frequency of each character in a string.
26. Reverse a string using Streams.
27. Check if all characters in a string are digits.
28. Convert all words in a sentence to uppercase.
29. Remove duplicate characters from a string.
30. Count words that start with a vowel in a sentence.

---

## 4. Stream Operations with Maps (10 Questions)

31. Convert a `Map`’s keys to a `List` using Streams.
32. Convert a `Map`’s values to a `List`.
33. Filter entries with values > 100.
34. Find the entry with the maximum value.
35. Find the entry with the minimum value.
36. Sum all values in a `Map`.
37. Convert a `Map` to a `List<String>` like “key=value”.
38. Group a list of objects by a field into a `Map`.
39. Count occurrences of words in a `List` using a `Map`.
40. Partition a `Map` into two groups based on a value condition.

---

## 5. Advanced Stream Operations (10 Questions)

41. Flatten a `List<List<T>>` using `flatMap()`.
42. Find the top 3 highest numbers in a `List`.
43. Find the top 3 longest strings in a `List`.
44. Skip the first 5 elements in a Stream.
45. Limit a Stream to the first 10 elements.
46. Find the second highest number in a `List`.
47. Check if any element matches a condition.
48. Check if all elements satisfy a condition.
49. Check if no element satisfies a condition.
50. Use `peek()` to debug intermediate Stream values.

---

## 6. Stream with Optional (10 Questions)

51. Find first element in a `List` using `findFirst()`.
52. Find any element in a `List` using `findAny()`.
53. Find the maximum element safely using `Optional`.
54. Find the minimum element safely using `Optional`.
55. Get the first string starting with “J” or return “N/A”.
56. Count elements greater than 50 and return `Optional`.
57. Find the first number divisible by 7.
58. Find first string containing “abc” using `Optional`.
59. Find the longest string using `Optional`.
60. Handle `Optional` value using `orElse()` and `orElseGet()`.

---

## 7. Stream with Primitives (10 Questions)

61. Sum all numbers in an `IntStream`.
62. Compute average of an `IntStream`.
63. Find max in a `DoubleStream`.
64. Filter all even numbers in an `IntStream`.
65. Convert `IntStream` to `List<Integer>`.
66. Generate first 10 natural numbers using `IntStream.range()`.
67. Square numbers in an `IntStream`.
68. Compute sum of squares of numbers in `IntStream`.
69. Count numbers divisible by 5 in `IntStream`.
70. Find first number greater than 50 in `IntStream`.

---

## 8. Collectors (10 Questions)

71. Collect `List` elements to a `Set`.
72. Join a `List<String>` with comma using `Collectors.joining()`.
73. Partition a list of integers into even and odd numbers.
74. Group a list of strings by their length.
75. Count frequency of each string in a `List`.
76. Sum of all integers in a `List` using `Collectors.summingInt()`.
77. Average of all integers using `Collectors.averagingInt()`.
78. Find max integer using `Collectors.maxBy()`.
79. Find min integer using `Collectors.minBy()`.
80. Convert a list of strings to uppercase and collect to a `List`.

---

## 9. Parallel Streams (10 Questions)

81. Sum numbers from 1 to 1_000_000 using parallel Stream.
82. Count all even numbers in a large list using parallel Stream.
83. Filter and collect all strings starting with “A” in parallel.
84. Find max value in an `int` array using parallel Stream.
85. Convert a `List` of objects to `List` of names using parallel Stream.
86. Count words longer than 5 letters in parallel.
87. Find all distinct elements in parallel Stream.
88. Flatten a `List<List<T>>` in parallel Stream.
89. Group elements by a property using parallel Stream.
90. Sum squares of numbers in parallel.

---

## 10. Real-World / Challenging Stream Problems (10 Questions)

91. Find the top 3 most frequent words in a `List`.
92. Find all prime numbers in a `List` using Streams.
93. Find all palindromes in a `List<String>`.
94. Merge two `List`s and remove duplicates using Streams.
95. Sort a `Map` by values in descending order.
96. Find all strings containing at least 2 vowels.
97. Count distinct characters across all strings in a `List`.
98. Group employees by department and find average salary.
99. Partition numbers into prime and non-prime.
100. Find all pairs in a `List` that sum to a target value.

---

If you want, I can also format this as a `README.md` file structure with sections and progress checkboxes (`- [ ]`) so you can track completion in Git.
