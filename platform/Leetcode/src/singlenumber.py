# memory efficient solution
def find_single(numbers):
    
    for i in range (len(numbers)):
        digit = numbers.pop()
        if digit not in numbers:
            return digit
        else:
            numbers.remove(digit)   

def main():
    numbers = input("Input numbers separated by commas:")
    numbers = numbers.split(",")
    print("the odd-one-out is: ", find_single([int(i) for i in numbers]))
    
if __name__ == '__main__':
    main()