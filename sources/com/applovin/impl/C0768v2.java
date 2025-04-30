package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* renamed from: com.applovin.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768v2 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0768v2 f11659g = new C0768v2(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f11660a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11663e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f11664f;

    public C0768v2(int i9, int i10, int i11, int i12, int i13, Typeface typeface) {
        this.f11660a = i9;
        this.b = i10;
        this.f11661c = i11;
        this.f11662d = i12;
        this.f11663e = i13;
        this.f11664f = typeface;
    }

    public static C0768v2 a(CaptioningManager.CaptionStyle captionStyle) {
        if (yp.f12451a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static C0768v2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new C0768v2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static C0768v2 c(CaptioningManager.CaptionStyle captionStyle) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (captionStyle.hasForegroundColor()) {
            i9 = captionStyle.foregroundColor;
        } else {
            i9 = f11659g.f11660a;
        }
        int i14 = i9;
        if (captionStyle.hasBackgroundColor()) {
            i10 = captionStyle.backgroundColor;
        } else {
            i10 = f11659g.b;
        }
        int i15 = i10;
        if (captionStyle.hasWindowColor()) {
            i11 = captionStyle.windowColor;
        } else {
            i11 = f11659g.f11661c;
        }
        int i16 = i11;
        if (captionStyle.hasEdgeType()) {
            i12 = captionStyle.edgeType;
        } else {
            i12 = f11659g.f11662d;
        }
        int i17 = i12;
        if (captionStyle.hasEdgeColor()) {
            i13 = captionStyle.edgeColor;
        } else {
            i13 = f11659g.f11663e;
        }
        return new C0768v2(i14, i15, i16, i17, i13, captionStyle.getTypeface());
    }
}
