
package tugas;
/**
 * BimaGilangLesmana
 */
public class TugasMain {
   public static void main(String[] args){
       System.out.println("Menampilkan Gaji : ");
       Pegawai pg = new Pegawai();
       pg.setNama("Bima");
       
       Dosen ds = new Dosen();
       ds.setNama("Lesmana");
       ds.setSKS(10);
       
       DaftarGaji dg =  new DaftarGaji(2);
       dg.addPegawai(pg);
       dg.addPegawai(ds);
       dg.printSemuaGaji();
   } 
}
