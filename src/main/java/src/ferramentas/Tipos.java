package src.ferramentas;

public enum Tipos {
    VENDEDOR("001"), CLIENTE("002"), VENDA("003"), NONE("");

    private final String id;
    Tipos(String label){
        this.id = label;
    }
    public String getTipo(){
        return this.id;
    }
}
