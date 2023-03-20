public class Pessoa {
    public String nome;
    public int idade;

    public void andar(){
        System.out.println("Estou caminhando");
    }
    public void falar(){
        System.out.println("bla, bla, bla");
    }
    public static void main(String []args){
        Pessoa usuario = new Pessoa();
        usuario.idade =10;
        usuario.nome = "Lucas";
        usuario.falar();
    }
}
