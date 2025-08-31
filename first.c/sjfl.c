
#include <stdio.h>

int main() {
    int burst_time[20], process_id[20], waiting_time[20], turnaround_time[20];
    int i, j, num_processes, temp, total_waiting_time = 0, total_turnaround_time = 0;
    float avg_waiting_time, avg_turnaround_time;

    printf("Enter the number of processes: ");
    scanf("%d", &num_processes);

    printf("Enter burst time for each process:\n");
    for (i = 0; i < num_processes; i++) {
        printf("Process %d: ", i + 1);
        scanf("%d", &burst_time[i]);
        process_id[i] = i + 1;
    }

    // Sorting processes based on burst time
    for (i = 0; i < num_processes - 1; i++) {
        for (j = 0; j < num_processes - i - 1; j++) {
            if (burst_time[j] > burst_time[j + 1]) {
                temp = burst_time[j];
                burst_time[j] = burst_time[j + 1];
                burst_time[j + 1] = temp;

                temp = process_id[j];
                process_id[j] = process_id[j + 1];
                process_id[j + 1] = temp;
            }
        }
    }

    // Calculating waiting time for each process
    waiting_time[0] = 0;
    for (i = 1; i < num_processes; i++) {
        waiting_time[i] = 0;
        for (j = 0; j < i; j++) {
            waiting_time[i] += burst_time[j];
        }
    }

    // Calculating turnaround time for each process
    for (i = 0; i < num_processes; i++) {
        turnaround_time[i] = burst_time[i] + waiting_time[i];
    }

    // Calculating total waiting time and total turnaround time
    for (i = 0; i < num_processes; i++) {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
    }

    // Calculating average waiting time and average turnarou
    avg_waiting_time = (float)total_waiting_time / num_processes;
    avg_turnaround_time = (float)total_turnaround_time / num_processes;

    // Printing the results
    printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < num_processes; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\n", process_id[i], burst_time[i], waiting_time[i], turnaround_time[i]);
    }

    printf("\nAverage Waiting Time: %.2f\n", avg_waiting_time);
    printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);

    return 0;
}

