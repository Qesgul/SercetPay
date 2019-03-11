package org.jizhi.newlover.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import org.jizhi.newlover.BaseActivity;
import org.jizhi.newlover.R;

public class MainActivity extends BaseActivity {
    @BindView(R.id.user_picture)
    ImageView user_pic;
    @BindView(R.id.user_name)
    TextView user_name;
    @BindView(R.id.RecyclerView_main)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(){

    }

    @Override
    protected void initData(){

    }

    @Override
    protected void initEvent(){
        user_pic.setOnClickListener(new ChangePicListener());
        
    }

    class ChangePicListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}
