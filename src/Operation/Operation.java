package Operation;

public abstract class Operation {
    String dateOperation;
    int montantOperation;

    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

    public String getDateOperation() {
        return dateOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }
}
