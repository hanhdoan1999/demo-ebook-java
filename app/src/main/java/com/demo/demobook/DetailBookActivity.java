package com.demo.demobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DetailBookActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);
        Intent intent = this.getIntent();
        webView = (WebView)findViewById(R.id.webView1);

        WebSettings webSetting = webView.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webSetting.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        String item= intent.getStringExtra("arrayChapSelecter");
        if (item.equals("Phần 1: Tôi Đã Học Như Thế Nào?")){

            webView.loadUrl("file:///android_asset/01_chap1.html");
        }
        if (item.equals("Phần 2: Học Đi Đôi Với Hành")){

            webView.loadUrl("file:///android_asset/01_chap2.html");
        }

        //---------------------------------------------------------
        if (item.equals("01 Hãy Là Chính Mình")){

            webView.loadUrl("file:///android_asset/02_chap1.html");
        }


        if (item.equals("02 Rào Cản Vô Hình")){

            webView.loadUrl("file:///android_asset/02_chap2.html");
        }

        if (item.equals("03 Sức Mạnh Của Sự Đơn Giản")){

            webView.loadUrl("file:///android_asset/02_chap3.html");
        }
        //---------------------------------------------------------

        if (item.equals("Phần 1. Dám Ước Mơ")){

            webView.loadUrl("file:///android_asset/05_chap1.html");
        }
        if (item.equals("Phần 2. Chuẩn Bị Cho Những Ước Mơ")){

            webView.loadUrl("file:///android_asset/05_chap2.html");
        }
        if (item.equals("Phần 3. Theo Đuổi Ước Mơ")){

            webView.loadUrl("file:///android_asset/05_chap3.html");
        }
        if (item.equals("Phần 4. Điều Chỉnh Ước Mơ")){

            webView.loadUrl("file:///android_asset/05_chap4.html");
        }
        if (item.equals("Phần 5. Chia Sẻ Ước Mơ")){

            webView.loadUrl("file:///android_asset/05_chap5.html");
        }

        //---------------------------------------------------------

        if (item.equals("Thỏa thuận")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap1.html");
        }
        if (item.equals("Nguồn gốc của vấn đề")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap2.html");
        }
        if (item.equals("Sự hài lòng: Là gì và tại sao")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap3.html");
        }
        if (item.equals("Con đường dẫn đến sự hài lòng")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap4.html");
        }
        if (item.equals("Những giấc mơ tan vỡ")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap5.html");
        }
        if (item.equals("Quảng cáo và những giấc mơ tan vỡ")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap6.html");
        }
        if (item.equals("Hãy yêu chính mình")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap7.html");
        }
        if (item.equals("Nơi bắt nguồn hạnh phúc")){

            webView.loadUrl("file:///android_asset/biet_hai_long/08_chap8.html");
        }

        //--------------------------------------------------------
        if (item.equals("Người khổng lồ thứ ba \"chưa được biết đến\"")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap1.html");
        }
        if (item.equals("Tại sao nói \"Con người có thể thay đổi\" ")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap2.html");
        }
        if (item.equals("Sang chấn tâm lý vốn không tồn tại")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap3.html");
        }
        if (item.equals("Con người ưa ngụy tạo cơn giận")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap4.html");
        }
        if (item.equals("Cách sống không bị quá khứ chi phối")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap5.html");
        }
        if (item.equals("Sokrates và Adler")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap6.html");
        }
        if (item.equals("Cậu không phải mãi \"như thế này\" mà được")){

            webView.loadUrl("file:///android_asset/dam_bi_ghet/07_chap7.html");
        }
        //---------------------------------------------------------------------

        if (item.equals("Chương 1: Khoảng Trống Tham Vọng Lãnh Đạo")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap1.html");
        }
        if (item.equals("Chương 2: Ngồi Vào Bàn")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap2.html");
        }
        if (item.equals("Chương 3: Thành Công Và Yêu Quý")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap3.html");
        }
        if (item.equals("Chương 4: Bạn Có Phải Cố Vấn Của Tôi")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap4.html");
        }
        if (item.equals("Chương 5: Tìm Sự Thật Và Nói Lên Sự Thật")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap5.html");
        }
        if (item.equals("Chương 6: Đừng Tử Bỏ Trước Khi Chính Thức Rút Lui")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap6.html");
        }
        if (item.equals("Chương 7: Bạn Đời Phải Thật Sự Là Bạn Đời")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap7.html");
        }
        if (item.equals("Chương 8: Hoang Tưởng Về Người Đa Năng")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap8.html");
        }
        if (item.equals("Chương 9: Hãy Bắt Đầu Thảo Luận")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap9.html");
        }
        if (item.equals("Chương 10: Chung Tay Vì Một Thế Giới Bình Đẳng")){

            webView.loadUrl("file:///android_asset/dan_than/09_chap10.html");
        }

        //--------------------------------------------------------------------
        if (item.equals("Chương 1: Chọn Lựa Ý Tưởng Đáng Lan Tỏa")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap1.html");
        }
        if (item.equals("Chương 2: Tổ Chức Bài Diễn Thuyết")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap2.html");
        }
        if (item.equals("Chương 3: Kể Câu Chuyện Của Bạn")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap3.html");
        }
        if (item.equals("Chương 4: Trau Chuốt Khẩu Hiệu Của Bạn")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap4.html");
        }
        if (item.equals("Chương 5: Mở Đầu Bài Diễn Thuyết")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap5.html");
        }
        if (item.equals("Chương 6: Chuyển Ý Giữa Các Phần")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap6.html");
        }
        if (item.equals("Chương 7: Kết Thúc Bài Diễn Thuyết")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap7.html");
        }
        if (item.equals("Chương 8: Thể Hiện Cảm Xúc")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap8.html");
        }
        if (item.equals("Chương 9: Nâng Tầm Ngôn Ngữ")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap9.html");
        }
        if (item.equals("Chương 10: Thêm Chất Hài Hước")){

            webView.loadUrl("file:///android_asset/hung_bien/06_chap10.html");
        }

        //--------------------------------------------------------
        if (item.equals("  Lời Mở Đầu")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/0_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_tai_sao_lai_co_nhung_nguoi_song_toi_gian.html");
        }
        if (item.equals("Tại Sao Lại Có Những Người Sống Tối Giản?")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/1_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_loi_mo_dau.html");
        }
        if (item.equals("Tại Sao Đồ Đạc Lại Chất Nhiều Đến Vậy?")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/2_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_tai_sao_do_dac_lai_chat_nhieu_den_vay.html");
        }
        if (item.equals("55 Quy Tắc Vứt Bỏ")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/3_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_55_quy_tac_vut_bo.html");
        }
        if (item.equals("Vứt Bớt Đồ Đạc, 12 Điều Thay Đổi Trong Tôi")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/4_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumiovut_bot_do_dac_12_dieu_thay_doi_trong_toi.html");
        }
        if (item.equals("Không Phải Trở Nên Hạnh Phúc Mà Là Cảm Nhận Hạnh Phúc")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/5_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_khong_phai_tro_nen_hanh_phuc_ma_la_cam_nhan_hanh_phuc.html");
        }
        if (item.equals("Lời Kết – Lời Cảm Ơn Chân Thành")){

            webView.loadUrl("file:///android_asset/loi_song_toi_gian/6_loi_song_toi_gian_cua_nguoi_nhat_sasaki_fumio_loi_ket_loi_cam_on_chan_thanh.html");
        }

        }


    }

