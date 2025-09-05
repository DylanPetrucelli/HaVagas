package br.edu.ifsp.scl.ads.prdm.sc3039226.havagas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.ads.prdm.sc3039226.havagas.databinding.ActivityMainBinding
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setContentView(binding.root)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.celularCb.setOnClickListener {
            if (binding.celularEd.isGone) {
                binding.celularEd.visibility = View.VISIBLE
            }
            else {
                binding.celularEd.visibility = View.GONE;
            }
        }


    }
}