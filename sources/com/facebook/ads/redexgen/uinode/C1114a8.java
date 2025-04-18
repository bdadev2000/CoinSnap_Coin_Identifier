package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1114a8 implements InterfaceC02792i {
    public final /* synthetic */ C1113a7 A00;

    public C1114a8(C1113a7 c1113a7) {
        this.A00 = c1113a7;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02792i
    public final void A5E(Canvas canvas, RectF rectF, float f10, Paint paint) {
        float f11 = f10 * 2.0f;
        float width = (rectF.width() - f11) - 1.0f;
        float height = (rectF.height() - f11) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f10 >= 1.0f) {
            float f12 = f10 + 0.5f;
            this.A00.A00.set(-f12, -f12, f12, f12);
            int save = canvas2.save();
            canvas2.translate(rectF.left + f12, rectF.top + f12);
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
            float f13 = (rectF.left + f12) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f12) + 1.0f;
            float roundedCornerRadius = rectF.top + f12;
            canvas2.drawRect(f13, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f14 = (rectF.left + f12) - 1.0f;
            float innerWidth2 = rectF.bottom - f12;
            float innerHeight2 = (rectF.right - f12) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f14, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f15 = rectF.left;
        float innerWidth3 = rectF.top + f10;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f15, innerWidth3, innerHeight3, rectF.bottom - f10, paint2);
    }
}
