package behavioral;

public abstract class Equipo {

    protected String nombreEquipo;
    private Estrategia estrategia;

    // Este es el metodo clave del patron que va a dinamicamente apuntar a
    // diferentes implementaciones dependiendo de clase concreta
    // de Estrategia que le hayas seteado al equipo
    public void iniciarJuego(){
        estrategia.jugar(nombreEquipo);
    }

    public void setEstrategia(Estrategia estrategia) { this.estrategia = estrategia; }
}
