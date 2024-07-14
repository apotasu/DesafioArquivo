package src.ferramentas;

public enum Tipos {
    VENDEDOR("001"), CLIENTE("002"), VENDA("003"), NONE("");

    private final String id;

    Tipos(String id) {
        this.id = id;
    }

    public String getTipo() {
        return this.id;
    }
    public static Tipos fromId(String id) {
        for (Tipos tipo : values()) {
            if (tipo.getTipo().equals(id)) {
                return tipo;
            }
        }
        return NONE;
    }
}
