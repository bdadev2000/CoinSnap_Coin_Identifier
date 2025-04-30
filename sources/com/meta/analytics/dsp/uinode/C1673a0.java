package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1673a0 implements C3D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C08703h A01;

    public C1673a0(C08703h c08703h) {
        this.A01 = c08703h;
    }

    @Override // com.meta.analytics.dsp.uinode.C3D
    public final C08733k AAk(View view, C08733k c08733k) {
        C08733k A06 = C3T.A06(view, c08733k);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int i9 = this.A01.getChildCount();
        for (int count = 0; count < i9; count++) {
            C08733k A05 = C3T.A05(this.A01.getChildAt(count), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C08733k applied = A06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
