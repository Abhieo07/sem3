#include <stdio.h>

int binarySearch(int a[], int high, int low, int x) {
    int mid;
    mid = (low + high) / 2;

    while(low <= high) {
        if(x == a[mid])
        return 1;
        else {
            if(x > a[mid]) {
                return binarySearch(a,high,mid+1,x);
            }
            else
            return binarySearch(a,mid-1,low,x);
        }
    }
    return 0;
}

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}
void sort(int a[], int n) {
    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - 1 - i; j++) {
            if(a[j] > a[j + 1])
            swap(&a[j], &a[j + 1]);
        }
    }
}

int main()
{
    int a[30],n,x;
    printf("Enter number of element in array and value of x:\n");
    scanf("%d%d", &n, &x);
    printf("Enter elements:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sort(a,n);
    if(binarySearch(a, n-1, 0, x))
    printf("Element present in array\n");
    else
    printf("Element not present in array");

    return 0;
}