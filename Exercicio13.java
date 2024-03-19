public class Exercicio13 {
    public static void executar(){

        System.out.println("Exercicio13");

        //13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e 
        //informese está apta ou não para cumprir o serviço militar obrigatório.
        // Informe os totais

        Servico13 servicoMilitar = new Servico13();
        servicoMilitar.verificarAptidao();

        System.out.println(servicoMilitar);
    }
}
