import javax.swing.JOptionPane;

public class MediaComWhile{

    public static void main(String[] args) {
        //declaracão de variáveis
        // inteiros-> byte, short, int, long
        short numeroAlunos, contador = 1;
        float nota1, nota2, media;

        numeroAlunos = lerShort("Quantos alunos deseja verificar?");

        while(contador <= numeroAlunos) {

            nota1 = lerFloat("Insira a nota 1 do aluno " + contador);
            nota2 = lerFloat("Insira a nota 2 do aluno " + contador);

            media = (nota1 + nota2) / 2;

            contador++;

        //saida com tres opções

        if (media >= 6.0){
            JOptionPane.showMessageDialog(null, "aprovado com " + media);

        } else if(media >= 4.0){
            JOptionPane.showMessageDialog(null, "voce tem media " + media + ", melhor fazer uma atividade extra");


        } else {
            JOptionPane.showMessageDialog(null, "nos vemos ano que vem de novo rss", "Resultado", JOptionPane.ERROR_MESSAGE);
        }

        }



    }

    static float lerFloat(String a) {
       return Float.parseFloat(
            JOptionPane.showInputDialog(a)
        );
    }

    static short lerShort(String a) {
       return Short.parseShort(
            JOptionPane.showInputDialog(a)
        );
    }

}