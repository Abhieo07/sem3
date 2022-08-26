#include <stdio.h>

int main()
{
    int n, a[30],d;
    printf("Enter number of elements and d\n");
    scanf("%d%d", &n, &d);
    printf("Enter element\n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    int temp;
    for(int i = 0; i < n; i++)
    {
        temp = a[d];
        a[d] = a[i];
        a[i] = temp;
        if(d > n - 2)
        d--;
        else
        d++;
        
    }

     for(int i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }

    return 0;
}