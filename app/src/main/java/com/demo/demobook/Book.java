package com.demo.demobook;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookName;

    // Image name (Without extension)
    private String bookIconName;
    private String bookAuther;
    private String categoryBook;
    private String [] chap;


    public Book() {
    }


    public Book(String bookName, String bookIconName, String bookAuther, String categoryBook, String[] chap) {
        this.bookName = bookName;
        this.bookIconName = bookIconName;
        this.bookAuther = bookAuther;
        this.categoryBook = categoryBook;
        this.chap = chap;
    }

    public Book(String bookName, String bookIconName, String bookAuther, String categoryBook) {
        this.bookName = bookName;
        this.bookIconName = bookIconName;
        this.bookAuther = bookAuther;
        this.categoryBook = categoryBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookIconName() {
        return bookIconName;
    }

    public void setBookIconName(String bookIconName) {
        this.bookIconName = bookIconName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public String[] getChap() {
        return chap;
    }

    public void setChap(String[] chap) {
        this.chap = chap;
    }

    public String getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(String categoryBook) {
        this.categoryBook = categoryBook;
    }

    public List<Book> getListData() {
        List<Book> list = new ArrayList<Book>();

        Book tuoi_tre_dang_gia_bao_nhieu =new Book("Tuổi trẻ đang giá bao nhiêu","tuoi_tre_dang_gia_bao_nhieu","Rosie Nguyen","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Phần 1: Tôi Đã Học Như Thế Nào?", "Phần 2: Học Đi Đôi Với Hành"});
        Book doi_ngan_dung_ngu_dai = new Book("Đời ngắn đừng ngủ dài", "doi_ngan_dung_ngu_dai", "Robin Saharam","Tâm Lý - Kỹ Năng Sống",
                new String[]{"01 Hãy Là Chính Mình", "02 Rào Cản Vô Hình","03 Sức Mạnh Của Sự Đơn Giản" });

        Book biet_hai_long =new Book("Biết hài lòng","biet_hai_long","Leo Babauta","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Thỏa thuận",
                        "Nguồn gốc của vấn đề",
                        "Sự hài lòng: Là gì và tại sao",
                        "Con đường dẫn đến sự hài lòng",
                        "Những giấc mơ tan vỡ",
                        "Quảng cáo và những giấc mơ tan vỡ",
                        "Hãy yêu chính mình",
                        "Nơi bắt nguồn hạnh phúc"});

        Book dam_bi_ghet=new Book("Dám bị ghét","dam_bi_ghet","Kishimi Ichiro","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Người khổng lồ thứ ba \"chưa được biết đến\"",
                        "Tại sao nói \"Con người có thể thay đổi\" ",
                        "Sang chấn tâm lý vốn không tồn tại",
                        "Con người ưa ngụy tạo cơn giận",
                        "Cách sống không bị quá khứ chi phối",
                        "Sokrates và Adler",
                        "Cậu không phải mãi \"như thế này\" mà được"});

        Book dam_uoc_mo=new Book("Dám ước mơ","dam_uoc_mo","Florence Littauer","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Phần 1. Dám Ước Mơ",
                        "Phần 2. Chuẩn Bị Cho Những Ước Mơ",
                        "Phần 3. Theo Đuổi Ước Mơ",
                        "Phần 4. Điều Chỉnh Ước Mơ",
                        "Phần 5. Chia Sẻ Ước Mơ"});

        Book loi_song_toi_gian_cua_nguoi_nhat =new Book("Lối sống tối giản của người nhật","loi_song_toi_gian_cua_nguoi_nhat","Sasaki Fumio","Tâm Lý - Kỹ Năng Sống",
                new String[]{"  Lời Mở Đầu",
                        "Tại Sao Lại Có Những Người Sống Tối Giản?",
                        "Tại Sao Đồ Đạc Lại Chất Nhiều Đến Vậy?",
                        "55 Quy Tắc Vứt Bỏ",
                        "Vứt Bớt Đồ Đạc, 12 Điều Thay Đổi Trong Tôi",
                        "Không Phải Trở Nên Hạnh Phúc Mà Là Cảm Nhận Hạnh Phúc",
                        "Lời Kết – Lời Cảm Ơn Chân Thành"});

        Book dan_than =new Book("Dấn thân","dan_than","Sheryl Sandberg","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Chương 1: Khoảng Trống Tham Vọng Lãnh Đạo",
                        "Chương 2: Ngồi Vào Bàn",
                        "Chương 3: Thành Công Và Yêu Quý",
                        "Chương 4: Bạn Có Phải Cố Vấn Của Tôi",
                        "Chương 5: Tìm Sự Thật Và Nói Lên Sự Thật",
                        "Chương 6: Đừng Tử Bỏ Trước Khi Chính Thức Rút Lui",
                        "Chương 7: Bạn Đời Phải Thật Sự Là Bạn Đời",
                        "Chương 8: Hoang Tưởng Về Người Đa Năng",
                        "Chương 9: Hãy Bắt Đầu Thảo Luận",
                        "Chương 10: Chung Tay Vì Một Thế Giới Bình Đẳng"});

        Book hung_bien_kieu_ted =new Book("Hùng biện kiểu ted","hung_bien_kieu_ted","Jeremey Donovan","Tâm Lý - Kỹ Năng Sống",
                new String[]{"Chương 1: Chọn Lựa Ý Tưởng Đáng Lan Tỏa",
                        "Chương 2: Tổ Chức Bài Diễn Thuyết",
                        "Chương 3: Kể Câu Chuyện Của Bạn",
                        "Chương 4: Trau Chuốt Khẩu Hiệu Của Bạn",
                        "Chương 5: Mở Đầu Bài Diễn Thuyết",
                        "Chương 6: Chuyển Ý Giữa Các Phần",
                        "Chương 7: Kết Thúc Bài Diễn Thuyết",
                        "Chương 8: Thể Hiện Cảm Xúc",
                        "Chương 9: Nâng Tầm Ngôn Ngữ",
                        "Chương 10: Thêm Chất Hài Hước"});

        Book danh_thuc_nang_luc_vo_han =new Book("Đánh thức năng lực vô hạn","danh_thuc_nang_luc_vo_han","Anthony Robbins","Tâm Lý - Kỹ Năng Sống");

        Book doi_don_gian_khi_ta_don_gian =new Book("Đời đơn giản khi ta đơn giản","doi_don_gian_khi_ta_don_gian","Xuan Nguyen","Tâm Lý - Kỹ Năng Sống");

        Book hanh_phuc_that_gian_don =new Book("Hạnh phúc thật giản đơn","hanh_phuc_that_gian_don","Nguyen Manh Hung","Cổ Tích - Thần Thoại");

        Book ky_nang_di_truoc_dam_me =new Book("Kỹ năng đi trước đam mê","ky_nang_di_truoc_dam_me","Cal Newport","Truyện Tranh");

        Book luat_hap_dan_bi_mat_toi_cao=new Book("Luật hấp dẫn","luat_hap_dan_bi_mat_toi_cao","Som Sujeera","Hồi Ký - Tuỳ Bút");


        list.add(tuoi_tre_dang_gia_bao_nhieu);
        list.add(loi_song_toi_gian_cua_nguoi_nhat);
        list.add(biet_hai_long);
        list.add(dam_bi_ghet);
        list.add(dam_uoc_mo);
        list.add(dan_than);
        list.add(hung_bien_kieu_ted);
        list.add(danh_thuc_nang_luc_vo_han);
        list.add(doi_don_gian_khi_ta_don_gian);
        list.add(hanh_phuc_that_gian_don);
        list.add(ky_nang_di_truoc_dam_me);
        list.add(doi_ngan_dung_ngu_dai);
        list.add(luat_hap_dan_bi_mat_toi_cao);


        return list;
    }

    public List<Book> getListNewData(List<Book> listold,String str){

        List<Book> newList= new ArrayList<Book>();

        for(int i=0;i<listold.size();i++){
            if(listold.get(i).getCategoryBook().equals(str)){
                newList.add(listold.get(i));
            }
        }

        return newList;
    }

    public List<Book> searchBook(List<Book> listold,String str){

        List<Book> newList= new ArrayList<Book>();

        for(int i=0;i<listold.size();i++){
            if(listold.get(i).getBookName().contains(str)){
                newList.add(listold.get(i));
            }
        }

        return newList;
    }
}
