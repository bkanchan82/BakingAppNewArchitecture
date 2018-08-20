package architech.android.com.bakingappnewarchitecture.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import architech.android.com.bakingappnewarchitecture.R;

public class MainActivity extends AppCompatActivity implements MainContract{

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter = new MainPresenter();

    }
}
