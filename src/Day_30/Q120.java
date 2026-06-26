package Day_30;

import java.util.Scanner;

public class Q120 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxTeams = 32;
        int maxMatches = 50;

        int[] teamCount = {0};
        int[] matchCount = {0};

        String[] teams = new String[maxTeams];
        String[] groups = new String[maxTeams];
        int[] points = new int[maxTeams];

        String[] matchHomeTeams = new String[maxMatches];
        String[] matchAwayTeams = new String[maxMatches];
        String[] matchResults = new String[maxMatches];

        initializeDefaultTeams(teams, groups, points, teamCount);

        int choice = 0;

        while (choice != 6) {
            displayMenu();
            System.out.print("Enter your choice (1-6): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Please enter a number between 1 and 6: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice != 6) {
                handleMenuChoice(choice, scanner, teams, groups, points, teamCount, matchHomeTeams, matchAwayTeams, matchResults, matchCount);
            }
        }

        System.out.println("\nThank you for using FIFA World Cup Management System. Goodbye!");
        scanner.close();
    }

    static void initializeDefaultTeams(String[] teams, String[] groups, int[] points, int[] teamCount) {
        String[] initialTeams = {"Argentina", "France", "Brazil", "Croatia", "Morocco", "England", "Portugal", "Spain"};
        String[] initialGroups = {"A", "A", "B", "B", "C", "C", "D", "D"};

        for (int i = 0; i < initialTeams.length; i++) {
            teams[teamCount[0]] = initialTeams[i];
            groups[teamCount[0]] = initialGroups[i];
            points[teamCount[0]] = 0;
            teamCount[0]++;
        }
    }

    static void displayMenu() {
        System.out.println("\n=============================================");
        System.out.println("     FIFA WORLD CUP MANAGEMENT SYSTEM       ");
        System.out.println("=============================================");
        System.out.println("1. Register a Team");
        System.out.println("2. Display Registered Teams & Standings");
        System.out.println("3. Schedule a Match");
        System.out.println("4. Update Match Result & Standings");
        System.out.println("5. Search Team Details");
        System.out.println("6. Exit System");
        System.out.println("=============================================");
    }

    static void handleMenuChoice(int choice, Scanner scanner, String[] teams, String[] groups, int[] points, int[] teamCount,
                                 String[] matchHome, String[] matchAway, String[] matchResults, int[] matchCount) {
        if (choice == 1) {
            registerTeam(scanner, teams, groups, points, teamCount);
        } else if (choice == 2) {
            displayTeams(teams, groups, points, teamCount[0]);
        } else if (choice == 3) {
            scheduleMatch(scanner, teams, teamCount[0], matchHome, matchAway, matchResults, matchCount);
        } else if (choice == 4) {
            updateMatchResult(scanner, teams, points, teamCount[0], matchHome, matchAway, matchResults, matchCount[0]);
        } else if (choice == 5) {
            searchTeam(scanner, teams, groups, points, teamCount[0]);
        } else {
            System.out.println("\n[Error] Invalid choice! Please select an option from 1 to 6.");
        }
    }

    static void registerTeam(Scanner scanner, String[] teams, String[] groups, int[] points, int[] teamCount) {
        System.out.println("\n--- Register New Team ---");
        if (teamCount[0] >= teams.length) {
            System.out.println("[Error] Maximum team limit reached!");
            return;
        }

        System.out.print("Enter Team Name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("[Error] Team name cannot be blank.");
            return;
        }

        if (findTeamIndex(name, teams, teamCount[0]) != -1) {
            System.out.println("[Error] " + name + " is already registered.");
            return;
        }

        System.out.print("Assign Group (A-H): ");
        String group = scanner.nextLine().trim().toUpperCase();

        if (group.length() != 1 || group.charAt(0) < 'A' || group.charAt(0) > 'H') {
            System.out.println("[Error] Invalid Group! Must be a single letter between A and H.");
            return;
        }

        teams[teamCount[0]] = name;
        groups[teamCount[0]] = group;
        points[teamCount[0]] = 0;
        teamCount[0]++;

        System.out.println("[Success] " + name + " registered in Group " + group + "!");
    }

    static void displayTeams(String[] teams, String[] groups, int[] points, int totalTeams) {
        System.out.println("\n--- Current Standings & Registered Teams ---");
        if (totalTeams == 0) {
            System.out.println("No teams registered yet.");
            return;
        }

        System.out.println("ID\t|\tTeam Name\t|\tGroup\t|\tPoints");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < totalTeams; i++) {
            System.out.println((i + 1) + "\t|\t" + teams[i] + "\t\t|\t" + groups[i] + "\t|\t" + points[i]);
        }
    }

    static void scheduleMatch(Scanner scanner, String[] teams, int totalTeams,
                              String[] matchHome, String[] matchAway, String[] matchResults, int[] matchCount) {
        System.out.println("\n--- Schedule a Match ---");
        if (totalTeams < 2) {
            System.out.println("[Error] You need at least 2 registered teams to schedule a fixture.");
            return;
        }

        if (matchCount[0] >= matchHome.length) {
            System.out.println("[Error] Match schedule is full.");
            return;
        }

        System.out.print("Enter Home Team Name: ");
        String home = scanner.nextLine().trim();
        System.out.print("Enter Away Team Name: ");
        String away = scanner.nextLine().trim();

        int homeIdx = findTeamIndex(home, teams, totalTeams);
        int awayIdx = findTeamIndex(away, teams, totalTeams);

        if (homeIdx == -1 || awayIdx == -1) {
            System.out.println("[Error] One or both teams are not registered.");
            return;
        }

        if (homeIdx == awayIdx) {
            System.out.println("[Error] A team cannot play against itself.");
            return;
        }

        matchHome[matchCount[0]] = teams[homeIdx];
        matchAway[matchCount[0]] = teams[awayIdx];
        matchResults[matchCount[0]] = "Pending";
        matchCount[0]++;

        System.out.println("[Success] Match Scheduled: " + teams[homeIdx] + " vs " + teams[awayIdx]);
    }

    static void updateMatchResult(Scanner scanner, String[] teams, int[] points, int totalTeams,
                                  String[] matchHome, String[] matchAway, String[] matchResults, int totalMatches) {
        System.out.println("\n--- Update Match Results ---");
        if (totalMatches == 0) {
            System.out.println("No fixtures scheduled yet.");
            return;
        }

        System.out.println("ID\t|\tFixture\t\t\t|\tStatus/Result");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < totalMatches; i++) {
            System.out.println((i + 1) + "\t|\t" + matchHome[i] + " vs " + matchAway[i] + "\t\t|\t" + matchResults[i]);
        }

        System.out.print("\nEnter Match ID to update: ");
        int matchId = scanner.nextInt() - 1;
        if (matchId < 0 || matchId >= totalMatches) {
            System.out.println("[Error] Invalid Match ID.");
            return;
        }

        System.out.print("Enter goals scored by " + matchHome[matchId] + ": ");
        int homeGoals = scanner.nextInt();
        System.out.print("Enter goals scored by " + matchAway[matchId] + ": ");
        int awayGoals = scanner.nextInt();

        matchResults[matchId] = homeGoals + " - " + awayGoals;

        int homeIdx = findTeamIndex(matchHome[matchId], teams, totalTeams);
        int awayIdx = findTeamIndex(matchAway[matchId], teams, totalTeams);

        if (homeGoals > awayGoals) {
            points[homeIdx] += 3;
        } else if (awayGoals > homeGoals) {
            points[awayIdx] += 3;
        } else {
            points[homeIdx] += 1;
            points[awayIdx] += 1;
        }
        System.out.println("[Result Updated Successfully]");
    }

    static void searchTeam(Scanner scanner, String[] teams, String[] groups, int[] points, int totalTeams) {
        System.out.println("\n--- Search Team Details ---");
        System.out.print("Enter the team name: ");
        String searchName = scanner.nextLine().trim();

        int idx = findTeamIndex(searchName, teams, totalTeams);

        if (idx == -1) {
            System.out.println("[-] Team \"" + searchName + "\" not found.");
        } else {
            System.out.println("\n[Match Found]");
            System.out.println("Official Name : " + teams[idx]);
            System.out.println("Group Stage   : Group " + groups[idx]);
            System.out.println("Total Points  : " + points[idx]);
        }
    }

    static int findTeamIndex(String teamName, String[] teams, int totalTeams) {
        for (int i = 0; i < totalTeams; i++) {
            if (teams[i].equalsIgnoreCase(teamName)) {
                return i;
            }
        }
        return -1;
    }
}