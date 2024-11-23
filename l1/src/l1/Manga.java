package l1;


public class Manga extends Main1{

    private String status;

    public Manga(String nam, String aut, String status) {
        super(nam, aut);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void l() {
        System.out.println("Манга: " + print());
    }
}
