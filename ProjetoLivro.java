package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa[]p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Marlon", 19, "M");
        p[1] = new Pessoa("suzielem", 18, "F");
        
        l[0] = new Livro("Aprendendo Java", "Francisco Paulo", 300, p[0]);
        l[1] = new Livro("Aprendendo C++", "Henry Araújo", 325, p[1]);
        l[0] = new Livro("Aprendendo Java avançado", "Francisco Paulo", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avacarPag();
         System.out.println(l[0].detalhes());
         
          System.out.println(l[1].detalhes());
         
     }
}
