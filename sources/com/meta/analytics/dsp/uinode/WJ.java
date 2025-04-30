package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class WJ extends C1155Fn implements Comparable<WJ> {
    public final int A00;

    public WJ(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, boolean z8, int i12, int i13) {
        super(charSequence, alignment, f9, i9, i10, f10, i11, f11, z8, i12);
        this.A00 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WJ wj) {
        int i9 = wj.A00;
        int i10 = this.A00;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
            return 1;
        }
        return 0;
    }
}
