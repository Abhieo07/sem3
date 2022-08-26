#include <stdio.h>

int main()
{
    int rows,cols,count = 0;
    printf("Enter rows and cols\n");
    scanf("%d%d", &rows, &cols);

    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= cols; j++){
            if(i == 1 || i == rows || j == 1 || j == cols)
                printf("*");
            else if(i == 2 || i == rows-1 || j == 2 || j == cols-1)
                printf("#");
            else if(i == 3 || i == rows-2 || j == 3 || j == cols-2)
                printf("@");
            else
            printf(" ");
        }
        printf("\n");
        count++;
    }

    return 0;
}