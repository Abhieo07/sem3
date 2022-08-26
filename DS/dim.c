#include <stdio.h>

int main()
{
    int n,a0 = 1189, b0 = 841;
    printf("Enter terms\n");
    scanf("%d", &n);
    printf("dimensio of A0: %d * %d\n", a0,b0);

    for(int i = 0; i < n; i++)
    {
        int a1 = b0;
        int b1 = a0 / 2;
        a0 = a1;
        b0 = b1;
        printf("dimensio of A%d: %d * %d\n", i+1,a0,b0);
        if (a0 == 0 || b0 == 0){
            printf("\npossible dimension: %d\n",i+1);
            break;
        }
    }

    return 0;
}