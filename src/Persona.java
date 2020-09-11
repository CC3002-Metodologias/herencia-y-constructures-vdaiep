public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String name, String ocupation, int age){
        this.nombre = name;
        this.ocupacion = ocupation;
        this.edad = age;
    }

    public void comer(String food) {
        System.out.println("Ñom Ñom, rico ".concat(food));
    }

    public void dormir(int horasDeTuto) {
        System.out.println("" + new String(new char[horasDeTuto]).replace("\0", "Z"));
    }

    public void hacerLoSuyo(String loSuyo) {
        System.out.println("Pasando la cuarentena.");
        System.out.println(loSuyo);
    }
}
