public class inventario {
    private String nombre;
    private boolean disponible;
    private int precio;

    public inventario() {
    }

    
    public inventario(String nombre, boolean disponible, int precio) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.precio = precio;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (disponible ? 1231 : 1237);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        inventario other = (inventario) obj;
        if (disponible != other.disponible)
            return false;
        return true;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
