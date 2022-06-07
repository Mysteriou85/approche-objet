package Operation;

import fr.diginamic.banque.entites.Compte;

public abstract class Operation {
    String dateOperation;
    int montantOperation;

    Compte compte;

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
