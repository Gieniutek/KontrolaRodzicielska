package pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.R;
import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.fragment.LoginFragment;
import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.listeners.FragmentListener;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    private Fragment currentFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            currentFragment = new LoginFragment();
            changeFragment(currentFragment, true);
        }
    }

    @Override
    public void changeFragment(Fragment fragment, Boolean shouldRemoveStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (shouldRemoveStack){
            transaction.replace(R.id.main_framgent, fragment);

        }
        else{
            transaction.replace(R.id.main_framgent, fragment)
                    .addToBackStack(null);

        }
        transaction.commit();
    }

    @Override
    public void popFragment() {

    }

    @Override
    public void hideKeyboard() {

    }
}
