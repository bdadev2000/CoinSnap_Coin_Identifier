package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: g, reason: collision with root package name */
    public static final v2 f8452g = new v2(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8453b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8455d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8456e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f8457f;

    public v2(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.a = i10;
        this.f8453b = i11;
        this.f8454c = i12;
        this.f8455d = i13;
        this.f8456e = i14;
        this.f8457f = typeface;
    }

    public static v2 a(CaptioningManager.CaptionStyle captionStyle) {
        if (yp.a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static v2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new v2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static v2 c(CaptioningManager.CaptionStyle captionStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (captionStyle.hasForegroundColor()) {
            i10 = captionStyle.foregroundColor;
        } else {
            i10 = f8452g.a;
        }
        int i15 = i10;
        if (captionStyle.hasBackgroundColor()) {
            i11 = captionStyle.backgroundColor;
        } else {
            i11 = f8452g.f8453b;
        }
        int i16 = i11;
        if (captionStyle.hasWindowColor()) {
            i12 = captionStyle.windowColor;
        } else {
            i12 = f8452g.f8454c;
        }
        int i17 = i12;
        if (captionStyle.hasEdgeType()) {
            i13 = captionStyle.edgeType;
        } else {
            i13 = f8452g.f8455d;
        }
        int i18 = i13;
        if (captionStyle.hasEdgeColor()) {
            i14 = captionStyle.edgeColor;
        } else {
            i14 = f8452g.f8456e;
        }
        return new v2(i15, i16, i17, i18, i14, captionStyle.getTypeface());
    }
}
