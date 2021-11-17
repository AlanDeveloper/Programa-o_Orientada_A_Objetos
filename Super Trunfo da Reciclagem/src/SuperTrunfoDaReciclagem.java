import java.util.*;

public class SuperTrunfoDaReciclagem {
    private Jogador[] jogadores;
    private final Scanner leitor = new Scanner(System.in);
    private Integer numJogadores = 0;
    private Integer turno = 0;
    private Integer vezDoJogador;
    private boolean simular;
    private Baralho baralho;

    public static void main(String[] args) {
        System.out.println("################################ Super Trunfo Da Reciclagem ################################");
        System.out.println("###                                                                                      ###");
        System.out.println("###                        Seja bem vindo e aproveite a jogatina!                        ###");
        System.out.println("############################################################################################");

        SuperTrunfoDaReciclagem superTrunfoDaReciclagem = new SuperTrunfoDaReciclagem();

        superTrunfoDaReciclagem.criarJogadores();
        superTrunfoDaReciclagem.lerBaralho();
        superTrunfoDaReciclagem.darCartas();
        superTrunfoDaReciclagem.simularJogo();
        superTrunfoDaReciclagem.iniciarJogo();
    }

    public void criarJogadores() {
        while (this.numJogadores < 2 || this.numJogadores > 4) {
            System.out.print("Selecione o número de jogadores(2-4): ");
            try {
                this.numJogadores = leitor.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Informe um número válido!");
            }
            leitor.nextLine();
        }
        this.jogadores = new Jogador[this.numJogadores];

        String nome;
        System.out.println("\nPara continuarmos informe o nome dos jogadores");
        for (int i = 0; i < this.numJogadores; i++) {
            System.out.print("Digite o nome do jogador " + (i + 1) + ": ");
            nome = leitor.next();
            this.jogadores[i] = new Jogador(nome);
        }
    }

    public void lerBaralho() {
        this.baralho = new Baralho();
        this.baralho.lerDoArquivo("src/Super Trunfo da Reciclagem.csv");
    }

    public void darCartas() {
        System.out.println("\nDistribuindo cartas...");
        Random gerador = new Random();
        int numCartas = 32 % this.numJogadores == 0 ? 32 : 30 , num;

        for (int i = 0; i < numCartas; i++) {
            num = gerador.nextInt(this.numJogadores);
            if (this.jogadores[num].numeroDeCartas() < numCartas/this.numJogadores) {
                this.jogadores[num].incluir(this.baralho.selecionaCarta());
            } else {
                i--;
            }
        }
    }

    public void simularJogo() {
        int simular = -1;
        while (simular < 1 || simular > 2) {
            System.out.print("\nDeseja simular um jogo?\n1-Sim\n2-Não\nEscolha uma opção: ");
            try {
                simular = leitor.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Informe um número válido!");
            }
            leitor.nextLine();
        }
        this.simular = simular == 1;
    }

    public void iniciarJogo() {
        System.out.println("\nInicio do Jogo!");
        boolean acabarJogo = false;
        Integer numCartas = this.jogadores[0].numeroDeCartas() * this.numJogadores, ganhadorIndex = null;
        this.vezDoJogador = new Random().nextInt(this.numJogadores);

        while (!acabarJogo) {
            this.iniciarTurno();

            for (int i = 0; i < this.numJogadores; i++) {
                if (Objects.equals(this.jogadores[i].numeroDeCartas(), numCartas)) {
                    acabarJogo = true;
                    ganhadorIndex = i;
                }
            }
        }
        System.out.println("\nGanhador: " + this.jogadores[ganhadorIndex].getNome() + " | Número de turnos: " + this.turno + "\nFim do Jogo!");
    }

    public void iniciarTurno() {
        System.out.println("\nCartas na mesa - Turno do jogador " + this.jogadores[this.vezDoJogador].getNome());

        ArrayList<Carta> cts = new ArrayList<>();
        for (int i = 0; i < this.numJogadores; i++) {
            if (this.jogadores[i].temCartas()) {
                cts.add(this.jogadores[i].excluir());
                if (i == this.vezDoJogador) System.out.println(this.jogadores[i].getNome() + " - " + cts.get(i).toString());
            } else {
                cts.add(null);
            }
        }
        Integer tipo = this.selecionarTipoDeComparacao();
        for (int i = 0; i < cts.size(); i++) {
            System.out.println(this.jogadores[i].getNome() + " - " + cts.get(i).toString());
        }

        this.verGanhadorDoTurno(cts, tipo);
        this.turno++;
    }

