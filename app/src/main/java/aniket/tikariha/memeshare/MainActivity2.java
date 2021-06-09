package aniket.tikariha.memeshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.memeshare.R;


public class MainActivity2 extends AppCompatActivity {
Button aboutmebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        aboutmebutton = findViewById(R.id.aboutmebutton);
    }


    public void aboutme(View view) {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://anikettikariha.atwebpages.com/"));
        startActivity(intent3);
    }

    public void bugBTN(View view) {
        Intent uriIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("whatsapp://send?text=" + "Hi, I found a BUG / additional FEATURE that could be removed/added with MEME SHARE APP : "));
        startActivity(uriIntent);



        //  Intent intent4 = new Intent(Intent.ACTION_SEND);
       // intent4.setType("text/plain");
       // intent4.putExtra(intent4.EXTRA_STREAM,"Hi, I found a BUG/Additional feature that can be added : ");
       // intent4.setPackage("com.whatsapp");
       // startActivity(intent4);
    }
}



