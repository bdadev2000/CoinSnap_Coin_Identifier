package com.applovin.impl;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.widget.EditText;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tv {
    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable h(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ Drawable j(EditText editText) {
        return editText.getTextCursorDrawable();
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint l() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m(int i2, int i3, int i4) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i2, i3, i4);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint n(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void q() {
    }
}
