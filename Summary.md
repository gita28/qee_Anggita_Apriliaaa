<h1>#APA ITU VERSIONING? </h1>
fx
mengatur versi dari source code program
TOOLS terdiri dari Version Control System (VCS) Source Code
Untuk menggunakan sync walau jarak jauh GitHub dapat memberikan layanan cloud untuk menyimpan dan mengelola project/repository git. Karena bersifat online, kita bisa meng-edit sebuah repository/project secara bersamaan dengan orang lain di tempat berbeda. Oleh karena itu, platform ini sangat membantu tim project dalam menyusun suatu folder yang berisikan files terkait pemrograman.
new paragraf here

<h1>#Cara inspecting github </h1>
GIT INIT, CLONE, CONFIG
$ gat config-global user.uare John Jone"
$ git config global user.ensil $ git config - - list
$ git init
$ git renote add <remote,nate> <remote_repo_url> $ git push u srenote name> <local branch name
$ git clone ash://jhon@example.com/path/to/my-project.git
$ cd ny project

<h1> #Untuk scyning </h1>
1.Buka github dan membuat repository baru (tanpa mencheck box)
2. Buat folder baru di File Explorer (bebas) dengan nama folder (bebas)
3. Membuat suatu file dengan tipe .txt (dengan menggunakan Notepad++)
4. Masuk ke folder yang sudah dibuat, lalu Klik addres location (hapus seluruhnya) lalu ketikan "cmd"
5. Setelah masuk ke cmd. ketikan "git" lalu enter
6. setelah git masuk. ke lokasi, sudah bisa masuk ke github
7. masuk lagi kepanduan github 
ketik git init (memulai inisialisasi)
git add untuk menambhakan perubahan file ke epo lokal
git commit -m untuk meng a sign (mensahan) perubahan file dengan message tertentu
git branch (tidak dipakai)
git remote add origin (link) (untuk mendirect / mengarahkan file lokal ke github)
jika ada error "git config user.name (username sendiri)"
atau "git config user.email (email sendiri)"
git push -u origin (untuk mengupload file yang berubah-ubah)
Versi 3 : 
Tidak membuat file
(tetapi hapus file  versi2)
masuk cmd : ketikan git add, git commit -m "versi3", git push
Cek github (refresh) jika sudah ada 3 commit berarti berhasil 
setelah itu masuk ke cmd ketikan "git log"
setelah muncul ada kode commit (ambil versi2)
lalu ketikan di cmd "git checkout ....kode versi2.... (lalu enter)
cek folder (jika di folder muncul kembali versi 2 berarti berhasil) 
lalu refresh github (jika terdapat 1 file dan 3 commit berarti berhasil)
penggunaan git branch
Dalam proyek Git apapun, kita bisa melihat semua branch dengan menulis command berikut di command line:

<h1> #git branch </h1>
Jika tidak ada branch yg dibuat, tidak akan ada output di terminal. 
git branch [new_branch]
Lalu, saya perlu memindahkan development branch yang baru saja Anda buat. Untuk melakukannya, saya akan menjalankan tugas berikut
git checkout [new_branch]
Output akan menginformasikan bahwa saya sudah berpindah ke branch baru. saya beri nama test, lalu:
Switched to branch ‘aku’
Sekarang, di development branch yang baru, saya dapat membuat modifikasi code sebanyak-banyaknya sesuai keinginan tanpa merubah apapun di branch utama. 
git branch
 jika saya ingin membuat development branch baru. Pertama, saya perlu commit branch utama agar Git dapat mengerti apa itu master branch. Tanpa langkah ini, Anda akan mengalami error. Oleh karena itu, pertama-tama commit lalu buatlah development branches.
Jika saya ingin menghapus sebuah branch, saya bisa melakukannya dengan command sebagai berikut:
git branch -d [branch_name]
Namun, untuk dapat melakukan ini, saya tidak boleh berada di branch yang ingin saya hapus. Jadi, saya pindah ke master branch lalu hapus branch yg baru saja saya buat dari master branch.
git checkout master
git branch -d test
Terakhir, akan ada saatnya dimana saya sudah membuat banyak modifikasi ke development branch dan membuatnya jadi stabil. Lalu, saya ingin menghubungkannya ke development branch yang lain. Untuk itu, ada perintah merge.
Pertama, temukan development branch yang akan digunakan untuk melampirkan development branch kedua. Sebagai contoh, saya akan melampirkan test branch ke master branch. saya harus berada di master branch dan menggabungkan dengan perintah:
git merge [branch]

![network.png](https://github.com/gita28/qee_Anggita_Apriliaaa/blob/main/screen%20shoot/network.PNG)