# Currency-Converter
#JAVA project
#This Java program implements a simple Currency Converter. Here's an explanation of the code:

1. Main Class: CurrencyConverter
The program runs inside the main() method.
2. Predefined Exchange Rates
The program has predefined exchange rates for currency conversion:
usdToEur = 0.85: 1 USD = 0.85 EUR
eurToUsd = 1.18: 1 EUR = 1.18 USD
usdToInr = 82.50: 1 USD = 82.50 INR
inrToUsd = 0.012: 1 INR = 0.012 USD
3. User Interaction
The program prompts the user to choose a conversion type from four options:

USD to EUR
EUR to USD
USD to INR
INR to USD
The user is then asked to input the amount they want to convert.

4. Conversion Process
The program uses a switch statement to perform the appropriate conversion based on the user's choice.
Depending on the choice:
If the user chooses 1, the amount in USD is converted to EUR using the formula amount * usdToEur.
If the user chooses 2, the amount in EUR is converted to USD using amount * eurToUsd.
If the user chooses 3, the amount in USD is converted to INR using amount * usdToInr.
If the user chooses 4, the amount in INR is converted to USD using amount * inrToUsd.
The result of the conversion is displayed to the user.
5. Error Handling
If the user enters an invalid choice (not between 1 and 4), the program outputs an "Invalid choice" message.
Summary
This program allows users to easily convert between USD, EUR, and INR based on predefined exchange rates by interacting with the program via a console. It uses basic control structures such as the switch statement to handle the currency conversion logic.
