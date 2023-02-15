public class Main {
    public static void main(String[] args)  {

//        Exception UNCHECKED
//       int [] vetor = new int[3];
//       vetor[0] = 10;
//       vetor[1] = 20;
//       vetor[2] = 30;
//       vetor[3] = 40;
//
//        System.out.println(vetor[0] + vetor[1] +  vetor[2]);

//        Exception CHECKED
        try{
            ValidacaoUtil.validarCPF("1234567890");
        }catch(InvalidCPFException exception){
            //Trata a exception
           exception.printStackTrace();
        }

        System.out.println("Chegou ao final do código!");
    }
}