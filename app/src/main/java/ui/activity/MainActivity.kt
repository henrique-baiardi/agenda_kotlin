package ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.agendaalura.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import model.Aluno

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Lista de alunos")

        Toast.makeText(this, "Hellow!", Toast.LENGTH_SHORT).show()

        val contatos: MutableList<Aluno> = mutableListOf(
//            "Alex", "Henri", "Lety","Oi moh"
        )

        val listaContatos: ListView = findViewById(R.id.activity_layout_lista_alunos)
        listaContatos.adapter = ArrayAdapter<Aluno>(this,android.R.layout.simple_list_item_1,contatos)

        val botaoNovoAluno: FloatingActionButton = findViewById(R.id.activity_btn_novo_aluno)
        botaoNovoAluno.setOnClickListener{
            val destinoActivity = Intent(this, FormularioAlunoActivity::class.java)
            startActivity(destinoActivity)
        }
    }

    override fun onResume() {
        super.onResume()
    }
}