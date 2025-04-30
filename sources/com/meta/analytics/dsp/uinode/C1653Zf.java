package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1653Zf implements AnonymousClass59 {
    public final /* synthetic */ AbstractC09024o A00;

    public C1653Zf(AbstractC09024o abstractC09024o) {
        this.A00 = abstractC09024o;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final View A6M(int i9) {
        return this.A00.A0t(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0j(view) + ((C09034p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0o(view) - ((C09034p) view.getLayoutParams()).topMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0g();
    }
}
