package com.example.android.tudien;

/*
*Định nghĩa cho lớp Word
* Lớp này có thể tạo một đối tượng chứa 2 textView là nội dung tiếng Việt và tiếng Anh của một từ
* */

public class Word {


    // Nội dung tiếng Việt của từ
    private String mVietTranslation;

    // Nội dung tiếng Anh của từ
    private String mEngTranslation;

    public Word(String vietTranslation, String engTranslation){
        mVietTranslation = vietTranslation;
        mEngTranslation = engTranslation;
    }

    // Phương thức getVietTranslation
    public String getVietTranslation(){
        return mVietTranslation;
    }

    // Phương thức getEngTranslation
    public String getEngTranslation(){
        return mEngTranslation;
    }

}
