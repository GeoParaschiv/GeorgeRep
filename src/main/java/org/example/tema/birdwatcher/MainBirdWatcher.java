package org.example.tema.birdwatcher;

import java.util.Arrays;

public class MainBirdWatcher {
    public static void main(String[] args) {

        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        // Task 1
        int[] lastWeekCounts = birdCount.getLastWeek();
        System.out.println("Last week's counts: " + Arrays.toString(lastWeekCounts));

        // Task 2
        int todayCount = birdCount.getToday();
        System.out.println("Birds visited today: " + todayCount);

        // Task 3
        birdCount.incrementTodaysCount();
        System.out.println("Updated birds visited today: " + birdCount.getToday());

        // Task 4
        boolean hasDayWithoutBirds = birdCount.hasDayWithoutBirds();
        System.out.println("Has a day without birds: " + hasDayWithoutBirds);

        // Task 5
        int countForFirstDays = birdCount.getCountForFirstDays(4);
        System.out.println("Count for the first 4 days: " + countForFirstDays);

        // Task 6
        int busyDays = birdCount.getBusyDays();
        System.out.println("Number of busy days: " + busyDays);
    }
}
