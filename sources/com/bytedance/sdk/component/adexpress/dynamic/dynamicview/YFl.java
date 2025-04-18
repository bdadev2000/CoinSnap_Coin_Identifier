package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class YFl extends Sg {
    private final Bitmap tN;
    private final Rect Sg = new Rect();
    private final Paint AlY = new Paint(1);

    public YFl(Bitmap bitmap, Sg sg2) {
        this.tN = bitmap;
        if (sg2 != null) {
            this.YFl = sg2.YFl;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sg
    public void YFl(Canvas canvas) {
        canvas.drawBitmap(this.tN, this.Sg, getBounds(), this.AlY);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.tN.getWidth();
        int height2 = this.tN.getHeight();
        this.Sg.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                Rect rect2 = this.Sg;
                int i10 = (width2 - width) / 2;
                rect2.left = i10;
                rect2.right = i10 + width;
            }
            if (height2 > height) {
                Rect rect3 = this.Sg;
                int i11 = (height2 - height) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + height;
                return;
            }
            return;
        }
        float f10 = height;
        float f11 = f10 * 1.0f;
        float f12 = height2;
        float f13 = f11 / f12;
        float f14 = width;
        float f15 = 1.0f * f14;
        float f16 = width2;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.Sg;
            int i13 = (height2 - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.Sg;
        int i15 = (width2 - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }
}
