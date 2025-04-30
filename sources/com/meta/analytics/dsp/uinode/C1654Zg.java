package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1654Zg implements AnonymousClass59 {
    public final /* synthetic */ AbstractC09024o A00;

    public C1654Zg(AbstractC09024o abstractC09024o) {
        this.A00 = abstractC09024o;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final View A6M(int i9) {
        return this.A00.A0t(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0n(view) + ((C09034p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0k(view) - ((C09034p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0e();
    }
}
