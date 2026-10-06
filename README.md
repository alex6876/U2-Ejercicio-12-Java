# 🏢 Simulación de Registro y Transferencia de Inmuebles (POO en Java)

Este proyecto es una aplicación en Java que modela la gestión de transferencias de dominio inmobiliario. Simula la validación legal del estado de una propiedad (libre de deudas/embargos vs. embargada) antes de autorizar el cambio de titularidad en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema se divide en 5 clases principales:

*   **`Propietario`**: Modela a la persona titular de un inmueble.
    *   **Atributos:** `dni` y `nombreCompleto`.
    *   **Métodos:** Métodos consultores (*getters*) para leer los datos del titular.
*   **`Propiedad`**: Representa el inmueble objeto de la transacción.
    *   **Atributos:** `direccion`, `tasacion`, `estadoLegal` ("LIBRE", "EMBARGADA") y la referencia al `Propietario` actual.
    *   **Métodos:** Métodos de acceso y modificación (*getters* y *setters*) para permitir la mutación de titularidad.
*   **`RegistroPropiedad`**: Entidad encargada de validar las reglas de negocio legales.
    *   **Métodos:** `transferirInmueble(Propiedad p, Propietario nuevoTitular)`, evalúa el `estadoLegal` de la propiedad. Si está "LIBRE", reasigna el titular mediante `setPropietario()`; si está "EMBARGADA", deniega la operación.
*   **`GestorInmobiliario`**: Actúa como intermediario entre el cliente y el registro público.
    *   **Métodos:** `solicitarTransferencia()`, canaliza la petición enviando la propiedad y el nuevo titular al `RegistroPropiedad`.
*   **`Main`**: Instancia los titulares, simula una propiedad libre y una embargada, y ejecuta las solicitudes de transferencia.

---

## ⚙️ Reglas de Negocio y Flujo de Operación

1. **Intermediación:** El `GestorInmobiliario` delega la validación legal a la clase `RegistroPropiedad`.
2. **Evaluación de Estado Legal:** Se consulta el atributo `estadoLegal` mediante `.getEstadoLegal().equals("EMBARGADA")`.
3. **Mutación de Estado:**
   * **Propiedad LIBRE:** Se ejecuta `p.setPropietario(nuevoTitular)`, cambiando la referencia al nuevo objeto `Propietario`.
   * **Propiedad EMBARGADA:** Se bloquea la mutación y se notifica el rechazo por pantalla.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida:

```text
CASO 1: TRANSFERENCIA EXITOSA
El gestor solicita la transferencia...
Transferencia realizada correctamente.
Nuevo titular: Juan Perez

CASO 2: TRANSFERENCIA BLOQUEADA
El gestor solicita la transferencia...
Transferencia rechazada.
La propiedad tiene un embargo.
