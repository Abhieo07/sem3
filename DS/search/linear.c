#include <stdio.h>

int linearSearch(int a[], int n, int x)
{
    for(int i = 0; i < n; i++)
    {
        if(a[i] == x)
        return 1;
    }
    return 0;
}

int main()
{
    int a[30], n,x,i;
    printf("Enter number of element\n");
    scanf("%d", &n);

    printf("Enter elements\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\nEnter the number to be searched\n");
    scanf("%d", &x);
    printf("Elements in Array are:\n");
    for(i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    if(linearSearch(a, n, x))
    printf("\nNumber found\n");
    else
    printf("\nNumber not found\n");

    return 0;
}