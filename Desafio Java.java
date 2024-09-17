// Interfaces
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

public interface AparelhoTelefonico {
    void ligar();
    void atender();
}

public interface NavegadorInternet {
    void abrirPagina();
    void adicionarAba();
    void atualizarPagina();
}

// Classes
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
}

public class Usuario {
    // Métodos para interagir com o iPhone
    public void usariPhone(iPhone iphone) {
        // Exemplo:
        iphone.tocar();
        iphone.abrirPagina();
    }
}

public class Apple {
    // A função exata dessa classe ainda não está clara
    // Pode ser usada para representar informações sobre a empresa,
    // como modelos de iPhone, histórico, etc.
}
     