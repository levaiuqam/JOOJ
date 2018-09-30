import java.util.Scanner;

public class mouse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] vetor = new String[100];// Se tiver mais que 100, aumenta esse n�mero.
		// N�o mexe em nada aqui em cima /\
		// VOC� MEXE A PARTIR DAQUI:
                /*the vector 1 have: 4,5,6,7
                the vector 2 have: 8,9,10,11
                the vector 3 have: 12,13,14,15,16,17
                */
            vetor[0] = "Você acorda no sofá, em uma casa que não conhece,não se lembra nem ao menos o seu nome.\n A única coisa familiar é a voz de sua mãe que ecoa pelo local.\n(mãe:)Eu te disse que a corda era a melhor opção!\nO ambiente é pesado e sufocante. Sua cabeça está doendo, um de seus braços ardem então você percebe que\nseu punho está mutilado. Você precisa sair daqui.\nVocê se levanta e observa o ambiente, e percebe que em cima de uma mesa da sala,\ntem uma garafa uma lista.\nO que você faz?###1###pegar a garrafa;###2###pegar a lista;###3###conferir a porta de saída.";
            vetor[1] = "É uma garrafa de veneno vazia. Seria melhor olhar a lista; ###4### pegar a lista, ###7### soltar a garrafa";
            vetor[2] = "É uma lista de mercado, com alguns venenos listados. ###8### pegar a garrafa, ###9### soltar a lista";
            vetor[3] = "A porta está trancada. ###12### voltar para a mesa ";
            vetor[4] = "É uma lista de mercado, conteúdo irrelevante, exeto pelo veneno listado\nque consta com o da garrafa em cima da mesa\n No vértice da lista, tem algumas instruções.\n seguindo as mesmas, você se depara com uma chave de baixo de algumas revistas velhas em cima da mesa\nO que você escolhe? ###5### pegar a chave, ###6### nao pegar a chave ";
            vetor[5] = "VENCEU-você, pega a chave e em seguida corre para a porta. felizmente ela abre perfeitamente.\n ao sair pela porta você estranhamente desmaia.Você acorda no sofá, em uma casa que não conhece. não lembra nem ao menos o seu nome...SAIA, SE VOCÊ ACREDITA QUE PODE SAIR DAQUI.";
            vetor[6] = "PERDEU-bem, não tem muito o que se fazer...";
            vetor[7] = "PERDEU-você desastradamente deixa a garrafa cair ao chão,\no barulho, chama muita atenção. Algum ser que parece ser,\numa mulher?. Vem em sua direção rapidamente girtando por um nome estranho e desconhecido por você.\n Quando está bem perto de você, puxa uma faca da calça; ela não parece ter boas intenções...";
            vetor[8] = "PERDEU-Sua saúde mental não é das melhores, você quebra a garrafa na quina da mesa e em seguida,\natola a garrafa quebrada em seu pescoço, em meio a sangue e muita dor você cai no chão.\nAcho que ele estava ouvindo aquela maldita voz familiar outra vez...";
            vetor[9] = "você solta a lista, ela cai no chão. Algo brilhante te chama a atenção,\nvocê se abaixa para ver o que seria aquela coisa brilhante\nde baixo da mesa... Na verdade não tinha nada, este lugar deve estar mexendo com você.\nAo fazer o mínimo de força para levantar, o chão que já estava rangendo\n quebrou, e sua perna entra na madeira. Como uma alfinetada, só que bem mais forte,\nvocê vê que sua perna foi perfurada por um grande pedaço de madeira.\n Está sangrando muito... Oque você faz? ###10### levantar-se do chao, ###11### deitar e chorar";
            vetor[10] = "PERDEU-Ao levantar-se você começa a urrar de dor, o pedaço de madeira que se situa entre o chão e um pedaço da sua perna,\nvocê sente rasgando e dilacerando o seu músculo. Seus gritos chamaram a atenção de três pessoas estranhas,\ncochichando eles decidem algo...um deles puxa uma faca da calça.";
            vetor[11] = "PERDEU-desta maneira voce certamente morrera,  nao tenho muito o que fazer";
            vetor[12] = "É a mesma maldita garrafa, vazia e sem graça.\n###13###escolha pegar a lista.";
            vetor[13] = "É uma outra lista de mercado, que está no chão.\nEsta lista também tem conteúdo irrelevante, no verso desta lista tem algumas instruções,\nseguindo-as você termina se deparando com uma escrivaninha, que tem uma gaveta.\n###14### abrir a gaveta?\n###15###não abrir a gaveta?";
            vetor[14] = "Você decide abrir a gaveta e dentro da mesma tem uma chave e uma...pistola?!;\nVocê nem fica com esperaça pois a chave é muito diferente da fechadura da porta.\nA pistola ainda está aí, uma dor intensa no seu fígado te faz cambalear para trás,\ncom isso pisando no controle remoto da televisão, assim ligando-a.\nVocê viu o noticiário e percebeu que estavam à procura de um assasino que sequestrava e matava pessoas em sua casa.\nAo seu lado tinha um espelho e o pior acontece, você é o SERIAL KILLER que está sendo procurado á qualquer custo,\n você entra em desespero e pode fazer uma decisão:\n###16### pegar a pistola.\n###17### sentar-se no chão e esperar.";
            vetor[15] = "PERDEU-voce e muito engraçado hein?";
            vetor[16] = "PERDEU-você rapidamente, e com o incentivo daquela maldita voz na sua cabeça,\nvocê bota a pistola apontada para o céu de sua boca, e por fim...";
            vetor[17] = "PERDEU-policiais arrombam a porta e, você tenta atirar contra eles. Mas você é fraco e eles te mataram.\n Você pelo menos teve a intenção, isso é o importante...";
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
