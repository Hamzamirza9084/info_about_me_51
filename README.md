# Java Programming Problems - Solutions

This repository contains solutions to three essential Java programming problems covering pattern generation and number operations.

## 📋 Project Contents

This project includes three different Java programs:

1. **RightHalfPyramid.java** - Right Half Pyramid Pattern
2. **FullPyramid.java** - Full (Inverted) Pyramid Pattern
3. **EvenNumbers.java** - Even Numbers Analysis (1-100)

---

## 🎯 Program 1: RightHalfPyramid

### Description
Creates a right half pyramid pattern using asterisks (*).

### Code
```java
public class RightHalfPyramid {
    public static void main(String[] args) {
        int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### How to Run
```bash
javac RightHalfPyramid.java
java RightHalfPyramid
```

### Screenshot 1 - Expected Output
```
*
* *
* * *
* * * *
* * * * *
* * * * * *
```

### Explanation
- Outer loop controls the number of rows (1 to 6)
- Inner loop prints asterisks for each row
- Row 1 has 1 asterisk, Row 2 has 2 asterisks, and so on...

---

## 🎯 Program 2: FullPyramid

### Description
Creates a full (inverted) pyramid pattern using asterisks with proper spacing.

### Code
```java
public class FullPyramid {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### How to Run
```bash
javac FullPyramid.java
java FullPyramid
```

### Screenshot 2 - Expected Output
```
* * * * *
  * * * *
   * * *
    * *
     *
```

### Explanation
- Starts from 5 rows and decrements to 1
- For each row, first prints leading spaces for alignment
- Then prints asterisks decreasing in count
- Creates a centered pyramid effect

---

## 🎯 Program 3: EvenNumbers

### Description
Finds all even numbers between 1 and 100, and provides:
- Complete list of even numbers
- Minimum even number
- Maximum even number
- Sum of all even numbers

### Code
```java
public class EvenNumbers {
    public static void main(String[] args) {
       
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        int sum = 0;

        System.out.print("The list of even numbers between 1 to 100: \n");
        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                System.out.print(i + " "); 
                

                if (i < min) {
                    min = i;
                }
                
               
                if (i > max) {
                    max = i;
                }
                
               
                sum += i;
            }
        }
        
        System.out.println("\n"); 

        System.out.println("The minimum even number: " + min);
        System.out.println("The maximum even number: " + max);
        System.out.println("The total (sum) of all even numbers between 1 to 100: " + sum);
    }
}
```

### How to Run
```bash
javac EvenNumbers.java
java EvenNumbers
```

### Expected Output
```
The list of even numbers between 1 to 100: 
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 

The minimum even number: 2
The maximum even number: 100
The total (sum) of all even numbers between 1 to 100: 2550
```

### Explanation
- Loops through numbers 1 to 100
- Identifies even numbers using modulo operator (i % 2 == 0)
- Tracks minimum and maximum values
- Calculates the sum of all even numbers
- There are 50 even numbers from 1 to 100

---

## 📊 Summary of Results

| Program | Output Type | Key Result |
|---------|------------|-----------|
| RightHalfPyramid | Pattern | 6-row pyramid |
| FullPyramid | Pattern | 5-row inverted pyramid |
| EvenNumbers | Numeric Data | Sum: 2550, Min: 2, Max: 100, Count: 50 |

---

## ✅ Requirements

- Java Development Kit (JDK) installed
- Java compiler (javac)
- Command line/Terminal access

---

## 🚀 Quick Start

1. Navigate to the DevOps directory:
   ```bash
   cd h:\DevOps
   ```

2. Compile all files:
   ```bash
   javac RightHalfPyramid.java FullPyramid.java EvenNumbers.java
   ```

3. Run individual programs:
   ```bash
   java RightHalfPyramid
   java FullPyramid
   java EvenNumbers
   ```

---

## 📝 Notes

- All programs use standard Java console output
- No external libraries are required
- Programs are compatible with Java 8 and above
- Each program operates independently

---

## 👨‍💻 Learning Outcomes

After studying these programs, you will understand:
- Loop control structures (for loops)
- Pattern generation using nested loops
- Conditional statements (if conditions)
- Variable initialization and arithmetic operations
- Integer limits (Integer.MAX_VALUE, Integer.MIN_VALUE)
- Console output formatting

---

**Created:** February 23, 2026
