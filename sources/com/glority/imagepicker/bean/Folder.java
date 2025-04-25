package com.glority.imagepicker.bean;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes6.dex */
public class Folder {
    public Image cover;
    public List<Image> images;
    public String name;
    public String path;

    public boolean equals(Object obj) {
        try {
            return TextUtils.equals(((Folder) obj).path, this.path);
        } catch (ClassCastException e) {
            e.printStackTrace();
            return super.equals(obj);
        }
    }
}
