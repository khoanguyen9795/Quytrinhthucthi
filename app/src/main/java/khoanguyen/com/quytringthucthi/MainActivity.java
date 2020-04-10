package khoanguyen.com.quytringthucthi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEdtSothunhat,mEdtSothuhai;
    Button mBtnReset,mBtnCong,mBntTru,mBtnNhan,BtnChia;
    TextView mTvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSothunhat = findViewById(R.id.edittextSothunhat);
        mEdtSothuhai = findViewById(R.id.edittextSothuhai);
        mBtnReset = findViewById(R.id.buttonReset);
        mBtnCong = findViewById(R.id.buttonCong);
        mBntTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        BtnChia = findViewById(R.id.buttonChia);
        mTvKetqua = findViewById(R.id.textviewKetqua);
        int a = 5;
        a++;
        Log.d("BBB",String.valueOf(a));
    }
}
