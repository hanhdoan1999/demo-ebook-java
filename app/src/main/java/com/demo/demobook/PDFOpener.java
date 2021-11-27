package com.demo.demobook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");





        if (getItem.equals("Đánh thức năng lực vô hạn")){

            myPDFViewer.fromAsset("danh_thuc_nang_luc_vo_han_anthony_robbins.pdf").load();
        }

        if (getItem.equals("Đời đơn giản khi ta đơn giản")){

            myPDFViewer.fromAsset("doi_don_gian_khi_ta_don_gian_xuan_nguyen.pdf").load();
        }

        if (getItem.equals("Hạnh phúc thật giản đơn")){

            myPDFViewer.fromAsset("hanh_phuc_that_gian_don_nguyen_manh_hung.pdf").load();
        }


        if (getItem.equals("Kỹ năng đi trước đam mê")){

            myPDFViewer.fromAsset("ky_nang_di_truoc_dam_me_cal_newport.pdf").load();
        }


        if (getItem.equals("Luật hấp dẫn")){

            myPDFViewer.fromAsset("luat_hap_dan_bi_mat_toi_cao_som_sujeera.pdf").load();
        }



    }
}
