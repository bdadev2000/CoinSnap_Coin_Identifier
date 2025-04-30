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
public class KS extends Drawable {
    private int KS;
    private RectF jU;
    private int lMd;
    private Paint zp;

    public KS(int i9, int i10) {
        this.KS = i9;
        this.lMd = i10;
        Paint paint = new Paint();
        this.zp = paint;
        paint.setColor(0);
        this.zp.setAntiAlias(true);
        this.zp.setShadowLayer(i10, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.zp.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.jU;
        int i9 = this.KS;
        canvas.drawRoundRect(rectF, i9, i9, this.zp);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.zp.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        int i13 = this.lMd;
        this.jU = new RectF(i9 + i13, i10 + i13, i11 - i13, i12 - i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.zp.setColorFilter(colorFilter);
    }
}
