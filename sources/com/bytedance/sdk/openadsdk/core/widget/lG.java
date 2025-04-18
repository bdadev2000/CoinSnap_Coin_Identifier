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

/* loaded from: classes.dex */
public class lG extends com.bytedance.sdk.openadsdk.core.wN.AlY {
    private final Matrix AlY;
    private int Sg;
    private final Paint YFl;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private BitmapShader f10766vc;
    private final RectF wN;

    public lG(Context context) {
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
        Bitmap YFl;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f10766vc == null && (YFl = YFl(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f10766vc = new BitmapShader(YFl, tileMode, tileMode);
            float f10 = 1.0f;
            if (YFl.getWidth() != getWidth() || YFl.getHeight() != getHeight()) {
                f10 = Math.max((getWidth() * 1.0f) / YFl.getWidth(), (getHeight() * 1.0f) / YFl.getHeight());
            }
            this.AlY.setScale(f10, f10);
            this.f10766vc.setLocalMatrix(this.AlY);
        }
        BitmapShader bitmapShader = this.f10766vc;
        if (bitmapShader != null) {
            this.YFl.setShader(bitmapShader);
            canvas.drawRoundRect(this.wN, this.Sg, this.tN, this.YFl);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.wN.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.Sg = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.tN = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f10766vc = null;
    }

    public lG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lG(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Sg = 25;
        this.tN = 25;
        this.wN = new RectF();
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.AlY = new Matrix();
    }
}
