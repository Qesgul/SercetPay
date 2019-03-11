package org.jizhi.newlover;

import android.os.Bundle;
import org.jizhi.newlover.presenter.BasicPresenter;


public abstract class MVPBaseActivity<V, P extends BasicPresenter> extends BaseActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        mPresenter.attachView((V) this);
    }

    protected abstract void initPresenter();

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }
}
