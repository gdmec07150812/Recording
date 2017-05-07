package com.gdmec.jacky.recording;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class RecordFragment extends Fragment {
    private Record mRecord;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRecord = new Record();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //新建一个视图
        View v = inflater.inflate(R.layout.fragment_record, container, false);
        //实例化mTitleField
        mTitleField = (EditText) v.findViewById(R.id.record_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //当编辑框的内容发生改变，直接修改mTitle的内容
                mRecord.setmTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }
}
