## Find the equilibrium indices from a given array of integers

Write a Java program to find the equilibrium indices from a given array of integers.

An equilibrium index of a sequence is an index into the sequence such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

For example, in a sequence A:

A0 = -7

A1 = 1

A2 = 5

A3 = 2

A4 = -4

A5 = 3

A6 = 0

3 is an equilibrium index, because:

A0 + A1 + A2 = A4 + A5 + A6

6 is also an equilibrium index, because:

A0 + A1 + A2 + A3 + A4 + A5 = 0

(sum of zero elements is zero)

7 is not an equilibrium index, because it is not a valid index of sequence A.

Example:

Input :

nums = {-7, 1, 5, 2, -4, 3, 0}

Output:

Equilibrium indices found at : 3

Equilibrium indices found at : 6


Task Link: https://www.w3resource.com/java-exercises/array/java-array-exercise-62.php