public class CreditAsseccement {

    private static double AGE= 0.25;

    private static double DEBT= 0.45;

    private static double CHILD= 0.30;

    public boolean assess(Client client) {
        double risk = 0;
        if (client.getAg() >= 18)
            risk += AGE;

        if (client.getDebt() == 0)
            risk += DEBT;

        if (client.getNumberChildren() < 3)
            risk += CHILD;

        return risk >= .60;
    }
}
