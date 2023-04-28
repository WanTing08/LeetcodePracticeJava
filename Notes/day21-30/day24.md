# Backtracking

Backtracking is a problem-solving technique that involves exploring 
all possible solutions to a problem by incrementally building a 
solution and abandoning a candidate solution as soon as it determines 
that the solution is not viable.

The general approach for implementing the backtracking algorithm is as follows:

1. Start with an empty solution set.

2. Choose the next possible candidate for the solution.

3. Check if the candidate satisfies the problem constraints.

4. If the candidate satisfies the constraints, add it to the solution set and recursively continue from step 2 to find the next candidate solution.

5. If the candidate does not satisfy the constraints, discard it and try the next candidate.

6. If all candidates have been tried and discarded, backtrack to the previous step and try a different candidate.

7. Repeat steps 2 to 6 until a solution is found.

# [77. Combinations](https://leetcode.com/problems/combinations/)

## Solution

