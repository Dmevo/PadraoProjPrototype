package militar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void cloneTest() throws CloneNotSupportedException {
        Pessoa pessoa = new Pessoa("Pessoa Original", "30/06/1999", "1234", new Patente("Marinha", "Almirante"));

        Pessoa pessoaClone = pessoa.clone();
        pessoaClone.setNome("Pessoa Clonada");
        pessoaClone.setDataNascimento("20/06/1999");
        pessoaClone.setCpf("5678");
        pessoaClone.getPatente().setPatente("Vice-Almirante");

        assertEquals("Pessoa{nome=Pessoa Original, dataNascimento=30/06/1999, cpf=1234, patente=Patente{forcaArmada=Marinha, patente=Almirante}}", pessoa.toString());
        assertEquals("Pessoa{nome=Pessoa Clonada, dataNascimento=20/06/1999, cpf=5678, patente=Patente{forcaArmada=Marinha, patente=Vice-Almirante}}", pessoaClone.toString());
    }
}
