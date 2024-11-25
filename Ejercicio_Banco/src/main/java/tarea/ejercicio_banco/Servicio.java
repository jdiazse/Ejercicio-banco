package tarea.ejercicio_banco;

//Author: Jhon Díaz
//Abstract: Ejercicio banco

import java.util.HashMap;//Se importa Hash y Map para guardar datos en llaves para los datos del banco
import java.util.Map;

public class Servicio {//Se crea la clase servicio para el manejo de las cuentas
    private Map<String, Cuenta> cuentas = new HashMap<>();// Guarda las cuentas con su numero como la llave

    public void crearCuenta(String noCuenta, double saldoInicial) {// Crear una nueva cuenta
        if (cuentas.containsKey(noCuenta)) {
            System.out.println("Esta cuenta ya existe.");//En el case que se repita el mismo numero
            return;
        }

        if (saldoInicial < 0) {
            System.out.println("Solo numeros positivos porfavor.");//Para prevenir errores con negativos
            return;
        }

        cuentas.put(noCuenta, new Cuenta(noCuenta, saldoInicial));
        System.out.println("Cuenta creada con exito!");
    }

    public void deposito(String noCuenta, double cantidad) {// Depositar dinero
        Cuenta cuenta = cuentas.get(noCuenta);

        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");//En caso de que la cuenta no exista
            return;
        }

        if (cantidad <= 0) {
            System.out.println("Solo numeros positivos porfavor.");//Para prevenir errores con negativos
            return;
        }

        cuenta.depositar(cantidad);
        System.out.println("Deposito exitoso! Saldo actual: $" + cuenta.getSaldo());
    }

    public void retiro(String noCuenta, double cantidad) {// Retirar dinero}
        Cuenta cuenta = cuentas.get(noCuenta);

        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");//En caso de que la cuenta no exista
            return;
        }

        if (cuenta.retirar(cantidad)) {
            System.out.println("Retiro exitoso! Saldo actual: $" + cuenta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferencia(String enviaNoCuenta, String recibeNoCuenta, double cantidad) {// Transferir dinero
        Cuenta cuentaEmisor = cuentas.get(enviaNoCuenta);
        Cuenta cuentaReceptor = cuentas.get(recibeNoCuenta);

        if (cuentaEmisor == null) {
            System.out.println("La cuenta del remitente no fue encontrada.");//En caso de que la cuenta no exista
            return;
        }

        if (cuentaReceptor == null) {
            System.out.println("La cuenta del destinatario no fue encontrada.");//En caso de que la cuenta no exista
            return;
        }

        if (cantidad <= 0 || !cuentaEmisor.retirar(cantidad)) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        cuentaReceptor.depositar(cantidad);
        System.out.println("Transferencia exitosa!");
        System.out.println("Nuevo saldo del remitente: $" + cuentaEmisor.getSaldo());
        System.out.println("Nuevo saldo del destinatario: $" + cuentaReceptor.getSaldo());
    }

    public void revisarSaldo(String noCuenta) {// Revisar saldo
        Cuenta cuenta = cuentas.get(noCuenta);

        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");//En caso que la cuenta no exista
            return;
        }

        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}

