public class ValidacaoUtil {

    public static void validarCPF(String cpf) throws InvalidCPFException {
        if(cpf.length() != 11){
            //Se entrou, CPF Inválido.
            throw new InvalidCPFException();
        }

        System.out.println("CPF Válido!");
    }
}
