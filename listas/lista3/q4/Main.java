public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {new PagamentoPix(), new PagamentoCartao(), new PagamentoBoleto()};

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(100.0);
        }
    }
}
