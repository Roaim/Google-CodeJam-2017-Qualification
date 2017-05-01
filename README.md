# Google-CodeJam-2017-Qualification-Round-Solution-Java
This project is all about the Java Solution of 2 problems of the Qualification round of Google CodeJam 2017 which were accepted and I was advanced to the Round 1. 

## Plot
The contest date was just a day before my joining date of my very first full-time job as an Android Developer. So I didn't get enough time to solve all the problems. As we know we need at least 25 points to advance to the first round so I did some research on the problems and found that choosing problem B and C is a wise decision because we could get 25 point instantly by submitting the small data sets and so I got. Also forunately, my big data sets worked too and gave me extra 25 points. I got official confirmation email of round 1 advancement. But unfortunately I couldn't participate on either of the contests due to my job duty. But I am so happy because as a business graduate this is really a great achievement specially when you failed to qualify for just 5 points in the qualification round of previous CodeJam(2016). That really shows the improvement of my programming.

## Problems
* Problem B. Tidy Numbers
* Problem C. Bathroom Stalls
### Problem B. Tidy Numbers
##### Problem
Tatiana likes to keep things tidy. Her toys are sorted from smallest to largest, her pencils are sorted from shortest to longest and her computers from oldest to newest. One day, when practicing her counting skills, she noticed that some integers, when written in base 10 with no leading zeroes, have their digits sorted in non-decreasing order. Some examples of this are 8, 123, 555, and 224488. She decided to call these numbers tidy. Numbers that do not have this property, like 20, 321, 495 and 999990, are not tidy.

She just finished counting all positive integers in ascending order from 1 to N. What was the last tidy number she counted?
##### Input
The first line of the input gives the number of test cases, T. Tlines follow. Each line describes a test case with a single integer N, the last number counted by Tatiana.
##### Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the last tidy number counted by Tatiana.
##### Limits
1 ≤ T ≤ 100.
##### Small dataset
1 ≤ N ≤ 1000.
##### Large dataset
1 ≤ N ≤ 1018.
##### Sample
```
Input

4
132
1000
7
111111111111111110

Output

Case #1: 129
Case #2: 999
Case #3: 7
Case #4: 99999999999999999
 
```
**Note that the last sample case would not appear in the Small dataset.**

### Problem C. Bathroom Stalls
##### Problem
A certain bathroom has N + 2 stalls in a single row; the stalls on the left and right ends are permanently occupied by the bathroom guards. The other N stalls are for users.

Whenever someone enters the bathroom, they try to choose a stall that is as far from other people as possible. To avoid confusion, they follow deterministic rules: For each empty stall S, they compute two values LS and RS, each of which is the number of empty stalls between S and the closest occupied stall to the left or right, respectively. Then they consider the set of stalls with the farthest closest neighbor, that is, those S for which min(LS, RS) is maximal. If there is only one such stall, they choose it; otherwise, they choose the one among those where max(LS, RS) is maximal. If there are still multiple tied stalls, they choose the leftmost stall among those.

K people are about to enter the bathroom; each one will choose their stall before the next arrives. Nobody will ever leave.

When the last person chooses their stall S, what will the values of max(LS, RS) and min(LS, RS) be?
##### Solving this problem
This problem has 2 Small datasets and 1 Large dataset. You must solve the first Small dataset before you can attempt the second Small dataset. You will be able to retry either of the Small datasets (with a time penalty). You will be able to make a single attempt at the Large, as usual, only after solving both Small datasets.
##### Input
The first line of the input gives the number of test cases, T. Tlines follow. Each line describes a test case with two integersN and K, as described above.
##### Output
For each test case, output one line containing Case #x: y z, where x is the test case number (starting from 1), y is max(LS, RS), and z is min(LS, RS) as calculated by the last person to enter the bathroom for their chosen stall S.
##### Limits
1 ≤ T ≤ 100.
1 ≤ K ≤ N.
##### Small dataset 1
1 ≤ N ≤ 1000.
##### Small dataset 2
1 ≤ N ≤ 106.
##### Large dataset
1 ≤ N ≤ 1018.
##### Sample
```
Input

5
4 2
5 2
6 2
1000 1000
1000 1

Output

Case #1: 1 0
Case #2: 1 0
Case #3: 1 1
Case #4: 0 0
Case #5: 500 499

```


In Case #1, the first person occupies the leftmost of the middle two stalls, leaving the following configuration (Ostands for an occupied stall and . for an empty one): O.O..O. Then, the second and last person occupies the stall immediately to the right, leaving 1 empty stall on one side and none on the other.

In Case #2, the first person occupies the middle stall, getting to O..O..O. Then, the second and last person occupies the leftmost stall.

In Case #3, the first person occupies the leftmost of the two middle stalls, leaving O..O...O. The second person then occupies the middle of the three consecutive empty stalls.

In Case #4, every stall is occupied at the end, no matter what the stall choices are.

In Case #5, the first and only person chooses the leftmost middle stall.


