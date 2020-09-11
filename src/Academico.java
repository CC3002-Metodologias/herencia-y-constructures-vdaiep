public class Academico extends Persona {
    private final String paper;

    public Academico(String name, String ocupation, int age, String paper) {
        super(name, ocupation, age);
        this.paper = paper;
    }

    public void hacerLoSuyo() {
        String loSuyo = "Aprendiendo a usar Zoom.";
        super.hacerLoSuyo(loSuyo);
    }

    public void dormir() {
        int horasDeTuto = 7;
        super.dormir(horasDeTuto);
    }

    public void comer() {
        String comida = "bajon casero.";
        super.comer(comida);
    }

    public void publicarPaper(){
        System.out.println(this.paper);
    }

}
