def subtract_arrays(a,b):
    return [each_a for each_a in a if each_a not in b]
   
def main():
    array_1 = input('enter a list of integers separated by commas: ')
    array_2 = input('enter another list of integers to subtract from: ')
    print("the remainder is: ", subtract_arrays(array_1, array_2))

if __name__ == '__main__':
    main()
    
    