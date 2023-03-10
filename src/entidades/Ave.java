package entidades;

public class Ave extends Animal{
    private String tipoPena;
    private String nomeCientifico;

    public Ave(String nome, int idade, double peso, String tipoPena, String nomeCientifico) {
        super(nome, idade, peso);
        this.tipoPena = tipoPena;
        this.nomeCientifico = nomeCientifico;
    }

    public Ave() {
    }

    public String getTipoPena() {
        return tipoPena;
    }

    public void setTipoPena(String tipoPena) {
        this.tipoPena = tipoPena;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    @Override
    public String emitirSom(String nome) {
        return "som";
    }

    @Override
    public void seAlimentar(String nome) {

    }

    @Override
    public void seMovimentar(String nome) {

    }
}
