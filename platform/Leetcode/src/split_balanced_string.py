def split_balanced_string(string):
    '''
    Function returns the maximum number of balanced groupings of L & R strings
    e.g., Input: s = "LLLLRRRR". Outputs 1, because 'LLLLRRRR' is one group
    '''
    assert_message = "Input must be a balanced combination of L & R"
    assert len(set(string)) == 2, assert_message
    assert string.count(list(set(string))[0]) == string.count(list(set(string))[-1]), assert_message
    
    total_cnt = 0
    leader_counter = 0
    
    ind = 0
    leader = string[0]
    while ind < len(string):
        if string[ind] == leader:
            leader_counter += 1            
        else:
            leader_counter -= 1            

        if leader_counter == 0:
            total_cnt += 1

        ind += 1
    
    return total_cnt

def main():
    text = input("Enter an interspersed string of L's and R's: ")
    output = split_balanced_string(text)
    print('The max number of balanced LR-group is: ', output)

if __name__ == '__main__':
    main()