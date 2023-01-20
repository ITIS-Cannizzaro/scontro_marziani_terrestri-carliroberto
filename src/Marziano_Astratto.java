
public abstract class Marziano_Astratto {
    protected String Matricola;
    protected int Autonomia;
    protected int AI;
    protected int Tecnologia;

    public Marziano_Astratto(String matricola, int autonomia, int ai, int tecnologia) {
        Matricola = "Indefinito";
        Autonomia = 50;
        this.AI = 5;
        Tecnologia = 5;
    }
}
