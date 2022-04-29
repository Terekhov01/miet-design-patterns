package people;

public class Pilot extends BaseHuman{
    private int rank;

    public Pilot(int rank) throws Exception {
        if (rank > 4) throw new Exception("Max amount of bars - 4(Captain)");
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
