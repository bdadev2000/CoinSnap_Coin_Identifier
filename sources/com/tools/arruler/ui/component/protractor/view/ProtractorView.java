package com.tools.arruler.ui.component.protractor.view;

import G7.j;
import U6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.protractor.ProtractorActivity;
import java.util.Arrays;
import java.util.Locale;
import t6.AbstractC2711a;
import u6.AbstractC2802s;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class ProtractorView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f19686s = 0;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19687c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f19688d;

    /* renamed from: f, reason: collision with root package name */
    public final int f19689f;

    /* renamed from: g, reason: collision with root package name */
    public float f19690g;

    /* renamed from: h, reason: collision with root package name */
    public float f19691h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f19692i;

    /* renamed from: j, reason: collision with root package name */
    public float f19693j;

    /* renamed from: k, reason: collision with root package name */
    public float f19694k;
    public final RectF l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f19695n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19696o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f19697p;

    /* renamed from: q, reason: collision with root package name */
    public float f19698q;

    /* renamed from: r, reason: collision with root package name */
    public a f19699r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtractorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        this.b = context;
        Paint paint = new Paint();
        this.f19687c = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f19688d = paint3;
        this.f19692i = new RectF();
        this.l = new RectF();
        Paint paint4 = new Paint();
        this.f19697p = paint4;
        this.f19698q = 90.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2711a.f23012a);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f19689f = obtainStyledAttributes.getInt(0, 10);
        obtainStyledAttributes.getDimensionPixelSize(4, 4);
        obtainStyledAttributes.recycle();
        paint2.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(R.color.color_black));
        paint.setAntiAlias(true);
        paint.setTextSize(33.0f);
        paint2.setStyle(style);
        paint.setStrokeWidth(4.0f);
        paint4.setColor(context.getResources().getColor(R.color.color_7F7200));
        paint4.setStrokeWidth(5.0f);
        paint3.setColor(context.getResources().getColor(R.color.color_black_20));
    }

    public final float a(float f9) {
        return TypedValue.applyDimension(1, f9, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z8;
        float f9;
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight();
        RectF rectF = this.f19692i;
        float width2 = (getWidth() * 0.8f) / 2.0f;
        float height2 = (getHeight() * 0.8f) / 2.0f;
        rectF.set(width - width2, height - height2, width2 + width, height2 + height);
        float min = Math.min(rectF.width() / 2.0f, rectF.height()) - 50.0f;
        this.f19691h = min;
        this.f19690g = min / 14.0f;
        float f11 = min / 20.0f;
        RectF rectF2 = this.l;
        rectF2.set((width - min) + 110.0f, (height - min) + 110.0f, (width + min) - 110.0f, (min + height) - 110.0f);
        canvas.drawArc(rectF2, -180.0f, this.f19698q, true, this.f19688d);
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 180.0f;
        for (float f15 = 180.0f; f13 <= f15; f15 = 180.0f) {
            double d2 = 0.017453292519943295d * f13;
            float cos = width - (this.f19691h * ((float) Math.cos(d2)));
            float f16 = f14;
            float sin = height - (this.f19691h * ((float) Math.sin(d2)));
            int i9 = this.f19689f;
            if (f13 % (i9 / f10) == f12 && f13 % i9 == f12) {
                z8 = true;
                f9 = this.f19690g * f10;
            } else {
                z8 = false;
                f9 = f11;
            }
            float cos2 = width - ((this.f19691h - f9) * ((float) Math.cos(d2)));
            float sin2 = height - ((this.f19691h - f9) * ((float) Math.sin(d2)));
            Paint paint = this.f19687c;
            canvas.drawLine(cos, sin, cos2, sin2, paint);
            if (z8 && f13 != f12 && f13 != f15) {
                float f17 = 1.3f * f9;
                float cos3 = width - ((this.f19691h - f17) * ((float) Math.cos(d2)));
                float sin3 = height - ((this.f19691h - f17) * ((float) Math.sin(d2)));
                String valueOf = String.valueOf((int) f13);
                float measureText = paint.measureText(valueOf);
                float descent = paint.descent() - paint.ascent();
                float f18 = 2;
                float f19 = measureText / f18;
                float cos4 = cos3 - (((float) Math.cos(d2)) * f19);
                float f20 = descent / f18;
                float sin4 = sin3 - (((float) Math.sin(d2)) * f20);
                canvas.save();
                float f21 = (-90.0f) + f13;
                canvas.rotate(f21, cos4, sin4);
                canvas.drawText(valueOf, cos4 - f19, sin4 + f20, paint);
                canvas.restore();
                C6.a aVar = new C6.a(this, 7);
                float f22 = 1.5f * f9;
                canvas.drawLine(width - (((this.f19691h - f17) - ((Number) aVar.invoke(Float.valueOf(5.0f))).floatValue()) * ((float) Math.cos(d2))), height - (((this.f19691h - f17) - ((Number) aVar.invoke(Float.valueOf(5.0f))).floatValue()) * ((float) Math.sin(d2))), width - (((this.f19691h - f22) - ((Number) aVar.invoke(Float.valueOf(15.0f))).floatValue()) * ((float) Math.cos(d2))), height - (((this.f19691h - f22) - ((Number) aVar.invoke(Float.valueOf(15.0f))).floatValue()) * ((float) Math.sin(d2))), paint);
                float f23 = 2.1f * f9;
                float cos5 = width - ((this.f19691h - f23) * ((float) Math.cos(d2)));
                float sin5 = height - ((this.f19691h - f23) * ((float) Math.sin(d2)));
                canvas.save();
                canvas.rotate(f21, cos5, sin5);
                String valueOf2 = String.valueOf((int) f16);
                if (valueOf2.length() == 2) {
                    canvas.drawText(valueOf2, (cos5 - f19) + 5, sin5 + f20, paint);
                } else {
                    canvas.drawText(valueOf2, (cos5 - f19) - 10, sin5 + f20, paint);
                }
                canvas.restore();
                float f24 = f9 * 2.4f;
                canvas.drawLine(width - ((this.f19691h - f24) * ((float) Math.cos(d2))), height - ((this.f19691h - f24) * ((float) Math.sin(d2))), width, height, paint);
            }
            f13 += 1.0f;
            f14 = f16 - 1.0f;
            f10 = 2.0f;
            f12 = 0.0f;
        }
        float f25 = this.f19698q;
        if (0.0f <= f25 && f25 <= 180.0f) {
            float f26 = this.f19691h * 1.1f;
            float a6 = a(20.0f);
            float a9 = a(10.0f);
            float a10 = a(1.5f);
            float a11 = a(15.0f);
            this.m = width - (((float) Math.cos(this.f19698q * 0.017453292519943295d)) * f26);
            this.f19695n = height - (f26 * ((float) Math.sin(this.f19698q * 0.017453292519943295d)));
            Paint paint2 = new Paint();
            Context context = this.b;
            paint2.setColor(context.getResources().getColor(R.color.color_FFE500));
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            float f27 = 1.5f * a11;
            canvas.drawArc(width - f27, height - f27, width + f27, height + f27, -180.0f, 180.0f, true, paint2);
            float f28 = this.m;
            float f29 = this.f19695n;
            Paint paint3 = this.f19697p;
            canvas.drawLine(width, height, f28, f29, paint3);
            canvas.drawCircle(this.m, this.f19695n, a(5.0f), paint3);
            this.f19693j = AbstractC2914a.a(this.m, width, 0.7f, width);
            this.f19694k = AbstractC2914a.a(this.f19695n, height, 0.7f, height);
            Paint paint4 = new Paint();
            paint4.setColor(context.getResources().getColor(R.color.color_white_60));
            canvas.drawCircle(this.f19693j, this.f19694k, a11, paint4);
            Paint paint5 = new Paint();
            paint5.setColor(context.getResources().getColor(R.color.color_black));
            paint5.setStyle(style);
            Path path = new Path();
            float f30 = a6 / 2;
            path.moveTo(this.f19693j - f30, this.f19694k);
            path.lineTo(this.f19693j - a10, this.f19694k - a9);
            path.lineTo(this.f19693j - a10, this.f19694k + a9);
            path.close();
            Path path2 = new Path();
            path2.moveTo(this.f19693j + f30, this.f19694k);
            path2.lineTo(this.f19693j + a10, this.f19694k - a9);
            path2.lineTo(this.f19693j + a10, this.f19694k + a9);
            path2.close();
            paint5.setPathEffect(new CornerPathEffect(7.0f));
            canvas.drawPath(path, paint5);
            canvas.drawPath(path2, paint5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        float width = getWidth() / 2.0f;
        float height = getHeight();
        if (action != 0) {
            if (action != 2) {
                return false;
            }
            if (this.f19696o) {
                float x9 = motionEvent.getX();
                float atan2 = (float) Math.atan2(getHeight() - motionEvent.getY(), -(x9 - (getWidth() / 2.0f)));
                if (atan2 <= 0.0f) {
                    atan2 += 6.2831855f;
                }
                float f9 = atan2 * 57.295776f;
                Log.e("TAG", "calculateAngle: " + f9);
                if (270.0f <= f9 && f9 <= 360.0f) {
                    f9 = 0.0f;
                } else if (180.0f <= f9 && f9 <= 270.0f) {
                    f9 = 180.0f;
                }
                this.f19698q = f9;
                a aVar = this.f19699r;
                if (aVar != null) {
                    ProtractorActivity protractorActivity = (ProtractorActivity) aVar;
                    String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f9)}, 1));
                    Log.e("Vinhtqkkk", "onAngleChanged: ".concat(format));
                    ((AbstractC2802s) protractorActivity.k()).f23409u.setText(o.j(protractorActivity.getString(R.string.angle_s, format), " °"));
                }
                float f10 = this.f19698q;
                if (0.0f <= f10 && f10 <= 180.0f) {
                    invalidate();
                }
            }
            return true;
        }
        float x10 = motionEvent.getX();
        float y4 = motionEvent.getY();
        float f11 = this.m;
        if (Math.abs(((f11 * height) + ((x10 * r7) - (y4 * r8))) - (r6 * width)) / Math.sqrt(Math.pow(f11 - width, 2.0d) + Math.pow(this.f19695n - height, 2.0d)) <= 20) {
            this.f19696o = true;
        } else {
            this.f19696o = false;
        }
        return true;
    }
}
