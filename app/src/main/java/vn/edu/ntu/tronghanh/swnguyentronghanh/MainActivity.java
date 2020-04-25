package vn.edu.ntu.tronghanh.swnguyentronghanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edtNhap1, edtNhap2, edtNhap3;
    RadioGroup rdGioiTinh;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddView();
        AddEvents();
    }
    private void AddView()
    {
        edtNhap1 = findViewById(R.id.edtNhap1);
        edtNhap2 = findViewById(R.id.edtNhap2);
        edtNhap3 = findViewById(R.id.edtNhap3);
        rdGioiTinh = findViewById(R.id.rdGioiTinh);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    private void AddEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) 
            {
                KetQua();
            }
        });
    }
    private void KetQua()
    {

    }
}
