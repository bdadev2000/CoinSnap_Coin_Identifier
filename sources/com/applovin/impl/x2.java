package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: g, reason: collision with root package name */
    public static final x2 f27825g = new x2(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f27826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27828c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f27829f;

    public x2(int i2, int i3, int i4, int i5, int i6, Typeface typeface) {
        this.f27826a = i2;
        this.f27827b = i3;
        this.f27828c = i4;
        this.d = i5;
        this.e = i6;
        this.f27829f = typeface;
    }

    public static x2 a(CaptioningManager.CaptionStyle captionStyle) {
        return xp.f27962a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static x2 b(CaptioningManager.CaptionStyle captionStyle) {
        return new x2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static x2 c(CaptioningManager.CaptionStyle captionStyle) {
        return new x2(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f27825g.f27826a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f27825g.f27827b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f27825g.f27828c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f27825g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f27825g.e, captionStyle.getTypeface());
    }
}
