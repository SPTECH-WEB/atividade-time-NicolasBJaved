package school.sptech;

class Time {

    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    void registrarVitoria() {
        vitorias++;
    }

    void registrarEmpate() {
        empates++;
    }

    void registrarDerrota() {
        derrotas++;
    }

    Integer getPontos() {
        return vitorias * 3 + empates;
    }

    Integer getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    Integer getAproveitamento() {
        return (vitorias * 100) / getTotalPartidas();
    }

    void compararAproveitamento(Time adversario) {
        if (getAproveitamento() > adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(nome, adversario.nome));
        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(adversario.nome, nome));
        } else {
            System.out.println("Os times %s e %s tem o mesmo aproveitamento".formatted(nome, adversario.nome));
        }
    }


}
