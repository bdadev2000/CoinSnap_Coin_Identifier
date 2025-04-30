package com.bytedance.sdk.component.adexpress.widget;

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
import android.widget.ImageView;

/* loaded from: classes.dex */
public class TTRoundRectImageView extends ImageView {
    private int KS;
    private Matrix jU;
    private int lMd;
    private Paint zp;

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
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap zp = zp(drawable);
            if (zp != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(zp, tileMode, tileMode);
                float f9 = 1.0f;
                if (zp.getWidth() != getWidth() || zp.getHeight() != getHeight()) {
                    f9 = Math.max((getWidth() * 1.0f) / zp.getWidth(), (getHeight() * 1.0f) / zp.getHeight());
                }
                this.jU.setScale(f9, f9);
                bitmapShader.setLocalMatrix(this.jU);
                this.zp.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.lMd, this.KS, this.zp);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i9) {
        this.lMd = i9;
        postInvalidate();
    }

    public void setYRound(int i9) {
        this.KS = i9;
        postInvalidate();
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.lMd = 25;
        this.KS = 25;
        Paint paint = new Paint();
        this.zp = paint;
        paint.setAntiAlias(true);
        this.zp.setFilterBitmap(true);
        this.jU = new Matrix();
    }
}
