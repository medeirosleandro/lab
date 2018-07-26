package br.com.leandro.recyclerviewsaga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkmmte.pkrss.Article;
import com.pkmmte.pkrss.Callback;
import com.pkmmte.pkrss.PkRSS;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<Article> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.minhaRecyclerviewNoXml);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(adapter);

        PkRSS.with(this).load("http://www.androidpro.com.br/feed/").skipCache().callback(this).async();


    }

    @Override
    public void onPreload() {

    }

    @Override
    public void onLoaded(List<Article> newArticles) {

        list.clear();
        list.addAll(newArticles);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onLoadFailed() {

    }
}
