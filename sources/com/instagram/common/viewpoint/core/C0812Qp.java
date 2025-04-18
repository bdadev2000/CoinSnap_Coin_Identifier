package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0812Qp extends RelativeLayout {
    public static String[] A03 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public C7V A00;
    public WeakReference<InterfaceC0811Qo> A01;
    public final InterfaceC0828Rf A02;

    public C0812Qp(C1045Zs c1045Zs, InterfaceC0828Rf interfaceC0828Rf) {
        super(c1045Zs);
        this.A02 = interfaceC0828Rf;
        M3.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(AbstractC0861Sm abstractC0861Sm) {
        addView(abstractC0861Sm, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C7V) abstractC0861Sm;
    }

    public final void A01(AbstractC0861Sm abstractC0861Sm) {
        M3.A0J(abstractC0861Sm);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A91();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        if (this.A00 != null) {
            this.A00.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2 = false;
        int heightSpecSize = this.A02.getVideoWidth();
        int widthSpecMode = this.A02.getVideoHeight();
        int width = getDefaultSize(heightSpecSize, i2);
        int height = getDefaultSize(widthSpecMode, i3);
        if (heightSpecSize > 0 && widthSpecMode > 0) {
            z2 = true;
            int mode = View.MeasureSpec.getMode(i2);
            int heightSpecMode = View.MeasureSpec.getSize(i2);
            int widthSpecSize = View.MeasureSpec.getMode(i3);
            int mVideoHeight = View.MeasureSpec.getSize(i3);
            if (mode != 1073741824 || widthSpecSize != 1073741824) {
                if (mode == 1073741824) {
                    width = heightSpecMode;
                    height = (width * widthSpecMode) / heightSpecSize;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                    }
                } else if (widthSpecSize == 1073741824) {
                    height = mVideoHeight;
                    width = (height * heightSpecSize) / widthSpecMode;
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                    }
                } else {
                    width = heightSpecSize;
                    height = widthSpecMode;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                        width = (height * heightSpecSize) / widthSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            } else {
                width = heightSpecMode;
                height = mVideoHeight;
                int mVideoWidth = heightSpecSize * height;
                if (mVideoWidth < width * widthSpecMode) {
                    int width2 = height * heightSpecSize;
                    String[] strArr = A03;
                    String str = strArr[2];
                    String str2 = strArr[1];
                    int mVideoWidth2 = str.length();
                    if (mVideoWidth2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    width = width2 / widthSpecMode;
                } else {
                    int mVideoWidth3 = heightSpecSize * height;
                    if (mVideoWidth3 > width * widthSpecMode) {
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            }
        }
        setMeasuredDimension(width, height);
        if (!z2 || this.A01 == null) {
            return;
        }
        WeakReference<InterfaceC0811Qo> weakReference = this.A01;
        int mVideoWidth4 = A03[6].charAt(8);
        if (mVideoWidth4 != 105) {
            throw new RuntimeException();
        }
        A03[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A01.get().AE2();
        }
    }

    public void setViewImplInflationListener(InterfaceC0811Qo interfaceC0811Qo) {
        this.A01 = new WeakReference<>(interfaceC0811Qo);
    }
}
