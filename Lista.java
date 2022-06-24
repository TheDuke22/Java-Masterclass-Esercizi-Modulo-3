import java.util.ArrayList;
import java.util.List;

public interface Lista <T> {
List lista = null;
    public default Object get(int i){
        return lista.get(i);
    }
    public default boolean contains(Object o){
        return lista.contains(o);
    }
    public default int size (){
        return lista.size();
    }
    public default void add (Object o){
        lista.add(o);
    }
    public default void remove (Object o){
        lista.remove(o);
    }
    public default void clear (){
        lista.clear();
    }
}

