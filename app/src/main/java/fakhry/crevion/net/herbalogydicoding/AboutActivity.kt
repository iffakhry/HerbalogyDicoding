package fakhry.crevion.net.herbalogydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var imgPhoto: ImageView = findViewById(R.id.img_photo)

        Glide.with(this)
            .load(R.drawable.fakhry)
            .apply(RequestOptions().override(200,200))
            .into(imgPhoto)

        setActionBarTitle("About")
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
