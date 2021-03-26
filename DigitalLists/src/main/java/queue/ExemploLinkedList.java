package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAserAtendido = filaBanco.poll();
        System.out.println(clienteAserAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);
        //filaBanco.clear();

        String primeiroClienteouErro = filaBanco.element();

        System.out.println(primeiroClienteouErro);

        System.out.println(filaBanco);

        for (String cliente:filaBanco) {
            System.out.println(cliente);

        }





    }




}
