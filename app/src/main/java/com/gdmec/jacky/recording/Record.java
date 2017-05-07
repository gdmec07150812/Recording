package com.gdmec.jacky.recording;

import java.util.UUID;

/**
 * Created by jacky on 2017/5/7.
 */

public class Record {
    private UUID mId;
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
