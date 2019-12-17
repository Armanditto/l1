public class France extends car {
    public France (String Marka, String Model){
        super(Marka,Model);
    }
    @Override
    public void info() {
        System.out.println(toString() + "  авто из Франции");
    }
}