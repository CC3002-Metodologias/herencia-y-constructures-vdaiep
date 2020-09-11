public class Main {

    public static void main(String[] args) {

        Estudiante compa1 = new Estudiante("Compa1", "DCC", 21);
        compa1.comer();
        compa1.hacerLoSuyo();
        compa1.dormir();

        Academico profe1 = new Academico("Profe1", "DCC", 55, "Vacunas y autismo RELOADED.");
        profe1.comer();
        profe1.hacerLoSuyo();
        profe1.dormir();
        profe1.publicarPaper();

    }
}
