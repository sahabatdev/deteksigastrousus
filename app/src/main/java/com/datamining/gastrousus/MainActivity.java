package com.datamining.gastrousus;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    LinearLayout linearChecked;
    Integer[] dataInputan;
    Double[] dataNilaiPenyakit1;
    Double[] dataNilaiPenyakit2;
    Integer[][] dataMetaPenyakit1, dataMetaPenyakit2;
    int i;
    private DecimalFormat df;
    private String[] dataGejala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-4646734217421486~8427715207");

        df = new DecimalFormat("#.##");
        linearChecked = findViewById(R.id.linear_checked);
        dataGejala = new String[]{
                "Buang Air Besar (Lebih dari 2 kali)",
                "Berak Encer",
                "Berak Berdarah",
                "Lesu dan tidak Bergairah",
                "Tidak selera makan",
                "Merasa mual dan sering muntah (lebih dari 1 kali)",
                "Merasa sakit dibagian perut",
                "Tekanan darah rendah",
                "Pusing",
                "Pingsan",
                "Suhu badan tinggi",
                "Luka dibagian tertentu",
                "Tidak dapat menggerakkan anggota badan tertentu",
                "Memakan sesuatu",
                "Memakan daging",
                "Memakan jamur",
                "Memakan makanan kaleng",
                "Membeli susu",
                "Meminum susu",
                "Mencret",
                "Muntah",
                "Sakit Perut",
                "Darah Rendah",
                "Koma",
                "Demam",
                "Septicaemia",
                "Lumpuh",
                "Mencret berdarah",
                "Makan daging",
                "Makan jamur",
                "Makan makanan kaleng",
                "Minum susu",
                "Keracunan Staphylococcus aureus",
                "Keracunan jamur beracun",
                "Keracunan Salmonellae",
                "Keracunan Clostridium botulinium",
                "Keracunan Clampylobacter",
        };

        dataInputan = new Integer[19];
        dataNilaiPenyakit1 = new Double[13];
        dataNilaiPenyakit2 = new Double[5];
        dataMetaPenyakit1 = new Integer[][]{
                {1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //penyakit 20
                {0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0}, //penyakit 21
                {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0}, //penyakit 22
                {0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0}, //penyakit 23
                {0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0}, //penyakit 24
                {0,0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0}, //penyakit 25
                {0,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0}, //penyakit 26
                {0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0}, //penyakit 27
                {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //penyakit 28
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0}, //penyakit 29
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0}, //penyakit 30
                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0}, //penyakit 31
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1} //penyakit 32
            };

        dataMetaPenyakit2 = new Integer[][]{
                {1,1,1,1,0,0,0,0,0,1,0,0,0}, // penyakit 33
                {1,1,1,0,1,0,0,0,0,0,1,0,0}, // penyakit 34
                {1,1,1,0,0,1,1,0,0,1,0,0,0}, // penyakit 35
                {0,1,0,0,0,0,0,1,0,0,0,1,0}, // penyakit 36
                {0,0,1,0,0,1,0,0,1,0,0,0,1}  // penyakit 37
            };

        for (i = 0; i < 19; i++)
        {
            TableRow row =new TableRow(this);
            row.setId(i);
            row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
            CheckBox checkBox = new CheckBox(this);
            checkBox.setId(i);
            checkBox.setOnCheckedChangeListener(this);
            checkBox.setText(dataGejala[i]);
            row.addView(checkBox);
            linearChecked.addView(row);
        }

        Button btnCekHasil = new Button(this);
        btnCekHasil.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        btnCekHasil.setText("Hasil Deteksi Penyakit");
        btnCekHasil.setTextColor(getResources().getColor(R.color.white));
        btnCekHasil.setTextSize(17);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            btnCekHasil.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        }else
            btnCekHasil.setBackgroundResource(R.color.colorAccent);


        linearChecked.addView(btnCekHasil);

        btnCekHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int j=1;
                Boolean isEmpty=true;
                for (Integer integer : dataInputan) {
                    if(integer==null || integer==0)
                        dataInputan[j-1] = 0;
                    else
                        isEmpty = false;

                    j++;
                }

                if(!isEmpty)
                    menghitungNilaiPenyakit1(menghitungJumlahKuadrat());
                else
                    Toast.makeText(MainActivity.this, "Anda Tidak Memiliki Gejala Penyakit", Toast.LENGTH_LONG).show();
            }
        });
    }

    private Integer menghitungJumlahKuadrat() {
        int jumlahKuadrat = 0;
        for (Integer integer : dataInputan) {
            jumlahKuadrat += Math.pow(integer,2);
        }
        return jumlahKuadrat;
    }

    private void menghitungNilaiPenyakit1(Integer jumlahKuadratY) {
        int j=0;
        for (Integer[] penyakit1 : dataMetaPenyakit1) {
            int jumlahKuadratX = 0, i = 0, jumlahKali=0;
            for (Integer gejala : penyakit1) {
                jumlahKuadratX += Math.pow(gejala,2);
                jumlahKali += dataInputan[i]*gejala;
                System.out.print(gejala+" ");
                i++;
            }
            dataNilaiPenyakit1[j] = jumlahKali/(Math.sqrt(jumlahKuadratX)*Math.sqrt(jumlahKuadratY));
            System.out.println(df.format(dataNilaiPenyakit1[j]));
            j++;
        }

        System.out.println("------------------- Data Masukan User ---------------------");

        for (Integer integer : dataInputan) {
            System.out.print(integer+" ");
        }
        System.out.println("\n\n");

        menghitungNilaiPenyakit2(menghitungJumlahKuadrat2());
    }

    private Double menghitungJumlahKuadrat2() {
        Double jumlahKuadrat = 0.0;
        for (Double nilai : dataNilaiPenyakit1) {
            jumlahKuadrat += Math.pow(nilai,2);
        }
        return jumlahKuadrat;
    }

    private void menghitungNilaiPenyakit2(Double jumlahKuadratY) {
        for (Double nilai : dataNilaiPenyakit1) {
            System.out.print(df.format(nilai)+" ");
        }
        System.out.println("\n\n");
        System.out.println("------------------- Batas Data Dari Perhitungan 1 ---------------------");
        int j=0;
        for (Integer[] penyakit2 : dataMetaPenyakit2) {
            int jumlahKuadratX = 0, i = 0;
            Double jumlahKali = 0.0;
            for (Integer penyakit1 : penyakit2) {
                jumlahKuadratX += Math.pow(penyakit1,2);
                jumlahKali += dataNilaiPenyakit1[i]*penyakit1;
                System.out.print(penyakit1+" ");
                i++;
            }
            dataNilaiPenyakit2[j] = jumlahKali/(Math.sqrt(jumlahKuadratX)*Math.sqrt(jumlahKuadratY));
            System.out.println(df.format(dataNilaiPenyakit2[j]));
            j++;
        }
        
        menampilkanData();
    }

    private void menampilkanData() {
        Intent intent = new Intent(this,HasilActivity.class);
        intent.putExtra("indeks",getMaxValue(dataNilaiPenyakit2));
        startActivity(intent);
    }

    public int getMaxValue(Double[] array) {
        Double maxValue = array[0];
        int indeks=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indeks = i;
            }
        }
        return indeks;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
            dataInputan[buttonView.getId()] = 1;
        else
            dataInputan[buttonView.getId()] = 0;
    }
}
