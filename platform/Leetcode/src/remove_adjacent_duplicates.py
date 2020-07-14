def remove_duplicates_stackwise(string):
    assert isinstance(string, str), "Input should be a string"
    stack = []
    for char in string:
        if stack and stack[-1] == char:
            stack.pop()
        else:
            stack.append(char)

    return ''.join(stack)

def main():
    user_input = input("Enter a string of alphabets with duplicates (e.g., aabbacd): ")
    output = remove_duplicates_stackwise(user_input)
    print("The remaining string after removing duplicates is: ", output)
    
if __name__ == '__main__':
    main()
