package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends PAGImageView {
    private final RectF COT;
    private BitmapShader HWF;
    private int KS;
    private final Matrix jU;
    private int lMd;
    private final Paint zp;

    public TTRoundRectImageView(Context context) {
        this(context, null);
    }

    private Bitmap zp(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0) {
            intrinsicWidth = getWidth();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() <= 0) {
            intrinsicHeight = getHeight();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap zp;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.HWF == null && (zp = zp(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.HWF = new BitmapShader(zp, tileMode, tileMode);
            float f9 = 1.0f;
            if (zp.getWidth() != getWidth() || zp.getHeight() != getHeight()) {
                f9 = Math.max((getWidth() * 1.0f) / zp.getWidth(), (getHeight() * 1.0f) / zp.getHeight());
            }
            this.jU.setScale(f9, f9);
            this.HWF.setLocalMatrix(this.jU);
        }
        BitmapShader bitmapShader = this.HWF;
        if (bitmapShader != null) {
            this.zp.setShader(bitmapShader);
            canvas.drawRoundRect(this.COT, this.lMd, this.KS, this.zp);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.COT.set(0.0f, 0.0f, i9, i10);
    }

    public void setXRound(int i9) {
        this.lMd = i9;
        postInvalidate();
    }

    public void setYRound(int i9) {
        this.KS = i9;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.HWF = null;
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.lMd = 25;
        this.KS = 25;
        this.COT = new RectF();
        Paint paint = new Paint();
        this.zp = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.jU = new Matrix();
    }
}
