package vn.edu.ntu.tronghanh.swnguyentronghanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNhap1, edtNhap2, edtNhap3;
    RadioGroup rdGioiTinh;
    RadioButton rbNam, rbNu;
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
        rbNam = findViewById(R.id.rbNam);
        rbNu = findViewById(R.id.rbNu);
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
                thucHien();
            }
        });
    }
    private void thucHien()
    {
        Context context = getApplicationContext();
        String KetQua = "";
        KetQua += "Tên : " + edtNhap1.getText().toString();
        KetQua += "\nNgày Sinh : " + edtNhap2.getText().toString();
        switch (rdGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam :  KetQua += "\nGiới Tính : Nam"; break;
            case R.id.rbNu :  KetQua += "\nGiới Tính : Nữ"; break;
        }
        KetQua += checkBox();
        Toast.makeText(MainActivity.this, KetQua, Toast.LENGTH_SHORT).show();
    }
    private String checkBox()
    {
        String KetQua="";
        CheckBox [] arrCb = new CheckBox[]{cb1, cb2, cb3, cb4, cb5};
        for(int i = 0; i < arrCb.length; i++)
        {
            if(arrCb[i].isChecked())
            {
                KetQua += arrCb[i].getText().toString() + "; ";
            }
        }
        KetQua += edtNhap3.getText();
        return KetQua;
    }
}
