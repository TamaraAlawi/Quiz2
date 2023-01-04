package edu.cs.birzeit.inclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTitle;
    EditText authorName;
    EditText pages;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }

    private void setUpViews() {
        edtTitle=findViewById(R.id.edtTitke);
        authorName=findViewById(R.id.edtAuthor);
        pages=findViewById(R.id.edtPages);

    }
    void setUpSharedPreferances(){
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor= prefs.edit();
    }

    void addToList(){
        String title = edtTitle.getText().toString().trim();
        editor.putString("Title:", title);

        String author = authorName.getText().toString().trim();
        editor.putString("Author Name:", author);

        String page = pages.getText().toString().trim();
        editor.putString("Pages: ",page);
    }

    public void saveAll(View view) {

    }
}