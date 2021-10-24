package one.digitallinnovation.gof;

import one.digitallinnovation.gof.facade.Facade;
import one.digitallinnovation.gof.singleton.SingletonEager;
import one.digitallinnovation.gof.singleton.SingletonHolder;
import one.digitallinnovation.gof.singleton.SingletonLazy;
import one.digitallinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitallinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitallinnovation.gof.strategy.ComportamentoNormal;
import one.digitallinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design Patter Singleton:
        SingletonLazy Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonHolder lazyHolder = SingletonHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder= SingletonHolder.getInstancia();
        System.out.println(lazyHolder);

        //Testes relacionados ao Strategy:

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();


        //Teste Facade:
        Facade facade = new Facade();
        facade.migrarCliente("Rogerio", "18040-000");




    }
}
