package MP.MaxPartecipants;

public class ReceivingAndNum {
    private String receivingOrganization;
    private int num;

    public ReceivingAndNum (String receivingOrganization, int num) {
        this.receivingOrganization = receivingOrganization;
        this.num = num;
    }

    public String getReceivingOrganization() {
        return receivingOrganization;
    }

    public void setReceivingOrganization(String receivingOrganization) {
        this.receivingOrganization = receivingOrganization;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
