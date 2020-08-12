package com.example.tugas_uas_akb_if3_10117091.Database;

import android.content.Context;

/** NIM : 10117091
 * Nama : Dida Handian
 * Kelas : IF-3
 * Tanggal : 10-08-2020
 **/

public class ListInsert {

    private static DatabaseHelper databaseHelper;

    public ListInsert(Context context){

        databaseHelper = new DatabaseHelper(context);
        //      Log.d("insert", "inserting data");
        databaseHelper.save(new TourPlace(1, "Tebing Keraton Bandung",
                "Kampung Ciharegem Puncak, Desa Ciburial, Bandung, Jawa Barat, Indonesia",
                "05.00 – 18.00 WIB",
                "Tebing keraton bandung merupakan tempat wisata yang baru dikenal akhir-akhir ini." +
                        "Tempat ini dikenal awalnya dari media sosial, " +
                        "hingga akhirnya berkembang jadi tempat wisata alam yang unik.",
                "https://www.nativeindonesia.com/wp-content/uploads/2015/09/tebing-keraton-bandung-di-dago.jpg",
                "-6.834154", "107.663661"));

        databaseHelper.save(new TourPlace(2, "Dusun Bambu Lembang",
                "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "08.00 – 23.00 WIB",
                "Dusun Bambu cocok sekali menjadi tujuan wisata keluarga di Bandung. " +
                        "Di dusun bambu terdapat berbagai area permainan, restoran, cafe, dan pujasera dengan berbagai pilihan kuliner, taman bunga, villa dan glamping, dan lain-lain. " +
                        "Jika anda berwisata ke Lembang, tempat ini sayang untuk anda lewatkan tempat rekreasi yang satu ini.",
                "https://media-cdn.tripadvisor.com/media/photo-s/14/5f/db/66/dusun-bambu-adalah-salah.jpg   ",
                "-6.789506", "107.578840"));

        databaseHelper.save(new TourPlace(3, "Gunung Tangkuban Perahu",
                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "07.00 – 17.00 WIB",
                "Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. " +
                        "Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, " +
                        "gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.",
                "https://www.nativeindonesia.com/wp-content/uploads/2014/09/kawah-tangkuban-perahu-2.jpg",
                "-6.760355", "107.609658"));

        databaseHelper.save(new TourPlace(4, "Floating Market Lembang",
                "Jl. Grand Hotel No.33E, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "09.00 - 19.00 WIB",
                "Floating Market Lembang wajib untuk anda kunjungi jika berlibur ke Bandung. " +
                        "Berada di daerah Lembang, suasananya adem banget." +
                        "Di Floating market anda bisa menemukan berbagai wahana permainan, kuliner, dan spot indah untuk berfoto. Tempat ini sudah populer sebelum dusun bambu ataupun floating market beroperasi.",
                "https://lokawisatabandung.com/wp-content/uploads/2019/08/floating-market-lembang-bandung.jpg",
                "-6.818574", "107.617946"));

        databaseHelper.save(new TourPlace(5, "Orchid Forest Cikole Lembang",
                "Genteng, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "09 - 18.00 WIB",
                "Salah satu tempat hits di Bandung nih. Orchid Forest Cikole merupakan tempat wisata sekaligus budidaya anggrek yang keren banget.  " +
                        "Di sini terdapat banyap tempat berfoto yang epic, dan pastinya bakal nge hits kalau di upload ke medsos. " +
                        "Selain itu juga, terdapat berbagai koleksi anggrek yang indah. Koleksi anggrek yang dimiliki oleh Orchid Forest Cikole termasuk yang terbesar di Indonesia lho.",
                "https://www.pegipegi.com/travel/wp-content/uploads/2019/03/1-11.jpg",
                "-6.780509", "107.637476"));

        databaseHelper.save(new TourPlace(5, "Orchid Forest Cikole Lembang",
                "Genteng, Cikole, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "09 - 18.00 WIB",
                "Salah satu tempat hits di Bandung nih. Orchid Forest Cikole merupakan tempat wisata sekaligus budidaya anggrek yang keren banget.  " +
                        "Di sini terdapat banyap tempat berfoto yang epic, dan pastinya bakal nge hits kalau di upload ke medsos. " +
                        "Selain itu juga, terdapat berbagai koleksi anggrek yang indah. Koleksi anggrek yang dimiliki oleh Orchid Forest Cikole termasuk yang terbesar di Indonesia lho.",
                "https://www.pegipegi.com/travel/wp-content/uploads/2019/03/1-11.jpg",
                "-6.780509", "107.637476"));

        databaseHelper.save(new TourPlace(6, "De Ranch Lembang",
                "Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "09 - 17.00 WIB",
                "Salah satu tempat wisata keluarga di Lembang, De Ranch menawarkan konsep yang beda dengan yang lain. Disini kita disuguhi siasana western ala koboy yang asik banget.  " +
                        "Anda bisa menaiki kuda dengan instruktur terlatih, dan juga menikmati berbagai wahana yang ada disini. " +
                        "Pastinya ini bakal menjadi pengalaman baru buat si kecil.",
                "https://www.nativeindonesia.com/wp-content/uploads/2018/03/wahana-kuda-de-ranch-bandung.jpg",
                "-6.815156", "107.626675"));

        databaseHelper.save(new TourPlace(7, "The Lodge Maribaya Bandung",
                "Jalan Maribaya No. 149/252 RT. 03 / RW. 15 Babakan, Gentong, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "09 - 17.00 WIB",
                "Berada di kawasan Cibodas Lembang, The Lodge Maribaya bisa dikatakan salah satu tempat favorit di Lembang saat ini. " +
                        "Di tempat ini kita bisa menikmati suasana indah hutan pinus, dan berbagai tempat untuk selfie yang keren banget. " +
                        "Beberapa yang paling sering muncul di timeline seperti spot selfie berupa ayunan dengan background hutan pinus, dan juga balon udara.",
                "https://i.ytimg.com/vi/bwjOvT1loX4/maxresdefault.jpg",
                "-6.829423", "107.687469"));

        databaseHelper.save(new TourPlace(8, "Taman Hutan Raya Ir. H. Djuanda",
                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198",
                "07.00 - 17.00 WIB",
                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. " +
                        "Di tempat yang merupakan taman hutan raya pertama di Indonesia ini terdapat kurang lebih 2500 jenis tanaman.",
                "https://www.nativeindonesia.com/wp-content/uploads/2017/11/1.jpg",
                "-6.856595", "107.632647"));

    }



}
