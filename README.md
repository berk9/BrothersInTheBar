# BrothersInTheBar

The console application can be started by going src/BrothersInBar.java and running the main. It is developed using IntelliJ Idea IDE and Java jdk 10.0.2. 

private static boolean IfContainsConsecutive(int[] glasses) - Using the for loop, we capture the first element of a possibly sequential row, and using the if condition, verify that the current element is equal to the next two elements. If boolean = true we have a sequential row of three elements. If boolean = false we continue with the for loop.

private static int[] brothersInTheBar(int[] glasses) - Then we take the array from the main method and declare the variable start, which will be the first element and end, which will be the last element. int shots are the number of elements inserted into the new array. We declare a new array that will have three elements less than the one we take as an argument.Using the for loop, we capture the first element of a possibly sequential row, and using the if condition, verify that the current element is equal to the next two elements and it follows that start = i and end = i + 2 and break. After finding the row and breaking, we have the next two for loops, with the first filling in some of the elements of the new array and with the second filling the rest of the new array.

After performing these two methods, we have one completed round and it repeats until there are no running rounds.
