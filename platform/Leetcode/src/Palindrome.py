def is_palindrome(input_string):
    revised_input = ''.join([let.lower() for let in input_string if let.isalnum()])
    return revised_input == revised_input[::-1] 
    
def main():
    original = input("Enter a string of words & I'll check if it's a palindrome: ")
    result = "is" if is_palindrome(original) else "isn't"
    print("This string %s a palindrome" %(result))

if __name__ == '__main__':
    main()