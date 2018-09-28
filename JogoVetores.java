pimport java.util.Scanner;

public class JogoVetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] vetor = new String[100];// Se tiver mais que 100, aumenta esse n�mero.
		// N�o mexe em nada aqui em cima /\
		// VOC� MEXE A PARTIR DAQUI:
		vetor[0] = "ino. O pagamento foi feito adiantado, um bom valor.  A caixa lacrada, o contratante misterioso  e a instru��o de levar a encomenda direto para o destino.  Sua curiosidade sobre o conte�do cresce a cada minuto. � hora de partir. Ser� que vale a pena dar uma  olhadinha dentro da caixa? ### 1 ### Abrir a caixa ### 4 ### Pegar a caixa e ir para a entrega.";
		vetor[1] = "Voc� abre a caixa. O conte�do n�o parece nada surpreendente: alguns documentos e um pequeno dispositivo eletr�nico que voc� n�o conhece. Voc� olha rapidamente para os pap�is e percebe que se tratam de documentos cont�beis. Voc� come�a a reconhecer alguns nomes de pol�ticos  importantes. De repente, voc� ouve um barulho vindo da porta  de seu apartamento. Est�o for�ando a porta de maneira bastante  violenta. A porta vai arrebentar em alguns instantes. ### 2 ### Guardar os documentos e fingir que n�o sabe o que est� acontecendo. ### 3 ### Tentar se esconder no seu arm�rio.";
		vetor[2] = "PERDEU-Voc� guarda os pap�is na caixa.  Os invasores arrombaram sua porta.  Eles est�o armados. N�o falam uma palavra.  Voc� s� ouve os tiros em sua dire��o.   Voc� morreu por sua curiosidade.";
		vetor[3] = "PERDEU-Voc� se esconde dentro do arm�rio.  Os invasores arrombaram sua porta.  Eles est�o a sua procura. � quest�o de tempo, eles v�o te achar.  As portas do arm�rio se abrem.  Voc� v� um homem de terno com uma arma na m�o.  Voc� ouve os tiros em sua dire��o.   Voc� morreu por sua curiosidade.";
		vetor[4] = "Voc� pega a chave de sua moto e segue para  o pr�dio de destino no centro da cidade. O  tr�nsito est� tranquilo, s� voc� est� na rua.  Voc� segue ouvindo sua m�sica nos fones  de ouvido. Mais a frente, voc� v� dois carros  que acabaram de colidir, uma mulher ensanguentada  acena desesperadamente pedindo ajuda.  A decis�o � sua: ### 5 ### Acelerar e seguir adiante. ### 9 ### Parar e ajudar.";
		vetor[5] = "Voc� se sente um monstro por n�o parar e ajudar.  Mas a encomenda � muito importante e o contrante  frisou que voc� deveria ir direto ao destino.  Voc� se conforta pensando que outra pessoa passar� em breve  e ajudar� a pobre senhora. Voc� segue direto ao destino.  Um antigo pr�dio no centro da cidade, com  centenas de salas, lojas e escrit�rios,  nada muito conhecido ou movimentado.  Voc� estaciona sua moto, pega a encomenda e  sobe at� o 5� andar, sala 503. Antes  de bater a porta, por�m, voc� ouve  l� de dentro alguns barulhos. Ao apurar  sua audi��o, voc� percebe que algu�m est�  sendo torturado l� dentro.  Voc� deve pensar r�pido, o que fazer? ### 6 ### Bater a porta.  ### 7 ### Ligar para a pol�cia. ### 8 ### Fugir sem entregar a encomenda.";
		vetor[6] = "VENCEU-Voc� bate na porta... O que estar� do outro lado? A resposta voc� encontrar� na continua��o desse jogo. At� mais...";
		vetor[7] = "VENCEU-Voc� liga para a pol�cia... Ser� que eles podem te ajudar? A resposta voc� encontrar� na continua��o desse jogo. At� mais...";
		vetor[8] = "VENCEU-Voc� sai correndo com a encomenda... Ser� que voc� vai conseguir se livrar disso? A resposta voc� encontrar� na continua��o desse jogo. At� mais...";
		vetor[9] = "PERDEU-Voc� desacelera e estaciona a moto para ajudar  a senhora. Ela diz que o outro motorista est� desacordado.  Ao chegar perto para analisar voc� percebe dois  homens armados dentro do carro. Voc� � rendido,  eles pegam a encomenda em sua moto e abrem a caixa.  Voc� ouve uma discuss�o sobre a necessidade de te matar ou  lhe deixar vivo. Antes de chegarem a uma decis�o,  dois carros aparecem em alta velocidade pela via e  param perto de voc�s. S�o v�rios homens armados!  Um intenso tiroteio come�a. Voc� � atingido e morre.  Bem que o contratante avisou para ir direto ao destino.";
		
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
