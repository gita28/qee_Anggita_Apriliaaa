BDD (Behavior Driven Development)

Dalam pengembangan suatu sistem ada methodology yang bernama TDD (Test Driven Development), yaitu adalah methodology pengembangan dimana kita mengutamakan komponen-komponen yang akan di test untuk membuat suatu sistem yang baik untuk Stakeholder/Customer. Tetapi ada juga methodology lain yang kebalikan dari TDD, ia berfokus kepada “Behavior” sebuah sistem, methodology tersebut adalah BDD (Behavior Driven Development). “Behavior” dalam konteks ini adalah hal-hal yang Stakeholder/Customer harapkan dapat dilakukan oleh suatu sistem. “Behavior” juga dapat dibilang sebagai kontrak, contoh: kita ditugaskan membuat mesin ATM. Maka sebagai Team yang mengimplentasi Behavior Driven Development  hal pertama yang kita lakukan adalah membuat suatu Statements yang berisikan Context (Starting State), Event (Apa yang User lakukan), Outcome (Apa yang diharapkan). Maka dalam pembuatan mesin ATM tersebut yang dibuat adalah :

Context :

Akun berisikan dana yang cukup.
Dan kartu valid.
Dan mesin ATM berisikan uang yang cukup.
Event :

Saat pemegang akun menarik uang sejumlah X.
Outcome :

Maka mesin akan dipastikan mengeluarkan uang sejumlah X.
Mesin akan dipastikan mengurangi akun sebanyak X.
Mesin akan mengembalikan kartu.
Ketiga hal tersebut adalah kontrak kerja kita, dan sebagai Team kita harus memastikan bahwa mesin ATM yang harus kita buat dapat memenuhi kondisi diatas.oleh karena itu Team akan melakukan Behavior Test yaitu adalah test dimana team harus memastikan bahwa sistem berkerja sesuai dengan yang diharapkan. Perlu dicatat dalam hal ini, error dalam suatu komponen dapat ditoleransi jika pada akhirnya sistem melakukan apa yang di tuliskan dalam kontrak / Behavior Test.

Proses yang dilakukan saat melakukan BDD adalah:

Membuat serangkain Behavior Test
Memastikan bahwa system melewati Behavior Test
Melihat jika sistem telah melewati Behavior Test tersebut maka produk sudah bisa di
Perlu dicatat bahwa saat kita melakukan pengembangan dengan BDD maka point utama dari sistem kita adalah Behavior Test, jika suatu sistem dapat melewati Behavior Test walau dengan fitur minimalis, maka produk sudah dapat di release.

Keuntungan dari menggunakan BDD adalah:

Lebih berinterkasi dengan Stakeholder/Customer
Jika suatu Function berubah, tidak perlu dilakukan test lagi selama fungsi tersebut tidak mengubah hasil akhir.
Behavior Test dapat dilakukan dengan Software apapun yang mirip, berbeda dengan Unit Test.
Kelemahan dari BDD adalah:

Membutuhkan waktu yang lama untuk mengetest sautu
Kesulitan dalam melacak akar permasalahan jika terjadi suatu

