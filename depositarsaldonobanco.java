public class depositarsaldonobanco {
double saldo;
double deposito;
double sacar;
    public void verifica(double saldo,double deposito,double sacar){
        this.saldo = saldo;
        this.deposito = deposito;
        this.sacar = sacar;
    }
    public void sacar(){
     if(sacar > saldo){
         System.out.println("Erro! Tente Novamente");
     }else{
         sacar= saldo - sacar;
     }
    }
    public void deposito(){
    saldo = deposito + saldo;
    }
}//ve depois se ja terminou!
