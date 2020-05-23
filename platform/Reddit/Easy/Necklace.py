# solution in Python
def compare_necklace(left, right):
    
    if left == right:
        return True 
    else:
        for i in range(len(left)):       
            if (left[i:] + left[:i]) == right: 
                return True
    return False
    
if __name__ == "__main__":
    # Test case
    word1, word2 = "abcd", "bcda"
    print("Is %s equal to %s " %(word1, word2))
    print(compare_necklace(word1,word2))