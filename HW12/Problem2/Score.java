package Problem2;

public class Score {
    private String participantName;
    private int triviaScore;

    public Score(String participantName, int triviaScore) {
        this.participantName = participantName;
        this.triviaScore = triviaScore;
    }

    public int getScore() {
        return triviaScore;
    }

    public void setScore(int triviaScore) {
        this.triviaScore = triviaScore;
    }

    public String getName() {
        return participantName;
    }

    @Override
    public int hashCode() {
        return participantName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Score other = (Score) obj;
        return participantName.equals(other.participantName);
    }
}