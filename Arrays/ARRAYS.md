# ARRAYS

###### DEFINATION:

###### An array in  is a fixed-size data structure that stores multiple values of the \*\*same data type\*\* in contiguous memory locations. Arrays are useful when you need to store and process a collection of similar elements.



##### Declaration:

int\[] numbers;

&#x20;    or

int numbers\[];



##### Array Creation:

int\[] numbers = new int\[5];

This creates an array that can store 5 integers. By default, all elements are initialized to `0`.



##### Array Initialization:

int\[] numbers = {10, 20, 30, 40, 50}; // Directly



##### Accessing Array Elements:

Array indexing starts from "0" not from 1.

System.out.println(numbers\[0]); // Output: 10

System.out.println(numbers\[2]); // Output: 30



##### Modifying Array Elements:

numbers\[1] = 25;

System.out.println(numbers\[1]); // Output: 25



##### Traversing an Array

###### >>Using a `for` loop

for (int i = 0; i < numbers.length; i++) {

&#x20;   System.out.println(numbers\[i]);

}



###### Using a `for-each` loop

for (int num : numbers) {

&#x20;   System.out.println(num);

}



##### Finding the Length of an Array:

System.out.println(numbers.length);

###### Output:

###### 5



##### Example Program:

public class ArrayExample {

&#x20;   public static void main(String\[] args) {

&#x20;       int\[] marks = {85, 90, 78, 92, 88};



&#x20;       System.out.println("Marks:");



&#x20;       for (int mark : marks) {

&#x20;           System.out.println(mark);

&#x20;       }



&#x20;       System.out.println("Total subjects: " + marks.length);

&#x20;   }

}

###### Output:

###### Marks:

85

90

78

92

88

Total subjects: 5

#### Types of Arrays in Java:

They are three types:

&#x20;              1.One-Dimensional Array

&#x20;              2.Two-Dimensional Array

&#x20;              3.MultiDimensional Array

##### 1.One-Dimensional Array:

A one-dimensional array is an array that stores elements in a single row or linear sequence.

example:

int\[] arr = {1, 2, 3, 4, 5};



##### 2.Two-Dimensional Array:

A two-dimensional array stores elements in the form of rows and columns, like a table or matrix.

example:

int\[]\[] matrix = {

&#x20;   {1, 2, 3},

&#x20;   {4, 5, 6}

};

System.out.println(matrix\[1]\[2]);

###### &#x20;Output: 6



##### 3.Multidimensional Array:

A multidimensional array is an array with more than two dimensions.

int\[]\[]\[] cube = new int\[2]\[3]\[4];



#### Advantages:

> Stores multiple values of the same type.

> Fast access using indexes (`O(1)`).

> Easy to traverse using loops.

> Efficient memory usage for fixed-size collections.



#### Disadvantages:

>Fixed size (cannot grow or shrink after creation).

>Can store only one data type.

>Inserting or deleting elements is inefficient because elements must be shifted.



#### Summary:

\* Arrays store elements of the same data type.

\* Indexing starts from 0.

\* The size is fixed after creation.

\* Use .length to get the number of elements.

\* Arrays can be one-dimensional or multidimensional.



##### EXAMPLE FOR TAKING INPUTS FROM USER TO EACH ARRAY TYPE:



###### 1D Array:

int n=sc.nextInt()                // no.of elements :3

int array\[]=new int\[n]           // Array Initialization

for(int i=0;i<n;i++) 

&#x20; array\[i]=sc.nextInt();           //Storing element in each index;

for(int i=0;i<n;i++)

&#x20;    System.out.print(array\[i]);  //printing each element;



###### 2D Array:(used for matrix)

int n=sc.nextInt();

int m=sc.nextInt();

int array\[]\[]=new int\[n]\[m]

for(int i=0;i<n;i++)

&#x20;  for(int j=0;j<n;j++)

&#x20;       a\[i]\[j]=sc.nextInt();

for(int i=0;i<n;i++)

&#x20;  for(int j=0;j<n;j++)

&#x20;        System.out.print(array\[i]\[j]);

#### QUESTIONS:

1\. Find the largest and smallest element

2\. Count even and odd numbers

3\. Reverse an array

4\. Find the second largest element

5\. Move all zeros to the end

6\. Find the missing number

7\. Find a pair with a given sum







