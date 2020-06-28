# Use recursion
def is_ugly(number):
    ''' Function returns True/False when a positive integer is determined to be an ugly number.
    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
    The number 1 is considered as ugly. 

    '''
    
    if (number <= 0):
        return False
    elif (number == 1):
        return True    
    elif (number % 2 == 0):
        return is_ugly(number / 2)
    elif (number % 3 == 0):
        return is_ugly(number / 3)
    elif (number % 5 == 0):
        return is_ugly(number / 5)
    return False

if __name__ == '__main__':
    number = input("Enter a positive integer value: ")
    result = is_ugly(int(number))
    answer = '' if result else ' NOT '    
    print('This integer is %s ugly.' %(answer))