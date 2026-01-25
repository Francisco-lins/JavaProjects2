package JFrame;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

class ContatoDAO
{
    public static List<Contato> contatos = new ArrayList<>();

    static void add(Contato contato)
    {
        contatos.add(contato);
    }

    Optional<Contato> buscarPorNome(String name) {
        return contatos.stream() 
                .filter(n -> n.getName().equals(name))
                .findFirst();
    }
}


class Contato
{
    String name;

    Contato(String name) {this.name = name;}

    String getName() {return this.name;}

}


public class OptionalAbout
{
    public static void main(String[] args)
    {
        ContatoDAO ContatoDAO = new ContatoDAO();

        Contato rodrigo = new Contato("Rodrigo");
        ContatoDAO.add(rodrigo);


        Optional<Contato> resposta = ContatoDAO.buscarPorNome("Rodrigo");

        resposta.ifPresent(it -> System.out.println(it.getName()));
    }
}
