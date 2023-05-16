class SinoTibetan extends Linguagem {
    SinoTibetan(String nome, int numFalantes){
        super(nome, numFalantes, "Asia", "sujeito - objeto - verbo");
        if (this.nome ==  "Mandarim") {
            ordemDasPalavras = "sujeito - verbo - objeto";
        }
    }
}