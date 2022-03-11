Struktur data di JAVA
Struktur data yang disediakan oleh paket utilitas Java sangat kuat dan melakukan berbagai fungsi. Ini struktur data terdiri dari kelas antarmuka dan berikut:

Enumeration

BitSet

Vector

Stack

Dictionary

Hashtable

Properties



Semua kelas ini sekarang warisan dan Jawa-2 telah memperkenalkan kerangka kerja baru yang disebut Collections Framework, yang dibahas dalam tutorial berikutnya:

enumeration:
Antarmuka enumeration tidak sendiri struktur data, tetapi sangat penting dalam konteks struktur data lainnya. Antarmuka enumeration mendefinisikan sarana untuk mengambil elemen berurutan dari struktur data.

Misalnya enumeration mendefinisikan sebuah metode yang disebut nextElement yang digunakan untuk mendapatkan elemen berikutnya dalam struktur data yang berisi beberapa elemen.

Antarmuka enumeration mendefinisikan metode yang Anda dapat menghitung (mendapatkan satu per satu) unsur-unsur dalam koleksi benda-benda.

Antarmuka warisan ini telah diganti oleh Iterator. Meskipun tidak usang, enumeration dianggap usang untuk kode baru. Namun, ia digunakan oleh beberapa metode yang didefinisikan oleh kelas warisan seperti Vector dan Properties, digunakan oleh beberapa kelas API lainnya, dan saat ini digunakan secara luas dalam kode aplikasi.

Metode dinyatakan oleh enumeration dirangkum dalam tabel berikut:

SN Metode dengan Deskripsi
1 hasMoreElements boolean ()
Ketika diterapkan, harus kembali benar sementara masih ada lebih elemen untuk mengekstrak, dan salah ketika semua elemen telah dicacah.

2 Obyek nextElement ()
Ini mengembalikan objek berikutnya dalam enumeration sebagai referensi Obyek generik.

Kelas BitSet di Java

Sebuah kelas BitSet menciptakan jenis khusus array yang memegang nilai-nilai bit. The BitSet array dapat meningkatkan ukuran sesuai kebutuhan. Hal ini membuat mirip dengan vektor bit. Ini adalah kelas warisan tetapi telah sepenuhnya kembali direkayasa di Jawa 2, versi 1.4.

The BitSet mendefinisikan dua konstruktor yang ditunjukkan di bawah ini.

SR.NO Constructor dan Deskripsi
1 BitSet ()
Konstruktor ini membuat objek bawaan

2 BitSet (int size)
Konstruktor ini memungkinkan Anda untuk menentukan ukuran awal, yaitu, jumlah bit yang dapat terus. Semua bit diinisialisasi ke nol

BitSet mengimplementasikan antarmuka Cloneable dan mendefinisikan metode yang tercantum dalam tabel di bawah ini:


1 void and (BitSet BitSet)
AND isi memohon dengan BitSet objek dengan yang ditentukan oleh BitSet. Hasilnya ditempatkan ke dalam obyek memohon.

2 void and not (BitSet BitSet)
Untuk setiap 1 bit di BitSet, bit yang sesuai di BitSet memohon dibersihkan.

3 int cardinality ()
Mengembalikan jumlah set bit dalam objek memohon.

4 void clear ()
Nol semua bit.

5 void clear(Int index)
Angka nol bit yang ditentukan oleh indeks.

6 void clear (int startIndex, int endIndex)
Zero bit dari startIndex ke endIndex.1.

7 Object clone ()
Duplikat objek BitSet memohon.

8 boolean equals (Object BitSet)
Mengembalikan nilai true jika set memohon bit setara dengan satu disahkan pada BitSet. Jika tidak, metode ini kembali palsu.

