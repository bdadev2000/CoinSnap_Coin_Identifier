package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1087Zf implements AnonymousClass59 {
    public final /* synthetic */ AbstractC03364o A00;

    public C1087Zf(AbstractC03364o abstractC03364o) {
        this.A00 = abstractC03364o;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final View A6M(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A6O(View view) {
        return this.A00.A0j(view) + ((C03374p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A6P(View view) {
        return this.A00.A0o(view) - ((C03374p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A7a() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass59
    public final int A7b() {
        return this.A00.A0g();
    }
}
