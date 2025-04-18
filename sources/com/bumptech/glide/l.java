package com.bumptech.glide;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9687b;

    static {
        int[] iArr = new int[h.values().length];
        f9687b = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9687b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9687b[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9687b[0] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
