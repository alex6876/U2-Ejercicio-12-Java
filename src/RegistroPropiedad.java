public class RegistroPropiedad {
    Propietario propietario;

    public void transferirInmueble(Propiedad p, Propietario nuevoTitular) {
        if(p.getEstadoLegal().equals("EMBARGADA")){
            System.out.println("Transferencia rechazada.");
            System.out.println("La propiedad tiene un embargo.");
        }else{
            p.setPropietario(nuevoTitular);

            System.out.println("Transferencia realizada correctamente.");
            System.out.println("Nuevo titular: "+ nuevoTitular.getNombreCompleto());
        }
    }
}
