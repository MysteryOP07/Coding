#include<stdio.h>
#include<conio.h>
void Userscreen(){
    int choice,balance=7777,withdrawl,newpass;
    bool exit=false;
    //  while(!exit){ 
        printf("Please enter your choice :\n Press 1 for Balance Enquiry.\n Press 2 for Withdrawl request.\n Press 3 for Mini Statement.\n Press 4 for Pin change Request.\n Press 5 to exit.\n ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Your account balance is Rs. %d\n",balance);
                printf("\n\n");
                break;
            case 2:
                printf("Please enter your withdrawl amount : \n");
                scanf("%d",&withdrawl);
                if(balance>=withdrawl){
                    balance=balance-withdrawl;
                    printf("Please Collect your amount from withdrawl tray.\n Your updated balance is Rs. %d \n",balance);
                    printf("\n\n");
                }
                else{
                    printf("Insufficient Balance.\n\n");
                }
                break;
            case 3:
                printf("Here is your mini statement: \n");
                printf("\nDate: \n Time: \n Amount: \n\n");
                break;
            case 4:
                printf("Please enter your new 6-digit PIN: \n");
                scanf("%d",&newpass);
                printf("Password Changed successfully......");
                printf("\n\n");
                break;
            case 5:
                printf("Exiting User Screen...");
                exit=true;
                break;
            default:
                printf("Invalid choice. Please try again.\n\n");
                break;
        }
     }
    
    // }


int main(){
    int pass=123456,upass,attempt=0;
    printf("Welcome to IES Bank....\n");
    for(attempt=0;attempt<=3;attempt++){
        printf("Please Enter Your Password: \n");
        scanf("%d",&upass);
        if(upass==pass){
            Userscreen();
            break;
        }
        else{
            printf("Incorrect Password. Please Try Again.\n");
        }}
    if(attempt==3){
        printf("Your account is blocked!!!! \n Please contact your respective branch.");
    }




return 0;
}