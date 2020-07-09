def find_people_group(group_size):
    result = []
    size_index = {}

    for i,size in enumerate(group_size):
        
        if (size not in size_index):
            size_index[size] = []
        size_index[size].append(i)
        
        if len(size_index[size]) == size:
            result.append(size_index[size])
            size_index.pop(size)
    return result

def convert_to_list(string):
    return [int(each.strip()) for each in string.split(',') if each != '']

def main():
    user_input = input("Enter a list of integers, representing people group sizes:")
    numbers = convert_to_list(user_input)
    output = find_people_group(numbers)
    print("The group time to sell stock is on day: ", output)
    
if __name__=='__main__':
    main()
