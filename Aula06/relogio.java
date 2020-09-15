/**
 * relogio
 */
public class relogio {


    public static void main(String[] args) {
        {
            relogio r1;
            r1 = new relogio(14,15,10);
            r1.informar();
            r1.incrementa();
            r1.informar();
            for(int c = 0; c <20; ++c) r1.decrementar();
            r1.informar();
        }
    }
    
    private int hora, minuto, segundo;
    
    // Construção relógio
    public relogio(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }
    // Incrementar um segundo
    public void incrementa(){
        if(++segundo>59){
            segundo = 0;
            if(++minuto>59){
                minuto = 0;
                if(++hora>23)
                hora = 0;
            }
        }
    }

    // Decrementar segundo
    public void decrementar()
    {
        if(--segundo<0){
            segundo = 59;
            if(--minuto<0){
                minuto = 59;
                if(--hora<0)
                hora=23;
            }
        }
    }
    // Informar hora
    public void informar()
    {
        System.out.println("Hora Atual: " + hora + ":" + minuto + ":" + segundo);
    }
   
}