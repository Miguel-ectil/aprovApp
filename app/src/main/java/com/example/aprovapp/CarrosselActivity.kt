package br.com.estudos.ap1

import CarrosselAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aprovapp.R
import com.example.aprovapp.databinding.ActivityCarrosselBinding
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.carousel.CarouselSnapHelper

class CarrosselActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarrosselBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarrosselBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = CarouselLayoutManager()
        CarouselSnapHelper().attachToRecyclerView(binding.recyclerView)

        val imageList = mutableListOf<Int>(
            R.drawable.imagem1,
            R.drawable.imagem2
        )

        val titleList = listOf(
            "Eder - 2401914",
            "Luiza",
            "Miguel",
            "Pedro"
        )

        val adapter = CarrosselAdapter(imageList, titleList)
        binding.recyclerView.adapter = adapter
    }

}