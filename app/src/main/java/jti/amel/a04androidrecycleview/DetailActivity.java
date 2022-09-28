package jti.amel.a04androidrecycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView recipeTitle, ingredients, procedure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        recipeTitle = findViewById(R.id.recipeTitle);
        ingredients = findViewById(R.id.ingredients);
        procedure = findViewById(R.id.procedure);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            recipeTitle.setText(getIntent().getStringExtra("nama_makanan"));
            ingredients.setText(getIntent().getStringExtra("bahan_makanan"));
            procedure.setText(getIntent().getStringExtra("cara_membuat"));
            Glide.with(this).load(getIntent().getIntExtra("foto_makanan", 0)).into(imageView);
        }

       getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("bahan_makanan") && getIntent().hasExtra("cara_membuat")){
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String fotoMakanan = getIntent().getStringExtra("foto_makanan");
            String bahanMakanan = getIntent().getStringExtra("bahan_makanan");
            String caraMembuat = getIntent().getStringExtra("cara_membuat");

            setDataActivity(namaMakanan, fotoMakanan, bahanMakanan, caraMembuat);
        }
    }

    private void setDataActivity(String namaMakanan, String fotoMakanan, String bahanMakanan, String caraMembuat){
        Glide.with(this).asBitmap().load(fotoMakanan).into(imageView);
        recipeTitle.setText(namaMakanan);
        ingredients.setText(bahanMakanan);
        procedure.setText(caraMembuat);
    }
}