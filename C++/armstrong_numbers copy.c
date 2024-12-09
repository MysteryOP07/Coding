#include <stdio.h>
#include <math.h>

void main() {
    int input, inp_copy1, inp_copy2, dig_count = 0, new_num, sum = 0;

    scanf("%d", &input);
    inp_copy1 = input;
    inp_copy2 = input;

    while (inp_copy1 != 0) {
        inp_copy1 %= 10;
        inp_copy1 /= 10;
        dig_count++;
    }

    printf("\n%d", dig_count);

    while (inp_copy2 != 0) {
        new_num = inp_copy2 % 10;
        sum += pow(new_num, dig_count);
        inp_copy2 /= 10;
    }

    printf("\n%d\n", sum);

    if (sum == input) {
        printf("The number is an Armstrong number.\n");
    } else {
        printf("Not an Armstrong Number\n");
    }
}