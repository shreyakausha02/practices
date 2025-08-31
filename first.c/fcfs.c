
#include <stdio.h>

int main() {
    int n, i;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    int pid[n], at[n], bt[n], st[n], ct[n], tat[n], wt[n];
    float total_tat = 0, total_wt = 0;

    // Input Arrival Time and Burst Time
    for(i = 0; i < n; i++) {
        pid[i] = i + 1;
        printf("Enter Arrival Time and Burst Time for Process %d: ", pid[i]);
        scanf("%d %d", &at[i], &bt[i]);
    }

    // Sort processes by Arrival Time
    for(i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
            if(at[i] > at[j]) {
                // Swap Arrival Time
                int temp = at[i];
                at[i] = at[j];
                at[j] = temp;
                // Swap Burst Time
                temp = bt[i];
                bt[i] = bt[j];
                bt[j] = temp;
                // Swap Process ID
                temp = pid[i];
                pid[i] = pid[j];
                pid[j] = temp;
            }
        }
    }

    // Calculate Start Time, Completion Time, Turnaround Time, and Waiting Time
    for(i = 0; i < n; i++) {
        if(i == 0) {
            st[i] = at[i];
        } else {
            st[i] = (ct[i - 1] > at[i]) ? ct[i - 1] : at[i];
        }
        ct[i] = st[i] + bt[i];
        tat[i] = ct[i] - at[i];
        wt[i] = tat[i] - bt[i];
        total_tat += tat[i];
        total_wt += wt[i];
    }

    // Display the results
    printf("\nProcess\tAT\tBT\tST\tCT\tTAT\tWT\n");
    for(i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\t%d\n", pid[i], at[i], bt[i], st[i], ct[i], tat[i], wt[i]);
    }

    printf("\nAverage Turnaround Time: %.2f", total_tat / n);
    printf("\nAverage Waiting Time: %.2f\n", total_wt / n);

    return 0;
}
