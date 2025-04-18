package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public final class j extends e {

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f22814f = new Paint(1);

    /* renamed from: g, reason: collision with root package name */
    private static final Paint f22815g = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private final float[] f22816c;
    private Path d;

    public j(Context context) {
        super(context);
        this.f22816c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f22814f.setARGB(80, 0, 0, 0);
        Paint paint = f22815g;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i2) {
        setViewScale(i2 / 30.0f);
        a();
    }

    @Override // com.applovin.impl.adview.e, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f22797a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f22814f);
        Paint paint = f22815g;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.d, paint);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.e, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void a() {
        int i2 = 0;
        while (true) {
            float[] fArr = this.f22816c;
            if (i2 < fArr.length) {
                fArr[i2] = fArr[i2] * 0.3f * this.f22797a;
                i2++;
            } else {
                Path path = new Path();
                this.d = path;
                float[] fArr2 = this.f22816c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.d;
                float[] fArr3 = this.f22816c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.d;
                float[] fArr4 = this.f22816c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.d;
                float[] fArr5 = this.f22816c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.d;
                float[] fArr6 = this.f22816c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.d;
                float[] fArr7 = this.f22816c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
