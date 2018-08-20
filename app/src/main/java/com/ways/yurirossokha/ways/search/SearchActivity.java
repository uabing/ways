package com.ways.yurirossokha.ways.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.ways.yurirossokha.ways.R;

public class SearchActivity extends AppCompatActivity implements SearchContract.SearchView {

    private SearchContract.SearchPresenter searchPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void init() {

    }

    @Override
    public void setPresenter(SearchContract.SearchPresenter presenter) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setFromAddress(String from) {

    }

    @Override
    public void setToAddress(String to) {

    }

    @Override
    public void showErrorMessage() {

    }
}
