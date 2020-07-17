
def quantify_forwards(emails):
    seen = set()
    for email in emails:
        local, domain = email.split('@')
        if '+' in local:
            local = local[:local.index('+')]
        seen.add(local.replace('.','') + '@' + domain)
    return len(seen)

def convert_to_list(string):
    return [each.strip() for each in string.split(',') if each != '']

def main():
    user_input = input("Enter email addresses, separated by commas : ")
    emails = convert_to_list(user_input)
    output = quantify_forwards(emails)
    print("The unique emails to forward are: ", output)
    
if __name__ == '__main__':
    main()
