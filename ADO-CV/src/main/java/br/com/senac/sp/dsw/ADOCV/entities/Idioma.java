package br.com.senac.sp.dsw.ADOCV.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Idioma {
    private String nome;
    private String leitura;
    private String escrita;
    private String conversacao;
}
