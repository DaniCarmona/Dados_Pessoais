package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val INFO_EXTRA_NOME = "NOME"
        const val INFO_EXTRA_EMAIL = "EMAIL"
        const val INFO_EXTRA_TELEFONE = "TELEFONE"
        const val INFO_EXTRA_IDADE = "IDADE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarDados(view: View) {
        val editTextNome= findViewById<EditText>(R.id.EditTextNome)
        val nome = editTextNome.text.toString()
        val editTextEmail= findViewById<EditText>(R.id.EditTextEmail)
        val email = editTextEmail.text.toString()
        val editTextTelefone = findViewById<EditText>(R.id.EditTextTelefone)
        val telefone = editTextTelefone.text.toString()
        //Normalmente deve ser pedida a data de nascimento e não a idade
        val editTextIdade= findViewById<EditText>(R.id.EditTextIdade)
        val idade = editTextIdade.text.toString().toIntOrNull()

        var dadosCorretos = true

        if(nome.isBlank()){
            editTextNome.error = getString(R.string.nome_obrigatorio)
            dadosCorretos = false
        }
        if(email.isBlank()){
            editTextEmail.error = getString(R.string.email_obrigatorio)
            dadosCorretos = false
        }
        if(telefone.isBlank()){
            editTextTelefone.error = getString(R.string.telefone_obrigatorio)
            dadosCorretos = false
        }
        if(idade == null ){
            editTextIdade.error = getString(R.string.idade_obrigatoria)
            dadosCorretos = false
        }

        if(dadosCorretos) {

            val intent = Intent(this, MostraDadosActivity::class.java).apply {
                putExtra(INFO_EXTRA_NOME, nome)
                putExtra(INFO_EXTRA_EMAIL, email)
                putExtra(INFO_EXTRA_TELEFONE, telefone)
                putExtra(INFO_EXTRA_IDADE, idade)
            }


            startActivity(intent)
        }
    }
}