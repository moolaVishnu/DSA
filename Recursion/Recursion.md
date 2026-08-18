🔁 Recursion in Java

1. What is Recursion?

Recursion means a method calling itself.

For example:

void fun() {

    fun();

}

Here fun() is calling itself.

fun()

  ↓

fun()

  ↓

fun()

  ↓

fun()

  ↓

...

But this cannot continue forever. We need a condition that tells the method when to stop.

That stopping condition is called the base case.

2. Two important parts of recursion

Every proper recursive solution generally has:

① Base Case

Tells recursion when to stop.

② Recursive Case

The method calls itself with a smaller/simpler problem.

General structure:

returnType function(parameters) {



    if(baseCondition) {

        return result;

    }



    return function(smallerProblem);

}

Think:

Recursion

   │

   ├── Base Case → STOP

   │

   └── Recursive Case → CALL ITSELF

3. First simple example

Let's print numbers from 1 to 5.

class Main {



    static void print(int n) {



        if(n == 6) {

            return;

        }



        System.out.println(n);



        print(n + 1);

    }



    public static void main(String\[] args) {

        print(1);

    }

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

   ↓

prints 1

   ↓

print(2)

   ↓

prints 2

   ↓

print(3)

   ↓

prints 3

   ↓

print(4)

   ↓

prints 4

   ↓

print(5)

   ↓

prints 5

   ↓

print(6)

   ↓

STOP

The base case is:

if(n == 6) {

    return;

}

⭐ 4. Why do we need a base case?

Consider:

static void fun() {

    fun();

}

There is no stopping condition.

So:

fun()

 ↓

fun()

 ↓

fun()

 ↓

fun()

 ↓

...

Eventually Java runs out of stack memory.

You will get:

StackOverflowError

So remember:

Recursive function without a proper base case can cause infinite recursion.



5. What is the Call Stack?

This is very important for understanding recursion.

Consider:

static void fun(int n) {



    if(n == 0) {

        return;

    }



    System.out.println(n);



    fun(n - 1);

}

Call:

fun(3);

Java creates stack frames.

Conceptually:

fun(3)

  ↓

fun(2)

  ↓

fun(1)

  ↓

fun(0)

At fun(0):

if(n == 0)

    return;

Now the calls start returning.

fun(0) returns

   ↑

fun(1) returns

   ↑

fun(2) returns

   ↑

fun(3) returns

This is the key idea:

Going down

Recursive calls are added to the stack.

Coming back

The stack frames are removed in reverse order.

⭐ 6. Printing forward vs backward

Look at this:

static void fun(int n) {



    if(n == 0)

        return;



    System.out.println(n);



    fun(n - 1);

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



    if(n == 0)

        return;



    fun(n - 1);



    System.out.println(n);

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



    if(n == 0)

        return;



    System.out.println("Before " + n);



    fun(n - 1);



    System.out.println("After " + n);

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

 |

 | print Before 3

 |

 ↓

fun(2)

 |

 | print Before 2

 |

 ↓

fun(1)

 |

 | print Before 1

 |

 ↓

fun(0)

 |

 | return

 ↑

 |

print After 1

 ↑

 |

print After 2

 ↑

 |

print After 3

This gives you the most important recursion concept:

Statements before the recursive call execute while going down. Statements after the recursive call execute while coming back.



8. Recursion with return value

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

