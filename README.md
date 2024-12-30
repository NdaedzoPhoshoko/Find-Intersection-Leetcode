## Problem description

The function FindIntersection(strArr) reads the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string "false".

## Example
Input: new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}   
output: 1,4,13

Input: new String[]{"1, 3, 9, 17, 18", "1, 4, 9, 10"}   
output: 1,9,10

## Problem approach
Split the numbers in first element and store them in a list, then check if each number in second element is contained in the list. For each number, if it is contained append it to the string intersection.
