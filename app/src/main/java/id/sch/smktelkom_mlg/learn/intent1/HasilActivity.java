package id.sch.smktelkom_mlg.learn.intent1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR, 0);

        int yearNow = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int tahunLahir = yearNow - umur;

        TextView tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil.setText(nama + " lahir pada tahun " + tahunLahir);

        setTitle("Hasil");
    }
}
