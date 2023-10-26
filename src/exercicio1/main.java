package exercicio1;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de criação:");
        String nomeUsuario = JOptionPane.showInputDialog("Informe o nome de usuário:");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        int numPublicacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas publicações deseja criar?"));

        for (int i = 0; i < numPublicacoes; i++) {
            String dataPublicacao = JOptionPane.showInputDialog("Informe a data da publicação:");
            String textoPublicacao = JOptionPane.showInputDialog("Informe o texto da publicação:");
            String linkMidia = JOptionPane.showInputDialog("Informe o link da mídia:");
            Publicacao publi = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
            redeSocial.inserePublicacao(publi);
        }

        redeSocial.imprimePublicacoes();
    }
}
