public class receita {
    
    String nomedareceita;
    String Tipodareceita;
    String Duracaodareceita;
    String Nacionalidadedareceita;

    Public receita (String nomedareceita, 
    String nomedareceita,
    String tipodereceita,
    String duracaodareceira,
    String nacionalidadedareceita){


   this.nomedareceita=nomedareceita;
   this.Tipodareceita=tipodereceita;
   this.Duracaodareceita=duracaodareceira;
   this.Nacionalidadedareceita=nacionalidadedareceita;     

  public void nomedareceita() {
    System.out.println("nome da receita:  "+nomedareceita);
    System.out.println("tipo de receita:  "+tipodereceita);
    System.out.println("Duracao da receita: "+Duracaodareceita);
    System.out.println("nacionalidade da receita:  "+nacionalidadedareceita);
  }

  public static void main(String[] args){
    receita= new receita(nomedareceita:"palha italiana" tipodereceita:"Doce" Duracaodareceita:"40 minutos" nacionalidadedareceita:"Brasil");
    receita.nomedareceita();
  }}

}
