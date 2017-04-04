package com.example.rok.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rok on 2017. 4. 4..
 */

public class MainFragement extends Fragment {
    TextView t1,t2,t3,t4,t5;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    CheckedTextView ct1;
    EditText e1,e2;
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
        e1 = (EditText)view.findViewById(R.id.e1);
        e2 = (EditText)view.findViewById(R.id.e2);
        final data a = new data();
    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                a.getdata("포도테이블");
                a.getdata("");
                a.getdata("");
                a.getdata("");
                a.getdata("");
                t1.setText(a.returndata(0));
                t2.setText(a.returndata(1));
                t3.setText(a.returndata(2));
                t4.setText(a.returndata(3));
                t5.setText(a.returndata(4));




                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        
                        b8.setVisibility(View.VISIBLE);
                        e1.setVisibility(View.VISIBLE);
                        e2.setVisibility(View.VISIBLE);
                        b7.setVisibility(View.INVISIBLE);
                        b6.setVisibility(View.INVISIBLE);
                        b5.setVisibility(View.INVISIBLE);
                        b8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b8.setVisibility(View.INVISIBLE);
                                b7.setVisibility(View.VISIBLE);
                                b6.setVisibility(View.VISIBLE);
                                b5.setVisibility(View.VISIBLE);
                                e1.setVisibility(View.INVISIBLE);
                                e2.setVisibility(View.INVISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.setdata(1,formatDate);
                                a.setdata(2,e1.getText().toString());
                                a.setdata(3,e2.getText().toString());
                                a.setdata(4,String.valueOf(b));
                                t2.setText(a.returndata(1));
                                t3.setText(a.returndata(2));
                                t4.setText(a.returndata(3));
                                t5.setText(a.returndata(4));
                                b1.setText("포도테이블");


                            }
                        });
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t3.setVisibility(View.INVISIBLE);
                                t4.setVisibility(View.INVISIBLE);
                                t5.setVisibility(View.INVISIBLE);
                                b8.setVisibility(View.VISIBLE);
                                b7.setVisibility(View.INVISIBLE);
                                b6.setVisibility(View.INVISIBLE);
                                b5.setVisibility(View.INVISIBLE);
                                e1.setVisibility(View.VISIBLE);
                                e2.setVisibility(View.VISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.setdata(1,formatDate);
                                a.setdata(2,e1.getText().toString());
                                a.setdata(3,e2.getText().toString());
                                a.setdata(4,String.valueOf(b));
                                t3.setText(a.returndata(2));
                                t4.setText(a.returndata(3));
                                t5.setText(a.returndata(4));
                                b8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b8.setVisibility(View.INVISIBLE);
                                        b7.setVisibility(View.VISIBLE);
                                        b6.setVisibility(View.VISIBLE);
                                        b5.setVisibility(View.VISIBLE);
                                        e1.setVisibility(View.INVISIBLE);
                                        e2.setVisibility(View.INVISIBLE);
                                        t3.setVisibility(View.VISIBLE);
                                        t4.setVisibility(View.VISIBLE);
                                        t5.setVisibility(View.VISIBLE);
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b = spa*10000+pizza*12000;
                                        a.setdata(1,formatDate);
                                        a.setdata(2,e1.getText().toString());
                                        a.setdata(3,e2.getText().toString());
                                        a.setdata(4,String.valueOf(b));
                                        t2.setText(a.returndata(1));
                                        t3.setText(a.returndata(2));
                                        t4.setText(a.returndata(3));
                                        t5.setText(a.returndata(4));
                                    }
                                });

                            }
                        });
                        b6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                b1.setText("포도테이블(비어있음)");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");

                                a.setdata(1,"");
                                a.setdata(2,"");
                                a.setdata(3,"");
                                a.setdata(4,"");

                            }
                        });
                    }
                });

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");



                a.applegetdata("사과테이블");
                a.applegetdata("");
                a.applegetdata("");
                a.applegetdata("");
                a.applegetdata("");
                t1.setText(a.applereturndata(0));
                t2.setText(a.applereturndata(1));
                t3.setText(a.applereturndata(2));
                t4.setText(a.applereturndata(3));
                t5.setText(a.applereturndata(4));




                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b8.setVisibility(View.VISIBLE);
                        e1.setVisibility(View.VISIBLE);
                        e2.setVisibility(View.VISIBLE);
                        b7.setVisibility(View.INVISIBLE);
                        b6.setVisibility(View.INVISIBLE);
                        b5.setVisibility(View.INVISIBLE);
                        b8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b8.setVisibility(View.INVISIBLE);
                                b7.setVisibility(View.VISIBLE);
                                b6.setVisibility(View.VISIBLE);
                                b5.setVisibility(View.VISIBLE);
                                e1.setVisibility(View.INVISIBLE);
                                e2.setVisibility(View.INVISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.applesetdata(1,formatDate);
                                a.applesetdata(2,e1.getText().toString());
                                a.applesetdata(3,e2.getText().toString());
                                a.applesetdata(4,String.valueOf(b));
                                t2.setText(a.applereturndata(1));
                                t3.setText(a.applereturndata(2));
                                t4.setText(a.applereturndata(3));
                                t5.setText(a.applereturndata(4));
                                b2.setText("사과테이블");


                            }
                        });
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t3.setVisibility(View.INVISIBLE);
                                t4.setVisibility(View.INVISIBLE);
                                t5.setVisibility(View.INVISIBLE);
                                b8.setVisibility(View.VISIBLE);
                                b7.setVisibility(View.INVISIBLE);
                                b6.setVisibility(View.INVISIBLE);
                                b5.setVisibility(View.INVISIBLE);
                                e1.setVisibility(View.VISIBLE);
                                e2.setVisibility(View.VISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.applesetdata(1,formatDate);
                                a.applesetdata(2,e1.getText().toString());
                                a.applesetdata(3,e2.getText().toString());
                                a.applesetdata(4,String.valueOf(b));
                                t3.setText(a.applereturndata(2));
                                t4.setText(a.applereturndata(3));
                                t5.setText(a.applereturndata(4));
                                b8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b8.setVisibility(View.INVISIBLE);
                                        b7.setVisibility(View.VISIBLE);
                                        b6.setVisibility(View.VISIBLE);
                                        b5.setVisibility(View.VISIBLE);
                                        e1.setVisibility(View.INVISIBLE);
                                        e2.setVisibility(View.INVISIBLE);
                                        t3.setVisibility(View.VISIBLE);
                                        t4.setVisibility(View.VISIBLE);
                                        t5.setVisibility(View.VISIBLE);
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b = spa*10000+pizza*12000;
                                        a.applesetdata(1,formatDate);
                                        a.applesetdata(2,e1.getText().toString());
                                        a.applesetdata(3,e2.getText().toString());
                                        a.applesetdata(4,String.valueOf(b));
                                        t2.setText(a.applereturndata(1));
                                        t3.setText(a.applereturndata(2));
                                        t4.setText(a.applereturndata(3));
                                        t5.setText(a.applereturndata(4));
                                    }
                                });

                            }
                        });
                        b6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                b2.setText("사과테이블(비어있음)");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");
                                a.applesetdata(1,"");
                                a.applesetdata(2,"");
                                a.applesetdata(3,"");
                                a.applesetdata(4,"");


                            }
                        });
                    }
                });

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");



                a.kiwigetdata("키위테이블");
                a.kiwigetdata("");
                a.kiwigetdata("");
                a.kiwigetdata("");
                a.kiwigetdata("");
                t1.setText(a.kiwireturndata(0));
                t2.setText(a.kiwireturndata(1));
                t3.setText(a.kiwireturndata(2));
                t4.setText(a.kiwireturndata(3));
                t5.setText(a.kiwireturndata(4));




                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b8.setVisibility(View.VISIBLE);
                        e1.setVisibility(View.VISIBLE);
                        e2.setVisibility(View.VISIBLE);
                        b7.setVisibility(View.INVISIBLE);
                        b6.setVisibility(View.INVISIBLE);
                        b5.setVisibility(View.INVISIBLE);
                        b8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b8.setVisibility(View.INVISIBLE);
                                b7.setVisibility(View.VISIBLE);
                                b6.setVisibility(View.VISIBLE);
                                b5.setVisibility(View.VISIBLE);
                                e1.setVisibility(View.INVISIBLE);
                                e2.setVisibility(View.INVISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.kiwisetdata(1,formatDate);
                                a.kiwisetdata(2,e1.getText().toString());
                                a.kiwisetdata(3,e2.getText().toString());
                                a.kiwisetdata(4,String.valueOf(b));
                                t2.setText(a.kiwireturndata(1));
                                t3.setText(a.kiwireturndata(2));
                                t4.setText(a.kiwireturndata(3));
                                t5.setText(a.kiwireturndata(4));
                                b3.setText("키위테이블");


                            }
                        });
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t3.setVisibility(View.INVISIBLE);
                                t4.setVisibility(View.INVISIBLE);
                                t5.setVisibility(View.INVISIBLE);
                                b8.setVisibility(View.VISIBLE);
                                b7.setVisibility(View.INVISIBLE);
                                b6.setVisibility(View.INVISIBLE);
                                b5.setVisibility(View.INVISIBLE);
                                e1.setVisibility(View.VISIBLE);
                                e2.setVisibility(View.VISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.kiwisetdata(1,formatDate);
                                a.kiwisetdata(2,e1.getText().toString());
                                a.kiwisetdata(3,e2.getText().toString());
                                a.kiwisetdata(4,String.valueOf(b));
                                t3.setText(a.kiwireturndata(2));
                                t4.setText(a.kiwireturndata(3));
                                t5.setText(a.kiwireturndata(4));
                                b8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b8.setVisibility(View.INVISIBLE);
                                        b7.setVisibility(View.VISIBLE);
                                        b6.setVisibility(View.VISIBLE);
                                        b5.setVisibility(View.VISIBLE);
                                        e1.setVisibility(View.INVISIBLE);
                                        e2.setVisibility(View.INVISIBLE);
                                        t3.setVisibility(View.VISIBLE);
                                        t4.setVisibility(View.VISIBLE);
                                        t5.setVisibility(View.VISIBLE);
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b = spa*10000+pizza*12000;
                                        a.kiwisetdata(1,formatDate);
                                        a.kiwisetdata(2,e1.getText().toString());
                                        a.kiwisetdata(3,e2.getText().toString());
                                        a.kiwisetdata(4,String.valueOf(b));
                                        t2.setText(a.kiwireturndata(1));
                                        t3.setText(a.kiwireturndata(2));
                                        t4.setText(a.kiwireturndata(3));
                                        t5.setText(a.kiwireturndata(4));
                                    }
                                });

                            }
                        });
                        b6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                b3.setText("키위테이블(비어있음)");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");
                                a.kiwisetdata(1,"");
                                a.kiwisetdata(2,"");
                                a.kiwisetdata(3,"");
                                a.kiwisetdata(4,"");


                            }
                        });
                    }
                });

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");



                a.jagetdata("자몽테이블");
                a.jagetdata("");
                a.jagetdata("");
                a.jagetdata("");
                a.jagetdata("");
                t1.setText(a.jareturndata(0));
                t2.setText(a.jareturndata(1));
                t3.setText(a.jareturndata(2));
                t4.setText(a.jareturndata(3));
                t5.setText(a.jareturndata(4));




                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b8.setVisibility(View.VISIBLE);
                        e1.setVisibility(View.VISIBLE);
                        e2.setVisibility(View.VISIBLE);
                        b7.setVisibility(View.INVISIBLE);
                        b6.setVisibility(View.INVISIBLE);
                        b5.setVisibility(View.INVISIBLE);
                        b8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b8.setVisibility(View.INVISIBLE);
                                b7.setVisibility(View.VISIBLE);
                                b6.setVisibility(View.VISIBLE);
                                b5.setVisibility(View.VISIBLE);
                                e1.setVisibility(View.INVISIBLE);
                                e2.setVisibility(View.INVISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.jasetdata(1,formatDate);
                                a.jasetdata(2,e1.getText().toString());
                                a.jasetdata(3,e2.getText().toString());
                                a.jasetdata(4,String.valueOf(b));
                                t2.setText(a.jareturndata(1));
                                t3.setText(a.jareturndata(2));
                                t4.setText(a.jareturndata(3));
                                t5.setText(a.jareturndata(4));
                                b4.setText("자몽테이블");


                            }
                        });
                        b7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                t3.setVisibility(View.INVISIBLE);
                                t4.setVisibility(View.INVISIBLE);
                                t5.setVisibility(View.INVISIBLE);
                                b8.setVisibility(View.VISIBLE);
                                b7.setVisibility(View.INVISIBLE);
                                b6.setVisibility(View.INVISIBLE);
                                b5.setVisibility(View.INVISIBLE);
                                e1.setVisibility(View.VISIBLE);
                                e2.setVisibility(View.VISIBLE);
                                int spa = Integer.parseInt(e1.getText().toString());
                                int pizza = Integer.parseInt(e2.getText().toString());
                                int b = spa*10000+pizza*12000;
                                a.jasetdata(1,formatDate);
                                a.jasetdata(2,e1.getText().toString());
                                a.jasetdata(3,e2.getText().toString());
                                a.jasetdata(4,String.valueOf(b));
                                t3.setText(a.jareturndata(2));
                                t4.setText(a.jareturndata(3));
                                t5.setText(a.jareturndata(4));
                                b8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b8.setVisibility(View.INVISIBLE);
                                        b7.setVisibility(View.VISIBLE);
                                        b6.setVisibility(View.VISIBLE);
                                        b5.setVisibility(View.VISIBLE);
                                        e1.setVisibility(View.INVISIBLE);
                                        e2.setVisibility(View.INVISIBLE);
                                        t3.setVisibility(View.VISIBLE);
                                        t4.setVisibility(View.VISIBLE);
                                        t5.setVisibility(View.VISIBLE);
                                        int spa = Integer.parseInt(e1.getText().toString());
                                        int pizza = Integer.parseInt(e2.getText().toString());
                                        int b = spa*10000+pizza*12000;
                                        a.jasetdata(1,formatDate);
                                        a.jasetdata(2,e1.getText().toString());
                                        a.jasetdata(3,e2.getText().toString());
                                        a.jasetdata(4,String.valueOf(b));
                                        t2.setText(a.jareturndata(1));
                                        t3.setText(a.jareturndata(2));
                                        t4.setText(a.jareturndata(3));
                                        t5.setText(a.jareturndata(4));
                                    }
                                });

                            }
                        });
                        b6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b4.setText("자몽테이블(비어있음)");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");
                                a.jasetdata(1,"");
                                a.jasetdata(2,"");
                                a.jasetdata(3,"");
                                a.jasetdata(4,"");


                            }
                        });
                    }
                });

            }

        });



        return view;
    }

}
