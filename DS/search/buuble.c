#include <stdio.h>

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void bubble(int arr[], int n)
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

void display(int arr[], int size)
{
    for(int i = 0; i < size; i++){
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

int main()
{
    // int arr[] = {64, 34, 25, 12, 22, 11, 90};
    // int n = sizeof(arr) / sizeof(arr[0]);

    int n, arr[20];
    printf("Enter number of element in Array\n");
    scanf("%d", &n);
    printf("Enter elements: \n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    bubble(arr, n);
    printf("Sorted Array: \n");
    display(arr, n);

    return 0;
}