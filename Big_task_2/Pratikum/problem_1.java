public class problem_1
{
public static void main(String [] args){
 
int n=5;
for (int i=1; i<=n-2; i++){
 
for (int j=0;j<=i;j++){
 
System.out.print(" ");
}
for (int k=i; k<n-1;k++){
System.out.print("*");
}
for (int l=i;l<n-2;l++){
System.out.print("*");
}System.out.print("\n");
}
 
//Untuk Yang dari kecil ke besar
for (int i=1; i<=n-2;i++){
for (int j=n-1;j>=i;j--){
System.out.print(" "); //untuk Spasinya
 
}
for (int k=1;k<=i;k++){
System.out.print("*");
}
for (int l=1;l<i;l++) {
System.out.print("*");
}System.out.print("\n");
}
}
}