
#include <stdio.h>

int linearSearch(int arr[], int n, int key, int i) {
    if (i == n) {
        return -1; // Not found
    }
    if (arr[i] == key) {
        return i; // Found at index i
    }
    return linearSearch(arr, n, key, i + 1); // Move to next element
}

int main() {
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int key;
    printf("Enter key to search: ");
    scanf("%d", &key);

    int result = linearSearch(arr, n, key, 0);

    if (result == -1)
        printf("Element not found\n");
    else
        printf("Element found at index %d\n", result);

    return 0;
}

