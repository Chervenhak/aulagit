package exemplos.exemplospoo.exemplo02;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        System.out.println(livro1.exibirDados() );

        livro1.titulo = "Progração em Java";
        livro1.autor = "Deitel";
        livro1.numPaginas = 437;

        livro2.titulo = "Engenharia de Software";
        livro2.autor = "Tanembaum";
        livro2.numPaginas = 300;

        System.out.println( livro1.exibirDados() );
        System.out.println( livro2.exibirDados() );

    }
    
}
