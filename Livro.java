package projetos.aula09;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    // Construtor

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }


    // Métodos

    public String detalhes() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + "\n, totalPaginas=" + totalPaginas + ", paginaAtual="+ paginaAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() +", sexo=" + leitor.getSexo() + "]";
    }


    // Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Interfaces

    @Override
    public void abrir() {
        this.setAberto(true);
    }
    
    @Override
    public void fechar() {
        this.setAberto(false); 
    }

    @Override
    public void avancarPagina() {
        this.setPaginaAtual(paginaAtual + 1);      
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(paginaAtual - 1);
        
    }

    @Override
    public void folhear(int p) {
        if(p > getTotalPaginas()){
            setPaginaAtual(0);
        }else{
            this.setPaginaAtual(p);
        }
    }

}
