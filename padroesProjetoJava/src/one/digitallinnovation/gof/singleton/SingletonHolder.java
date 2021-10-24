package one.digitallinnovation.gof.singleton;
//Singleton com encapsulamento (recomendado como thread safe)"...
// @see <a href = "https://stackoverflow.com/a/24018148"> Referêcnia para singleton Holder</a>

public class SingletonHolder {

    private static class InstanceHolder{
        public static SingletonHolder instancia = new SingletonHolder();
    }


    public SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
