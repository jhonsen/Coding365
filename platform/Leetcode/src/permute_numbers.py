# Python solution
def get_input(text):
    return input(text)

def permute(nums):
    if len(nums) == 1:
        return [nums]
    
    output = []
    for idx in range(len(nums)):

        temp_nums = []
        for num in nums:
            if (num != nums[idx]):
                temp_nums.append(num)
                    
        for each in permute(temp_nums): 
            output.append([nums[idx]] + each)            
    
    return output

def main():
    user_input = get_input("Enter integers separated by commas (e.g., 1,2,3): ")
    numbers = [int(num) for num in user_input.split(",")]
    return permute(numbers)
    
if __name__ == "__main__":
    print("the permutations are: ", main())
    
