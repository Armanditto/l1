public class car {
    private String Marka;
    private String Model;

    public car (String Marka, String Model){
        this.Marka = Marka;
        this.Model = Model;
    }
    @Override
    public String toString(){
        return "Марка: " + Marka + "  Номер: " + Model + ".";
    }

    public void info() {
    }
}
