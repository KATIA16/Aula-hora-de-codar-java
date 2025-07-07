package POO;

public class ProgramaPrincipal {
    

    public static void main(String[] args) {
        

        // criar uma pessoa ---> instanciar (new)
        // tipo (classe) var ---> new classe ()

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome( "Katïa");
        pessoa1.setIdade(37);
        pessoa1.setPeso( 55);
        pessoa1.setAltura( 1.50);


        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade() + " " + pessoa1.getPeso() + " " + pessoa1.getAltura());
    }
}
