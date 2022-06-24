import com.sun.tools.javac.Main;

import java.util.Arrays;

public  class ListaDiInteri implements Iterabile{
   static Integer [] a = new Integer[]{1,5,8,3,2,8,88,24};
   int index = -1;

    @Override
    public Object objectNext() {
        index++;
        System.out.println(a[index]);

        return a[index];
    }

    @Override
    public boolean hasNext() {
        return index < a.length - 1;
    }


    @Override
    public void reset() {
        index= -1;
    }

    public static void main(String[] args) {
        ListaDiInteri a = new ListaDiInteri();
        a.objectNext();
        a.objectNext();
        a.objectNext();
        a.objectNext();
        a.objectNext();
        a.objectNext();
        System.out.println(a.hasNext());
        a.objectNext();
        a.objectNext();
        System.out.println(a.hasNext());
        a.reset();
        a.objectNext();
        System.out.println(a.hasNext());


    }

}