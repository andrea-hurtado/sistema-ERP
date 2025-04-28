package models;

public class Proveedor extends Persona {
    private int id;

    public Proveedor(int id, String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono); // Llamamos al constructor de Persona
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", " + super.toString() + // Llamamos al toString() de Persona
                '}';
    }
}
