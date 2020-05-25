#%% [markdown]

#  Given an array of integers, return indices of the two numbers such that they add up to a specific target.  
#  You may assume that each input would have exactly one solution, and you may not use the same element twice.    
#  ## Example:  
#  Given nums = [2, 7, 11, 15], target = 9,<br/>  
#  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].  

#%% [markdown]
#  #
#  Answer: The simple & straight forward approach
#  - Runtime O(n<sup>2</sup>)
#%%
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n=len(nums)
        pair = []
        for ind_1 in range(n):
            for ind_2 in range(ind_1+1, n):
                added = nums[ind_1] + nums[ind_2]
                if added == target:
                    pair.append(ind_1)
                    pair.append(ind_2)
                    return pair
        return pair

# %%
# testing solution
nums=[2,7,11,15]
problem = Solution()
problem.twoSum(nums, 9)

# %%
%%timeit
nums=[2,7,11,15]
problem = Solution()
problem.twoSum(nums, 9)

# %%
# **Answer:** Using python libraries
from itertools import combinations

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        idx = dict()
        idx = {val:key for key,val in enumerate(nums)}        
        return [[idx[one],idx[two]] for one,two in combinations(nums, 2) \
                                    if one+two==target][0]

# %%
# testing solution
nums=[2,7,11,15]
problem = Solution()
problem.twoSum(nums, 9)

# %%
%%timeit
problem.twoSum(nums, 9)

#%% [markdown]
# ## Problem 
# Given a 32-bit signed integer, reverse digits of an integer.
# ### Example 1
# Input: 123
# Output: 321

# ## Example 2
# Input: -123
# Output: -321

# ## Example 3
# Input: 120
# Output: 21

# ## Note:
# Assume we are dealing with an environment which could only store integers 
# within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

#%%
class Solution:
    def reverse(self, x: int):
        a = int(str(x)[::-1]) if x>0 else -1 * int(str(-1*x)[::-1])
        return a if (a < 2**31-1 and a > -2**31) else 0

#%%
x= -231
problem = Solution()
problem.reverse(x)

#%%
%%timeit
problem.reverse(x)



# %% [markdown]
# Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
# ### Example 1:
# Input: 121
# Output: true

# ### Example 2:
# Input: -121<br/>
# Output: false<br/>
# Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

# ###Example 3:
# Input: 10 <br/>
# Output: false <br/>
# Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

# Follow up:
# Coud you solve it without converting the integer to a string?


# %%
class Solution:
    def isPalindrome(self, x: int) -> bool:
        return str(x)[::-1] == str(x)
# %%
problem=Solution()
problem.isPalindrome(121)

# %%
%%timeit
problem.isPalindrome(121)

# %%
