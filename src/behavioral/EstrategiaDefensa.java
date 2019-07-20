package behavioral;

public class EstrategiaDefensa implements Estrategia {

    @Override
    public void jugar(String equipo) {
        System.out.println(equipo  + " ahora esta defendiendo!");
    }

}
