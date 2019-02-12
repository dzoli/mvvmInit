package com.example.viewmodelinit;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<List<Article>> articles;
    public LiveData<List<Article>> getArticles() {
        if (articles == null) {
            articles = new MutableLiveData<List<Article>>();
            loadArticles();
        }
        return articles;
    }

    private void loadArticles() {
        // do async operation to fetch articles
    }


}
