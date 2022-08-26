#include <stdio.h>

int linearSearch(int a[], int n, int x)
{
    int count = 0;
    for(int i = 0; i < n; i++)
    {
        if(a[i] == x)
        count ++;
        
    }
    printf("\nnumber of times %d occured = %d\n", x, count);
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
    linearSearch(a, n, x);

    return 0;
}