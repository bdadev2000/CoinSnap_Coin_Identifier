package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1680a8 implements InterfaceC08452i {
    public final /* synthetic */ C1679a7 A00;

    public C1680a8(C1679a7 c1679a7) {
        this.A00 = c1679a7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08452i
    public final void A5E(Canvas canvas, RectF rectF, float f9, Paint paint) {
        float f10 = f9 * 2.0f;
        float width = (rectF.width() - f10) - 1.0f;
        float height = (rectF.height() - f10) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f9 >= 1.0f) {
            float f11 = f9 + 0.5f;
            this.A00.A00.set(-f11, -f11, f11, f11);
            int save = canvas2.save();
            canvas2.translate(rectF.left + f11, rectF.top + f11);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(height, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(save);
            float f12 = (rectF.left + f11) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f11) + 1.0f;
            float roundedCornerRadius = rectF.top + f11;
            canvas2.drawRect(f12, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f13 = (rectF.left + f11) - 1.0f;
            float innerWidth2 = rectF.bottom - f11;
            float innerHeight2 = (rectF.right - f11) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f13, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f14 = rectF.left;
        float innerWidth3 = rectF.top + f9;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f14, innerWidth3, innerHeight3, rectF.bottom - f9, paint2);
    }
}
