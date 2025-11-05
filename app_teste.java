public class app_teste {

    public static void main(String[] args) {
        System.out.println("codigo externo");

        int[] meus_numeros = { 10, 20, 30, 40, 50 };
        int alvo = 30;

        int resultado = Programa02.pesquisar(meus_numeros, alvo);

        if (resultado != -1) {
            System.out.println("Teste RAG:  posição: " + resultado);
        } else {
            System.out.println("Teste RAG: não encontrado.");
        }
        
    }
}
