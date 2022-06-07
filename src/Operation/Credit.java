package Operation;

public class Credit extends Operation {

    public Credit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }

}
