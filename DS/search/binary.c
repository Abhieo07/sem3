#include <stdio.h>

int binarySearch(int a[], int n, int x) {
    int low,high,mid;
    low = 0;
    high = n - 1;
    mid = (low + high) / 2;

    while(low <= high) {
        if(x == a[mid])
        return 1;
        else
        {
            if(x > a[mid]) {
                low = mid + 1;
            mid = (low + high) / 2;
            }
            else {
                high = mid - 1;
            mid = (low + high) / 2;
            }
        }
    }
    return 0;
    
}

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void bubbleSort(int arr[], int n)
{
    int i, j;
    for(i = 0; i < n - 1; i++)
    {
        for(j = 0; j < n -i - 1; j++)
        {
            if(arr[j] > arr[j + 1])
            swap(&arr[j], &arr[j + 1]);
        }
    }
}

void display(int a[], int n) {
    printf("elements in array:");
    for(int i = 0; i < n; i++) {
        printf("%d\t", a[i]);
    }
}

int main()
{
    int a[30], n, x;
    printf("Enter number of element in array and x:\n");
    scanf("%d%d", &n, &x);
    printf("Enter elements\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    bubbleSort(a, n);
    if(binarySearch(a, n, x)) {
        printf("FOUND\n");
    }
    else 
    printf("NOT\n");

    display(a,n);

    return 0;
}