    public Integer selecionarTipoDeComparacao() {
        String comparacao = null;
        int tipo = -1;
        if (this.simular) {
            tipo = new Random().nextInt(4);

            switch (tipo) {
                case 0 -> comparacao = "Cor";
                case 1 -> comparacao = "Decomposição";
                case 2 -> comparacao = "Reciclável";
                case 3 -> comparacao = "Ataque";
            }
            System.out.println("Comparação selecionada: " + comparacao);
        } else {
            while (tipo < 1 || tipo > 4) {
                System.out.print("\n1-Cor\n2-Decomposição\n3-Reciclável\n4-Ataque\nSelecione um método de comparação: ");
                try {
                    tipo = leitor.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Informe um número válido!");
                }
                leitor.nextLine();
            }
        }
        return tipo - 1;
    }

    public void verGanhadorDoTurno(ArrayList<Carta> cts, Integer tipo) {
        ArrayList<Carta> ctsCopy = new ArrayList<>(cts);
        cts = this.compararCartas(cts, tipo);
        for (int i = 0; i < cts.size(); i++) {
            if (ctsCopy.get(i) == cts.get(0)) {
                if (this.verificarEmpate(cts, tipo)) {
                    System.out.println("Houve um empate!");
                    this.iniciarTurno();

                    for (Carta ct : cts) {
                        if (!Objects.equals(ct, null)) this.jogadores[this.vezDoJogador].incluir(ct);
                    }
                    System.out.println("Ganhador do turno anterior: " + this.jogadores[this.vezDoJogador].getNome());
                } else {
                    for (Carta ct : cts) {
                        if (!Objects.equals(ct, null)) this.jogadores[i].incluir(ct);
                    }
                    this.vezDoJogador = i;
                    System.out.println("Ganhador do turno: " + this.jogadores[i].getNome());
                }
            }
        }
    }

    public ArrayList<Carta> compararCartas(ArrayList<Carta> cts, Integer tipo) {
        switch (tipo) {
            case 0 -> cts.sort(Carta.compararCor());
            case 1 -> cts.sort(Carta.compararDecomposicao());
            case 2 -> cts.sort(Carta.compararReciclavel());
            case 3 -> cts.sort(Carta.compararAtaque());
        }
        return cts;
    }

    public Boolean verificarEmpate(ArrayList<Carta> cts, Integer tipo) {
        for (int i = 0; i < cts.size(); i++) {
            for (int j = i + 1; j < cts.size(); j++) {
                if (!Objects.equals(cts.get(i), null) && !Objects.equals(cts.get(j), null)) {
                    switch (tipo) {
                        case 0 -> {
                            if (Objects.equals(cts.get(i).getCor(), cts.get(j).getCor())) return true;
                            if (Objects.equals(cts.get(i).getCor(), Cor.VERMELHO) && Objects.equals(cts.get(j).getCor(), Cor.PRETO)) return true;
                            if (Objects.equals(cts.get(i).getCor(), Cor.PRETO) && Objects.equals(cts.get(j).getCor(), Cor.VERMELHO)) return true;
                            if (Objects.equals(cts.get(i).getCor(), Cor.VERDE) && Objects.equals(cts.get(j).getCor(), Cor.LARANJA)) return true;
                            if (Objects.equals(cts.get(i).getCor(), Cor.LARANJA) && Objects.equals(cts.get(j).getCor(), Cor.VERDE)) return true;
                        }
                        case 1 -> {
                            if (Objects.equals(cts.get(i).getDecomposicao(), cts.get(j).getDecomposicao())) return true;
                        }
                        case 2 -> {
                            if (cts.get(i).ehReciclavel() == cts.get(j).ehReciclavel()) return true;
                        }
                        case 3 -> {
                            if (Objects.equals(cts.get(i).getAtaque(), cts.get(j).getAtaque())) return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
