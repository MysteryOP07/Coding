#include <stdio.h>
#include <conio.h>

void Userscreen() {
    int choice, balance = 7777, withdrawl, newpass;

    while (true) {
        printf("Please enter your choice :\n");
        printf("1 for Balance Enquiry.\n");
        printf("2 for Withdrawal request.\n");
        printf("3 for Mini Statement.\n");
        printf("4 for Pin change Request.\n");
        printf("5 for Exit.\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Your account balance is ₹ %d\n", balance);
                break;
            case 2:
                printf("Please enter your withdrawal amount : \n");
                scanf("%d", &withdrawl);
                if (balance >= withdrawl) {
                    balance = balance - withdrawl;
                    printf("Please collect your amount from the withdrawal tray.\n Your updated balance is ₹ %d \n", balance);
                } else {
                    printf("Insufficient Balance.\n");
                }
                break;
            case 3:
                printf("Here is your mini statement: \n");
                printf("Date: \n Time: \n Amount: \n");
                break;
            case 4:
                printf("Please enter your new 6-digit PIN: \n");
                scanf("%d", &newpass);
                break;
            case 5:
                printf("Exiting User Screen...\n");
                return;
            default:
                printf("Invalid choice. Please try again.\n");
                break;
        }
    }
}

int main() {
    int pass = 123456, upass, attempt = 0;
    printf("Welcome to IES Bank....\n");

    for (attempt = 0; attempt <= 3; attempt++) {
        printf("Please Enter Your Password: \n");
        scanf("%d", &upass);

        if (upass == pass) {
            Userscreen();
            break;
        } else {
            printf("Incorrect Password. Please Try Again.\n");
        }
    }

    if (attempt == 3) {
        printf("Your account is blocked!!!! \nPlease contact your respective branch.\n");
    }

    return 0;
}