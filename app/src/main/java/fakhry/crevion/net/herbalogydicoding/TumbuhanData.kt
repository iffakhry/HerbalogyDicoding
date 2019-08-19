package fakhry.crevion.net.herbalogydicoding

/**
 * Created by Fakhry on 2019-08-13.
 */
object TumbuhanData {
    private var data = arrayOf(
        arrayOf(
            "Alpukat",
            "Buah",
            "Vitamin B, Vitamin C, Zat Besi, Kalsium, Fosfor, Lemak Baik",
            "Memperlancar sistem kardiovaskular, Meminimalisir inflamasi pada sistem pencernaan dan dinding perut",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/Tanaman-Herbal-2.jpg"
        ),

        arrayOf(
            "Pepaya",
            "Buah",
            "Vitamin C,Vitamin B1, Vitamin B3, Vitamin B5, Vitamin E, Vitamin K,Likopen, Serat, Kalsium, Potasium, Folat, Magnesium",
            "Menyehatkan Mata, Memperlancar Pencernaan, Menyehatkan rambut dan kuku, Memelihara kesehatan kulit, Menjaga kesehatan jantung, Mengurangi risiko kanker, Meningkatkan sistem kekebalan tubuh",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/Tanaman-Herbal-3.jpg"
        ),
        arrayOf(
            "Jeruk Nipis",
            "Buah",
            "Vitamin C, Antioksidan",
            "Membunuh bakteri, Menyembuhkan jerawat, Menjaga kesehatan dinding arteri,",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/Tanaman-Herbal-4.jpg"
        ),
        arrayOf(
            "Belimbing",
            "Buah",
            "Vitamin C, Vitamin A, Kandungan Air, Asam Osalat, Antioksidan alami, Magnesium, Potasium, Fosfor, Betakaroten",
            "Sifat Antioksidan, Sumber serat yang tidak larut dalam air, Efek penurun kolesterol, Anti Inflamasi dan Anti Mikroba",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/Tanaman-Herbal-5.jpg"
        ),
        arrayOf(
            "Mengkudu",
            "Buah",
            "Kalium",
            "Meningkatkan stamina tubuh, Mengurangi mual pasca operasi, Menurunkan tekanan darah tinggi, Meredakan osteoarthristis",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/Tanaman-Herbal-6.jpg"
        ),
        arrayOf(
            "Kunyit",
            "Rempah-Rempah",
            "Zat Besi, Vitamin C, Vitamin B-6, Magnesium",
            "Menghilangkan bau badan, Membunuh virus, Menurunkan tekanan darah tinggi, Menyembuhakn radang gusi, Membantu mengembalikan siklus menstruasi, Mengurangi rasa gatal, Meredakan demam",
            "https://doktersehat.com/wp-content/uploads/2018/08/manfaat-kunyit-bagi-kesehatan.jpg"
        ),
        arrayOf(
            "Kencur",
            "Rempah-Rempah",
            "Zat Besi, Vitamin C, Vitamin B-6, Magnesium",
            "Meredakan sakit kepala, masuk angin, batuk, flu, Meredakan sakit perut karena mulas dan diare, Mengobati keseleo, Membersihkan darah kotor, Mencegah batu ginjal",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/kencur-drsakitkepalacom.jpg"
        ),
        arrayOf(
            "Kayu Manis",
            "Rempah-Rempah",
            "Anti Inflamasi, Anti Infeksi, Anti Mikroba, Antioksidan, Polifenol, Zat Besi, Kalsium, Mangaan",
            "Mencegah sakit jantung, Mencegah kanker, Mengurangi peradangan (sendi dll), Meringankan perut kembung, Mengurangi rasa nyeri akibat reumatik, Mengobati infeksi saluran pernafasan",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/pertanian99com.jpg"
        ),
        arrayOf(
            "Jintan Hitam",
            "Rempah-Rempah",
            "thymoquinone",
            "Pereda nyeri (Analgesik), Anti bakteri, radang, maag, hipertensi, bakteri, virus, jamur, Menangkal gangguan imun, Obat diabetes, kanker usus besar, anomali pada saluran pencernaan, alergi dan juga asma",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/pertanian99com1.jpg"
        ),
        arrayOf(
            "Kapulaga",
            "Rempah-Rempah",
            "Karbohidrat, Protein",
            "Mengatasi Hipertensi, Melancarkan sirkulasi darah, Mengatasi susah buang air besar, Mengobati gangguan pencernaan",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/faunadanfloracom.jpg"
        ),
        arrayOf(
            "Jahe",
            "Rempah-Rempah",
            "Karbohidrat, Protein, Kalori, Air, Gula, Serat",
            "Meringankan nyeri perut saat menstruasi, Mengatasi sakit perut, diare, muntah, dan mual saat hamil, Meredakan nyari dada, sakit punggung bawah, dan nyeri otot, Mengobati masalah infeksi pada saluran pernafasan bagian atas",
            "https://res.cloudinary.com/de5lnco7h/image/upload/v1531745683/jahe_zuuucw.jpg"
        ),
        arrayOf(
            "Temulawak",
            "Rempah-Rempah",
            "Protein, Serat",
            "Mengatasi pegal badan, Sebagai obat masalah perut seperti maag, kembung dan diare, Membantu pencegahan penggumpalan, Anti radang, Obat sakit kuning",
            "https://blogpictures.99.co/wp-content/uploads/2018/07/temulawak-floweriancom.jpg"
        )
    )

    val listData: ArrayList<Tumbuhan>
        get() {
            val list = ArrayList<Tumbuhan>()
            for (aData in data) {
                val tumbuhan = Tumbuhan()
                tumbuhan.nama = aData[0]
                tumbuhan.jenis = aData[1]
                tumbuhan.kandungan_gizi = aData[2]
                tumbuhan.khasiat = aData[3]
                tumbuhan.photo = aData[4]
                list.add(tumbuhan)
            }
            return list
        }
}