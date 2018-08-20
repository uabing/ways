package com.ways.yurirossokha.ways.search;


import com.ways.yurirossokha.ways.BaseView;

public class SearchPresenter implements SearchContract.SearchPresenter {

    private SearchContract.SearchView searchView;

    @Override
    public void subscribe(BaseView view) {
        searchView = (SearchContract.SearchView) view;
    }


    @Override
    public void unsubscribe() {

    }

    @Override
    public void calculateWay() {
        searchView.showProgress();
    }
}
