public class Estudiante extends Persona {

    public Estudiante(String name, String ocupation, int age) {
        super(name, ocupation, age);
    }

    public void hacerLoSuyo() {
        String loSuyo = "Viendo animé uwu Shinzou wo Sasageyo!!!";
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

}
