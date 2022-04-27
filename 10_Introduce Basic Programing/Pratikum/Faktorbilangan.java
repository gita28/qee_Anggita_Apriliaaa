public class faktorbilangan_
{
public static void main(String[] args)
{
int bilangan;
Scanner input = new Scanner (System.in);
System.out.print ("Masukkan angka yang akan di cari faktornya:  ");
bilangan = input.nexInt();
System.out.print("Faktor dari" + bilangan + "adalah: ");
for(int i=1;i<=bilangan;i++)
{
if(bilang%i == 0)
{
Sytem.outprint(i+ " ");
}
}
}

