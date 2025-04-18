package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1127bF implements InterfaceC02232i {
    public final /* synthetic */ C0524Fb A00;

    public C1127bF(C0524Fb c0524Fb) {
        this.A00 = c0524Fb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02232i
    public final void A5a(Canvas canvas, RectF rectF, float f2, Paint paint) {
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }
}
