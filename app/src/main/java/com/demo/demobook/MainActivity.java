package com.demo.demobook;



import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn =(Button) findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,TabHostActivity.class);
                startActivity(intent);
                
            }
        });



        getSupportActionBar().hide();

        // init constraintLayout
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        // initializing animation drawable by getting background from constraint layout
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(5000);

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000);


        TextView contentQ = (TextView) findViewById(R.id.contentQ);
        TextView author = (TextView) findViewById(R.id.author);


        Quotes quotes1 = new Quotes("Việc đọc rất quan trọng. Nếu bạn biết cách đọc, cả thế giới sẽ mở ra cho bạn.", "Barack Obama");
        Quotes quotes2 = new Quotes("Vào khoảnh khắc mà chúng ta quyết thuyết phục đứa trẻ, bất cứ đứa trẻ nào, bước qua bậc thềm ấy, bậc thềm màu nhiệm dẫn vào thư viện, ta thay đổi cuộc sống của nó mãi mãi, theo cách tốt đẹp hơn", "Barack Obama");
        Quotes quotes3 = new Quotes("Chúng ta là ai, mỗi người trong chúng ta là ai nếu không phải tổ hợp của kinh nghiệm, thông tin, những cuốn sách chúng ta đã đọc, những điều chúng ta đã tưởng tượng ra?", "Italo Valvino");
        Quotes quotes4 = new Quotes("Một cuốn sách thực sự hay nên đọc trong tuổi trẻ, rồi đọc lại khi đã trưởng thành, và một nửa lúc tuổi già, giống như một tòa nhà đẹp nên được chiêm ngưỡng trong ánh bình minh, nắng trưa và ánh trăng", "Robertson Davies");
        Quotes quotes5 = new Quotes("Cuốn sách tốt nhất cho bạn là cuốn sách nói nhiều nhất với bạn vào lúc bạn đọc nói. Tôi không nói tới cuốn sách cho bạn nhiều bài học nhất mà là cuốn sách nuôi dưỡng tâm hồn bạn. Và điều đó phụ thuộc vào tuổi tác, trải nghiệm, nhu cầu về tâm lý và tinh thần.", "Robertson Davies");
        Quotes quotes6 = new Quotes("Tôi đọc lòi cả mắt và vẫn không đọc được tới một nửa... người ta càng đọc nhiều, người ta càng thấy còn nhiều điều cần phải đọc", "John Adams");
        Quotes quotes7 = new Quotes("Đừng bao giờ cho mượn sách - chưa ai từng trả lại chúng; những cuốn sách duy nhất tôi có trong thư viện của mình là những cuốn người khác cho tôi mượn", "Anatole France");
        Quotes quotes8 = new Quotes("Chính từ sách mà những người khôn ngoan tìm được sự an ủi khỏi những rắc rối của cuộc đời", "Victor Hugo");
        Quotes quotes9 = new Quotes("Số lượng sách cứ tiếp tục lớn dần lên và ta có thể dự đoán rằng rồi sẽ đến lúc học được từ sách cũng khó như học toàn bộ vũ trụ. Rồi tìm kiếm từng chút sự thật ẩn dấu trong tự nhiên cũng sẽ thuận tiện như tìm nó giữa vô vàn chuồng sách", "Denis Diderot");
        Quotes quotes10 = new Quotes("Đọc sách hay cũng giống như trò chuyện với các bộ óc tuyệt vời nhất của những thế kỷ đã trôi qua", "Rene Descartes");
        Quotes quotes11 = new Quotes("Tất cả những gì con người làm, nghĩ hoặc trở thành: được bảo tồn một cách kỳ diệu trên những trang sách", "Thomas Carlyle");
        Quotes quotes12 = new Quotes("Chúng ta sẽ trở thành gì phụ thuộc vào điều chúng ta đọc sau khi các thầy cô giáo đã xong việc với chúng ta. Trường học vĩ đại nhất chính là sách vở", "Thomas Carlyle");
        Quotes quotes13 = new Quotes("Sách có thể ít đi một chút, nhưng phải tốt đẹp hơn. Không nên đặt một cuốn sách tầm thường lên giá sách", "N.Ôxtơrốpxki");
        Quotes quotes14 = new Quotes("Những gì sách dạy chúng ta cũng giống như lửa. Chúng ta lấy nó từ nhà hàng xóm, thắp nó trong nhà ra, đem nó truyền cho người khác và nó trở thành tài sản của tất cả mọi người", "Voltaire");
        Quotes quotes15 = new Quotes("Bạn biết rằng một cuốn sách hay trên giá sách là một người bạn dù quay lưng lại nhưng vẫn là bạn tốt", "Khuyết Danh");
        Quotes quotes16 = new Quotes("Sách hay, cũng như bạn tốt, ít và được lựa chọn; chọn lựa càng nhiều, thưởng thức càng nhiều", "Louis May Alcott");
        Quotes quotes17 = new Quotes("Lí tưởng là cuốn sách không có trật tự gì cả và người đọc phải tự khám phá ra cho mình", "Mark Twain");
        Quotes quotes18 = new Quotes("Sách là nguồn của cải quý báu của thế giới và là di sản xứng đáng của các thế hệ và các quốc gia", "Henry David Thoreau");
        Quotes quotes19 = new Quotes("Bạn biết rằng bạn đã đọc một cuốn sách hay khi bạn giở đến trang cuối cùng và cảm thấy như mình vừa chia tay một người bạn", "Khuyết Danh");
        Quotes quotes20 = new Quotes("Đọc sách có thể không giàu, nhưng không đọc, chắc chắn nghèo!", "Khuyết Danh");
        Quotes quotes21 = new Quotes("Một cuốn sách hay thực sự hay dạy tôi nhiều điều hơn là đọc nó, Tôi phải nhanh chóng đặt nó xuống, bắt đầu sống theo những điều nó chỉ dẫn. Điều tôi bắt đầu bằng cách đọc, tôi phải kết thúc bằng hành động", "Henry David Thoreau");
        Quotes quotes22 = new Quotes("Cuộc đời ta thay đổi theo hai cách: qua những người ta gặp và qua những cuốn sách ta đọc.", "Harvey MacKay");
        Quotes quotes23 = new Quotes("Thế giới vô cùng vĩ đại. Cặp mắt của bạn chỉ thấy được một phần nhỏ bé không đáng kể. Bởi vậy bạn hãy tìm lấy các sự kiện ở trong sách. Hãy tích lũy đều đặn hàng ngày các sự kiện ấy. ", "V.Ôbrưsép");

        Quotes quotes = new Quotes[]{quotes1, quotes2, quotes3, quotes4, quotes5, quotes6, quotes7, quotes8, quotes9, quotes10, quotes11, quotes12, quotes13, quotes14, quotes15, quotes16, quotes17, quotes18, quotes19, quotes20, quotes21, quotes22, quotes23}[(int) (Math.random() * 22)];

        contentQ.setText(quotes.getDesQuotes());
        author.setText("~ " + quotes.getAuthorQuotes() + " ~");

    }


    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning()) {
            // start the animation
            animationDrawable.start();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning()) {
            // stop the animation
            animationDrawable.stop();
        }
    }
}
