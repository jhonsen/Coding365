def replace_alphabets(string):
    alphabets = {alph:str(ind+1) for ind,alph in enumerate(list('abcdefghijklmnopqrstuvwxyz'))}
    return ' '.join([alphabets[alph.lower()] for alph in string if alph.lower().isalpha()])

def main():
    text = input("Enter a phrase of words to be decrypted: ")
    print("After numerical encryption (e.g., 'a': 1, 'b': 2, etc.),")
    print("the phrase becomes: ", replace_alphabets(text))
    
if __name__== "__main__":
    main()