package pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.listeners;

import android.support.v4.app.Fragment;

/**
 * Created by GBAR on 24.10.2016.
 */
public interface FragmentListener {

    void changeFragment(Fragment fragment, Boolean shouldRemoveStack);
    void popFragment();
    void hideKeyboard();
}
