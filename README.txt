Bank System
===========
This system helps to banker to manage deposits of the clients.

There are 6 classes:

-----------
Main.java - this class helps to create clients and their deposit:
	public static void main()

-----------
CurrenAccount.java - this class helps to manage Current Accounts.
For example, putMoney(), withdrawMoney(), getBalance() etc
This class has balance, client.

-----------
DepositAccount.java - this class helps to manage Deposit Accounts.
For example, addPercent(), withdrawMoney(), putMoney() etc
This class has fixedPercent, balance, client.

-----------
Client.java - this class helps to manage Clients.
For example, Client(), getFullName(), getAddress() etc
This class has fullName, address, numberOfPassport, mobilePhone, salary, validMobile

Also my project has two test

-----------
CurrentAccountTest - this class check the input data of Current Account. 
DepositAccountTest - this class check the input data of Deposit Account.

