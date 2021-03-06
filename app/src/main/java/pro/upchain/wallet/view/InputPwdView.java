package pro.upchain.wallet.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import pro.upchain.wallet.R;


public class InputPwdView extends FrameLayout {
    private EditText password;

    public InputPwdView(@NonNull Context context, View.OnClickListener onClickListener) {
        super(context);

        LayoutInflater.from(getContext())
                .inflate(R.layout.layout_input_password, this, true);
        password = (EditText)findViewById(R.id.password);

        findViewById(R.id.send_button).setOnClickListener(onClickListener);
    }



    public String getPassword() {
        return password.getText().toString();
    }

    public void showKeyBoard() {
        password.requestFocus();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        showKeyBoard();
    }
}
