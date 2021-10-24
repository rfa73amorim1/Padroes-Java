package one.digitallinnovation.gof.singleton;
//Singleton "preguiçoso"...
// ...A própria classe controla a sua instância.

public class SingletonLazy {
    private static SingletonLazy instancia;

    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia()
    {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
