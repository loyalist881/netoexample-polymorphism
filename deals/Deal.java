package deals;

public class Deal {
    protected String comment;
    protected int creditChange;
    protected int debitChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.debitChange = debitChange;
        this.creditChange = creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public String getComment() {
        return comment;
    }
}
