    package com.example.tgs4_RecycleView;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import android.os.Bundle;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private MahasiswaAdapter adapter;
        private ArrayList<Mahasiswa> mahasiswaArrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addData();

            recyclerView = (RecyclerView)findViewById(R.id.recycleview);

            adapter = new MahasiswaAdapter(mahasiswaArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);

        }

        private void addData() {
            mahasiswaArrayList = new ArrayList<>();
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.image4,"Daniel Putera Alamsyah", "1918081", "2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.image1,"Daniel Putra", "1918082", "2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.image2,"Putra Alamsyah", "1918083", "2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.image3,"Alamsyah Daniel", "1918084", "2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.image5,"Daniel Alamsyah", "1918085", "2019"));
        }
    }