9 void flip (int index)
Membalikkan bit yang ditentukan oleh indeks. (

10 void flip (int startIndex, int endIndex)
Membalikkan bit dari startIndex ke endIndex.1.

11 boolean get (int index)
Mengembalikan keadaan saat bit pada indeks tertentu.

12 BitSet get (int startIndex, int endIndex)
Mengembalikan BitSet yang terdiri dari bit dari startIndex ke endIndex.1. Objek invoking adalah

tidak berubah.
13 int hashCode ()
Mengembalikan kode hash untuk objek memohon.

14 b boolean intersects (BitSet BitSet)
Mengembalikan nilai true jika setidaknya satu pasangan dari bit yang sesuai dalam objek memohon dan BitSet adalah 1.

15 boolean isEmpty ()
Mengembalikan nilai true jika semua bit dalam objek memohon adalah nol.

16  int length ()
Mengembalikan jumlah bit yang diperlukan untuk menahan isi BitSet memohon. Nilai ini ditentukan oleh lokasi yang terakhir 1 bit.

17 int nextClearBit (int startIndex)
Mengembalikan index dari bit dibersihkan berikutnya, (yaitu, nol bit berikutnya), mulai dari indeks yang ditentukan oleh startIndex

18 int nextSetBit (int startIndex)
Mengembalikan index dari set bit berikutnya (yaitu, berikutnya 1 bit), mulai dari indeks yang ditentukan oleh startIndex. Jika tidak ada bit diatur, 0,1 dikembalikan.

19 void or (BitSet BitSet)
OR isi memohon dengan BitSet objek dengan yang ditetapkan oleh BitSet. Hasilnya ditempatkan ke dalam obyek memohon.

20 void set (int index)
Menetapkan bit yang ditentukan oleh indeks.

21 void  set (int index, boolean v)
Menetapkan bit ditentukan oleh indeks dengan nilai yang disahkan pada v. Benar set bit, palsu membersihkan bit.

22 void set (int startIndex, int endIndex)
Set bit dari startIndex ke endIndex.1.

23 void set (int startIndex, int endIndex, boolean v)
Set bit dari startIndex ke endIndex.1, dengan nilai yang disahkan pada v. Benar menetapkan bit, palsu membersihkan bit.

24 int size ()
Mengembalikan jumlah bit dalam objek BitSet memohon.

25 String toString ()
Mengembalikan setara string objek memohon BitSet.

26 void XOR (BitSet BitSet)
XORs isi menerapkan objek BitSet dengan yang ditetapkan oleh BitSet. Hasilnya ditempatkan ke dalam obyek memohon

Vektor mengimplementasikan array dinamis. Hal ini mirip dengan ArrayList, tetapi dengan dua perbedaan:

Vektor yang akan disinkronkan.

Vektor mengandung banyak metode warisan yang bukan merupakan bagian dari kerangka koleksi.

Vektor terbukti sangat berguna jika Anda tidak tahu ukuran array di muka atau Anda hanya perlu satu yang dapat mengubah ukuran selama masa program.

Dibawah ini adalah daftar konstruktor yang disediakan oleh kelas vektor.


1 Vector ()
Konstruktor ini menciptakan vektor default, yang memiliki ukuran awal 10

2 Vector ( int size)
Konstruktor ini menerima argumen yang sama dengan ukuran yang dibutuhkan, dan menciptakan vektor yang kapasitas awal ditentukan oleh ukuran:

3 Vector ( int size, int incr)
Konstruktor ini menciptakan vektor yang awal kapasitas ditentukan oleh ukuran dan yang kenaikan ditentukan oleh incr. Kenaikan yang menentukan jumlah elemen untuk mengalokasikan setiap kali vektor diubah ukurannya ke atas

4 Vector (c collection)
menciptakan vektor yang mengandung unsur-unsur koleksi c

Terlepas dari metode yang diwarisi dari kelas induknya, Vector mendefinisikan metode berikut:


1 void add (int index, object element)
Menyisipkan elemen tertentu pada posisi tertentu di Vector ini.

2 boolean add (Object o)
Menambahkan elemen tertentu untuk akhir Vector ini.

3 boolean addAll ( c Collection)
Menambahkan semua elemen dalam Koleksi tertentu untuk akhir Vector ini, dalam urutan bahwa mereka dikembalikan oleh Koleksi ditentukan itu Iterator.

4 boolean addAll (int index, c collection)
Menyisipkan semua elemen di dalam Koleksi ditentukan dalam Vector ini pada posisi yang ditentukan.

5 void addElement (Object obj)
Menambahkan komponen tertentu untuk akhir vektor ini, meningkatkan ukurannya per satu.

6  int capacity()
Mengembalikan kapasitas saat ini vektor ini.

7 void clear ()
Menghapus semua elemen dari Vector ini.

8 Object clone ()
Pengembalian tiruan dari vektor ini.

9 boolean contains (Object elem)
Tes jika objek tertentu adalah komponen dalam vektor ini.

10 boolean containsAll (c collection)
Mengembalikan nilai true jika Vector ini berisi semua elemen dalam Koleksi tertentu.

11 void copyInto (Object [] anArray)
Salinan komponen vektor ini ke dalam array tertentu.

12 Object elementAt (int index)
Mengembalikan komponen pada indeks tertentu.

13 enumeration elements ()
Pengembalian penghitungan komponen vektor ini.

14 void ensureCapacity (int minCapacity)
Meningkatkan kapasitas vektor ini, jika perlu, untuk memastikan bahwa hal itu dapat menahan setidaknya jumlah komponen ditentukan oleh argumen kapasitas minimum.

15 boolean equals (Object o)
Membandingkan Obyek ditentukan dengan Vector ini untuk kesetaraan.

16 Object firstElement ()
Mengembalikan komponen pertama (item pada indeks 0) dari vektor ini.

17 Object get (int index)
Mengembalikan elemen pada posisi yang ditentukan dalam Vector ini.

18 int hashCode ()
Mengembalikan nilai kode hash untuk Vector ini.

19 int indexOf (Object elem)
Pencarian untuk kejadian pertama dari argumen yang diberikan, pengujian untuk kesetaraan menggunakan metode equals.

20 int indexOf (Object elem, indeks int)
Pencarian untuk kejadian pertama dari argumen yang diberikan, mulai pencarian di indeks, dan pengujian untuk kesetaraan menggunakan metode equals.

21 kekosongan insertElementAt (Object obj, indeks int)
Menyisipkan objek tertentu sebagai komponen dalam vektor ini pada indeks tertentu.

22 boolean isEmpty ()
Tes jika vektor ini tidak memiliki komponen.

23 Object lastElement ()
Mengembalikan komponen terakhir dari vektor.

24 int lastIndexOf (Object elem)
Mengembalikan index dari kejadian terakhir dari objek ditentukan dalam vektor ini.

25 int lastIndexOf (Object elem, indeks int)
Mencari mundur untuk objek tertentu, mulai dari indeks tertentu, dan mengembalikan indeks untuk itu.

26 Object remove (int index)
Menghapus elemen pada posisi yang ditentukan dalam Vector ini.

27 boolean remove (Object o)
Menghapus kejadian pertama dari elemen tertentu di Vector ini Jika Vector tidak mengandung elemen, itu tidak berubah.

28 boolean removeAll (Koleksi c)
Menghapus dari Vector ini semua elemen yang terkandung dalam Koleksi tertentu.

29 void removeAllElements ()
Menghapus semua komponen dari vektor ini dan menetapkan ukurannya ke nol.

30 boolean removeElement (Object obj)
Menghapus pertama (terendah-diindeks) terjadinya argumen dari vektor ini.

31 void removeElementAt (int index)
removeElementAt (int index)

32 protect void removeRange (int fromIndex, int toIndex)
Menghapus dari Daftar ini semua elemen yang indeks antara fromIndex, inklusif dan toIndex, eksklusif.

33 boolean retainAll (Koleksi c)
Mempertahankan hanya unsur-unsur dalam Vector ini yang terkandung dalam Koleksi tertentu.

34 Object set (int index, elemen Obyek)
Menggantikan elemen pada posisi yang ditentukan dalam Vector ini dengan elemen tertentu.

35 void setElementAt (Object obj, indeks int)
Set komponen pada indeks tertentu dari vektor ini menjadi objek tertentu.

36 void setSize (int newSize)
Menetapkan ukuran vektor ini.

37  int  size()
Mengembalikan jumlah komponen dalam vektor ini.

38 list sublist (int fromIndex, int toIndex)
Pengembalian pandangan porsi Daftar ini antara fromIndex, inklusif, dan toIndex, eksklusif.

39 Obyek [] toArray ()
Mengembalikan array yang berisi semua elemen di Vector ini dalam urutan yang benar.

40 Obyek [] toArray (Object [] a)
Mengembalikan array yang berisi semua elemen di Vector ini dalam urutan yang benar; jenis runtime dari array kembali adalah bahwa dari array yang ditentukan.

41 String toString ()
Mengembalikan representasi string dari Vector ini, mengandung representasi String dari setiap elemen.

42 void trimToSize ()
Trims kapasitas vektor ini menjadi ukuran vektor saat ini.

Stack di Java

Stack adalah subclass dari Vector yang mengimplementasikan standar terakhir-in, first-out stack.

Stack hanya mendefinisikan konstruktor default, yang menciptakan tumpukan kosong. Stack mencakup semua metode yang didefinisikan oleh Vector, dan menambahkan beberapa sendiri.

Stack ()
Terlepas dari metode yang diwarisi dari Vector kelas induk, Stack mendefinisikan metode berikut:


1 boolean empty ()
Tes jika tumpukan ini kosong. Mengembalikan nilai true jika stack kosong, dan mengembalikan false jika stack berisi elemen.

2 Object peek ()
Mengembalikan elemen di atas tumpukan, tetapi tidak menghapusnya.

3 Object pop ()
Mengembalikan elemen di atas tumpukan, mengeluarkannya dalam proses.

4 Obyek push (elemen Object)
Mendorong elemen ke stack. Elemen juga dikembalikan.

5 int search (elemen Object)
Pencarian untuk elemen dalam stack. Jika ditemukan, offset dari puncak stack dikembalikan. Jika tidak, 0,1 dikembalikan.

Kelas Hash table di Java

Hashtable adalah bagian dari java.util asli dan merupakan implementasi konkret dari Kamus.

Namun, Java 2 rekayasa ulang Hashtable sehingga juga mengimplementasikan antarmuka Peta. Dengan demikian, Hashtable sekarang terintegrasi ke dalam kerangka koleksi. Hal ini mirip dengan HashMap, tetapi disinkronisasi.

Seperti HashMap, toko Hashtable kunci / nilai pasangan di tabel hash. Bila menggunakan Hashtable, Anda menentukan sebuah benda yang digunakan sebagai kunci, dan nilai yang Anda ingin terhubung dengan kunci itu. Kuncinya kemudian hash, dan kode hash yang dihasilkan digunakan sebagai indeks di mana nilai tersebut disimpan dalam tabel.

Dibawah ini adalah daftar konstruktor yang disediakan oleh kelas HashTable.


1 Hashtable ()
Ini adalah konstruktor default dari tabel hash itu instantiates kelas Hashtable.

2 Hashtable (int size)
Konstruktor ini menerima parameter integer dan membuat tabel hash yang memiliki ukuran awal yang ditentukan oleh ukuran nilai integer.

3 Hashtable (int size, float fillRatio)
Hal ini menciptakan tabel hash yang memiliki ukuran awal yang ditentukan oleh ukuran dan rasio mengisi ditentukan oleh fillRatio. Rasio ini harus antara 0,0 dan 1,0, dan menentukan bagaimana penuh tabel hash bisa sebelum diubah ukurannya ke atas.

4 Hashtable (int size, float fillRatio)
Konstruktor ini membuat tabel hash yang diinisialisasi dengan unsur-unsur dalam m. Kapasitas tabel hash diatur dengan dua kali jumlah elemen dalam m. Beban bawaan faktor 0,75 digunakan.

Terlepas dari metode yang didefinisikan oleh antarmuka Peta, Hashtable mendefinisikan metode berikut:


1 void clear ()
Reset dan mengosongkan tabel hash.

2 Object clone ()
Pengembalian duplikat dari objek memohon.

3 boolean contains (nilai Object)
Mengembalikan nilai true jika beberapa nilai sama dengan nilai ada dalam tabel hash. Mengembalikan false jika nilai tidak ditemukan.

4 boolean containsKey (key Object)
Mengembalikan nilai true jika beberapa kunci yang sama dengan kunci ada dalam tabel hash. Mengembalikan false jika kunci tidak ditemukan.

5 boolean containsValue (nilai Object)
Mengembalikan nilai true jika beberapa nilai sama dengan nilai ada dalam tabel hash. Mengembalikan false jika nilai tidak ditemukan.

6 enumeration element ()
Pengembalian penghitungan nilai-nilai yang terkandung dalam tabel hash.

7 Object get (key Object)
Mengembalikan objek yang berisi nilai yang terkait dengan kunci. Jika kunci tidak dalam tabel hash, objek null dikembalikan.

8 boolean isEmpty ()
Mengembalikan nilai true jika tabel hash kosong; mengembalikan false jika mengandung setidaknya satu kunci.

9 enumeration keys ()
Pengembalian penghitungan tombol yang terdapat pada tabel hash.

10 Object put (key Obyek, nilai Object)
Menyisipkan kunci dan nilai ke dalam tabel hash. Mengembalikan null jika kunci tidak sudah dalam tabel hash; mengembalikan nilai sebelumnya yang terkait dengan kunci jika kunci sudah dalam tabel hash.

11 void rehash()
Memperbesar ukuran tabel hash dan rehashes semua kunci-kuncinya.

12 Object remove (key Object)
Menghapus kunci dan nilainya. Mengembalikan nilai yang terkait dengan kunci. Jika kunci tidak dalam tabel hash, objek null dikembalikan.

13 int size ()
Mengembalikan jumlah entri dalam tabel hash.

14 String toString ()
Mengembalikan setara string tabel hash.


