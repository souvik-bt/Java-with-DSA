# ⭐ Advanced Pattern Logic Building – 35 Pattern Questions

A collection of beginner to advanced pattern questions designed to strengthen nested loops, visualization, symmetry, mathematical relations and DSA thinking.

---

# 📚 Topics Covered

- Nested Loops
- Star Patterns
- Number Patterns
- Character Patterns
- Hollow Patterns
- Pyramid Logic
- Symmetry & Mirroring
- Space Handling
- Advanced Pattern Construction

---

# ✅ Pattern List

---

## 1. Solid Square Pattern

### Pattern
```txt
*****
*****
*****
*****
*****
```

### Concepts Used
- Nested loops
- Fixed rows and columns

### Algorithm
1. Outer loop controls rows
2. Inner loop prints fixed number of stars
3. Move to next line

### Key Learning
Basic row-column understanding

---

## 2. Increasing Triangle

### Pattern
```txt
*
**
***
****
*****
```

### Concepts Used
- Increasing inner loop

### Algorithm
1. Outer loop runs from 1→n
2. Print current row number of stars

### Key Learning
Dependent inner loops

---

## 3. Decreasing Triangle

### Pattern
```txt
*****
****
***
**
*
```

### Concepts Used
- Reverse pattern

### Algorithm
1. Outer loop decreases
2. Print stars equal to remaining rows

### Key Learning
Reverse iteration

---

## 4. Increasing Number Triangle

### Pattern
```txt
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### Concepts Used
- Number sequence

### Algorithm
1. Outer loop controls rows
2. Print numbers from 1→i

### Key Learning
Number generation

---

## 5. Diamond Triangle

### Pattern
```txt
*
**
***
****
*****
****
***
**
*
```

### Concepts Used
- Increasing + decreasing

### Algorithm
1. Print increasing triangle
2. Print decreasing triangle

### Key Learning
Combining patterns

---

## 6. Right Aligned Triangle

### Pattern
```txt
    *
   **
  ***
 ****
*****
```

### Concepts Used
- Spaces + stars

### Algorithm
1. Print spaces
2. Print stars

### Key Learning
Alignment logic

---

## 7. Reverse Right Triangle

### Pattern
```txt
*****
 ****
  ***
   **
    *
```

### Concepts Used
- Reverse spaces

### Algorithm
1. Increase spaces
2. Decrease stars

### Key Learning
Mirroring logic

---

## 8. Pyramid Pattern

### Pattern
```txt
    *
   ***
  *****
 *******
*********
```

### Concepts Used
- Odd sequence

### Algorithm
1. Print spaces
2. Print odd stars

### Key Learning
Classic pyramid logic

---

## 9. Reverse Pyramid

### Pattern
```txt
*********
 *******
  *****
   ***
    *
```

### Concepts Used
- Reverse pyramid

### Algorithm
1. Increase spaces
2. Reduce stars

### Key Learning
Inverted patterns

---

## 10. Spaced Pyramid

### Pattern
```txt
    *
   * *
  * * *
 * * * *
* * * * *
```

### Concepts Used
- Spaces between elements

### Algorithm
1. Print leading spaces
2. Print stars separated by spaces

### Key Learning
Pattern formatting

---

## 11. Reverse Spaced Pyramid

### Pattern
```txt
* * * * *
 * * * *
  * * *
   * *
    *
```

### Concepts Used
- Reverse structure

### Algorithm
1. Increase spaces
2. Reduce stars

### Key Learning
Reverse visualization

---

## 12. Diamond Spaced Pyramid

### Pattern
```txt
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *
```

### Concepts Used
- Upper + lower halves

### Algorithm
1. Print upper inverted
2. Print lower normal

### Key Learning
Pattern composition

---

## 13. Hollow Pyramid

### Pattern
```txt
    *
   * *
  *   *
 *     *
*********
```

### Concepts Used
- Border conditions

### Algorithm
1. Print stars only at boundaries
2. Fill inside with spaces

### Key Learning
Conditional printing

---

## 14. Reverse Hollow Pyramid

### Pattern
```txt
*********
 *     *
  *   *
   * *
    *
```

### Concepts Used
- Reverse hollow logic

### Algorithm
1. Reverse spaces
2. Boundary stars only

### Key Learning
Hollow structures

---

## 15. Hollow Diamond

### Pattern
```txt
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

### Concepts Used
- Symmetry
- Hollow structure

### Algorithm
1. Create hollow pyramid
2. Mirror it

### Key Learning
Symmetry logic

---

## 16. Pascal Triangle

### Pattern
```txt
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
```

### Concepts Used
- Combinations

### Algorithm
1. Generate row values
2. Use previous relations

### Key Learning
Mathematical patterns

---

## 17. Palindrome Diamond

