package fakhry.crevion.net.herbalogydicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * Created by Fakhry on 2019-08-13.
 */
class ListTumbuhanAdapter (private val listTumbuhan: ArrayList<Tumbuhan>) : RecyclerView.Adapter<ListTumbuhanAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Tumbuhan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_tumbuhan, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTumbuhan.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nama = listTumbuhan[position].nama
        val jenis = listTumbuhan[position].jenis
        val photo = listTumbuhan[position].photo

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)

        holder.tvNama.text = nama
        holder.tvJenis.text = jenis

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTumbuhan[position]) }
    }


    inner class ListViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvJenis: TextView = itemView.findViewById(R.id.tv_item_jenis)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}