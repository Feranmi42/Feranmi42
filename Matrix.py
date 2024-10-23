import requests


def  get_exchange_rate(base_currency, target_currency):
    url = f"https://api.exchangerate-api.com/v4/latest/{base_currency}"
    response = requests.get(url)
    if response.status_code == 200:
        data = response.json()
        return (data['rates'].get(target_currency, None))
    else:
        print("Error fetching exchange rates.")
        return None


balance_1 = int(input("enter amount in Bank"))
attempt = 0
max_attempt = 4
password = 3480
while attempt < max_attempt:
    pin = int(input("Welcome to Ferrysco Bank. Please Enter your Bank Pin number:"))
    attempt += 1
    if pin == password:
        print("Choose what you would like to do today? \n Choose an option: ")
    else:
        print('Incorrect Pin, Please try again! Remaining Attempt: ', (max_attempt - attempt))
    if attempt == max_attempt:
        print('Sorry, account is lock due to too many failed attempt, Please Contact Customer Services')
    while pin == password:
        print("1. Deposit")
        print("2. Whithdrawal")
        print("3. Check Balance")
        print("4.convert Balance to Another Currency")
        print("5. Cancel")
        choice = int(input("Enter choice"))
        if choice == 1:
            deposit_Num = float(input('Enter the amount you want to deposit: '))
            if deposit_Num > 0:
                balance_1 += deposit_Num
                print(f"you Deposited: {deposit_Num}. your new balance is:{balance_1}")
            else:
                print("Invalid Amount")
        elif choice == 2:
            Money_widwraw = float(input("Enter the amount you want to withdrawal"))
            if 0 < Money_widwraw <= balance_1:
                balance_1 -= Money_widwraw

                print(f"you Deposited: {Money_widwraw}. your new balance is:{balance_1}")
            else:
                print("Invalid Amount")
        elif choice == 3:
            print("Your current Balance is: $", balance_1)
        elif choice == 4:
            target_currency = input("Enter the currency code you want to convert to: ")
            exchange_rate = get_exchange_rate("USD", target_currency)
            if exchange_rate:
                converted_balance = balance_1 * exchange_rate
                print(f"Your balance in {target_currency} is: {converted_balance:.2f}")
            else:
                print("Thanks for Banking with Us! \n Enjoy your Day!")
            break
        else:
            print("your input is invalid, please try again!")

