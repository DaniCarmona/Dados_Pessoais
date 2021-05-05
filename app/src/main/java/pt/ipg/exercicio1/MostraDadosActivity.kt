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


        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)
        val email = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        val telefone = intent.getStringExtra(MainActivity.INFO_EXTRA_TELEFONE)
        val idade = intent.getIntExtra(MainActivity.INFO_EXTRA_IDADE, 0)

        val textViewNome= findViewById<TextView>(R.id.textViewNome)
        val textViewEmail= findViewById<TextView>(R.id.textViewEmail)
        val textViewTelefone = findViewById<TextView>(R.id.textViewTelefone)
        val textViewIdade= findViewById<TextView>(R.id.textViewIdade)
        textViewNome.setText(nome)
        textViewEmail.setText(email)
        textViewTelefone.setText(telefone)
        textViewIdade.setText(idade)
    }
}