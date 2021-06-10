package ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.agendaalura.R

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)

        val campoNome: EditText = findViewById(R.id.activity_formulario_aluno_nome)
        val campoTelefone: EditText = findViewById(R.id.activity_formulario_aluno_telefone)
        val campoEmail: EditText = findViewById(R.id.activity_formulario_aluno_email)


        val botaoSalvar: Button = findViewById(R.id.activity_formulario_btn_salvar)
        botaoSalvar.setOnClickListener {

            val nome: String = campoNome.text.toString()
            val telefone: String = campoTelefone.text.toString()
            val email: String = campoEmail.text.toString()

            Toast.makeText(this, "$nome - $telefone - $email", Toast.LENGTH_SHORT).show()

//            startActivity(Intent(this@FormularioAlunoActivity,MainActivity::class.java))
            finish()
        }


    }
}