package com.example.todomobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todomobile.databinding.CardLayoutBinding
import com.example.todomobile.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefasViewHolder> (){

   private var listTarefa = emptyList<Tarefa>()

    class TarefasViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefasViewHolder {

        return TarefasViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))

    }

    override fun onBindViewHolder(holder: TarefasViewHolder, position: Int) {

    val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria
    }

    override fun getItemCount(): Int {

    return listTarefa.size

    }

    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }

}