package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;

/* loaded from: classes.dex */
public class lMd extends GradientDrawable {
    private final Paint lMd;
    protected Path zp;

    public lMd() {
        this.zp = new Path();
        Paint paint = new Paint(1);
        this.lMd = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.zp;
        if (path != null && !path.isEmpty()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.lMd, 31);
            zp(canvas);
            this.lMd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.zp, this.lMd);
            this.lMd.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        zp(canvas);
    }

    public void zp(Canvas canvas) {
        super.draw(canvas);
    }

    public void zp(int i9, int i10, int i11, int i12) {
        this.zp.addRect(i9, i10, i11, i12, Path.Direction.CW);
        invalidateSelf();
    }

    public lMd(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.zp = new Path();
        Paint paint = new Paint(1);
        this.lMd = paint;
        paint.setColor(-1);
    }
}
