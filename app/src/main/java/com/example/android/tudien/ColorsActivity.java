package com.example.android.tudien;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Tạo ArrayList words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Đỏ", "Red"));
        words.add(new Word("Vàng", "Yellow"));
        words.add(new Word("Xanh lá cây", "Green"));
        words.add(new Word("Nâu", "Brown"));
        words.add(new Word("Xám", "Gray"));
        words.add(new Word("Đen", "Black"));
        words.add(new Word("Trắng", "White"));

        // Tạo ArrayAdapter chứa dữ liệu là các chuỗi (String).
        // Các adapter tạo layout cho mỗi item trong danh sách, sử dụng word_list.xml.
        // Layout word_list.xml này chứa 2 TextView, mà adapter sẽ đặt
        // để hiển thị một từ.
        WordAdapter adapter = new WordAdapter(this,words);

        // Tìm đối tượng ListView trong sơ đồ phân cấp View của Activity.
        // Cần có một ListView với ID là list, được khai báo trong
        // file layout word_list
      ListView listView = (ListView) findViewById(R.id.list);

        // ListView sử dụng ArrayAdapter đã tạo ở trên để
        // ListView hiển thị danh sách item cho mỗi từ trong danh sách.
        // Thực hiện việc này bằng cách gọi phương thức setAdapter trên đối tượng ListView và truyền
        // đối số là WordAdapter với tên biến là adapter.
        listView.setAdapter(adapter);
    }

}
