package com.bumptech.glide;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12833a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[g.values().length];
        b = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[0] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f12833a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12833a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f12833a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f12833a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f12833a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f12833a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f12833a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f12833a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
