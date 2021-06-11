package adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.agendaalura.R
import model.Aluno

class AlunosAdapeter(contexto:Context): ArrayAdapter<Aluno>(contexto, 0) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val viewReceptora:View
        if (convertView != null){
            viewReceptora = convertView
        }else{
            //inflar o layout
            //criar layout do item depois
            viewReceptora = LayoutInflater.from(context).inflate(R.layout.lista_view_item, parent, false)
        }

        val item = getItem(position)

        val txt_nome = viewReceptora.findViewById<TextView>(R.id.txt_item_nome)
        val txt_telefone = viewReceptora.findViewById<TextView>(R.id.txt_item_telefone)
        val txt_email = viewReceptora.findViewById<TextView>(R.id.txt_item_email)

        if (item != null) {
            txt_nome.text = item.nome.toString()
        }
        if (item != null) {
            txt_telefone.text = item.telefone.toString()
        }
        if (item != null) {
            txt_email.text = item.email.toString()
        }

//        return super.getView(position, convertView, parent)
        return viewReceptora
    }

}