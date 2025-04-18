package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class qO extends Drawable {
    private RectF AlY;
    private int Sg;
    private Paint YFl;
    private int tN;

    public qO(int i10, int i11) {
        this.tN = i10;
        this.Sg = i11;
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setColor(0);
        this.YFl.setAntiAlias(true);
        this.YFl.setShadowLayer(i11, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.YFl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.AlY;
        int i10 = this.tN;
        canvas.drawRoundRect(rectF, i10, i10, this.YFl);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.YFl.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.Sg;
        this.AlY = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.YFl.setColorFilter(colorFilter);
    }
}
