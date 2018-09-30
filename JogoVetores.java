pimport java.util.Scanner;

public class JogoVetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] vetor = new String[100];// Se tiver mais que 100, aumenta esse n�mero.
		// N�o mexe em nada aqui em cima /\
		// VOC� MEXE A PARTIR DAQUI:
		vetor[0] = "Você acorda no sofá, em uma casa que não conhece,não se lembra nem ao menos o seu nome. A única coisa familiar é a voz de sua mãe que ecoa pelo local. Mãe: Eu te disse que a corda era a melhor opção.O ambiente é pesado e sufocante. Sua cabeça está doendo, um de seus braços ardem então você percebe que seu punho está mutilado. Você precisa sair daqui. Você se levanta e observa o ambiente, e percebe que em cima da mesa da sala,tem uma garafa e uma lista. O que você faz? ### 1 ### 1-Pegar a garrafa; ### 2 ### 2-Pegar a lista.";
		vetor[1] = "É uma garrafa de veneno vazia. ### 2 ### 1- Pegar a lista.";
		vetor[2] = "É uma lista de mercado conteúdo irrevelente, porém, o nome do veneno que está na mesa está escrito no papel. Obsevando ainda você encontra uma chave.### 3 ### 1-Pegar a chave e tentar sair pela porta da frente. ### 4 ### 2-Seguir em frente. ";
		vetor[3] = "PERDEU-Voc� Você tenta encaixar a chave na porta, porém não consegue então se irrita e começa a bater na porta.Não deveria ter feito isso! Você só consegue sentir a faca entrando na altura do seus rins, e lentamente tudo fica escuro.";
		vetor[4] = "Você explora mais um pouco o cômodo, e acaba notando a presenta de um criado-mudo. ### 6 ### 1-Abrir as gavetas. ### 5 ### 2-Seguir em frente. " ;
		vetor[5] = "Você segue em frente, começa a explorar e em seguida encontra uma cozinha. Explora o cômodo e nota a presença de uma porta então decide abri-lá.É um porão. Está tudo escuro. Então... você teria que ter aberto aquele criado-mudo...tinha uma arma lá. ### 7 ### 1-Descer e explorar. ### 7 ### 2-Descer sem vontade, porque sabe que vai morrer. ";
		vetor[6] = "Você abre a primeira gaveta e nada. Você abre a segunda, papéis e apéis, e algo brilhante embaixo deles. Você estende as mão e pega o objeto. É uma arma. ### 10 ### Levar a arma e explorar. ### 5 ### Deixar a arma. ";
		vetor[7] = "PERDEU-Voc� Antes de descer você encontrar uma dijuntor. ### 8 ### 1-Acender a luz. ### 9 ### 2-Seguir em frente. Tanto faz.";
		vetor[8] = "Não se iluda , não tem luz. <3 ### 9 ### 1- Morrer ### 9 ### 2- Morrer também, porque você escolheu errado.";
		vetor[9] = "PERDEU-VOC� Com cuidado você começa a descer as escadas. Então você chega até o final da escada;O odor é púdrido, seus olhos após alguns segundos acostumam com a escuridão, então você observa o ambiente, são celaS? Sim. Em ambos os lados existe celas. Algo se movimenta na cela mais próxima a você. É uma pessoa, a cena é grotesca, a pessoa apresenta sinais de tortura. Você se aproxima. Mulher: Me tira daqui. Você: Como? Não tenho as chaves. Mulher: Ali! Você pega as chaves e abre a sela, a mulher não consegue ficar em pé então você a apoia. Você: Quem fez isso com você? A pergunta é seguida de uma dor aguda na altura do umbigo. Mulher: ISSO É PELO O QUE VOCÊ FEZ COM TODOS NÓS!!"       ";
		vetor[10] =  
		// S� MEXE AQUI EM CIMA /\
		// DAQUI PRA BAIXO VOC� N�O MEXE!
		
		int tentativas, tt;
		boolean naoacertou = true;

		System.out.println("Digite a quantidade de tentativas:");
		tentativas = teclado.nextInt();
		tt = tentativas;
		System.out.flush();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBem-vindo ao nosso jogo!");

		do{
			System.out.println("\n###################################\nN�mero de tentativas: "+tentativas+"\n###################################");
			int posicao = 0;
			boolean continua = true;
			
			do {
				
				String completa = vetor[posicao];
				if(completa.startsWith("PERDEU")) {
					System.out.println(completa.substring(7));
					System.out.println("---------------------------------------\n----          Voc� PERDEU!         ----\n---------------------------------------");
					continua = false;
				}else if(completa.startsWith("VENCEU")) {
					System.out.println(completa.substring(6));
					System.out.println("---------------------------------------\n----          Voc� GANHOU!         ----\n---------------------------------------");
					continua = false;
					naoacertou = false;
				}else {
					String[] tokens = completa.split("###");
					int opcoes[] = new int[(tokens.length/2) + 1];
					int n = 1;
					String historia = tokens[0];
					System.out.println(historia);
					System.out.println("Escolha uma op��o:");
					for (int i = 1; i < tokens.length; i=i+2) {
						String p = tokens[i];
						String opt = tokens[i+1];
						System.out.println(n+ " - "+ opt);
						opcoes[n] = Integer.parseInt(p.trim());
						n++;					
					}
					int escolha = teclado.nextInt();
					if(escolha>0 && escolha < opcoes.length) {
						posicao = opcoes[escolha];
					}else {
						System.out.println("\n\n --> Voc� escolheu uma op��o errada...\n\n");
					}
					

				}
			}while(continua);
			tentativas--;
		}while(naoacertou && tentativas > 0);
		if(naoacertou) {
			System.out.println("Suas tentativas acabaram!");
			System.out.println("###################################\nVoc� perdeu!\n###################################");
		}else {
			System.out.println("###################################\n\nVoc� ganhou em "+ (tt - tentativas)+" tentativas! Parab�ns!\n\n###################################");

		}
		//teclado.nextInt();
		teclado.close();

	}

}
