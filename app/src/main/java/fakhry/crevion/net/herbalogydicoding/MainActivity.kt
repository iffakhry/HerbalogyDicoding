package fakhry.crevion.net.herbalogydicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTumbuhan: RecyclerView
    private var list: ArrayList<Tumbuhan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTumbuhan = findViewById(R.id.rv_tumbuhan) //ada perbedaan dg modul
        rvTumbuhan.setHasFixedSize(true)

        list.addAll(TumbuhanData.listData) //ada perbedaan dg modul
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        setMode(item!!.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }


    private fun showRecyclerList() {
        rvTumbuhan.layoutManager = LinearLayoutManager(this)
        val listTumbuhanAdapter = ListTumbuhanAdapter(list)
        rvTumbuhan.adapter = listTumbuhanAdapter

        //onclick function
        listTumbuhanAdapter.setOnItemClickCallback(object : ListTumbuhanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Tumbuhan) {
                showSelectedTumbuhan(data)

                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("nama", data.nama)
                intent.putExtra("jenis", data.jenis)
                intent.putExtra("gizi", data.kandungan_gizi)
                intent.putExtra("khasiat", data.khasiat)
                intent.putExtra("photo", data.photo)
                startActivity(intent)
            }
        })
    }

    //onclick function. dengan menambahkan onItemClickCallback di Adapter
    private fun showSelectedTumbuhan(tumbuhan: Tumbuhan) {
        Toast.makeText(this, "Kamu memilih " + tumbuhan.nama, Toast.LENGTH_SHORT).show()
    }

}
