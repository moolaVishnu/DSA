🔁 Recursion in Java

1\. What is Recursion?

Recursion means a method calling itself.

For example:

void fun() {

&#x20;   fun();

}

Here fun() is calling itself.

fun()

&#x20; ↓

fun()

&#x20; ↓

fun()

&#x20; ↓

fun()

&#x20; ↓

...

But this cannot continue forever. We need a condition that tells the method when to stop.

That stopping condition is called the base case.

2\. Two important parts of recursion

Every proper recursive solution generally has:

① Base Case

Tells recursion when to stop.

② Recursive Case

The method calls itself with a smaller/simpler problem.

General structure:

returnType function(parameters) {



&#x20;   if(baseCondition) {

&#x20;       return result;

&#x20;   }



&#x20;   return function(smallerProblem);

}

Think:

Recursion

&#x20;  │

&#x20;  ├── Base Case → STOP

&#x20;  │

&#x20;  └── Recursive Case → CALL ITSELF

3\. First simple example

Let's print numbers from 1 to 5.

class Main {



&#x20;   static void print(int n) {



&#x20;       if(n == 6) {

&#x20;           return;

&#x20;       }



&#x20;       System.out.println(n);



&#x20;       print(n + 1);

&#x20;   }



&#x20;   public static void main(String\[] args) {

&#x20;       print(1);

&#x20;   }

}

Output:

1

2

3

4

5

Let's understand exactly what happens.

We call:

print(1);

Then:

print(1)

&#x20;  ↓

prints 1

&#x20;  ↓

print(2)

&#x20;  ↓

prints 2

&#x20;  ↓

print(3)

&#x20;  ↓

prints 3

&#x20;  ↓

print(4)

&#x20;  ↓

prints 4

&#x20;  ↓

print(5)

&#x20;  ↓

prints 5

&#x20;  ↓

print(6)

&#x20;  ↓

STOP

The base case is:

if(n == 6) {

&#x20;   return;

}

⭐ 4. Why do we need a base case?

Consider:

static void fun() {

&#x20;   fun();

}

There is no stopping condition.

So:

fun()

&#x20;↓

fun()

&#x20;↓

fun()

&#x20;↓

fun()

&#x20;↓

...

Eventually Java runs out of stack memory.

You will get:

StackOverflowError

So remember:

Recursive function without a proper base case can cause infinite recursion.



5\. What is the Call Stack?

This is very important for understanding recursion.

Consider:

static void fun(int n) {



&#x20;   if(n == 0) {

&#x20;       return;

&#x20;   }



&#x20;   System.out.println(n);



&#x20;   fun(n - 1);

}

Call:

fun(3);

Java creates stack frames.

Conceptually:

fun(3)

&#x20; ↓

fun(2)

&#x20; ↓

fun(1)

&#x20; ↓

fun(0)

At fun(0):

if(n == 0)

&#x20;   return;

Now the calls start returning.

fun(0) returns

&#x20;  ↑

fun(1) returns

&#x20;  ↑

fun(2) returns

&#x20;  ↑

fun(3) returns

This is the key idea:

Going down

Recursive calls are added to the stack.

Coming back

The stack frames are removed in reverse order.

⭐ 6. Printing forward vs backward

Look at this:

static void fun(int n) {



&#x20;   if(n == 0)

&#x20;       return;



&#x20;   System.out.println(n);



&#x20;   fun(n - 1);

}

Call:

fun(5);

Output:

5

4

3

2

1

Because printing happens before the recursive call.

Now:

static void fun(int n) {



&#x20;   if(n == 0)

&#x20;       return;



&#x20;   fun(n - 1);



&#x20;   System.out.println(n);

}

Output:

1

2

3

4

5

Why?

Because printing happens after the recursive call returns.

This is extremely important.

⭐ 7. Understand this deeply

Consider:

static void fun(int n) {



&#x20;   if(n == 0)

&#x20;       return;



&#x20;   System.out.println("Before " + n);



&#x20;   fun(n - 1);



&#x20;   System.out.println("After " + n);

}

Call:

fun(3);

Output:

Before 3

Before 2

Before 1

After 1

After 2

After 3

Why?

Let's trace:

fun(3)

&#x20;|

&#x20;| print Before 3

&#x20;|

&#x20;↓

fun(2)

&#x20;|

&#x20;| print Before 2

&#x20;|

&#x20;↓

fun(1)

&#x20;|

&#x20;| print Before 1

&#x20;|

&#x20;↓

fun(0)

&#x20;|

&#x20;| return

&#x20;↑

&#x20;|

print After 1

&#x20;↑

&#x20;|

print After 2

&#x20;↑

&#x20;|

print After 3

This gives you the most important recursion concept:

Statements before the recursive call execute while going down. Statements after the recursive call execute while coming back.



8\. Recursion with return value

Recursion doesn't have to be void.

Example: factorial.

Mathematically:

5! = 5 × 4 × 3 × 2 × 1

Also:

5! = 5 × 4!

4! = 4 × 3!

3! = 3 × 2!

2! = 2 × 1!

1! = 1

So:

n! = n × (n-1)!

This naturally becomes recursion.

## QUESTION:



1.Print numbers from 1 to N using recursion.



2.Print numbers from N to 1 using recursion.



3.Find the sum of the first N natural numbers using recursion.



4.Find the factorial of N using recursion.



5.Find the power of a number using recursion.



6.Find the Nth Fibonacci number using recursion.



7.Find the maximum element in an array using recursion.



8.Find the sum of all elements in an array using recursion.



9.Check whether a String is a palindrome using recursion.



10.Reverse a String using recursion.

