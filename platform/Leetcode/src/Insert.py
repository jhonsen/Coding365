# Solution 2
def search_insert(num_list, target):
    for ind, num in enumerate(num_list):
        if target> num:
            continue
        else:
            return ind
    return ind+1

def main():
    number_list = input("Enter a list of numbers separated by commas: ")
    target = input("Enter a target number: ")
    integer_list = [int(each.strip()) for each in number_list.split(",")]
    position = search_insert(integer_list, int(target))
    if position+1 == 2:
        ith = 'nd'
    elif position+1 == 3:
        ith = 'rd'
    else: 
        ith = 'th'
    print("The target should be inserted at the {}-{} position in the list".format(position+1, ith))
    
    
if __name__=='__main__':
   main()
