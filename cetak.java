package modul6;

public final class cetak {
    public static void main (String[] args){
        komputer [] axioo = new komputer [3];
        
        axioo[0]=new pc();
        axioo[1]=new laptop();
        axioo[2]=new netbook();
        
        for (komputer intel : axioo) {
            intel.hidupkan_os();
            intel.matikan_os();
            intel.klik_kanan();
            intel.klik_kiri();
            intel.tekan_enter();
            intel.cetak_data();
        }
    }
}
