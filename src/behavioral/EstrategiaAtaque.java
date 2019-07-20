package behavioral;

public class EstrategiaAtaque implements Estrategia {

    @Override
    public void jugar(String equipo) {
        System.out.println(equipo + " ahora esta atacando!");
    }

}
