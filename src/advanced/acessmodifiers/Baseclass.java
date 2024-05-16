package advanced.acessmodifiers;

public class Baseclass {
    private int basevariable = 20;

    protected void basemethod() {
        System.out.println("baseclass");
    }

    public static class Derivedclass extends Baseclass {
        public int derivedvariable = 40;

        @Override
        public void basemethod() {
            System.out.println("override the basemethod");
        }
    }

    public static void main(String[] args) {
        Baseclass.Derivedclass d1 = new Baseclass.Derivedclass();
        d1.basemethod(); 
      
        System.out.println(d1.derivedvariable); // Output: 40
    }


	

}
