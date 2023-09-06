

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioDeVoz();
}

// Interface para o Navegador na Internet
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe que representa o iPhone, implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean ligado;
    private boolean reproduzindo;
    private String musicaAtual;
    private String numeroChamada;
    private String paginaAtual;

    public iPhone() {
        this.ligado = false;
        this.reproduzindo = false;
        this.musicaAtual = "";
        this.numeroChamada = "";
        this.paginaAtual = "";
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        if (ligado) {
            reproduzindo = true;
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para reproduzir música.");
        }
    }

    @Override
    public void pausar() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música está sendo reproduzida.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (ligado) {
            musicaAtual = musica;
            System.out.println("Música selecionada: " + musicaAtual);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para selecionar música.");
        }
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (!ligado) {
            System.out.println("Ligando para " + numero);
            numeroChamada = numero;
        } else {
            System.out.println("O iPhone já está em uma chamada. Encerre a chamada atual para ligar para outro número.");
        }
    }

    @Override
    public void atender() {
        if (!ligado) {
            System.out.println("Atendendo chamada de " + numeroChamada);
        } else {
            System.out.println("O iPhone já está em uma chamada. Não é possível atender outra chamada.");
        }
    }

    @Override
    public void iniciarCorreioDeVoz() {
        if (!ligado) {
            System.out.println("Iniciando correio de voz...");
        } else {
            System.out.println("O iPhone está em uma chamada. Termine a chamada para iniciar o correio de voz.");
        }
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        if (ligado) {
            paginaAtual = url;
            System.out.println("Exibindo página: " + paginaAtual);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para navegar na Internet.");
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        if (ligado) {
            System.out.println("Abrindo nova aba com página: " + url);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para abrir uma nova aba.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("O iPhone está desligado. Ligue-o para atualizar a página.");
        }
    }

    public void ligarDesligar() {
        ligado = !ligado;
        if (ligado) {
            System.out.println("O iPhone está ligado.");
        } else {
            System.out.println("O iPhone está desligado.");
        }
    }
}
    
