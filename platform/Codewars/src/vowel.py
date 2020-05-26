def encode(string):
    vowel_map = {'a':1, 'e':2, 'i':3, 'o':4, 'u':5}
    return ''.join([str(vowel_map[letter]) if letter in vowel_map else letter for letter in string])

def decode(string):    
    vowel_map = {'1':'a', '2':'e', '3':'i', '4':'o', '5':'u'}
    return ''.join([str(vowel_map[letter]) if letter in vowel_map else letter for letter in string])
    
if __name__ == "__main__":
    selection = input("Enter 1 for encoding, or 2 for decoding: ")
    while (int(selection) not in [1,2]):
        print('Your selection is invalid please choose again.')
        selection = input("Enter 1 for encoding, or 2 for decoding: ")
        
    words_to_code = input("Enter your phrase: ")
    print(encode(words_to_code)) if selection == '1' else print(decode(words_to_code))
    
    
