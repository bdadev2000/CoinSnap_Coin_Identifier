package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.3a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08633a extends ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public boolean A05;

    public C08633a() {
        super(-1, -1);
        this.A00 = 0.0f;
    }

    public C08633a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08703h.A0u);
        this.A04 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
