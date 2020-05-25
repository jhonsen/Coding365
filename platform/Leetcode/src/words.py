# Python solution
def find_length_last(words):
    word_list = words.strip().split(' ')    
    return len(word_list[-1]) if len(word_list)>0 else 0

if __name__ == "__main__":
    print("Input a phrase below:")
    words = input()
    print("the length of last word is:", find_length_last(words))
