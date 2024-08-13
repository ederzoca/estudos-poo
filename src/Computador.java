public class Computador { // Encapsulamento

    public static void main(String[] args) {
        SistemaMensagemInstantanea smi = null; // Polimorfismo

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSN();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}

// linha 6 -> escolher o app