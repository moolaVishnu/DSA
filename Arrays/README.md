# DSA - Arrays in Java

A comprehensive guide and reference for **Arrays in Data Structures and Algorithms (DSA)** using Java.

---

## 📌 1. Definition

An **array** in Java is a fixed-size data structure that stores multiple values of the **same data type** in contiguous memory locations. Arrays are essential for storing and processing linear collections of data efficiently.

---

## ⚙️ 2. Array Declaration & Creation

### Declaration
```java
int[] numbers; // Recommended syntax
// or
int numbers[];
```

### Creation & Allocation
```java
int[] numbers = new int[5]; // Creates an array of 5 integers (default initialized to 0)
```

### Direct Initialization
```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

## 🔍 3. Basic Operations

### Accessing Elements
> Note: Array indexing in Java is **0-based**.

```java
System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30
```

### Modifying Elements
```java
numbers[1] = 25;
System.out.println(numbers[1]); // Output: 25
```

### Finding Length
```java
System.out.println(numbers.length); // Output: 5
```

---

## 🔄 4. Traversing an Array

### Using a standard `for` loop
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using an enhanced `for-each` loop
```java
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 💡 5. Complete Java Code Example

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Total subjects: " + marks.length);
    }
}
```

### Output:
```text
Marks:
85
90
78
92
88
Total subjects: 5
```

---

## 📐 6. Types of Arrays

### 1. One-Dimensional (1D) Array
Stores elements in a single linear sequence.
```java
int[] arr = {1, 2, 3, 4, 5};
```

#### Taking User Input for 1D Array:
```java
import java.util.Scanner;

public class OneDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of elements
        int[] array = new int[n];

        // Storing elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Printing elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
```

---

### 2. Two-Dimensional (2D) Array (Matrix)
Stores elements in rows and columns.
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrix[1][2]); // Output: 6
```

#### Taking User Input for 2D Array:
```java
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Rows
        int m = sc.nextInt(); // Columns
        int[][] array = new int[n][m];

        // Storing elements in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Printing matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 3. Multidimensional Array
Arrays with more than two dimensions.
```java
int[][][] cube = new int[2][3][4];
```

---

## ⚡ 7. Advantages & Disadvantages

| Advantages | Disadvantages |
| :--- | :--- |
| Stores multiple values of the same type | Fixed size (cannot dynamically grow or shrink) |
| Fast access using zero-based indices ($O(1)$) | Can store only one data type |
| Easy to traverse using loops | Insertion and deletion are inefficient ($O(N)$ shift operations) |
| Efficient contiguous memory allocation | |

---

## 📝 8. Core Summary

- Arrays store elements of the same data type.
- Indexing starts at `0`.
- Array size is fixed upon creation.
- Use `.length` property to get element count.
- Can be 1D, 2D, or multidimensional.

---

## 🎯 9. Practice Questions

1. 🔍 **Find the largest and smallest element** in an array.
2. 🔢 **Count even and odd numbers** in an array.
3. 🔄 **Reverse an array** in place.
4. 🥈 **Find the second largest element** in an array.
5. 0️⃣ **Move all zeros to the end** while maintaining relative order.
6. ❓ **Find the missing number** in a given range.
7. ➕ **Find a pair with a given target sum** (Two Sum problem).
