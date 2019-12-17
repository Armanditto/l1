public class Japan extends car {
      public Japan (String Marka, String Model)       {
    super(Marka,Model);
     }
    @Override
    public void info() {
        System.out.println(toString() + "  авто из Франции");
    }
}