package com.gmail.reebrando.navigationdrawer.Fragments;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gmail.reebrando.navigationdrawer.R;

public class FormFragment extends Fragment implements View.OnClickListener {
    private EditText ed1;
    private EditText ed2;
    private TextView txtResult;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;


    public FormFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        ed1 = (EditText) view.findViewById(R.id.edOne);
        ed2 = (EditText) view.findViewById(R.id.edTwo);
        txtResult = (TextView) view.findViewById(R.id.txtResult);
        btnPlus = (Button) view.findViewById(R.id.btnPlus);
        btnMinus = (Button) view.findViewById(R.id.btnMinus);
        btnMultiply = (Button) view.findViewById(R.id.btnMultiply);
        btnDivide = (Button) view.findViewById(R.id.btnDivide);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        double num1 = 0;
        double num2 = 0;
        if (!ed1.getText().toString().isEmpty() && !ed2.getText().toString().isEmpty()) {
            num1 = Double.parseDouble(ed1.getText().toString());
            num2 = Double.parseDouble(ed2.getText().toString());
        }
        else{
            Snackbar.make(v, "Do not screw with me, alright?", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        switch (v.getId()) {
            case R.id.btnPlus:
                txtResult.setText(String.valueOf(num1+num2));
                break;
            case R.id.btnMinus:
                txtResult.setText(String.valueOf(num1-num2));
                break;
            case R.id.btnMultiply:
                txtResult.setText(String.valueOf(num1*num2));
                break;
            case R.id.btnDivide:
                txtResult.setText(String.valueOf(num1/num2));
                break;
            default:
                break;
        }

    }
}
