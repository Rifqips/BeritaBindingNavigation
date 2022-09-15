package com.rifqipadisiliwangi.beritabindingnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.rifqipadisiliwangi.beritabindingnavigation.databinding.ItemBeritaBinding

class BeritaAdapter (var listBerita : ArrayList<Berita>):RecyclerView.Adapter<BeritaAdapter.ViewHolder>(){

    class ViewHolder(val binding: ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun dataBind(itemData : Berita){
            binding.dataBerita = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(listBerita[position])
        val title = listBerita[position].title
        val writer = listBerita[position].writer
        val content = listBerita [position].content
        val date = listBerita[position].date
        val image = listBerita[position].image
        holder.binding.cvContent.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val bun = Bundle()
                bun.putString("title",title)
                bun.putString("writer",writer)
                bun.putString("content", content)
                bun.putString("date",date)
                bun.putInt("image",image)

                Navigation.findNavController(holder.itemView).navigate(R.id.action_beritaFragment_to_kontenBeritaFragment,bun)

            }
        })
    }


    override fun getItemCount(): Int {
        return listBerita.size
    }

}