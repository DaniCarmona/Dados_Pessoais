package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val INFO_EXTRA_NOME = "MENSAGEM"
        const val INFO_EXTRA_EMAIL = "DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaDados(view: View) {
        val editTextNome= findViewById<EditText>(R.id.EditTextNome)
        val nome = editTextNome.text.toString()
        val editTextEmail= findViewById<EditText>(R.id.EditTextEmail)
        val email = editTextEmail.text.toString()
        val editTextTelefone = findViewById<EditText>(R.id.EditTextTelefone)
        val telefone = editTextTelefone.text.toString()
        val editTextIdade= findViewById<EditText>(R.id.EditTextIdade)
        val idade = editTextIdade.text.toString()


        /*if(mensagem.trim().isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }*/

        val intent = Intent(this, MostraMensagemActivity::class.java).apply {
            putExtra(INFO_EXTRA_NOME, nome )
            putExtra(INFO_EXTRA_EMAIL, email)
        }


        startActivity(intent)
    }
}