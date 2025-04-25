package com.glority.imagepicker.bean;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class Image {
    public String name;
    public String path;
    public long time;
    public Uri uri;

    public Image(String str, String str2, long j, Uri uri) {
        this.path = str;
        this.name = str2;
        this.time = j;
        this.uri = uri;
    }

    public boolean equals(Object obj) {
        try {
            Image image = (Image) obj;
            if (TextUtils.equals(this.uri.getPath(), image.uri.getPath())) {
                if (TextUtils.equals(this.uri.getScheme(), image.uri.getScheme())) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return super.equals(obj);
        }
    }
}
