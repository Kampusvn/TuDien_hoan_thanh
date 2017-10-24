package com.example.android.tudien;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Tạo ArrayList words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Bố", "Father"));
        words.add(new Word("Mẹ", "Mother"));
        words.add(new Word("Con trai", "Son"));
        words.add(new Word("Con gái", "Daughter"));
        words.add(new Word("Anh trai", "Older brother"));
        words.add(new Word("Em trai", "Younger brother"));
        words.add(new Word("Chị gái", "Older sister"));
        words.add(new Word("Em gái", "Younger sister"));
        words.add(new Word("Bà", "Grandmother"));
        words.add(new Word("Ông", "Grandfather"));

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
