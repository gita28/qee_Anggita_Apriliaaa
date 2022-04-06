<h1>Why JMeter? </h1>

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas fungsi pengujian lainnya.

<h1>Some components of JMeter script </h1>

- Listeners

Perekam data yang dihasilkan dari tes Timers

Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan

- Assertions

Seperti assert pada API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak Pre-post processors Fitur yang memproses response data sebelum/sesudah tes


<h1> Let's Record! </h1>

1. Go to

https://opensource-demo.oran

gehrmlive.com/ on your

Firefox browser

2. Fill with the username and password (already on the

web). 3. Click Login (2)

4. Result from record already

created

<h1> Stop Your Record </h1>

1. Stop your record on jmeter 
2. Disable HTTP(S) Test Script Recorder

<h1> Let's Run </h1>

1. Fill number of threads (users) with 3

2. Click Run menu and click Start to run your test plan. Don't forget to save the plan. 

3. See view result table (3)


<h1> Run in CLI mode </h1>

1. Open your terminal or Command Prompt 2. Redirect your path to lapache-jmeter-version\bin

3. Type jmeter -n-t [path to jex file] -1 [path to results file in CSV]

4. Open JMeter in GUI mode, load the generated csv file on your Google Sheets




