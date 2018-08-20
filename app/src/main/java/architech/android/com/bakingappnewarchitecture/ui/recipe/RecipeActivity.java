package architech.android.com.bakingappnewarchitecture.ui.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import architech.android.com.bakingappnewarchitecture.R;

public class RecipeActivity extends AppCompatActivity implements RecipeContract{

    private RecipePresenter mRecipePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipePresenter = new RecipePresenter();
    }
}
