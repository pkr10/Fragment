package com.example.rok.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rok on 2017. 4. 4..
 */

public class MainFragement extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow =  new SimpleDateFormat("yyyy/MM/dd HH:MM");
    String formatDate = sdfNow.format(date);
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.mainfragment,null);
        b1 = (Button)view.findViewById(R.id.button1);
        b2 = (Button)view.findViewById(R.id.button2);
        b3 = (Button)view.findViewById(R.id.button3);
        b4 = (Button)view.findViewById(R.id.button4);
        b5 = (Button)view.findViewById(R.id.button5);
        b6 = (Button)view.findViewById(R.id.button7);
        b7 = (Button)view.findViewById(R.id.button6);
        b8 = (Button)view.findViewById(R.id.button8);
        t1 = (TextView)view.findViewById(R.id.t1);
        t2 = (TextView)view.findViewById(R.id.t2);
        t3 = (TextView)view.findViewById(R.id.t3);
        t4 = (TextView)view.findViewById(R.id.t4);
        t5 = (TextView)view.findViewById(R.id.t5);
        t6 = (TextView)view.findViewById(R.id.t6);
        final data a = new data();
    b1.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View v) {
                                  a.getdata("포도테이블");
                                  a.getdata("");
                                  a.getdata("");
                                  a.getdata("");
                                  a.getdata("");
                                  a.getdata("");
                                  t1.setText(a.returndata(0));
                                  t2.setText(a.returndata(1));
                                  t3.setText(a.returndata(2));
                                  t4.setText(a.returndata(3));
                                  t5.setText(a.returndata(4));
                                  t6.setText(a.returndata(5));

                                  if(t2.getText().toString().matches("")){
                                      Toast.makeText(getContext(),"정보가없습니다",Toast.LENGTH_LONG).show();
                                  }
                                  b5.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(final View v) {

                                          View dlgview = View.inflate(getContext(), R.layout.box, null);
                                          final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                                          final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                                          final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                                          final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                                          AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                                          dlg.setTitle("새주문");
                                          dlg.setView(dlgview);
                                          dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                              @Override
                                              public void onClick(DialogInterface dialog, int which) {
                                                  Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View v) {
                                                          int spa = Integer.parseInt(e1.getText().toString());
                                                          int pizza = Integer.parseInt(e2.getText().toString());
                                                          int b;
                                                          if (c1.isChecked() && c2.isChecked()) {
                                                              b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                                              a.setdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                                          } else if (c1.isChecked()) {
                                                              b = spa * 10000 + pizza * 12000 * 9 / 10;
                                                              a.setdata(5,"기본멤버쉽");

                                                          } else if (c2.isChecked()) {
                                                              b = spa * 10000 + pizza * 12000 * 7 / 10;
                                                              a.setdata(5,"VIP멤버쉽 사용");

                                                          } else {
                                                              b = spa * 10000 + pizza * 12000;
                                                              a.setdata(5,"사용하지않음");


                                                          }
                                                          a.setdata(1, formatDate);
                                                          a.setdata(2, e1.getText().toString());
                                                          a.setdata(3, e2.getText().toString());
                                                          a.setdata(4, String.valueOf(b));
                                                          t2.setText(a.returndata(1));
                                                          t3.setText(a.returndata(2));
                                                          t4.setText(a.returndata(3));
                                                          t5.setText(a.returndata(4));
                                                          t6.setText(a.returndata(5));
                                                          b1.setText("포도테이블");
                                                      }
                                                  }).show();
                                              }
                                          });
                                          dlg.show();


                                          b7.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(final View v) {
                                                  View dlgview = View.inflate(getContext(), R.layout.box, null);
                                                  final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                                                  final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                                                  final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                                                  final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                                                  AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                                                  dlg.setTitle("정보수정");
                                                  dlg.setView(dlgview);
                                                  dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                      @Override
                                                      public void onClick(DialogInterface dialog, int which) {
                                                          Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View v) {
                                                                  int spa = Integer.parseInt(e1.getText().toString());
                                                                  int pizza = Integer.parseInt(e2.getText().toString());
                                                                  int b;
                                                                  if (c1.isChecked() && c2.isChecked()) {
                                                                      b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                                                      a.setdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                                                  } else if (c1.isChecked()) {
                                                                      b = spa * 10000 + pizza * 12000 * 9 / 10;
                                                                      a.setdata(5,"기본멤버쉽");

                                                                  } else if (c2.isChecked()) {
                                                                      b = spa * 10000 + pizza * 12000 * 7 / 10;
                                                                      a.setdata(5,"VIP멤버쉽 사용");

                                                                  } else {
                                                                      b = spa * 10000 + pizza * 12000;
                                                                      a.setdata(5,"사용하지않음");


                                                                  }
                                                                  a.setdata(1, formatDate);
                                                                  a.setdata(2, e1.getText().toString());
                                                                  a.setdata(3, e2.getText().toString());
                                                                  a.setdata(4, String.valueOf(b));
                                                                  t2.setText(a.returndata(1));
                                                                  t3.setText(a.returndata(2));
                                                                  t4.setText(a.returndata(3));
                                                                  t5.setText(a.returndata(4));
                                                                  t6.setText(a.returndata(5));

                                                              }
                                                          }).show();
                                                      }
                                                  });
                                                  dlg.show();
                                                  b6.setOnClickListener(new View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View v) {
                                                          b1.setText("포도테이블(비어있음)");
                                                          t2.setText("");
                                                          t3.setText("");
                                                          t4.setText("");
                                                          t5.setText("");
                                                          t6.setText("");
                                                          a.setdata(1, "");
                                                          a.setdata(2, "");
                                                          a.setdata(3, "");
                                                          a.setdata(4, "");
                                                          a.setdata(5,"");

                                                      }});}});}});}});

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.applegetdata("사과테이블");
                a.applegetdata("");
                a.applegetdata("");
                a.applegetdata("");
                a.applegetdata("");
                a.applegetdata("");
                t1.setText(a.applereturndata(0));
                t2.setText(a.applereturndata(1));
                t3.setText(a.applereturndata(2));
                t4.setText(a.applereturndata(3));
                t5.setText(a.applereturndata(4));
                t6.setText(a.applereturndata(5));

                if(t2.getText().toString().matches("")){
                    Toast.makeText(getContext(),"정보가없습니다",Toast.LENGTH_LONG).show();
                }

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {

                        View dlgview = View.inflate(getContext(), R.layout.box, null);
                        final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                        final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                        final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                        final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                        AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                        dlg.setTitle("새주문");
                        dlg.setView(dlgview);
                        dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b;
                                        if (c1.isChecked() && c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                            a.applesetdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                        } else if (c1.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10;
                                            a.applesetdata(5,"기본멤버쉽");

                                        } else if (c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 7 / 10;
                                            a.applesetdata(5,"VIP멤버쉽 사용");

                                        } else {
                                            b = spa * 10000 + pizza * 12000;
                                            a.applesetdata(5,"사용하지않음");


                                        }

                                        a.applesetdata(1, formatDate);
                                        a.applesetdata(2, e1.getText().toString());
                                        a.applesetdata(3, e2.getText().toString());
                                        a.applesetdata(4, String.valueOf(b));
                                        t2.setText(a.applereturndata(1));
                                        t3.setText(a.applereturndata(2));
                                        t4.setText(a.applereturndata(3));
                                        t5.setText(a.applereturndata(4));
                                        t6.setText(a.applereturndata(5));
                                        b2.setText("사과테이블");}}).show();}});
                        dlg.show();
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(final View v) {
                                View dlgview = View.inflate(getContext(), R.layout.box, null);
                                final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                                final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                                final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                                final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                                AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                                dlg.setTitle("정보수정");
                                dlg.setView(dlgview);
                                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int spa = Integer.parseInt(e1.getText().toString());
                                                int pizza = Integer.parseInt(e2.getText().toString());
                                                int b;
                                                if (c1.isChecked() && c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                                    a.applesetdata(5,"기본멤버쉽,VIP멤버쉽 사용");
                                                } else if (c1.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10;
                                                    a.applesetdata(5,"기본멤버쉽");
                                                } else if (c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 7 / 10;
                                                    a.applesetdata(5,"VIP멤버쉽 사용");
                                                } else {
                                                    b = spa * 10000 + pizza * 12000;
                                                    a.applesetdata(5,"사용하지않음");

                                                }
                                                a.applesetdata(1, formatDate);
                                                a.applesetdata(2, e1.getText().toString());
                                                a.applesetdata(3, e2.getText().toString());
                                                a.applesetdata(4, String.valueOf(b));

                                                t2.setText(a.applereturndata(1));
                                                t3.setText(a.applereturndata(2));
                                                t4.setText(a.applereturndata(3));
                                                t5.setText(a.applereturndata(4));
                                                t6.setText(a.applereturndata(5));}}).show();}});
                                dlg.show();
                                b6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b1.setText("사과테이블(비어있음)");
                                        t2.setText("");
                                        t3.setText("");
                                        t4.setText("");
                                        t5.setText("");
                                        t6.setText("");
                                        a.setdata(1, "");
                                        a.setdata(2, "");
                                        a.setdata(3, "");
                                        a.setdata(4, "");
                                        a.setdata(5,"");
                                        }});}});}});}});
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.kiwigetdata("키위테이블");
                a.kiwigetdata("");
                a.kiwigetdata("");
                a.kiwigetdata("");
                a.kiwigetdata("");
                a.kiwigetdata("");
                ;
                t1.setText(a.kiwireturndata(0));
                t2.setText(a.kiwireturndata(1));
                t3.setText(a.kiwireturndata(2));
                t4.setText(a.kiwireturndata(3));
                t5.setText(a.kiwireturndata(4));
                t6.setText(a.kiwireturndata(5));
                if(t2.getText().toString().matches("")){
                    Toast.makeText(getContext(),"정보가없습니다",Toast.LENGTH_LONG).show();
                }

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {

                        View dlgview = View.inflate(getContext(), R.layout.box, null);
                        final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                        final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                        final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                        final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                        AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                        dlg.setTitle("새주문");
                        dlg.setView(dlgview);
                        dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b;
                                        if (c1.isChecked() && c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                            a.kiwisetdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                        } else if (c1.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10;
                                            a.kiwisetdata(5,"기본멤버쉽");

                                        } else if (c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 7 / 10;
                                            a.kiwisetdata(5,"VIP멤버쉽 사용");

                                        } else {
                                            b = spa * 10000 + pizza * 12000;
                                            a.kiwisetdata(5,"사용하지않음");


                                        }
                                        a.kiwisetdata(1, formatDate);
                                        a.kiwisetdata(2, e1.getText().toString());
                                        a.kiwisetdata(3, e2.getText().toString());
                                        a.kiwisetdata(4, String.valueOf(b));

                                        t2.setText(a.kiwireturndata(1));
                                        t3.setText(a.kiwireturndata(2));
                                        t4.setText(a.kiwireturndata(3));
                                        t5.setText(a.kiwireturndata(4));
                                        t6.setText(a.kiwireturndata(5));
                                        b3.setText("키위테이블");
                                    }
                                }).show();
                            }
                        });
                        dlg.show();
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(final View v) {
                                View dlgview = View.inflate(getContext(), R.layout.box, null);
                                final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                                final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                                final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                                final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                                AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                                dlg.setTitle("정보수정");
                                dlg.setView(dlgview);
                                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int spa = Integer.parseInt(e1.getText().toString());
                                                int pizza = Integer.parseInt(e2.getText().toString());
                                                int b;
                                                if (c1.isChecked() && c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                                    a.kiwisetdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                                } else if (c1.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10;
                                                    a.kiwisetdata(5,"기본멤버쉽");

                                                } else if (c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 7 / 10;
                                                    a.kiwisetdata(5,"VIP멤버쉽 사용");

                                                } else {
                                                    b = spa * 10000 + pizza * 12000;
                                                    a.kiwisetdata(5,"사용하지않음");


                                                }
                                                a.kiwisetdata(1, formatDate);
                                                a.kiwisetdata(2, e1.getText().toString());
                                                a.kiwisetdata(3, e2.getText().toString());
                                                a.kiwisetdata(4, String.valueOf(b));
                                                t2.setText(a.kiwireturndata(1));
                                                t3.setText(a.kiwireturndata(2));
                                                t4.setText(a.kiwireturndata(3));
                                                t5.setText(a.kiwireturndata(4));
                                                t6.setText(a.kiwireturndata(5));}}).show();}});

                                dlg.show();
                                b6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b1.setText("키위테이블(비어있음)");
                                        t2.setText("");
                                        t3.setText("");
                                        t4.setText("");
                                        t5.setText("");
                                        t6.setText("");
                                        a.kiwisetdata(1, "");
                                        a.kiwisetdata(2, "");
                                        a.kiwisetdata(3, "");
                                        a.kiwisetdata(4, "");
                                        a.kiwisetdata(5,"");
                                        }});}});}});}});
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.jagetdata("자몽테이블");
                a.jagetdata("");
                a.jagetdata("");
                a.jagetdata("");
                a.jagetdata("");
                a.jagetdata("");

                t1.setText(a.jareturndata(0));
                t2.setText(a.jareturndata(1));
                t3.setText(a.jareturndata(2));
                t4.setText(a.jareturndata(3));
                t5.setText(a.jareturndata(4));
                t6.setText(a.jareturndata(5));
                if(t2.getText().toString().matches("")){
                    Toast.makeText(getContext(),"정보가없습니다",Toast.LENGTH_LONG).show();
                }

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {

                        View dlgview = View.inflate(getContext(), R.layout.box, null);
                        final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                        final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                        final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                        final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                        AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                        dlg.setTitle("새주문");
                        dlg.setView(dlgview);
                        dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b;
                                        if (c1.isChecked() && c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                            a.jasetdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                        } else if (c1.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 9 / 10;
                                            a.jasetdata(5,"기본멤버쉽");

                                        } else if (c2.isChecked()) {
                                            b = spa * 10000 + pizza * 12000 * 7 / 10;
                                            a.jasetdata(5,"VIP멤버쉽 사용");

                                        } else {
                                            b = spa * 10000 + pizza * 12000;
                                            a.jasetdata(5,"사용하지않음");


                                        }
                                        a.jasetdata(1, formatDate);
                                        a.jasetdata(2, e1.getText().toString());
                                        a.jasetdata(3, e2.getText().toString());
                                        a.jasetdata(4, String.valueOf(b));
                                        t2.setText(a.jareturndata(1));
                                        t3.setText(a.jareturndata(2));
                                        t4.setText(a.jareturndata(3));
                                        t5.setText(a.jareturndata(4));
                                        t6.setText(a.jareturndata(5));
                                        b4.setText("자몽테이블");}}).show();}});dlg.show();
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(final View v) {
                                View dlgview = View.inflate(getContext(), R.layout.box, null);
                                final EditText e1 = (EditText) dlgview.findViewById(R.id.e1);
                                final EditText e2 = (EditText) dlgview.findViewById(R.id.e2);
                                final CheckBox c1 = (CheckBox) dlgview.findViewById(R.id.c1);
                                final CheckBox c2 = (CheckBox) dlgview.findViewById(R.id.c2);
                                AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
                                dlg.setTitle("정보수정");
                                dlg.setView(dlgview);
                                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Snackbar.make(v, "주문하시겠습니까", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int spa = Integer.parseInt(e1.getText().toString());
                                                int pizza = Integer.parseInt(e2.getText().toString());
                                                int b;
                                                if (c1.isChecked() && c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10 * 7 / 10;
                                                    a.jasetdata(5,"기본멤버쉽,VIP멤버쉽 사용");

                                                } else if (c1.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 9 / 10;
                                                    a.jasetdata(5,"기본멤버쉽");

                                                } else if (c2.isChecked()) {
                                                    b = spa * 10000 + pizza * 12000 * 7 / 10;
                                                    a.jasetdata(5,"VIP멤버쉽 사용");

                                                } else {
                                                    b = spa * 10000 + pizza * 12000;
                                                    a.jasetdata(5,"사용하지않음");


                                                }
                                                a.jasetdata(1, formatDate);
                                                a.jasetdata(2, e1.getText().toString());
                                                a.jasetdata(3, e2.getText().toString());
                                                a.jasetdata(4, String.valueOf(b));
                                                t2.setText(a.jareturndata(1));
                                                t3.setText(a.jareturndata(2));
                                                t4.setText(a.jareturndata(3));
                                                t5.setText(a.jareturndata(4));
                                                t6.setText(a.jareturndata(5));
                                            }
                                        }).show();
                                    }
                                });
                                dlg.show();
                                b6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b1.setText("자몽테이블(비어있음)");
                                        t2.setText("");
                                        t3.setText("");
                                        t4.setText("");
                                        t5.setText("");
                                        t6.setText("");
                                        a.jasetdata(1, "");
                                        a.jasetdata(2, "");
                                        a.jasetdata(3, "");
                                        a.jasetdata(4, "");
                                        a.jasetdata(5,"");
                                        }});}});}});}});
        return view;
    }
}
