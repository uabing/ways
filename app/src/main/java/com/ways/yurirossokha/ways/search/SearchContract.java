package com.ways.yurirossokha.ways.search;

import com.ways.yurirossokha.ways.BasePresenter;
import com.ways.yurirossokha.ways.BaseView;

/**
 * This interface describes behavior between View-Presenter-View
 */

public interface SearchContract {
    interface SearchView extends BaseView<SearchPresenter> {
        void showProgress();

        void hideProgress();

        void setFromAddress(String from);

        void setToAddress(String to);

        void showErrorMessage();
    }

    interface SearchPresenter extends BasePresenter {
        void calculateWay();
    }
}
