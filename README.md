### COMP1110 Lab Test

*No materials permitted*

The test will be marked out of 20. 
Your mark will be divided by 4 to give a final mark out of 5.

---

## Question 1 (5 Marks)

* Using IntelliJ, clone your labtest exam `File` -> `New` -> `Project from Version Control...`, and enter the https URL provided to you.
* Within the `comp1110.labtest` package of the `comp1110-labtest` project,
  find the class called `HelloWorld`.
This should appear as a file `HelloWorld` within a package `comp1110.labtest`.
This detail is important because the tests assume that your work appears in
exactly this location.
* Run the `Q1 HelloWorld` test from the dropdown menu.  This should run five tests, and all five should fail with a message `java.lang.NoSuchMethodError: `void comp1110.labtest.HelloWorld.main(java.lang.String[])'`.
* If the above does not happen, you should consult your tutor.
* Now navigate to your `HelloWorld` class, and modify it so that its main
 method prints `Hello world!`.
* Test your `HelloWorld` class by selecting the `Q1 HelloWorld` option in the
  drop-down next to green arrow.
* Once your `HelloWorld` class passes the tests, commit it to your Git repo, and **push** to the server (_this is critical, since you will only be marked on what is actually pushed to the server_).

## Question 2 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Square`. The class will read from the console an
integer that represents the length of a side and then calculate
 and print an integer that reprents the area of a square. Test
 your solution using the `Q2 Square` test.

Once you have it working, add, commit, and **push** your work.

## Question 3 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Grade` that reads a mark for a subject (an integer) from the
console and then prints the final grade based on this mark. Assume final
grades are calculated using the following: marks between and including 0
and 49 will given a grade of `N`, 50 and 59 will give `P`, 60 and 69 will
give `C`, 70 and 79 will give `D`, and finally 80 and 100 will give `HD`.
If the mark is less than zero or greater than 100, print `Bad mark`.
Test your solution using the `Q3 Grade` test.

Once you have it working, add, commit, and **push** your work.

## Question 4 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Permute` that reads in two strings one line after the other from
the console then determines whether the characters of one string are some
permutation of the characters of another string (a permutation is a strict
reordering, no additions, no deletions). The strings will be made up only of
lower case letters and not contain white spaces (e.g. tab, space character). If
the strings are perumtations of each other, print `Yes` otherwise print `No`.
So for exampl `cats` is a permutation of `acst`, so you would print `Yes` whereas,
neither `cats` nor `catt` are permutations of `cate`, so you would print `No`
(Hint - use `.length` to find the length of a `String` and the `charAt()`
method to get the character at a given position in a `String`). Test your solution
using the `Q4 Permute` test.

Once you have it working, add, commit, and **push** your work.

---

*Once you have completed all of the questions, check that everything has been **pushed**.
You may then leave.*