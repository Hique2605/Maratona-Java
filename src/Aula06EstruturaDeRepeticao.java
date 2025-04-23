public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
    //FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Repetição " + i);
        }
    //WHILE
        int a = 0;
        while (a < 5) {
            System.out.println("Valor: " + a);
            a++;
        }
    //DO WHILE
        int j = 0;
        do {
            System.out.println("Número: " + j);
            j++;
        } while (j < 5);

    //par ate 100
        for (int num =0; num<=100;num++){
        if(num % 2 == 0){
            System.out.println(num);
            }

        }
    //imprima os priemiros 25 de um dado valor, 50.
        int max = 50;
        for (int i =0; max<=50;i++){
            if (i>25){
                break;
            }
            System.out.println(i);
        }
        //imprime de 0 a 25

        //caso da parcela se maior que 1000
        //descobrir quantas parcelas o carro pode ser parcelado
        double valorTotal = 30000;

        for(int parcela =1 ; parcela <=valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: "+ parcela + "rs: "+valorParcela);
        }

        /* if(valorParcela < 1000){
        *   continue; }
        * se a logica fosse trocada
        *  */

    }

}
