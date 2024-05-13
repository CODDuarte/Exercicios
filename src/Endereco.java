public record Endereco( String logradouro, String cep,
                        String localidade,
                        String uf, String complemento) {

    @Override
    public String toString() {
        return  "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
