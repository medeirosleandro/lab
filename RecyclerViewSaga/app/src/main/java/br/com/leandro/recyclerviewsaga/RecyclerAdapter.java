package br.com.leandro.recyclerviewsaga;

//ESTA CLASSE QUE PEGA OS ITENS E EXIBE NA TELA

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkmmte.pkrss.Article;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter <ViewHolder> {

    //RECEBENDO POR PARAMENTROS A LISTA DE ARTIGOS: Biblioteca externa

    private List<Article> list;

    public RecyclerAdapter (List<Article> list){

        this.list = list;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        //NESTE METODO EU FAÇO UM DE/PARA DAS MINHAS INFORMAÇÕES DO ITEM.XML COM A BIBLIOTECA

        final Article article = list.get(position);

        holder.tituloDoPost.setText(article.getTitle());
        holder.descricaoDoPost.setText(article.getAuthor());
        new TrazendoAsImagens(holder.imagemDestaque).execute(article.getEnclosure().getUrl());
        holder.botaoLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, article.getSource());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
