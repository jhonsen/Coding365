def find_max_profit(prices):
    if len(prices) == 0:
        return 0
    
    max_profit = 0
    base_price = prices[0]
    
    for i in range(1, len(prices)):        
            
        if (prices[i] - base_price) > 0:
            profit = (prices[i] - base_price) 
        else:
            profit = max_profit        
        
        if prices[i] < base_price:
            base_price = prices[i]        
        
        if profit > max_profit:
            max_profit = profit

    return max_profit

def convert_to_list(string):
    return [int(each.strip()) for each in string.split(',') if each != '']

def main():
    user_input = input("Enter a list of integers, separated by commas: ")
    numbers = convert_to_list(user_input)
    output = find_max_profit(numbers)
    print("The group and the people related ids are: ", output)
    
if __name__=='__main__':
    main()
    
