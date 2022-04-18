package Model;


public class barang{
    private String foto_barang;
    private String nama_barang;
    private String deskripsi;
    private int harga_barang;
    private String asal_barang;
    private String status_stok;

    public barang(String mfoto,String mNama,String mDeskripsi,int mharga,String mAsal,String mStatus){
        this.foto_barang = mfoto;
        this.nama_barang = mNama;
        this.deskripsi = mDeskripsi;
        this.harga_barang = mharga;
        this.asal_barang = mAsal;
        this.status_stok = mStatus;
    }

    public void printbarang(){
        System.out.println( 
                "Foto Barang              : "+ this.foto_barang+"\n"+
                "Nama Barang              : "+ this.nama_barang+"\n"+
                "Deskripsi                : "+ this.deskripsi+"\n"+
                "Harga Barang             : "+ this.harga_barang+"\n"+
                "Asal Barang              : "+ this.asal_barang+"\n"+
                "Status Stok              : "+ this.status_stok+"\n\n");
    }
    

}