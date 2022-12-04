#include <stdio.h>

void print_arr(int* arr, int len)
{
    int i;
    printf("{ ");
    for (i = 0; i < len; ++i) {

        printf("%d, ", arr[i]);
    }

    printf(")\n");
}

int merge(int arr[], int l, int m, int h)
{
    int arr1[10], arr2[10]; // Two temporary arrays to
    int n1, n2, i, j, k;
    n1 = m - l + 1;
    n2 = h - m;

    for (i = 0; i < n1; i++)
        arr1[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        arr2[j] = arr[m + j + 1];

    arr1[i] = 9999; // To mark the end of each temporary array
    arr2[j] = 9999;

    i = 0;
    j = 0;
    for (k = l; k <= h; k++) //process of combining two sorted arrays
    {
        if (arr1[i] <= arr2[j])
            arr[k] = arr1[i++];
        else
            arr[k] = arr2[j++];
    }

    printf("-------------------\n");

    return 0;
}

int merge_sort(int arr[], int low, int high)
{
    int mid;
    if (low < high) {
        mid = (low + high) / 2;
        // Divide and Conquer
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        // Combine
        merge(arr, low, mid, high);
    }

    return 0;
}

int main()
{
    int arr[10] = { 1, 2, 5, 7, 3, 4, 6, 11, 12, 13 };
    int arr2[3] = { '6', '9', '2' };
    merge_sort(arr2, 0, 2); // sort the array

    print_arr(arr2, 3);

    return 0;
}
