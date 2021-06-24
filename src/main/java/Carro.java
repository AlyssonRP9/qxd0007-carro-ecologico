package models;

public class Carro{

    private final int limite_passageiros = 2;
    private final int limite_combustivel = 100;

    private int quilometragem;
    private int passageiros;
    private int tanque;

    public Carro(){
        this.quilometragem = 0;
        this.passageiros = 0;
        this.tanque = 0;
    }

    public boolean embarcar(){
        if(this.passageiros < this.limite_passageiros){
            this.passageiros++;
            System.out.println("Passageiro embarcado");
            return true;
        }
        return false;
    }


    public boolean desembarcar() {
        if(this.passageiros > 0){
            this.passageiros--;
            System.out.println("Passageiro desembarcado");

            return true;
        }
        return false;
    }

    public boolean dirigir(int distancia){
        if(this.tanque == 0|| this.passageiros == 0){
            System.out.println("Tanque vazio ou passageiro inexistente");
            return false;
        }
       if(this.tanque < distancia){
           this.tanque += this.quilometragem;
           this.tanque = 0;
       }

       this.tanque -= distancia;
       this.quilometragem += distancia;
       return true;



    }
    public boolean abastecer(int quantidade){
        if(this.tanque < this.limite_combustivel){
            this.tanque += quantidade;

            if (this.tanque > this.limite_combustivel){
                this.tanque = this.limite_combustivel;

            }
            System.out.println("Carro abastecido");
            return true;
    }
    return false;


    }

    public String toString(){
        return "=======Carro Ecológico=======" + "/n" +
                "Tanque: " + this.tanque + "/n" +
                "Quilometragem: " + this.quilometragem + "/n" +
                "Passageiros: " + this.passageiros;


    }


    public int getQuilometragem(){ return this.quilometragem; }
    public int getPassageiros(){ return this.passageiros; }
    public int getTanque(){ return this.tanque; }
}
