package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    public Curso() {
        super();
    }

    @Override
    public Double caldularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
