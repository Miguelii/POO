package Ficha4;

public class StackTeste {

    public static void main(String [] args) {

        Stack st = new Stack();

        System.out.println("Stack Vazia? " + st.empty());

        st.push("Ola");
        st.push("Miguelii");

        System.out.println("Stack Vazia? " + st.empty() + " Comprimento: " + st.length());

        System.out.println("Elemento no topo da Stack: " + st.top());

        st.pop();

        System.out.println("Elemento no topo da Stack: " + st.top());

    }
}
