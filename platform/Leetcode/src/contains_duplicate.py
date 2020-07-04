def contains_duplicate(numbers, *args):
    assert isinstance(numbers, list), 'Input must be a list of integers'
    
    collect = {}
    for each in numbers:
        if each not in collect:
            collect[each] = 1
        else:
            collect[each] += 1
    for num in numbers:
        if collect[num] > 1:
            return True
    return False

def convert_to_list(string):
    return [int(each.strip()) for each in string.split(',') if each != '']

def main():
    user_input = input('Enter a list of numbers, separated by commas: ')
    numbers = convert_to_list(user_input)
    output = contains_duplicate(numbers)
    print("There are%sduplicates here." %(' ' if output else ' no '))
    
if __name__=='__main__':
    main()