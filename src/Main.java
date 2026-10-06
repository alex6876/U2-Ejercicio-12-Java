public class Main {
    public static void main(String[] args) {

        Propietario propietarioActual = new Propietario("12345678", "Carlos Gomez");
        Propietario nuevoTitular = new Propietario("87654321", "Juan Perez");

        Propiedad propiedadLibre = new Propiedad(
                "Av. San Martin 123",
                50000000,
                "LIBRE",
                propietarioActual
        );

        Propiedad propiedadEmbargada = new Propiedad(
                "Calle Mitre 456",
                35000000,
                "EMBARGADA",
                propietarioActual
        );

        RegistroPropiedad registro = new RegistroPropiedad();

        GestorInmobiliario gestor = new GestorInmobiliario(registro);

        System.out.println("CASO 1: TRANSFERENCIA EXITOSA");
        gestor.solicitarTransferencia(propiedadLibre, nuevoTitular);

        System.out.println();

        System.out.println("CASO 2: TRANSFERENCIA BLOQUEADA");
        gestor.solicitarTransferencia(propiedadEmbargada, nuevoTitular);
    }
}