def find_common_chars(words):
    check = list(words[0])
    for word in words:
        newCheck = []
        
        for c in word:
            
            if c in check:
                newCheck.append(c)
                check.remove(c)
            
        check = newCheck        

    return check

def convert_to_list(string):
    return [each.strip() for each in string.split(',') if each != '']

def main():
    user_input = input("Enter a list of words, separated by commas: ")
    words = convert_to_list(user_input)
    output = find_common_chars(words)
    print("The characters found in every word are: ", output)

if __name__ == "__main__":
    main()
