Jika mendengar tentang Linux, sebagian besar orang pasti langsung mengacu pada sistem operasi yang kompleks dan hanya digunakan oleh programmer. Padahal Linux tidak semenyeramkan yang dikira selama ini.

Linux adalah keluarga sistem operasi Unix yang open-source dan didasarkan pada Linux Kernel. Di dalam ‘keluarga’ ini juga termasuk sistem berbasis Linux populer seperti Ubuntu, Fedora, Mint, Debian, dan lain-lain. Sistem-sistem ini lebih tepatnya disebut sebagai distribusi atau distros.

Sejak pertama kali dirilis pada tahun 1991, popularitas Linux terus meroket karena sifatnya yang open-source. User bebas memodifikasi Linux dan mendistribusikannya dengan memakai namanya sendiri. 

Ketika mengoperasikan OS Linux, Anda harus menggunakan shell, yaitu interface yang menyediakan akses ke layanan sistem operasi. Sebagian besar distribusi Linux menggunakan antarmuka pengguna grafis (graphic user interface – GUI) sebagai shell-nya, terutama untuk memberikan kemudahan penggunaan bagi para user. 

Dengan demikian, penggunaan command-line interface (CLI) sangat disarankan karena lebih powerful dan efektif. Task atau tugas yang membutuhkan proses dengan banyak langkah melalui GUI dapat dilakukan hanya dalam waktu sekian detik dengan mengetikkan command atau perintah ke CLI.

Jadi, jika hendak menggunakan Linux, Anda wajib tahu perintah dasar Linux. Di artikel ini, Anda akan mempelajari 35 perintah Linux yang paling mendasar yang akan membantu Anda sebagai pengguna baru untuk menjelajahi Linux.

Perintah Dasar Linux
Sebelum menjabarkan perintah dasar sistem operasi Linux, Anda harus membuka baris perintah (command line) terlebih dulu. Jika belum pernah menggunakan antarmuka baris perintah (command-line interface), silakan baca tutorial CLI ini.

Meskipun langkah-langkah yang akan diikuti berbeda tergantung pada distribusi yang digunakan, baris perintah biasanya ada di bagian Utilities.

Berikut daftar command dasar Linux:

1. pwd command
Perintah dasar Linux pwd berfungsi untuk mencari path dari direktori (folder) yang Anda gunakan saat ini. Perintah ini akan mengembalikan path yang absolut (penuh), yang pada dasarnya merupakan path semua direktori yang diawali dengan garis miring depan (/). Contoh dari path absolut adalah /home/username.

2. cd command
Untuk menjelajahi file dan direktori Linux, gunakan perintah cd. Perintah Linux ini memerlukan path penuh atau nama direktori, tergantung pada direktori yang Anda gunakan saat ini.

Misalkan saat ini Anda sedang berada di /home/username/Documents dan ingin membuka Photos, subdirektori dari Documents. Untuk melakukannya, Anda hanya perlu mengetikkan command ini: cd Photos.

Contoh lainnya, ketika Anda ingin beralih ke direktori yang sepenuhnya baru, misalnya, /home/username/Movies. Dalam contoh ini, ketik cd yang diikuti dengan path absolut direktori: cd /home/username/Movies.

Berikut beberapa jalan pintas (shortcut) untuk memudahkan navigasi:

cd .. (dengan dua tanda titik) untuk memindahkan satu direktori ke atas.
cd jika ingin langsung membuka folder home.
cd- (dengan tanda penghubung) untuk berpindah ke direktori sebelumnya.
Satu hal yang perlu diperhatikan, shell Linux sangat sensitif. Jadi, Anda harus mengetikkan nama direktori dengan benar dan tepat.

3. Is command
Is merupakan perintah dasar pada Linux yang digunakan untuk melihat konten atau isi direktori. Secara default, command ini akan menampilkan isi dari direktori yang Anda gunakan saat ini.

Jika ingin melihat isi direktori lain, ketik Is, disusul dengan path direktori. Contoh, ketik Is /home/username/Documents untuk melihat isi Documents.

