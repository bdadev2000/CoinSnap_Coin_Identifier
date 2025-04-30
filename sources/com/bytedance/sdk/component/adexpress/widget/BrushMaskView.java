package com.bytedance.sdk.component.adexpress.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.component.sdk.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.tG;

/* loaded from: classes.dex */
public class BrushMaskView extends View {
    private static final String zp = "BrushMaskView";
    private Paint COT;
    private BitmapDrawable HWF;
    private Bitmap KS;
    private Paint QR;
    private Path YW;
    private Paint dT;
    private Canvas jU;
    private Path ku;
    private Paint lMd;

    public BrushMaskView(Context context) {
        super(context);
        zp(context);
    }

    public void KS() {
        final int width = getWidth();
        final int height = getHeight();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setIntValues(0, width);
        valueAnimator.setInterpolator(new TimeInterpolator() { // from class: com.bytedance.sdk.component.adexpress.widget.BrushMaskView.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f9) {
                int i9 = (int) (width * f9);
                if (BrushMaskView.this.jU != null) {
                    Canvas canvas = BrushMaskView.this.jU;
                    int i10 = height;
                    canvas.drawRect(0.0f, i10 / 2, i9 - 50, i10 / 2, BrushMaskView.this.QR);
                    BrushMaskView.this.jU.drawCircle(i9, height / 2, 10.0f, BrushMaskView.this.QR);
                }
                BrushMaskView.this.postInvalidate();
                return f9;
            }
        });
        valueAnimator.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.KS;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.COT);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setMeasuredDimension(zp(i9), zp(i10));
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        zp(i9, i10);
    }

    public void setEraserSize(float f9) {
        this.QR.setStrokeWidth(f9);
        this.dT.setStrokeWidth(f9);
    }

    public void setMaskColor(int i9) {
        this.lMd.setColor(i9);
    }

    @RequiresApi(api = 21)
    public void setWatermark(int i9) {
        if (i9 == -1) {
            this.HWF = null;
        } else {
            this.HWF = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), i9));
        }
    }

    private void lMd(float f9, float f10) {
        this.ku.reset();
        this.YW.reset();
        this.ku.moveTo(f9, f10);
        this.YW.moveTo(f9, f10);
    }

    private void zp(Context context) {
        Paint paint = new Paint();
        this.lMd = paint;
        paint.setAntiAlias(true);
        this.lMd.setDither(true);
        setMaskColor(-1426063361);
        Paint paint2 = new Paint();
        this.COT = paint2;
        paint2.setAntiAlias(true);
        this.COT.setDither(true);
        Paint paint3 = new Paint();
        this.dT = paint3;
        paint3.setColor(-7829368);
        this.dT.setAlpha(100);
        this.dT.setAntiAlias(true);
        this.dT.setDither(true);
        Paint paint4 = this.dT;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint paint5 = this.dT;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        setWatermark(-1);
        Paint paint6 = new Paint();
        this.QR = paint6;
        paint6.setAntiAlias(true);
        this.QR.setDither(true);
        this.QR.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.QR.setStyle(style);
        this.QR.setStrokeCap(cap);
        setEraserSize(60.0f);
        this.ku = new Path();
        this.YW = new Path();
    }

    public void lMd() {
        KS();
    }

    public void zp(float f9, float f10) {
        lMd(f9, f10);
        invalidate();
    }

    private void zp(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
            this.KS = createBitmap;
            Canvas canvas = this.jU;
            if (canvas == null) {
                this.jU = new Canvas(this.KS);
            } else {
                canvas.setBitmap(createBitmap);
            }
            this.jU.drawRoundRect(new RectF(0.0f, 0.0f, i9, i10), 120.0f, 120.0f, this.lMd);
            if (this.HWF != null) {
                this.HWF.setBounds(new Rect(0, 0, i9, i10));
                this.HWF.draw(this.jU);
            }
        } catch (Exception e4) {
            tG.zp(zp, e4.getMessage());
        }
    }

    private int zp(int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(0, size);
        }
        return 0;
    }

    public void zp() {
        zp(getWidth(), getHeight());
        invalidate();
    }
}
