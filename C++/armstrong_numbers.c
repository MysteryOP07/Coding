#include <stdio.h>
#include <math.h>
int main()
{
    int input, inp_copy1, inp_copy2, dig_count = 0, new_num = 0, sum = 0;
    scanf("%d", &input);
    inp_copy1 = input;
    inp_copy2 = input;
    printf("\n\t %d is input 1\n\t %d is input 2", inp_copy1, inp_copy2);
    while (inp_copy1 > 0)
    {
        dig_count++;
        inp_copy1 = inp_copy1 / 10;
    }
    printf("\n%d", dig_count);
    while (inp_copy2 > 0)
    {
        new_num = inp_copy2 % 10; 
        printf("\n new num = %d", new_num);
        sum = sum + ceil(pow(new_num, dig_count));
        inp_copy2 = inp_copy2 / 10;
        printf("\nsum = %d", sum);
    }
    printf("\n%d\n", sum);
    if (sum == input)
    {
        printf("The number is an Armstrong number.");
    }
    else
    {
        printf("Not an Armstrong Number");
    }
    return 0;
}

// #include<stdio.h>
// #include<math.h>
// int main(){
//     int n;
//     scanf("%d", &n);

//     int n1 = n;
//     int count = 0;
//     while (n1 > 0){
//         count++;
//         n1 /= 10;
//     }

//     printf("Number: %d\n", n);
//     printf("Digit: %d\n", count);

//     n1 = n;
//     int new_num = 0;
//     while (n1 > 0){
//         int digit = n1 % 10;
//         printf("new digit: %d\n", digit);
//         new_num += ceil(pow(digit, count)); 
//         printf("New Num: %d\n", new_num);
//         n1 /= 10;
//     }


//     if (new_num == n){
//         printf("%d is an Armstrong number with %d digits.", n, count);
//     }
//     else{
//         printf("%d is not an Armstrong number.", n);
//     }

// }