### Pattern
```txt
    1
   212
  32123
 4321234
  32123
   212
    1
```

### Concepts Used
- Ascending + descending

### Algorithm
1. Print reverse numbers
2. Print forward numbers

### Key Learning
Palindrome construction

---

## 18. Hollow Hourglass

### Pattern
```txt
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
```

### Concepts Used
- Spaces in center

### Algorithm
1. Reduce stars
2. Increase middle spaces

### Key Learning
Dual-side construction

---

## 19. Butterfly Pattern

### Pattern
```txt
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

### Concepts Used
- Two mirrored triangles

### Algorithm
1. Print left stars
2. Print middle spaces
3. Print right stars

### Key Learning
Symmetry

---

## 20. Hollow Square

### Pattern
```txt
****
*  *
*  *
*  *
****
```

### Concepts Used
- Boundary checking

### Algorithm
1. Print star at edges
2. Otherwise print spaces

### Key Learning
Conditional logic

---

## 21. Floyd Triangle

### Pattern
```txt
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### Concepts Used
- Continuous counting

### Algorithm
1. Maintain counter
2. Increment after each print

### Key Learning
State management

---

## 22. Binary Triangle

### Pattern
```txt
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

### Concepts Used
- Modulo operation

### Algorithm
1. Use (row+column)%2

### Key Learning
Alternating logic

---

## 23. M Pattern

### Pattern
```txt
*      *
 *   * *
*      *
```

### Concepts Used
- Position-based printing

### Algorithm
1. Print stars at selected positions

### Key Learning
Coordinate thinking

---

## 24. X Butterfly

### Pattern
```txt
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
```

### Concepts Used
- Diagonal patterns

### Algorithm
1. Print stars on diagonals

### Key Learning
Index relation

---

## 25. Hollow Reverse L

### Pattern
```txt
*****
*   *
*   *
*   *
*****
```

### Concepts Used
- Hollow borders

### Algorithm
1. Print star at boundaries

### Key Learning
Edge conditions

---

## 26. Repeated Number Reverse Triangle

### Pattern
```txt
1 1 1 1 1 1
2 2 2 2 2
3 3 3 3
4 4 4
5 5
6
```

### Concepts Used
- Fixed repeated values

### Algorithm
1. Print row value repeatedly

### Key Learning
Outer variable reuse

---

## 27. Number Box Pattern

### Pattern
```txt
1 2 3 4 17 18 19 20
  5 6 7 14 15 16
    8 9 12 13
      10 11
```

### Concepts Used
- Multiple counters

### Algorithm
1. Maintain left and right counters
2. Print accordingly

### Key Learning
Advanced counting

---

## 28. Diamond Pyramid

### Pattern
```txt
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

### Concepts Used
- Mirrored pyramids

### Algorithm
1. Print upper half
2. Print lower half

### Key Learning
Diamond creation

---

## 29. Butterfly Pattern (Variant)

### Pattern
```txt
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

### Concepts Used
- Symmetry

### Algorithm
1. Left stars
2. Spaces
3. Right stars

### Key Learning
Mirror construction

---

## 30. Number Pyramid

### Pattern
```txt
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
```

### Concepts Used
- Descending + ascending

### Algorithm
1. Print reverse numbers
2. Print forward numbers

### Key Learning
Center-based logic

---

## 31. Concentric Square Pattern

### Pattern
```txt
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
```

### Concepts Used
- Matrix relation

### Algorithm
1. Find minimum distance from border

### Key Learning
Coordinate mathematics

---

## 32. Reverse Alphabet Triangle

### Pattern
```txt
E
D E
C D E
B C D E
A B C D E
```

### Concepts Used
- Character decrement

### Algorithm
1. Start from E
2. Move backward

### Key Learning
Character arithmetic

---

## 33. Alternate Character Triangle

### Pattern
```txt
a
B c
D e F
g H i J
k L m N o
```

### Concepts Used
- Upper/lower case

### Algorithm
1. Alternate character case

### Key Learning
ASCII handling

---

## 34. Reverse Alphabet Triangle

### Pattern
```txt
E D C B A
D C B A
C B A
B A
A
```

### Concepts Used
- Reverse sequence

### Algorithm
1. Reduce characters each row

### Key Learning
Reverse logic

---

## 35. Number Palindrome Pattern

### Pattern
```txt
1      1
12    21
123  321
12344321
```

### Concepts Used
- Spaces
- Palindrome

### Algorithm
1. Print ascending numbers
2. Print spaces
3. Print descending numbers

### Key Learning
Complex pattern construction

---

# 🎯 Skills Built

| Skill | Improvement |
|---|---|
| Nested Loops | ✅ |
| Visualization | ✅ |
| Space Management | ✅ |
| Symmetry | ✅ |
| Mathematical Thinking | ✅ |
| DSA Foundation | ✅ |

---
