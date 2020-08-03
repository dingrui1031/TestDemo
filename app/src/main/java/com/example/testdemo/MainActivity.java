package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.qcc.jump.OnOpenAppListener;
import com.qcc.jump.QccHelper;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    EditText et = findViewById(R.id.et);
    ScrollView scrollView = findViewById(R.id.scrollView);
    LinearLayout llBottom = findViewById(R.id.ll_bottom);
    et.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        llBottom.setVisibility(View.GONE);
      }
    });
  }

  public void showSoftInput(View view) {
    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    if (!imm.isActive()) {
      imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }
  }

}
