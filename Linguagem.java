public class Linguagem{
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;
    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }
    public void getInfo(){
        System.out.println(nome + " é falado por "+ numFalantes+ " principalmente em "+regioesFaladas+".");
        System.out.println("A linguagem segue a ordem: " +ordemDasPalavras +".");
        System.out.println("-");
    }
    public static void main (String args[]){
        Linguagem ingles = new Linguagem("Inglês", 200000000, "América", "Sujeito, verbo, complemento");
        ingles.getInfo();
        Linguagem maia = new Mayan("Maia", 6000000);
        maia.getInfo();
        Linguagem sinoTibetanas = new SinoTibetan("Mandarim", 1400000000);
        Linguagem sinoTibetanas2 = new SinoTibetan("Birmanês", 1400000000);
        sinoTibetanas.getInfo();
        sinoTibetanas2.getInfo();
    }
}