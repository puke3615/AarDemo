package pk.aar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import pk.aarprovider.IToast;
import pk.aarprovider.IToastFactory;


public class MainActivity extends Activity {

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        IToast toast = IToastFactory.build();
        toast.showToast(this, String.valueOf(index++));
    }

}
