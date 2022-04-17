<h1>Apa itu Post Processor?<h1>

Elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler. Pemroses pos ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler, mis. kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.


<h1> JSON Path </h1>

Digunakan untuk ekstrak isi dari json response Beberapa ekspresi yang umum digunakan :

- $root element

- .= child operator (object)

- [] = child operator (array)

- .. = recursive descent (langsung ke objek)

- * = wildcard (all things)

[startend] = array slice operator borrowed

<h1> Let's do exercise </h1>

Specification:

BASE URL: https://reqres.in

- PATH:

- Poth 1: [GET] /api/users?page=2

- Poth 2: [GET] /api/unknown/$(id) Path 3 [POST]/opikusers

