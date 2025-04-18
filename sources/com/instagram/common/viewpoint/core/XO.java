package com.instagram.common.viewpoint.core;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class XO extends C0539Fs implements Comparable<XO> {
    public final int A00;

    public XO(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z2, int i5, int i6) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4, z2, i5);
        this.A00 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(XO xo) {
        if (xo.A00 < this.A00) {
            return -1;
        }
        if (xo.A00 > this.A00) {
            return 1;
        }
        return 0;
    }
}
