#include <stdio.h>
#include <string.h>

int main()
{
    int rows,cols,count = 0;
    char print[] = "*#@$&";
    printf("%c", print[count]);

    printf("Enter rows and cols\n");
    scanf("%d%d", &rows, &cols);

    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= cols; j++){
            if(i == 1 + count || i == rows - count || j == 1 + count || j == cols - count)
                printf("*");
            else
            printf(" ");
        }
        count++;
        printf("\n");
    }

    return 0;
}