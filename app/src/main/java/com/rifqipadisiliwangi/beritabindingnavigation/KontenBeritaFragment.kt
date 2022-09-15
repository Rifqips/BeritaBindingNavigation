package com.rifqipadisiliwangi.beritabindingnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rifqipadisiliwangi.beritabindingnavigation.databinding.FragmentKontenBeritaBinding


class KontenBeritaFragment : Fragment() {

    lateinit var binding: FragmentKontenBeritaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_konten_berita, container, false)
        binding = FragmentKontenBeritaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = arguments?.getString("title")
        val writer = arguments?.getString("writer")
        val content = arguments?.getString("content")
        val date = arguments?.getString("date")
        val image = arguments?.getInt("image")

        binding.dataBerita = Berita(image !!,writer!!,content!!,date!!,title!!)
    }


}