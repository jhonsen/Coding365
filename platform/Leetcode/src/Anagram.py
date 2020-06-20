def is_anagram(left, right):
    return sorted(left) == sorted(right)

def main():
    text_1 = input("Enter a word: ")
    text_2 = input("Enter another word: ")
    result = is_anagram(text_1, text_2)
    print("These words are anagrams!") if result else print("These are NOT anagrams!")
    
if __name__ == "__main__":
    main()
    
    