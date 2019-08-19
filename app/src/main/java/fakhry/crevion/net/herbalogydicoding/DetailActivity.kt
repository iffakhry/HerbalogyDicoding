package fakhry.crevion.net.herbalogydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setActionBarTitle("Detail")

        val nama = intent.getStringExtra("nama")
        val jenis = intent.getStringExtra("jenis")
        val gizi = intent.getStringExtra("gizi")
        val khasiat = intent.getStringExtra("khasiat")
        val photo = intent.getStringExtra("photo")

        var imgPhoto: ImageView = findViewById(R.id.img_tumbuhan)

        tv_nama_tumbuhan.text = nama
        tv_jenis.text = jenis
        tv_isi_gizi.text = gizi
        tv_isi_khasiat.text = khasiat

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(300,200))
            .into(imgPhoto)

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