Berikut beberapa variasi yang bisa dikombinasikan dengan perintah dasar Linux Is:

Is -R akan membuat daftar semua file yang ada di sub-direktori.
Is -a akan menampilkan file yang tersembunyi.
Is -al akan membuat daftar file dan direktori yang memuat informasi mendetail, seperti permission (hak akses), ukuran (size), pemilik (owner), dll.
4. cat command
cat (akronim dri concatenate) adalah salah satu perintah dasar sistem operasi Linux yang sering digunakan. Perintah ini berfungsi untuk membuat daftar konten atau isi file pada standard output (sdout). Untuk menjalankan command ini, ketik cat yang kemudian diikuti dengan nama dan ekstensi file. Sebagai contoh: cat file.txt.

Berikut beberapa cara untuk menggunakan perintah cat:

cat > filename untuk membuat file baru.
cat filename1 filename2>filename3 untuk menggabungkan dua file (1 dan 2) dan menyimpan outputnya di file baru (3).
cat filename | tr a-z A-Z >output.txt untuk mengonversi file ke penggunaan huruf besar atau huruf kecil.
5. cp command
Gunakan perintah dasar Linux cp untuk menyalin file dari direktori saat ini ke direktori yang berbeda. Misalnya, command cp scenery.jpg /home/username/Pictures untuk membuat salinan scenery.jpg (dari direktori saat ini) ke direktori Pictures.

6. mv command
Fungsi utama command mv adalah untuk memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti atau mengubah nama file.

Argumen yang ada di mv serupa dengan argumen yang ada di perintah cp. Ketik mv, nama file, dan direktori tujuan. Contoh: mv file.txt /home/username/Documents.

Untuk mengganti nama file, perintah Linux-nya adalah mv oldname.ext newname.ext.

7. mkdir command
Untuk membuat direktori baru, Anda bisa menggunakan perintah dasar Linux mkdir. Sebagai contoh, jika Anda mengetik mkdir Music, direktori baru yang muncul disebut Music.

Berikut beberapa command mkdir tambahan:

Untuk membuat direktori baru di dalam direktori lain, gunakan command dasar Linux mkdir Music/Newfile.
Gunakan opsi p (parents) untuk membuat direktori di antara dua direktori yang sudah ada. Misalnya, mkdir -p Music/2020/Newfile untuk membuat file baru “2020”.
8. rmdir command
Jika ingin menghapus direktori, gunakan perintah rmdir. Namun, rmdir hanya boleh digunakan untuk menghapus direktori kosong.

9. rm command
rm adalah perintah dasar pada Linux yang berfungsi untuk menghapus direktori beserta isinya. Jika hanya ingin menghapus direktorinya saja – alternatif command selain rmdir – gunakan rm -r.

Catatan: Saat menggunakan command ini, Anda harus berhati-hati dan cek kembali direktori di mana Anda berada saat ini. Sekali command rm dijalankan, maka semuanya akan terhapus dan tidak bisa dikembalikan.

10. touch command
touch adalah perintah dasar Linux yang memperbolehkan Anda membuat file baru yang kosong melalui baris perintah Linux. Sebagai contoh, ketik touch /home/username/Documents/Web.html untuk membuat file HTML berjudul Web di bawah direktori Documents.

11. locate command
locate digunakan untuk mencari file, fungsinya sama seperti command pencarian di OS Windows. Apabila dipasangkan dengan argumen -i, command ini akan bersifat case-insensitive sehingga file dapat dicari meski Anda tidak mengingat namanya dengan tepat.

Untuk mencari file yang memuat dua atau lebih dari dua kata, gunakan tanda bintang (*). Misalnya, perintah locate -i school*note akan mencari file yang pada namanya termuat kata “school” dan “note”, entah itu huruf besar atau kecil.

12. find command
Sama seperti command locate, perintah find juga bisa digunakan untuk mencari file dan direktori. Bedanya, perintah find lebih ditujukan untuk mencari file yang berlokasi di dalam direktori yang diberikan.

Contoh, perintah find /home/ -name notes.txt akan mencari file bernama notes.txt di dalam direktori home dan subdirektorinya.

