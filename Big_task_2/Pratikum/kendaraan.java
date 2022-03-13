public class kendaraan{
    boolean mesin;
    int kapasitas;
    
    void jalan(){
}

void berhenti (){
    
}
}

public class Mobil extends kendaraan{
    public static void main (String args[]){
        mobil a = new mobil ();
        
        a.mesin= true;
        a.kapasitas= 5;
        a.jalan ();
        a.berhenti();
        
    }
}




