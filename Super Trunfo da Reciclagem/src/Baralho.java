import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Baralho {
    private final ArrayList<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
    }

    public Carta selecionaCarta() {
        Carta carta = this.cartas.get(0);
        this.cartas.remove(0);
        return carta;
    }

    public void lerDoArquivo(String nomeDoArquivo) {
        FileReader reader = null;
        try {
            reader = new FileReader(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + nomeDoArquivo + " não encontrado.");
        }
        assert reader != null;
        BufferedReader leitor = new BufferedReader(reader);
        StringTokenizer st;

        String linha = null;
        String codigo, tipo, nome, descricao, cor, decomposicao, ataque, reciclavel;
        Carta carta;

        while (true) {
            try {
                if ((linha = leitor.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            assert linha != null;
            st = new StringTokenizer(linha, ";");

            while (st.hasMoreTokens()) {

                codigo = st.nextToken();
                tipo = st.nextToken();
                nome = st.nextToken();
                descricao = st.nextToken();
                cor = st.nextToken();
                decomposicao = st.nextToken();
                ataque = st.nextToken();
                reciclavel = st.nextToken();

                if (Objects.equals(reciclavel, "sim")) {
                    carta = new Reciclavel(codigo, tipo, nome, descricao, cor, Integer.parseInt(ataque), Double.parseDouble(decomposicao));
                } else {
                    carta = new NaoReciclavel(codigo, tipo, nome, descricao, cor, Integer.parseInt(ataque), Double.parseDouble(decomposicao));
                }
                this.cartas.add(carta);
            }
        }
        try {
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
