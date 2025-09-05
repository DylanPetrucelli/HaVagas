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

        binding.fundamentalCb.setOnClickListener {
            if (binding.fundamentalEt.isGone) {
                binding.fundamentalEt.visibility = View.VISIBLE
            }
            else {
                binding.fundamentalEt.visibility = View.GONE
            }
        }

        binding.medioCb.setOnClickListener {
            if (binding.medioEt.isGone) {
                binding.medioEt.visibility = View.VISIBLE
            }
            else {
                binding.medioEt.visibility = View.GONE
            }
        }

        binding.gradCb.setOnClickListener {
            if (binding.gradEtAno.isGone) {
                binding.gradEtAno.visibility = View.VISIBLE
                binding.gradEtInst.visibility = View.VISIBLE
            }
            else {
                binding.gradEtAno.visibility = View.GONE
                binding.gradEtInst.visibility = View.GONE
            }
        }

        binding.espCb.setOnClickListener {
            if (binding.espEtAno.isGone) {
                binding.espEtAno.visibility = View.VISIBLE
                binding.espEtInst.visibility = View.VISIBLE
            }
            else {
                binding.espEtAno.visibility = View.GONE
                binding.espEtInst.visibility = View.GONE
            }
        }

        binding.mestCb.setOnClickListener {
            if (binding.mestEtAno.isGone) {
                binding.mestEtAno.visibility = View.VISIBLE
                binding.mestEtInst.visibility = View.VISIBLE
                binding.mestEtTitulo.visibility = View.VISIBLE
                binding.mestEtOrientador.visibility = View.VISIBLE
            }
            else {
                binding.mestEtAno.visibility = View.GONE
                binding.mestEtInst.visibility = View.GONE
                binding.mestEtTitulo.visibility = View.GONE
                binding.mestEtOrientador.visibility = View.GONE
            }
        }

        binding.docCb.setOnClickListener {
            if (binding.docEtAno.isGone) {
                binding.docEtAno.visibility = View.VISIBLE
                binding.docEtInst.visibility = View.VISIBLE
                binding.docEtTitulo.visibility = View.VISIBLE
                binding.docEtOrientador.visibility = View.VISIBLE
            }
            else {
                binding.docEtAno.visibility = View.GONE
                binding.docEtInst.visibility = View.GONE
                binding.docEtTitulo.visibility = View.GONE
                binding.docEtOrientador.visibility = View.GONE
            }
        }

        binding.limparBt.setOnClickListener {
            binding.nomeEt.setText("")
            binding.emailEt.setText("")
            binding.emailCb.isChecked = false
            binding.telefoneEt.setText("")
            binding.telefoneRb1.isChecked = false
            binding.telefoneRb2.isChecked = false
            binding.celularCb.isChecked = false
            binding.celularEd.setText("")
            binding.fundamentalCb.isChecked = false
            binding.medioCb.isChecked = false
            binding.gradCb.isChecked = false
            binding.espCb.isChecked = false
            binding.mestCb.isChecked = false
            binding.docCb.isChecked = false
            binding.fundamentalEt.setText("")
            binding.medioEt.setText("")
            binding.gradEtAno.setText("")
            binding.gradEtInst.setText("")
            binding.espEtAno.setText("")
            binding.espEtInst.setText("")
            binding.mestEtAno.setText("")
            binding.mestEtTitulo.setText("")
            binding.mestEtInst.setText("")
            binding.mestEtOrientador.setText("")
            binding.docEtAno.setText("")
            binding.docEtTitulo.setText("")
            binding.docEtTitulo.setText("")
            binding.docEtOrientador.setText("")
            binding.interesseEt.setText("")
        }
    }
}