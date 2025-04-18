package com.facebook.ads.redexgen.uinode;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Nt extends View {
    public static byte[] A09;
    public static String[] A0A = {"Nbc6Jmo5XxwoSf0WsC4pNUwvbxxmeuzU", "Es2t6BS2", "WUgCzt6qD3CB9cjx4HsVq0Jqaz41VBuo", "hkZRo5NTzxOFCAK6tj2hPIlun6a", "TTjuir0T4YhatH37Odlm7BF", "mNho4RFDELoa", "9llBB27OMv3OwRnb05oM", "XnRgJ28VorNH"};
    public static final int A0B;
    public float A00;
    public ObjectAnimator A01;
    public Bitmap A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{0, 2, Ascii.US, Ascii.ETB, 2, Ascii.NAK, 3, 3};
    }

    static {
        A01();
        A0B = (int) (LD.A02 * 5.0f);
    }

    public C0794Nt(C1070Yn c1070Yn) {
        super(c1070Yn);
        float f10 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A03 = f10;
        this.A00 = 0.0f;
        this.A01 = null;
        this.A07 = new RectF();
        this.A08 = new RectF();
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10);
        Paint paint2 = new Paint(1);
        this.A05 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f10);
        this.A06 = new Paint(1);
    }

    public final void A02(int i10, int i11, int i12) {
        this.A04.setColor(i10);
        this.A05.setColor(i11);
        this.A06.setColorFilter(new PorterDuffColorFilter(AbstractC02862p.A01(i11, i12), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            if (A0A[4].length() == 15) {
                throw new RuntimeException();
            }
            A0A[0] = "vMfsJaJNlQJ6eTU2cMKDLU2YSzRmfzEH";
            this.A01 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A07, 0.0f, 360.0f, false, this.A04);
        canvas.drawArc(this.A07, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A05);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight()), this.A08, this.A06);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i11), getDefaultSize(getSuggestedMinimumWidth(), i10));
        setMeasuredDimension(min, min);
        RectF rectF = this.A07;
        float f10 = (this.A03 / 2.0f) + 0.0f;
        int min2 = getPaddingLeft();
        float f11 = f10 + min2;
        float f12 = (this.A03 / 2.0f) + 0.0f;
        int min3 = getPaddingTop();
        float f13 = f12 + min3;
        float f14 = min - (this.A03 / 2.0f);
        int min4 = getPaddingRight();
        float f15 = f14 - min4;
        float f16 = min - (this.A03 / 2.0f);
        int min5 = getPaddingBottom();
        rectF.set(f11, f13, f15, f16 - min5);
        RectF rectF2 = this.A08;
        float f17 = this.A07.left;
        int i12 = A0B;
        rectF2.set(f17 + i12, this.A07.top + i12, this.A07.right - i12, this.A07.bottom - i12);
    }

    public void setImage(EnumC0745Lw enumC0745Lw) {
        this.A02 = enumC0745Lw == null ? null : AbstractC0746Lx.A01(enumC0745Lw);
        invalidate();
    }

    public void setProgress(float f10) {
        this.A00 = Math.min(f10, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f10);
        this.A01 = ofFloat;
        ofFloat.setDuration(400L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
    }
}
