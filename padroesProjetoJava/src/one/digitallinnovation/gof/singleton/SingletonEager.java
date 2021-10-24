package one.digitallinnovation.gof.singleton;

//Sigleton "apressado"...

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia()
    {
        return instancia;
    }

}
