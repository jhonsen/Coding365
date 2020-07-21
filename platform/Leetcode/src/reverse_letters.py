def reverse_letters(string):
    phrase = list(string)
    indices, letters = [], []
    
    for ind,letter in enumerate(string):
        if letter.isalpha():
            indices.append(ind)
            letters.append(letter)
    
    reversed_indices = indices[::-1]
    for i,letter in zip(reversed_indices, letters):
        phrase[i] = letter
    
    return ''.join(phrase)

def main():
    user_input = input("Enter a string of ASCII codes (e.g., alphabets, punctuations, etc.): ")
    output = reverse_letters(user_input)
    print("Reversing only the alphabets in the string, we have: ", output)
    
if __name__ == '__main__':
    main()