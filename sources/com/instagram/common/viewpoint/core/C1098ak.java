package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1098ak implements AnonymousClass59 {
    public final /* synthetic */ AbstractC02804o A00;

    public C1098ak(AbstractC02804o abstractC02804o) {
        this.A00 = abstractC02804o;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final View A6k(int i2) {
        return this.A00.A0t(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A6m(View view) {
        return this.A00.A0j(view) + ((C02814p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A6n(View view) {
        return this.A00.A0o(view) - ((C02814p) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A7y() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A7z() {
        return this.A00.A0g();
    }
}
