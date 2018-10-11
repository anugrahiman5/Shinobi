public class Shinobi{
  public static void main(String[] args){
    Konoha[] k = new Konoha[3];

    k[0]=new Konoha();
    k[0].setNo("012606");
    k[0].setNama("Uchiha Sasuke");
    k[0].setPeringkat("Genin");

    k[1]=new Konoha();
    k[1].setNo("012607");
    k[1].setNama("Uzumaki Naruto");
    k[1].setPeringkat("Genin");

    k[2]=new Konoha();
    k[2].setNo("012601");
    k[2].setNama("Haruno Sakura");
    k[2].setPeringkat("Chunin");

    System.out.println("Data Shinobi \n");
    System.out.println("No. Registrasi \t Nama \t\t\t Peringkat");
    for(Konoha x:k){
      System.out.print(x.getNo()+"\t\t");
      System.out.print(x.getNama()+"\t\t");
      System.out.print(x.getPeringkat()+"\t");
      System.out.println();
    }
  }
}
