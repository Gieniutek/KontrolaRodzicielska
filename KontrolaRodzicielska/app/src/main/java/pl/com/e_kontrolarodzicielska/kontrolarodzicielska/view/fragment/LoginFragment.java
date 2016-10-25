package pl.com.e_kontrolarodzicielska.kontrolarodzicielska.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.com.e_kontrolarodzicielska.kontrolarodzicielska.R;

/**
 * Created by GBAR on 25.10.2016.
 */
public class LoginFragment extends BaseFragment implements View.OnClickListener {

    @BindView(R.id.etLogin)
    EditText etLogin;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.bRegister)
    Button bRegister;
    @BindView(R.id.bLogin)
    Button bLogin;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.login_fragment,container,false);
        ButterKnife.bind(this,view);
        initView();
        return view;
    }

    private void initView(){
        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == bLogin.getId())
            Log.d("OnClick","Login "+etLogin.getText().toString().trim()+"  "+etPassword.getText().toString().trim());
        if(view.getId() == bRegister.getId())
            Log.d("OnClick","Register");
    }
}
