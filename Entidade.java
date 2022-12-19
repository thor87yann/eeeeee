public abstract class Entidade{
    private String nome;
    private int codigo;

    public Entidade(String nome, int codigo){
    	this.nome = nome;
    	this.codigo = codigo;
    }
    public Entidade(String base){
        String[] array = base.split(";");
        this.nome = array[0];
        this.codigo = Integer.parseInt(array[1]);
    }

    public abstract String toCsv();

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNome(String novo){
        nome = novo;
    }

    public void setCodigo(int novo){
        codigo = novo;
    }
}
