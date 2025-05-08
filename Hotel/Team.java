package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }

    public static class Match {

        private Team team1;
        private Team team2;
        private Team winner;

        //this is the constructor
        public Match(Team team1, Team team2) {
            this.team1 = team1;
            this.team2 = team2;
        }

        // these are the getters
        public Team getTeam1() {
            return team1;
        }

        public Team getTeam2() {
            return team2;
        }

        public Team getWinner() {
            return winner;
        }

        public Team playMatch() {
            winner = Math.random() > 0.5 ? team1 : team2;
            System.out.println("The winner is: " + winner.getTeamName());
            return winner;
        }
    }

    public static class Round {
        private List<Match> matches;
        List<Team> roundWinners = new ArrayList<>();

        public Round(List<Match> matches) {
            this.matches = matches;
        }
        public Round(){
            //leave empty
        }

        //declaration and initialization
    //private List<Hotel.Team.Match> matches = new ArrayList<>();

    public List<Team> playRound() {
        //create a method where you implement to play all matches in a round
        //What happens in a round? matches are played and a winner wins a round
        //winner of the round goes to the tournament
        System.out.println("Starting Hotel.Team.Round");
        for(Match match: matches) {
            roundWinners.add(match.playMatch());
        }
        System.out.println("Hotel.Team.Round complete");
        return roundWinners;
    }
    }
}
