def print_table(num):
    for i in range(1, 11):
        print(f"{num} * {i} = {num * i}")

# Example usage
user_input = int(input("Enter a number: "))
print_table(user_input)