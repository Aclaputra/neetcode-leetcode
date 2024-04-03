# contains duplicate solutions

pseudocode counter map

```bash
function containsDuplicate(nums: array of integers) -> boolean:
    Create an empty counter to keep track of how many times each number appears.
  
    For each number (num) in the given array (nums):
        Increment the counter for that number.
        If the counter for the number becomes greater than 1:
            Return true, indicating that there is a duplicate number.
  
    If no duplicate numbers are found:
        Return false.

function main():
    Call the containsDuplicate function with an example array [1, 2, 3, 4, 1].
    Print the result indicating whether there are duplicate numbers.
```

seen map

```

```
