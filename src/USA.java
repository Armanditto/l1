public class USA extends car {
    public USA (String Marka, String Model){
        super(Marka,Model);
    }
    @Override
    public void info() {
        System.out.println(toString() + "  авто из США");
    }
}