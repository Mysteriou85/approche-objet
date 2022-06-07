package Operation;

public class TestOperation {

    public static void main(String[] args) {
        Operation operationTab[] = new Operation[8];
        operationTab[0] = new Credit("26/05/2010", 101);
        operationTab[1] = new Credit("27/05/2010", 25);
        operationTab[2] = new Credit("12/06/2010", 10);
        operationTab[3] = new Credit("05/07/2010", 5);
        operationTab[4] = new Debit("15/10/2010", 100);
        operationTab[5] = new Debit("02/12/2010", 50);
        operationTab[6] = new Debit("27/05/2012", 25);
        operationTab[7] = new Debit("27/05/2013", 25);

        int totalOperation = 0;

        for (Operation operation : operationTab) {
            System.out.println(operation.getType() + " (" + operation.getDateOperation() + ") : " +  operation.getMontantOperation());
            if (operation.getType() == "CREDIT") {
                totalOperation += operation.getMontantOperation();
            } else if (operation.getType() == "DEBIT") {
                totalOperation -= operation.getMontantOperation();
            }
        }

        System.out.println("total des opérations : " + totalOperation);

    }

}
