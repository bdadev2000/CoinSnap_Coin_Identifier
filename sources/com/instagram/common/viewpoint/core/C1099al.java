package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1099al implements AnonymousClass59 {
    public final /* synthetic */ AbstractC02804o A00;

    public C1099al(AbstractC02804o abstractC02804o) {
        this.A00 = abstractC02804o;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final View A6k(int i2) {
        return this.A00.A0t(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A6m(View view) {
        return this.A00.A0n(view) + ((C02814p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A6n(View view) {
        return this.A00.A0k(view) - ((C02814p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A7y() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass59
    public final int A7z() {
        return this.A00.A0e();
    }
}
