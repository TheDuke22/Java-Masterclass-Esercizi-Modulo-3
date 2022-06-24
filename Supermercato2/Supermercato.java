package Supermercato2;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Supermercato{
    private Queue<Cliente> coda;
    private int counter;



    public Supermercato() {

        coda = new PriorityQueue<>();
        counter = 0;
    }
    public void addCliente (Cliente c){
        coda.offer(c);
    }
    public void removeCliente (){
        coda.remove();
    }
    public Cliente nextCliente(){
        return coda.peek();
    }
    public int numClienti (){
        return coda.size();
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente("mario", "mari", 11, 123);
        Cliente c2 = new Cliente("mario3", "mari", 16, 113);
        Cliente c3 = new Cliente("mario2", "mari", 21, 163);
        Supermercato s = new Supermercato();

        s.addCliente(c1);
        s.addCliente(c2);
        s.addCliente(c3);
        System.out.println(s.numClienti());
        System.out.println(s.nextCliente().getNome());
        s.removeCliente();
        System.out.println(s.nextCliente().getNome());
        s.removeCliente();
        System.out.println(s.nextCliente().getNome());





    }


}
