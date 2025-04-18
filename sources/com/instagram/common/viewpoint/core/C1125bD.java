package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1125bD implements InterfaceC02232i {
    public final /* synthetic */ C1124bC A00;

    public C1125bD(C1124bC c1124bC) {
        this.A00 = c1124bC;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02232i
    public final void A5a(Canvas canvas, RectF rectF, float f2, Paint paint) {
        float f3 = f2 * 2.0f;
        float width = (rectF.width() - f3) - 1.0f;
        float height = (rectF.height() - f3) - 1.0f;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        if (f2 >= 1.0f) {
            float f4 = f2 + 0.5f;
            this.A00.A00.set(-f4, -f4, f4, f4);
            int save = canvas2.save();
            canvas2.translate(rectF.left + f4, rectF.top + f4);
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
            float f5 = (rectF.left + f4) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f4) + 1.0f;
            float roundedCornerRadius = rectF.top + f4;
            canvas2.drawRect(f5, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f6 = (rectF.left + f4) - 1.0f;
            float innerWidth2 = rectF.bottom - f4;
            float innerHeight2 = (rectF.right - f4) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f6, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f7 = rectF.left;
        float innerWidth3 = rectF.top + f2;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f7, innerWidth3, innerHeight3, rectF.bottom - f2, paint2);
    }
}
