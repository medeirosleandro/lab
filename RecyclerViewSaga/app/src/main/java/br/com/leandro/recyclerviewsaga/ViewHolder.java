package br.com.leandro.recyclerviewsaga;

import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//ESTA CLASSE IRA REPRESENTAR O LAYOUT ITEM.XML (DO XML PARA O JAVA)

public class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView imagemDestaque;
    public TextView tituloDoPost;
    public TextView descricaoDoPost;
    public AppCompatButton botaoLINK;


    public ViewHolder(View itemView) {
        super(itemView);

        this.imagemDestaque = itemView.findViewById(R.id.imagemDestaque);
        this.tituloDoPost = itemView.findViewById(R.id.tituloDoPost);
        this.descricaoDoPost = itemView.findViewById(R.id.descricaoDoPost);
        this.botaoLINK = itemView.findViewById(R.id.botaoLINK);
    }
}
