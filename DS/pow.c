#include <stdio.h>
#include <string.h>
#include <math.h>

// int power(int x,int n)
// {
//     if (n == 0){
//         return 1;
//     }
//     else{
//         return x * power(x, n - 1);
//     }
// }

// typedef struct {
//     int roll[10];
//     char *name;
//     float fees[10];
// }student;

int main()
 {  //--------------POWEER FUNCTION------------------------
//     int x,n;
//     printf("Enter value of x and n\n");
//     scanf("%d%d", &x,&n);

//     printf("x raised n is: %d", power(x,n));

  //==================PATTERN 1===========================  
  
    // int i, j,n;
    // printf("Enter number of row\n");
    // scanf("%d", &n);
    // char ch = 'A';

    // for(i = 0; i < n; i++){
    //     for(j = 0; j <= i; j++){
    //         printf("%2c", ch);
    //     }
    //     ch++;
    //     printf("\n");
    // }

//     int array[5],temp;
//     printf("Enter the numbers for array\n");
//     for(int i = 0; i < 5; i++){
//         scanf("%d", &array[i]);
//     }
    
//     for(int j = 0; j < 5; j++){
//         if(array[j] > array[j + 1]){
//            temp = array[j];
//            array[j] = array[j+1];
//            array[j+1] = temp;
//         }
        
//     }
//    printf("greatest is %d\n", array[5]);
// ------------------PATTERN 2-----------------------------
//    int n;
//    printf("enter rows: ");
//    scanf("%d", &n);

//    for(int i = 0; i < n; i++){
//     for(int j = 0; j <= i; j++){
//         printf("* ");
//     }
//     printf("\n");
//    }

//----------------------------------------------------------------------
    // student s[10];
    // for(int i = 0; i < 10; i++){
    //     printf("Enter roll, name and fees of student %d\n", i + 1);
    //     scanf("%d %s %f", &s->roll[i], &s->name[i], &s->fees[i]);
    // }
    // for(int j = 0; j < 10; j++){
    //     printf("detail of student%d\n", j + 1);
    //     printf("%d %s %f", s->roll[j], s->name[j], &s->fees[j]);
    // }
//------------------------------REVERSE AND ITS SUM-----------------
    // int num,sum,rev = 0,s1 = 0;

    // printf("enter number: ");
    // scanf("%d", &num);
    // int n1 = num;

    // while(n1>0){
    //     sum = n1 % 10;
    //     n1 /= 10;
    //     rev = rev * 10 + sum;
    //     s1 += sum;
    // }
    // printf("reverse of %d is %d and its sum is %d\n", num, rev,s1);

    //-----------------CARTESIAN TO POLAR-------------------------
   return 0;
}