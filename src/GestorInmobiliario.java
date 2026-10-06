public class GestorInmobiliario {
   RegistroPropiedad registro;

   public GestorInmobiliario(RegistroPropiedad registro) {
       this.registro = registro;
   }

   public void solicitarTransferencia(Propiedad propiedad, Propietario nuevoTitular ) {
       System.out.println("El gestor solicita la transferencia...");
       registro.transferirInmueble(propiedad, nuevoTitular);
   }
}
