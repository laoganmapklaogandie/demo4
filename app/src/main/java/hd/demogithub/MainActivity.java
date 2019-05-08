package hd.demogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int add(int a,int b){

        return a + b;
    }

    public int addtwo(int a,int b,int c){

        return a + b + c;
    }

    public int addthree(int a,int b,int c,int d){

        return a + b + c +d;
    }

    public int addfour(int a,int b,int c,int d,int e){

        return a + b + c +d +e;
    }


}
