package com.gdmec.jacky.recording;

import java.util.UUID;

public class Record {
    //Record项的唯一标识符
    private UUID mId;
    //Record项的标题
    private String mTitle;

    public Record() {
        //创建唯一标识符
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
