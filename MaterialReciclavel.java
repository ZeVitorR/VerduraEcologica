public class MaterialReciclavel {
    private String nome;
    private int codigo;
    private double precoporkilo;
    
    public void materialReciclavel(String nome, int codigo, double precoporkilo) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoporkilo = precoporkilo;
    }

    public String getNome() {
        return nome;
    }
    public double getPrecoporkilo() {
        return precoporkilo;
    }
    public void setPrecoporkilo(double precoporkilo) {
        this.precoporkilo = precoporkilo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
