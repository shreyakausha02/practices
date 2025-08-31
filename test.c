

#include<stdio.h>

void main()
{
    int n, sum = 0;
    printf("Enter size : ");
    scanf("%d", &n);
    int a[n];
    printf("Enter elements : ");
    for(int i = 0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }

    for(int i = 0; i<n; i++)
    {
        sum += a[i];
    }
    printf("Sum of elements : %d", sum);
    
}
