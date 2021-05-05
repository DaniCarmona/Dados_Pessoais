package pt.ipg.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostraDadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_dados)


        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val email = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA)
        val telefone = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA)
        val idade = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA)

        val textViewNome= findViewById<TextView>(R.id.textViewNome)
        val textViewEmail= findViewById<TextView>(R.id.textViewEmail)
        val textViewTelefone = findViewById<TextView>(R.id.textViewTelefone)
        val textViewIdade= findViewById<TextView>(R.id.textViewIdade)
        textViewMensagem.setText(mensagem)
        textViewMensagem.setText(data.toString())
    }
}