Berikut beberapa variasi yang bisa dipasangkan dengan find:

find . – name notes.txt untuk mencari file di dalam direktori yang digunakan saat ini.
/ -type d -name notes.txt untuk mencari direktori.
13. grep command
Perintah dasar Linux lain yang sangat berguna untuk menyelesaikan task harian adalah grep. Dengan command ini, Anda bisa melakukan pencarian di semua teks di dalam file yang diberikan.

Sebagai contoh, ketik grep blue notepad.txt untuk mencari kata blue di file notepad. Baris yang memuat kata yang dicari akan ditampilkan sepenuhnya.

14. sudo command
sudo merupakan singkatan dari “SuperUser Do” dan berfungsi untuk menjalankan task yang memerlukan hak akses (permission) administrative atau root. Namun, kami tidak menyarankan penggunaan command sudo untuk task harian karena bisa terjadi error kapan saja bila Anda melakukan kesalahan.

15. df command
Untuk mendapatkan laporan tentang penggunaan disk space sistem, gunakan perintah df. Laporan yang diberikan hadir dalam bentuk persentase dan satuan KB. Bila ingin melihat laporan berupa satuan megabyte, ketik df -m.

16. du command
du merupakan perintah dasar Linux yang berfungsi untuk mengecek seberapa banyak space yang digunakan oleh suatu file atau direktori. Hanya saja, untuk format ringkasan, penggunaan disk yang ditampilkan berupa nomor blok disk alih-alih format ukuran pada umumnya. Jika ingin melihat jumlah penggunaan disk dalam satuan byte, kilobyte, dan megabyte, tambahkan argumen -h ke baris perintah.

17. head command
Perintah head digunakan untuk melihat baris pertama dari semua file teks. Secara default, perintah ini akan menampilkan sepuluh baris pertama. Namun, jumlah baris tersebut dapat diubah sesuai keinginan Anda. Misalnya, jika Anda hanya ingin menampilkan lima baris pertama, ketik head -n 5 filename.ext

18. tail command
Perintah tail memiliki fungsi yang sama dengan perintah head. Hanya saja, alih-alih baris pertama, perintah tail akan menampilkan sepuluh baris terakhir dari suatu file. Misalnya, tail -n filename.ext.

19. diff command
diff adalah perintah dasar Linux yang membandingkan konten atau isi dua file berdasarkan baris demi baris. Setelah menganalisis file, perintah ini akan menghasilkan output berupa line atau baris yang tidak cocok. Programmer sering menggunakan command ini ketika mereka perlu membuat perubahan program, alih-alih menulis kembali semua kode source.

Format paling sederhana dari command dasar Linux ini adalah diff file1.ext file2.ext.

20. tar command
tar merupakan perintah Linux yang paling banyak digunakan untuk mengarsipkan banyak file ke dalam tarball – format file Linux yang serupa dengan format zip, di mana tindakan kompresi bersifat opsional.

Perintah dasar sistem operasi Linux ini cukup kompleks dengan daftar fungsi yang panjang, seperti menambahkan file baru ke arsip yang sudah ada, membuat daftar konten suatu arsip, mengekstrak konten dari arsip, dan masih banyak lagi. Untuk mengetahui lebih banyak tentang fungsi lainnya, silakan cek contoh-contoh sederhana di sini.

21. chmod command
chmod adalah perintah dasar Linux lainnya yang digunakan untuk membaca, menulis, dan menjalankan permission (hak akses) file dan direktori. Karena perintah ini cukup sulit, maka untuk menjalankannya, silakan baca tutorial lengkap ini terlebih dulu.

22. chown command
Pada sistem operasi Linux, semua file dimiliki oleh user khusus. Sebagai perintah dasar pada Linux, chown memungkinkan Anda untuk mengubah atau mentransfer kepemilikan file ke username khusus atau yang spesifik. Misalnya, chown linuxuser2 file.ext akan menentukan linuxuser2 sebagai pemilik file.ext.

23. jobs command
Perintah jobs akan menampilkan semua jobs saat ini beserta dengan statusnya. Pada dasarnya job merupakan proses yang dimulai oleh shell.

