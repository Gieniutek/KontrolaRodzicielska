package pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.listeners.FragmentListener;

/**
 * Created by Użytkownik on 25.10.2016.
 */
public class BaseFragment extends Fragment {
    protected FragmentListener fragmentListener;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        if (context instanceof FragmentListener) {
            fragmentListener = (FragmentListener) context;
        }
    }
}
