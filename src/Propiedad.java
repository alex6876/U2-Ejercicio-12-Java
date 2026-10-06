public class Propiedad {
    String direccion;
    double tasacion;
    String estadoLegal;
    Propietario propietario;

    public Propiedad(String direccion, double tasacion, String estadoLegal, Propietario propietario) {
        this.direccion = direccion;
        this.tasacion = tasacion;
        this.estadoLegal = estadoLegal;
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTasacion() {
        return tasacion;
    }
    public void setTasacion(double tasacion) {
        this.tasacion = tasacion;
    }

    public String getEstadoLegal() {
        return estadoLegal;
    }
    public void setEstadoLegal(String estadoLegal) {
        this.estadoLegal = estadoLegal;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}
