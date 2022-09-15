package com.rifqipadisiliwangi.beritabindingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.rifqipadisiliwangi.beritabindingnavigation.databinding.FragmentBeritaBinding


class BeritaFragment : Fragment() {

    lateinit var binding: FragmentBeritaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        cara root by binding di fragment
        binding = FragmentBeritaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listBerita = arrayListOf(
            Berita(R.drawable.ic_berita,"\"BUMN Pupuk Geber Inovasi Biar Pendapatan Makin 'Gemuk', Begini Caranya\"","Ardan Adhi Chandra","08-10-2022","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. "),
            Berita(R.drawable.ic_berita,"\"BUMN Pupuk Geber Inovasi Biar Pendapatan Makin 'Gemuk', Begini Caranya\"","Ardan Adhi Chandra","08-10-2022","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. "),
            Berita(R.drawable.ic_berita,"\"BUMN Pupuk Geber Inovasi Biar Pendapatan Makin 'Gemuk', Begini Caranya\"","Ardan Adhi Chandra","08-10-2022","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. "),
            Berita(R.drawable.ic_berita,"\"BUMN Pupuk Geber Inovasi Biar Pendapatan Makin 'Gemuk', Begini Caranya\"","Ardan Adhi Chandra","08-10-2022","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. "),
            Berita(R.drawable.ic_berita,"\"BUMN Pupuk Geber Inovasi Biar Pendapatan Makin 'Gemuk', Begini Caranya\"","Ardan Adhi Chandra","08-10-2022","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. "),
        )

        binding.rvKontent.adapter = BeritaAdapter(listBerita)
        binding.rvKontent.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
    }
}