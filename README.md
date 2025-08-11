# BankAccountSimulation
This Java OOP-based banking system simulates deposits, withdrawals, and transaction history with timestamps, enforcing a ₹500 minimum balance for Manoj Kumar’s account.

# Bank Account Simulation (Java)

## 📌 Overview
This Java program simulates basic banking operations such as **deposit**, **withdrawal**, and **transaction history tracking**.  
It uses **OOP principles** with a `BankAccount` class to manage account details and a `BankAccountSimulation` class with a menu-driven interface.

---

## 🛠 Features
- **Account Creation** with a minimum deposit requirement (`Rs. 500`).
- **Deposit Money** and update account balance.
- **Withdraw Money** while maintaining a **minimum balance**.
- **View Transaction History** with timestamps.
- **Balance Display** with date & time.
- **User-Friendly Menu** for multiple operations.
- **Transaction Logging** for each activity.

---

## 📂 Project Structure



### **Class: BankAccount**
Handles account data and core banking functionalities.

#### Fields:
- `accountNumber` → Fixed Account Number.
- `accountHolderName` → Name of account holder.
- `bankName` → Bank name.
- `balance` → Current account balance.
- `MIN_BALANCE` → Minimum balance (`Rs. 500`).
- `transactionHistory` → Stores list of transactions with timestamps.

#### Constructor:
- **`BankAccount(double initialDeposit)`**
  - Creates an account with an initial deposit.
  - Ensures deposit is >= `MIN_BALANCE`.

#### Methods:
- **`deposit(double amount)`** → Adds money to balance.
- **`withdraw(double amount)`** → Deducts money if `MIN_BALANCE` is maintained.
- **`showBalance()`** → Displays current balance with timestamp.
- **`printTransactionHistory()`** → Prints all previous transactions.
- **`logTransaction(String detail)`** → Stores a timestamped transaction log.
- **Getters** → For account holder name, number, and bank name.

---

### **Class: BankAccountSimulation**
Handles the main menu-driven interaction with the user.

#### Main Steps:
1. **Displays Welcome Screen** with account details.
2. **Creates a `BankAccount` instance** with an initial deposit of Rs. 500.
3. **Menu Options:**
   1. **Deposit**
   2. **Withdraw**
   3. **View Transaction History**
   4. **Close Program**
4. **Uses `Scanner`** for user input.
5. **Loop runs** until user chooses option `4` (Close).

---

## 📜 Example Run

Welcome Manoj Kumar Pinniboina..
AccountNo:38761563829
State Bank of India
IFSC:SBIN0021202
Deposit

Withdraw

Transaction History

Close
Choose an operation to perform: 1
Enter deposit amount: RS.1000
[2025-08-12 10:30:15] Current Balance: Rs.1500.0

Deposit

Withdraw

Transaction History

Close
Choose an operation to perform: 2
Enter withdrawal amount: Rs.500
[2025-08-12 10:31:02] Current Balance: Rs.1000.0

Deposit

Withdraw

Transaction History

Close
Choose an operation to perform: 3

Transaction History for Manoj Kumar:
2025-08-12 10:30:00 - Account created with initial deposit: Rs.500.0
2025-08-12 10:30:15 - Deposited Rs.1000.0
2025-08-12 10:31:02 - Withdrew Rs.500.0

[2025-08-12 10:31:02] Total Available Balance: Rs.1000.0
