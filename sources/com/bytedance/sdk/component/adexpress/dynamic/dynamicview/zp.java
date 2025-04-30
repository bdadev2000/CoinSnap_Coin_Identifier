package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class zp extends lMd {
    private final Bitmap KS;
    private final Rect lMd = new Rect();
    private final Paint jU = new Paint(1);

    public zp(Bitmap bitmap, lMd lmd) {
        this.KS = bitmap;
        if (lmd != null) {
            this.zp = lmd.zp;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.KS.getWidth();
        int height2 = this.KS.getHeight();
        this.lMd.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                Rect rect2 = this.lMd;
                int i9 = (width2 - width) / 2;
                rect2.left = i9;
                rect2.right = i9 + width;
            }
            if (height2 > height) {
                Rect rect3 = this.lMd;
                int i10 = (height2 - height) / 2;
                rect3.top = i10;
                rect3.bottom = i10 + height;
                return;
            }
            return;
        }
        float f9 = height;
        float f10 = f9 * 1.0f;
        float f11 = height2;
        float f12 = f10 / f11;
        float f13 = width;
        float f14 = 1.0f * f13;
        float f15 = width2;
        if (Math.max(f12, f14 / f15) > f12) {
            int i11 = (int) ((f10 / f13) * f15);
            Rect rect4 = this.lMd;
            int i12 = (height2 - i11) / 2;
            rect4.top = i12;
            rect4.bottom = i12 + i11;
            return;
        }
        int i13 = (int) ((f14 / f9) * f11);
        Rect rect5 = this.lMd;
        int i14 = (width2 - i13) / 2;
        rect5.left = i14;
        rect5.right = i14 + i13;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lMd
    public void zp(Canvas canvas) {
        canvas.drawBitmap(this.KS, this.lMd, getBounds(), this.jU);
    }
}
