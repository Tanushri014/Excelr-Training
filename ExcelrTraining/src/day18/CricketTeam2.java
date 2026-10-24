package day18;

import java.util.Arrays;

public class CricketTeam2 {

public static void main(String[] args) {
    int players[] = {4, 3, 5, 6};
    int teamSize = 4;

    int max = maximumTeams(players, teamSize);
    System.out.println("Maximum number of teams: " + max);
}

private static int maximumTeams(int[] players, int teamSize) {
    int sum = Arrays.stream(players).sum();

    for (int i = 1; i <= sum; i++) {
        if (!checkTeamPossible(players, teamSize, i)) {
            return i - 1;
        }
    }

    return -1;
}

private static boolean checkTeamPossible(
        int[] players, int teamSize, int numberOfTeams) {

    int playersNeeded = teamSize * numberOfTeams;
    int playersHave = 0;

    for (int p : players) {
        playersHave += Math.min(p, teamSize);
    }

    return playersHave >= playersNeeded;
}


}
