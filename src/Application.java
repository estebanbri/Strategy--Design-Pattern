import behavioral.*;

public class Application {

    public static void main(String[] args) {
        // Equipos
        Equipo argentina = new EquipoArgentina();
        Equipo chile = new EquipoChile();

        /**
         *  Primer Tiempo
         */
        // Seteo de estrategia en runtime
        argentina.setEstrategia(new EstrategiaAtaque());
        chile.setEstrategia(new EstrategiaDefensa());
        // Inicio de juego
        argentina.iniciarJuego();  // -> estrategia.jugar(nombreEquipo) -> EstrategiaAtaque
        chile.iniciarJuego();      // -> estrategia.jugar(nombreEquipo) -> EstrategiaDefensa

        /**
         *  Segundo Tiempo
         */
        // Seteo de estrategia en runtime
        argentina.setEstrategia(new EstrategiaDefensa());
        chile.setEstrategia(new EstrategiaAtaque());
        // Inicio de juego
        argentina.iniciarJuego();  // -> estrategia.jugar(nombreEquipo) -> EstrategiaDefensa
        chile.iniciarJuego();      // -> estrategia.jugar(nombreEquipo) -> EstrategiaAtaque
    }
}
