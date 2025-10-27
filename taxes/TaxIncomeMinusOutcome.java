package taxes;

public class TaxIncomeMinusOutcome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) Math.max((debit - credit) * 0.15, 0);
    }
}
