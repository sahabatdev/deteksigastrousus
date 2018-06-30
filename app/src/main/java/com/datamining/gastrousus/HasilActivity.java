package com.datamining.gastrousus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    String[] dataPenyakit = {
        "Keracunan Staphylococcus aureus",
        "Keracunan jamur beracun",
        "Keracunan Salmonellae",
        "Keracunan Clostridium botulinium",
        "Keracunan Clampylobacter",
    };

    Integer[] dataImage={
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar3,
        R.drawable.gambar4,
        R.drawable.gambar5,
    };

    String[] dataArtikel={
        "Bakteri ini bisa mencemari makanan melalui jamahan tangan manusia yang sudah tercemar racun.Racun ini berada pada manusia melalui hidung,tenggorokan,mulut saat bersin dan batuk atau luka infeksi pada tangan.Makanan yang sering tercemari bakteri ini antara lain daging,daging unggas,telur,susu,ikan,dan kerang.\n" +
                "\n" +
                "Gejala penderita\n" +
                "Penderita keracunan bakteri ini biasanya disertai dengan gejala seperti mual,kejang usus,muntah,diare,dan badan terasa lemah.Umumnya gejala tersebut akan muncul 2 - 4 jam setelah penderita mengkonsumsi makanan yang mengandung racun.\n" +
                "\n" +
                "Pengobatan\n" +
                "Penderita dikompres denga air panas dan diusahakan agar muntah dengan diberi minum segelas air hangat yang ditambahkan sesendok teh garam atau segelas susu murni.Kemudian penderita diberi minum  segelas air kelapa hijau muda  untuk menawarkan racun.Sekitar 4 - 5 jam setelah meminumnya penderita dapat diberikan obat urus-urus sehingga perut bersih dari racun.Setelah itu,penderita diberikan lagi air kelapa hijau muda.\n" +
                "\n" +
                "Bawalah penderita ke puskesmas atau rumah sakit bila gejala-gejala yang timbul lebih parah\n" +
                "\n" +
                "\n" +
                "Pencegahan\n" +
                "Untuk menjamah makanan,tubuh harus sehat dan bersih,tidak ada luka infeksi di tangan seperti cantengan atau bisul.Peralatan masak dan peralatan makan harus dijaga kebersihannya.Untuk mengurangi sentuhan tangan terhadap makanan sebaiknya digunakan alat untuk memegang makanan.\n" +
                "\n" +
                "Akhir postingan mudah-mudahan apa yang dipaparkan diatas bisa bermanfaat untuk kita semuanya.Jangan lupa baca juga keracunan bakteri Clostridium perfringens  untuk menambah wawasan.",
            "Indonesia kaya akan keragaman flora, salah satunya jamur. Sebagian jamur-jamur ini aman dimakan, namun sebagian lainnya mengandung racun dan dapat menyebabkan kematian. Cara untuk mengetahui suatu jamur aman dikonsumi atau tidak, adalah dengan diidentifikasi oleh ahli jamur (mikologi).\n" +
                    "\n" +
                    "Jika Anda merasa ragu dengan suatu jenis jamur untuk dikonsumi, lebih baik tinggalkan. Dan jika pun Anda benar-benar ingin memakan jamur, jangan ambil jamur yang tumbuh liar, tapi belilah jenis jamur yang sudah umum dan sering dijual di pasar atau supermarket.\n" +
                    "\n" +
                    "Efek jamur beracun\n" +
                    "Ada tiga efek utama dari jamur beracun, yaitu:\n" +
                    "Halusinasi. Beberapa jenis jamur mengandung racun yang dapat menimbulkan halusinasi. Jenis jamur psikotropika ini sering disebut dengan 'magic mushrooms' atau 'jamur ajaib'. Salah satu spesies ini yang terkenal adalah Golden Top (Psilocybe subaeruginosa). Selain menyebabkan halusinasi, efek lainnya yang menyertai adalah kebingungan, kelemahan otot, agitasi, denyut jantung cepat dan sakit kepala. Perlu diperhatikan, terutama bagi penyuka traveling ke hutan, jamur Golden Top juga mirip dengan beberapa jamur jenis Galerina, yang berpotensi mematikan.\n" +
                    "Penyakit gastrointestinal. Banyak jamur beracun yang menyebabkan penyakit pencernaan, seperti mual, muntah, kram perut dan diare.\n" +
                    "Kegagalan hati hingga kematian. Gejala keracunan akibat makan jamur Death Cap (Amanita phalloides) terjadi antara 6-24 jam setelah makan. Gejalanya adalah mual, kram perut, muntah dan diare. Racunnya bahkan dapat berakibat fatal pada hati dan ginjal, bahkan kematian yang dapat terjadi dalam waktu 48 jam. Jamur lain yang memiliki efek mirip dengan Death Cap adalah beberapa jamur dari spesies Galerina, Lepiota dan Conocybe. \n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Kematian akibat jamur Death Cap\n" +
                    "Jamur Death Cap (Amanita phalloides) dapat mengakibatkan kefatalan jika dikonsumsi. Karakteristiknya adalah: \n" +
                    "Sering tumbuh di bawah pohon oak (ek) - tidak jelas apakah jamur ini ada di Indonesia\n" +
                    "Diameternya berkisar antara 10-160 mm\n" +
                    "Warna topinya (tudung) bisa kuning pucat atau hijau atau coklat zaitun\n" +
                    "Insang (tonjolan pada bagian bawah topi) berwarna putih\n" +
                    "Pangkal batang memiliki topi lain yang berselaput\n" +
                    "Gejalanya terjadi antara 6-24 jam setelah dikonsumsi\n" +
                    "Menyebabkan kerusakan hati, ginjal, bahkan kematian\n" +
                    "Satu jamur cukup mengandung racun untuk membunuh satu orang dewasa\n" +
                    "Racunnya tidak dapat netral dengan dimasak cara apapun, termasuk dengan perendaman atau pengeringan. \n" +
                    "\n" +
                    "Jamur beracun Yellow Stainer\n" +
                    "Jamur Yellow Stainer (Agaricus xanthodermus) biasanya tumbuh liar di halaman berumput dan kebun, dan cukup mirip dengan jamur pangan. Karakteristiknya adalah:\n" +
                    "Tumbuh di tanah dalam kelompok\n" +
                    "Diameternya berkisar antara 50-200 mm\n" +
                    "Topinya biasanya berwarna putih, tapi dapat berubah menjadi coklat karena usianya\n" +
                    "Topi jamur muda tampak persegi kecil\n" +
                    "Ketika rusak, topi dan batang bernoda kuning, memudar, kemudian berubah menjadi coklat kotor\n" +
                    "Mengeluarkan bau kimia, seperti desinfektan, yodium atau minyak tanah. Baunya akan lebih menyengat ketika dimasak\n" +
                    "Jika dimakan, gejala yang muncul adalah kram perut, mual, muntah dan diare (biasanya dalam waktu 30 menit sampai 2 jam setelah dimakan). Gejala lainnya yang kurang umum adalah sakit kepala, pusing, berkeringat dan mengantuk. \n" +
                    "\n" +
                    "Pengobatan keracunan jamur\n" +
                    "Jika Anda mencurigai seseorang atau anak Anda telah memakan jamur beracun, maka segera hubungi layanan kesehatan terdekat, tidak perlu menunggu gejalanya muncul. Dan jangan lupa bawa juga sampel jamur tersebut.\n" +
                    "\n" +
                    "Jika orang itu telah kolap atau kehilangan kesadaran, napasnya berhenti, mengalami kejang atau mengalami reaksi anafilaksis, segera hubungi gawat darurat rumah sakit. Jangan berusaha menanganinya sendiri.\n" +
                    "\n" +
                    "Fakta-fakta tentang keracunan jamur\n" +
                    "Sebuah penelitan memberikan informasi terkait keracunan akibat jamur. Beberapa temuannya adalah: \n" +
                    "\n" +
                    " \n" +
                    "Orang-orang yang sengaja memakan jamur liar dengan harapan akan mengalami halusinasi seperti halnya memakan obat, sangat mungkin akan mengalami sakit.\n" +
                    "Gejala yang paling umum dari keracunan jamur adalah gangguan pencernaan seperti muntah, nyeri perut dan diare (terkadang disertai darah).\n" +
                    "Suatu jamur tidak bisa dinilai aman dikonsumsi atau tidak, kecuali sudah diidentifikasi oleh seorang ahli jamur.\n" +
                    "Tidak ada tes rumahan yang dapat menentukan apakah suatu jenis jamur itu beracun atau tidak. \n" +
                    "\n" +
                    "Melindungi anak-anak dari keracunan jamur\n" +
                    "Banyak varietas jamur yang tumbuh di Indonesia. Kebanyakan anak-anak yang makan jamur beracun adalah karena menemukannya di sekitarnya. Anak-anak yang berusia di bawah lima tahun cenderung akan meletakkan segala sesuatu ke mulutnya. Jika Anda memiliki balita, periksalah taman rumah atau kebun Anda secara teratur demi mengurangi risiko terjadinya keracunan.\n" +
                    "\n" +
                    "Satu hal yang perlu diingat bahwa jangan sembarangan mengonsumsi jamur. Jika Anda baru pertama kali melihat jenis jamur tersebut dan dan tidak tahu apakah jamur tersebut aman dikonsumsi, lebih baik tinggalkan.",
            "Banyak orang mengalami diare atau sakit perut karena salah mengonsumsi makanan. Masalah pencernaan ini mungkin saja disebabkan oleh adanya bakteri salmonella dalam makanan, terutama makanan yang kurang matang. Sehingga, Anda perlu menghindari makanan yang mengandung bakteri salmonella. Namun, adakah cara untuk mengetahui kandungan salmonella dalam makanan?\n" +
                    "\n" +
                    "Bahaya salmonella dalam makanan\n" +
                    "Adanya bakteri salmonella dalam makanan yang Anda makan dapat menyebabkan Anda menderita gastoenteritis. Hal ini dapat terjadi pada Anda dengan gejala mual, muntah, kram perut, diare, demam, sakit kepala, panas dingin, dan darah di feses. Anda bisa mengalami gejala-gejala tersebut selama dua sampai tujuh hari.\n" +
                    "\n" +
                    "Saat Anda mengonsumsi makanan yang mengandung bakteri salmonella, Anda tidak akan langsung merasa sakit. Sakit akan muncul setidaknya 2-3 hari setelah Anda mengonsumsi makanan tersebut. Sehingga, mungkin akan sulit bagi Anda untuk mengetahui makanan apa yang menyebabkan Anda sakit. Anda harus mengingat-ingat lagi makanan apa yang Anda makan selama tiga hari kebelakang, dan hal ini mungkin tidak mudah untuk diingat.\n" +
                    "\n" +
                    "Selain dapat menyebabkan masalah pencernaan, bakteri salmonella jenis tertentu juga dapat menyebabkan demam tifoid atau lebih dikenal dengan nama tifus. Penyakit ini disebabkan oleh bakteri Salmonella typhi yang terkandung dalam makanan yang terkontaminasi.\n" +
                    "\n" +
                    "Makanan yang berisiko mengandung salmonella\n" +
                    "Salmonella merupakan bakteri yang hidup di banyak usus hewan ternak. Anda bisa terinfeksi bakteri salmonella saat mengonsumsi makanan yang terkontaminasi dengan feses hewan yang mengandung bakteri salmonella. Beberapa makanan yang umumnya bisa terkontaminasi dengan bakteri salmonella adalah:\n" +
                    "\n" +
                    "Daging, unggas, dan makanan laut mentah. Feses bisa masuk ke dalam daging dan unggas mentah selama proses pemotongan. Sedangkan, makanan laut bisa terkontaminasi salmonella dari air yang terkontaminasi.\n" +
                    "Telur mentah. Pada ayam yang terinfeksi bakteri salmonella, ayam tersebut dapat menghasilkan telur yang mengandung salmonella sebelum cangkangnya terbentuk. Sehingga, bakteri salmonella bisa terkandung dalam telur. Sedangkan, cangkang telur sebenarnya dapat menjadi penghalang telur terkontaminasi bakteri salmonella dari luar.\n" +
                    "Buah-buahan dan sayuran. Buah dan sayur dapat terkontaminasi bakteri salmonella dari air yang terkontaminasi. Kontaminasi ini bisa terjadi saat pencucian, pengolahan dengan air, atau bersentuhan dengan daging atau unggas mentah yang terkontaminasi.\n" +
                    "Apakah bisa mengetahui makanan mana yang mengandung salmonella?\n" +
                    "Salmonella merupakan bakteri yang dapat menyebabkan keracunan makanan jika masuk ke dalam tubuh Anda. Sehingga, Anda perlu menghindari makanan yang mengandung salmonella. Namun, untuk mengetahui apakah makanan yang Anda makan mengandung bakteri salmonella atau tidak, ini merupakan hal yang tidak mudah.\n" +
                    "\n" +
                    "Bakteri salmonella dalam makanan tentu tidak dapat dideteksi dengan hanya melihat makanan tersebut atau hanya mencium bau makanan tersebut. Untuk mengetahui adanya bakteri salmonella dalam makanan, ini hanya dapat dilakukan dengan uji di laboratorium. Sayangnya, ini bukan suatu hal yang sederhana.\n" +
                    "\n" +
                    "Namun begitu, Anda bisa melakukan beberapa hal seperti di bawah ini untuk mengurangi risiko Anda terkena keracunan makanan karena bakteri salmonella.\n" +
                    "\n" +
                    "Masak telur sampai benar-benar matang, baik putih telur maupun kuning telurnya\n" +
                    "Masak daging utuh sampai 63°C, daging giling sampai 71°C, dan unggas sampai 74°C. Hal ini karena pada temperatur tersebut sebagian besar bakteri dalam makanan dapat mati, sehingga dapat meminimalkan risiko Anda terkena infeksi.\n" +
                    "Simpan makanan panas dan dingin secara terpisah\n" +
                    "Jangan membiarkan makanan terbuka selama lebih dari dua jam\n" +
                    "Membedakan talenan atau peralatan masak lain untuk makanan mentah dan makanan matang\n" +
                    "Bersihkan peralatan makan dan memasak setelah menggunakannya\n" +
                    "Selalu cuci tangan Anda sebelum memegang makanan",
            "Botulisme adalah kondisi keracunan serius yang disebabkan oleh racun yang dihasilkan bakteri Clostridium botulinum. Kondisi ini cukup langka, tapi racun yang dihasilkan oleh bakteri ini dikenal sebagai salah satu racun yang paling berbahaya dan mematikan.\n" +
                    "\n" +
                    "Racun yang dihasilkan bakteri ini menyerang sistem saraf seperti otak, tulang belakang, saraf lainnya, dan menyebabkan kelumpuhan otot. Kelumpuhan yang terjadi bisa menyerang otot-otot yang mengendalikan pernapasan, ini bisa mematikan dan harus segera mendapatkan penanganan. Bakteri ini biasanya bisa masuk ke dalam tubuh melalui makanan maupun melalui luka pada tubuh.\n" +
                    "\n" +
                    "Botulism - alodokter\n" +
                    "\n" +
                    "Penyebab Botulisme\n" +
                    "Bakteri Clostridium botulinum bisa ditemukan di tanah, debu, sungai serta dasar laut. Bakteri ini sebenarnya tidak berbahaya dalam kondisi lingkungan normal, namun ketika kekurangan oksigen mereka akan melepaskan racunnya. Bakteri Clostridium botulinum akan kekurangan oksigen saat berada dalam kaleng tertutup, botol, lumpur dan tanah yang tidak bergerak, atau di dalam tubuh manusia.\n" +
                    "Berdasarkan penyebabnya, berikut ini adalah ketiga jenis botulisme:\n" +
                    "\n" +
                    "Botulisme keracunan makanan. Botulisme yang muncul akibat konsumsi makanan kalengan rendah asam seperti buncis, jagung dan bit yang menjadi tempat berkembangnya bakteri Clostridium botulinum. Jika seseorang mengonsumsi makanan yang mengandung racun penyebab botulisme, maka racun tersebut akan mengganggu fungsi saraf sehingga mengakibatkan kelumpuhan.\n" +
                    "Botulisme luka. Botulisme yang muncul karena luka pada penderita terinfeksi bakteri Clostridium botulinum. Bakteri yang berada di dalam luka kemudian berkembang biak dan memproduksi racun penyebab botulisme.\n" +
                    "Botulisme bayi. Botulisme ini terjadi ketika bayi menelan spora bakteri Clostridium botulinum. Spora-spora bakteri Clostridium botulinum (biasanya terdapat pada tanah atau madu) yang tertelan oleh bayi ini akan berkembangbiak dan memproduksi racun pada saluran pencernaan. Biasanya terjadi pada bayi di bawah usia satu tahun.\n" +
                    "Gejala Botulisme\n" +
                    "Gejala adalah sesuatu yang dirasakan dan diceritakan oleh penderita. Kemunculan gejala botulisme berbeda-beda pada setiap pasien, mulai dari beberapa jam hingga beberapa hari setelah terpapar bakteri Clostridium botulinum. Gejala yang dirasakan penderita bergantung pada penyebab dan jenis botulisme, yaitu:\n" +
                    "Botulisme keracunan makanan: kesulitan menelan dan berbicara, mulut kering, otot wajah lemah, gangguan penglihatan, kelopak mata lemas (terkulai), kesulitan bernafas, mual, muntah, kram perut dan lumpuh.\n" +
                    "Botulisme luka: kesulitan menelan dan berbicara, otot wajah lemah, gangguan pengelihatan, kelopak mata lemas (terkulai), kesulitan bernafas, lumpuh.\n" +
                    "Botulisme bayi: Sembelit, kesulitan mengontrol kepala, gerak tubuh tidak bertonus (tidak ada tegangan otot, seperti boneka kain), menangis lemah, mudah marah, sering mengeluarkan air liur, kelopak mata lemas terkulai, kelelahan, kesulitan untuk menyedot atau makan, lumpuh.\n" +
                    "Jika tidak ditangani dengan cepat dan benar, penderita botulisme dapat berisiko terkena beberapa komplikasi seperti:\n" +
                    "Gangguan pernapasan.\n" +
                    "Kesulitan berbicara.\n" +
                    "Sulit menelan.\n" +
                    "Merasa lemah terus menerus.\n" +
                    "Nafas menjadi pendek\n" +
                    "Diagnosis Botulisme\n" +
                    "Diagnosis merupakan langkah dokter untuk mengidentifikasi penyakit atau kondisi berdasarkan gejala dan tanda-tanda yang dialami oleh pasien. Dokter akan menjalankan pemeriksaan fisik untuk mengecek tanda-tanda lemah otot atau kelumpuhan, seperti kelopak mata lemas dan suara lemah.\n" +
                    "Selain pemeriksaan fisik, dokter juga akan mengajukan pertanyaan tentang makanan yang dikonsumsi pasien selama beberapa hari terakhir dan tentang luka di tubuh yang berisiko terinfeksi bakteri.\n" +
                    "\n" +
                    "Dokter  bisa menyarankan tes darah dan tinja untuk memeriksa apakah terdapat bakteri Clostridium botulinum di dalamnya. Jika masih ada, makanan yang dicurigai juga bisa dibawa untuk diuji di laboratorium.\n" +
                    "\n" +
                    "Pada botulisme bayi, dokter akan bertanya pada orang tua bayi apakah bayinya diberi makan madu, ataukah mengalami sembelit atau lesu. Dokter mungkin juga akan menganalisa darah, tinja atau muntah bayi untuk mengidentifikasi racun penyebab botulisme.\n" +
                    "\n" +
                    "Pengobatan Botulisme\n" +
                    "Penderita botulisme perlu menjalani rawat inap di rumah sakit. Tujuan dari pengobatan botulisme adalah untuk menetralisir racun dan membantu fungsi tubuh (seperti pernapasan) berjalan normal, hingga penderita pulih kembali.\n" +
                    "Pengobatan botulisme tidak akan menyembukan kelumpuhan otot dan pernapasan yang mungkin sudah terjadi, tapi pengobatan akan menjaga kondisi tidak semakin memburuk. Beberapa minggu atau bulan setelah pengobatan, umumnya kelumpuhan yang muncul sebelum pengobatan akan menghilang dan tubuh kembali normal.\n" +
                    "\n" +
                    "Beberapa perawatan bagi penderita botulisme yang biasanya diberikan oleh dokter adalah:\n" +
                    "\n" +
                    "Pemberian antitoksin. Pada penderita botulisme keracunan makanan atau botulisme luka, biasanya dokter akan menyuntikkan obat antitoksin untuk mengurangi risiko komplikasi. Antitoksin dengan jenis imun globulin botulisme biasanya diberikan untuk mengobati botulisme bayi.\n" +
                    "Pemberian antibiotik. Prosedur ini direkomendasikan hanya untuk penderita botulisme luka, karena antibiotik justru mempercepat pelepasan racun.\n" +
                    "Alat bantu pernapasan. Alat ini akan dipasang oleh dokter jika penderita mengalami kesulitan bernapas.\n" +
                    "Rehabilitasi. Kelumpuhan pada penderita botulisme bisa sembuh secara bertahap. Penderita membutuhkan terapi untuk membantu proses pemulihan berbicara, menelan, dan fungsi tubuh yang terkena dampak botulisme.\n" +
                    "Pencegahan Botulisme\n" +
                    "Ada beberapa langkah yang bisa dilakukan untuk mencegah seseorang terkena botulisme yaitu:\n" +
                    "Hindari mengonsumi makanan dengan kemasan yang sudah rusak, makanan diawetkan yang sudah berbau, makanan yang disimpan pada suhu yang tidak sesuai, serta makanan kadaluarsa.\n" +
                    "Jangan berikan madu pada bayi berusia di bawah satu tahun, meskipun dalam jumlah sedikit, karena diketahui madu mengandung spora bakteri Clostridium botulinum. Sirup jagung juga dilarang diberikan pada bayi di bawah satu tahun.\n" +
                    "Jangan menggunakan narkotika dan obat-obatan terlarang.",
            "Campylobacter jejuni adalah bakteri gram negatif yang berbentuk batang, melengkung, motil, serta termasuk bakteri termofilik dan mikroaerofilik.\n" +
                    "\n" +
                    "Campylobacter jejuni bertahan hidup pada kondisi yang memiliki kadar oksigen sangat rendah (5 persen) dan bisa mati bila kadar oksigen meningkat.\n" +
                    "\n" +
                    " \n" +
                    "Usus burung adalah tempat terbaik bagi bakteri C. jejuni.\n" +
                    "\n" +
                    "C. jejuni menyebabkan infeksi saluran pencernaan pada manusia dan hewan, termasuk burung.\n" +
                    "\n" +
                    "Bakteri C. jejuni adalah penyebab utama dari penyakit yang ditularkan melalui makanan dan/atau keracunan makanan pada manusia.\n" +
                    "\n" +
                    "Beberapa spesies yang termasuk genus Campylobacter yang bisa menimbulkan penyakit yaitu C. jejuni, C. coli, dan C. fetus.\n" +
                    "\n" +
                    "Spesies C. fetus menyebabkan enteritis serta aborsi pada sapi dan domba.\n" +
                    "\n" +
                    "Campylobacter jejuni sering ditemukan pada kotoran hewan yang juga bisa diisolasi dari lalat, burung, unggas, dan ternak.\n" +
                    "\n" +
                    "Terkadang C. jejuni terdapat pada sumber air yang tergenang seperti kolam dan danau.\n" +
                    "\n" +
                    "Infeksi yang disebabkan oleh Campylobacter jejuni disebut sebagai campylobakteriosis, campylobacter enteritis, atau gastroenteritis.\n" +
                    "\n" +
                    "Infeksi C. jejuni lebih sering terjadi pada anak di bawah 5 tahun dan dewasa muda (15-29 tahun).\n" +
                    "\n" +
                    "Penularan C. jejuni terjadi melalui konsumsi daging mentah serta makanan dan air yang terkontaminasi.\n" +
                    "\n" +
                    "Infeksi C. jejuni juga dapat menyebar dari orang yang terinfeksi ke orang lain melalui kontak langsung dengan kulit.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Gejala dan Pengobatan Infeksi Bakteri Campylobacter Jejuni\n" +
                    "\n" +
                    "Tanda dan gejala infeksi campylobacter muncul 2-5 hari setelah mengonsumsi makanan atau cairan yang terkontaminasi.\n" +
                    "\n" +
                    "Masa inkubasi penyakit atau infeksi bakteri C. jejuni bisa berlangsung selama 8-10 hari.\n" +
                    "\n" +
                    "Meskipun individu yang terinfeksi bakteri ini menjadi sangat lemah, namun gejala yang muncul jarang sampai mengancam jiwa.\n" +
                    "\n" +
                    "Gejala umum yang muncul akibat infeksi C. jejuni adalah diare yang berair atau lengket.\n" +
                    "\n" +
                    "Pada kasus infeksi berat, terdapat darah dan sel-sel darah putih pada feses.\n" +
                    "\n" +
                    "Gejala lain dari campylobakteriosis termasuk sakit kepala, mual, pusing, kram perut, nyeri otot, dan demam.\n" +
                    "\n" +
                    "Diagnosis infeksi C. jejuni dilakukan melalui analisis tinja.\n" +
                    "\n" +
                    "Feses orang yang terinfeksi biasanya mengandung bakteri dalam jumlah besar.\n" +
                    "\n" +
                    "Oleh karena itu, bakteri C. jejuni dapat diidentifikasi dengan mengkultur dan memeriksa tinja dengan bantuan mikroskop.\n" +
                    "\n" +
                    "Individu sehat yang terinfeksi C. jejuni dapat sembuh sendiri tanpa dilakukan intervensi terapi.\n" +
                    "\n" +
                    "Pemberian antbiotik untuk mengelola dan memperpendek durasi gejala bisa dilakukan dengan pengawasan medis.\n" +
                    "\n" +
                    "Infeksi Campylobacter dapat menyebabkan komplikasi pada orang-orang dengan sistem kekebalan tubuh yang lemah atau orang dengan masalah kesehatan.\n" +
                    "\n" +
                    "Pada kasus tersebut, dokter mungkin meresepkan obat antibiotik yang tepat untuk pengobatan infeksi C. jejuni.\n" +
                    "\n" +
                    "Komplikasi dari infeksi campylobacter yakni termasuk arthritis dan sindrom Guillain-Barré.\n" +
                    "\n" +
                    "Pada kasus sindrom Guillain-Barré, bakteri memicu sistem kekebalan tubuh untuk menyerang saraf tertentu sehingga mengakibatkan kelumpuhan pada bagian tubuh yang terkena.\n" +
                    "\n" +
                    "Disarankan minum banyak air dan jus buah selama diare berlangsung untuk mengganti cairan tubuh yang hilang serta mencegah dehidrasi."
    };

    TextView tvJudul, tvArtikel;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        getSupportActionBar().setTitle("Hasil Deteksi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvJudul = findViewById(R.id.tv_judul);
        tvArtikel = findViewById(R.id.tv_artikel);
        imageView = findViewById(R.id.image_view);

        int indeks = getIntent().getExtras().getInt("indeks");

        tvJudul.setText("Anda Terkena Penyakit "+dataPenyakit[indeks]);
        imageView.setImageDrawable(getResources().getDrawable(dataImage[indeks]));
        tvArtikel.setText(dataArtikel[indeks]);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