24. kill command
Jika tidak ada program yang responsif, Anda bisa mematikannya secara manual dengan menggunakan command dasar Linux kill. Perintah ini akan mengirimkan sinyal tertentu ke aplikasi yang bermasalah dan memberi instruksi kepada aplikasi tersebut untuk berakhir atau mati dengan sendirinya.

Totalnya ada 64 sinyal yang dapat digunakan, tapi biasanya orang-orang hanya menggunakan dua sinyal, yakni:

SIGTERM (15) – meminta program untuk berhenti bekerja dan memberikannya waktu untuk menyimpan semua progress. Jika tidak ada sinyal khusus yang ditentukan ketika memasukkan perintah kill, sinyal inilah yang akan digunakan. 
SIGKILL (9) – memaksa program untuk berhenti bekerja saat itu juga. Progress yang tidak tersimpan akan hilang.
Selain sinyal, Anda juga harus tahu nomor identifikasi proses (process identification number – PID) dari sebuah program yang hendak dihentikan (kill). Jika tidak tahu PID-nya, Anda bisa menjalankan command ps ux.

Setelah mengetahui sinyal yang ingin digunakan dan PID program, masukkan syntax ini: kill [signal option] PID.

25. ping command
Command ping berfungsi untuk mengecek status konektivitas ke server. Misalnya, dengan menambahkan ping google.com, command akan mengecek apakah Anda sudah terhubung ke Google atau belum dan juga mengukur waktu respons.

26. wget command
Perintah dasar Linux ini sangat berguna – Anda bahkan bisa mengunduh file dari internet dengan bantuan command wget. Anda hanya perlu mengetikkan wget yang diikuti dengan link unduhan.

27. uname command
uname, akronim dari Unix Name, adalah perintah dasar sistem operasi Linux yang akan mencetak informasi lengkap mengenai sistem Linux, misalnya nama mesin, sistem operasi, kernel, dan lain-lain.

28. top command
Sebagai terminal yang setara dengan Task Manager di Windows, command top akan menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut. Melakukan pengawasan terhadap penggunaan resource sistem sangatlah disarankan, terutama ketika Anda harus mencari tahu mana proses yang perlu dimatikan karena terlalu banyak menggunakan resource.

29. history command
Kalau sudah lihai menggunakan Linux, Anda bisa menjalankan ratusan command atau perintah setiap hari. Misalnya, penggunaan command history untuk mengecek kembali (review) command yang sudah ditambahkan sebelumnya.

30. mand command
Bingung dengan fungsi dari command Linux tertentu? Untuk mempelajarinya langsung dari shell Linux, Anda bisa menggunakan command man. Sebagai contoh, dengan menambahkan perintah man tail, Anda akan disodorkan instruksi manual dari perintah tail.

31. echo command
Perintah dasar Linux ini digunakan untuk memindahkan beberapa data ke dalam satu file. Misalnya, jika ingin menambahkan teks, “Hello, my name is John” ke file yang bernama name.txt, yang perlu diketik adalah echo Hello, my name is John >> name.txt.

32. zip, unzip command
Gunakan perintah zip untuk meng-compress file ke arsip zip dan perintah unzip untuk mengekstrak file zip ke arsip zip.

33. hostname command
hostname merupakan perintah dasar pada Linux yang dapat Anda gunakan jika ingin mengetahui nama host/network. Dengan menambahkan -I di akhir command, alamat IP jaringan akan ditampilkan.

34. useradd, userdel command
Linux adalah sistem multi-user, dan ini berarti ada banyak orang yang bisa berinteraksi di dalam satu sistem yang sama pada waktu bersamaan. useradd adalah perintah dasar Linux yang digunakan untuk membuat user baru, sedangkan passwd untuk menambahkan password ke akun user tersebut. Untuk menambahkan user bernama John, misalnya, cukup ketikkan useradd John dan passwd 12345678 untuk menambahkan passwordnya.

Cara menghapus user sama dengan menambahkan user. Untuk menghapus akun user, ketik userdel UserName