package br.com.senac.sp.dsw.ADOCV.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String nome;
    private String cargo;
    private String email;
    private String telefone;
    private String dataNascimento;
}
