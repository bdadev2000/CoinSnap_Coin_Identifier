package com.bytedance.sdk.component.adexpress.vc;

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
public class UZM extends ImageView {
    private Matrix AlY;
    private int Sg;
    private Paint YFl;
    private int tN;

    public UZM(Context context) {
        this(context, null);
    }

    private Bitmap YFl(Drawable drawable) {
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
            Bitmap YFl = YFl(drawable);
            if (YFl != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(YFl, tileMode, tileMode);
                float f10 = 1.0f;
                if (YFl.getWidth() != getWidth() || YFl.getHeight() != getHeight()) {
                    f10 = Math.max((getWidth() * 1.0f) / YFl.getWidth(), (getHeight() * 1.0f) / YFl.getHeight());
                }
                this.AlY.setScale(f10, f10);
                bitmapShader.setLocalMatrix(this.AlY);
                this.YFl.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.Sg, this.tN, this.YFl);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setXRound(int i10) {
        this.Sg = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.tN = i10;
        postInvalidate();
    }

    public UZM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UZM(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Sg = 25;
        this.tN = 25;
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setAntiAlias(true);
        this.YFl.setFilterBitmap(true);
        this.AlY = new Matrix();
    }
}
