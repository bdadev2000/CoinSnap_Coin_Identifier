package com.tools.arruler.utils.view;

import G7.j;
import I.h;
import T7.o;
import T7.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.c;
import com.tools.arruler.photomeasure.camera.ruler.R;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class BubbleLevelView extends View implements SensorEventListener {
    public final SensorManager b;

    /* renamed from: c, reason: collision with root package name */
    public o f19739c;

    /* renamed from: d, reason: collision with root package name */
    public o f19740d;

    /* renamed from: f, reason: collision with root package name */
    public float f19741f;

    /* renamed from: g, reason: collision with root package name */
    public float f19742g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19743h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19744i;

    /* renamed from: j, reason: collision with root package name */
    public float f19745j;

    /* renamed from: k, reason: collision with root package name */
    public float f19746k;
    public float l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19747n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f19748o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f19749p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f19750q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f19751r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f19752s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f19753t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f19754u;

    /* renamed from: v, reason: collision with root package name */
    public float f19755v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, "context");
        j.e(attributeSet, "attrs");
        Object systemService = context.getSystemService("sensor");
        j.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Float valueOf = Float.valueOf(0.0f);
        this.f19739c = new r(valueOf);
        this.f19740d = new r(valueOf);
        this.f19743h = getResources().getDimensionPixelSize(R.dimen._30sdp);
        this.f19744i = getResources().getDimensionPixelSize(R.dimen._6sdp);
        Paint paint = new Paint();
        paint.setColor(-65536);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f19747n = paint;
        Paint paint2 = new Paint();
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(5.0f);
        this.f19748o = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(h.getColor(context, R.color.color_80FFFFFF));
        paint3.setStyle(style);
        this.f19749p = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(h.getColor(context, R.color.color_80FFFFFF));
        paint4.setStyle(style2);
        paint4.setStrokeWidth(c.L(1, context));
        this.f19750q = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(-256);
        paint5.setStyle(style);
        this.f19751r = paint5;
        this.f19752s = new Paint();
        Paint paint6 = new Paint();
        paint6.setColor(h.getColor(context, R.color.color_00ff38));
        paint6.setTextSize(c.L(16, context));
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTypeface(K.o.a(context, R.font.poppins_medium));
        this.f19753t = paint6;
        this.f19754u = new Rect();
        sensorManager.registerListener(this, defaultSensor, 2);
        this.f19755v = 1.0f;
    }

    public final o getXSensor() {
        return this.f19739c;
    }

    public final o getYSensor() {
        return this.f19740d;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
        j.e(sensor, "sensor");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.unregisterListener(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap createScaledBitmap;
        float floatValue;
        Bitmap createScaledBitmap2;
        float floatValue2;
        Bitmap createScaledBitmap3;
        float floatValue3;
        float floatValue4;
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        this.f19755v = height / 2.5f;
        canvas.save();
        float f9 = width / 20.0f;
        canvas.translate(f9, 0.0f);
        float f10 = 2;
        float f11 = width / f10;
        float f12 = this.f19755v;
        float f13 = height / 20;
        float f14 = width / 50;
        int i9 = this.f19743h;
        float f15 = i9 / 2;
        float f16 = f11 + f15;
        float f17 = height / 12;
        Context context = getContext();
        j.d(context, "getContext(...)");
        float L8 = c.L(3, context);
        Paint paint = this.f19749p;
        canvas.drawCircle(f16, f17, L8, paint);
        float f18 = f14 + f13;
        Context context2 = getContext();
        j.d(context2, "getContext(...)");
        canvas.drawCircle(f18, f12, c.L(3, context2), paint);
        Context context3 = getContext();
        j.d(context3, "getContext(...)");
        canvas.drawCircle(f16, height, c.L(3, context3), paint);
        float f19 = width - f9;
        Context context4 = getContext();
        j.d(context4, "getContext(...)");
        canvas.drawCircle(f19, f12, c.L(3, context4), paint);
        Context context5 = getContext();
        j.d(context5, "getContext(...)");
        float L9 = c.L(3, context5) + f17;
        Context context6 = getContext();
        j.d(context6, "getContext(...)");
        float L10 = height - c.L(3, context6);
        Paint paint2 = this.f19750q;
        canvas.drawLine(f16, L9, f16, L10, paint2);
        Context context7 = getContext();
        j.d(context7, "getContext(...)");
        float L11 = c.L(3, context7) + f18;
        Context context8 = getContext();
        j.d(context8, "getContext(...)");
        canvas.drawLine(L11, f12, f19 - c.L(3, context8), f12, paint2);
        float f20 = this.f19755v;
        float f21 = 3;
        float min = Math.min(width, height) / f21;
        int i10 = (int) (min * f10);
        Bitmap createScaledBitmap4 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.background_center), i10, i10, false);
        j.d(createScaledBitmap4, "createScaledBitmap(...)");
        canvas.drawBitmap(createScaledBitmap4, (f11 - min) + f15, f20 - min, this.f19748o);
        float min2 = (Math.min(width, height) / f21) * f10;
        float f22 = min2 / f10;
        float f23 = i9;
        float f24 = f23 / f10;
        int i11 = (int) min2;
        int i12 = (int) f13;
        Bitmap createScaledBitmap5 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bg_ruler_horizontal), i11, i12, false);
        j.d(createScaledBitmap5, "createScaledBitmap(...)");
        Paint paint3 = this.f19751r;
        canvas.drawBitmap(createScaledBitmap5, (f11 - f22) + f24, getResources().getDimensionPixelSize(R.dimen._42sdp) / f10, paint3);
        float f25 = this.f19755v - f22;
        Bitmap createScaledBitmap6 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bg_ruler_vertical), i12, i11, false);
        j.d(createScaledBitmap6, "createScaledBitmap(...)");
        canvas.drawBitmap(createScaledBitmap6, f14, f25, paint3);
        int min3 = (Math.min(getWidth(), getHeight()) / 3) * 2;
        int height2 = getHeight() / 20;
        float floatValue5 = ((Number) ((r) this.f19739c).getValue()).floatValue();
        if (-0.4f <= floatValue5 && floatValue5 <= 0.4f) {
            float floatValue6 = ((Number) ((r) this.f19740d).getValue()).floatValue();
            if (-0.4f <= floatValue6 && floatValue6 <= 0.4f) {
                int i13 = (int) (min3 / 5.5f);
                createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_center), i13, i13, false);
                j.b(createScaledBitmap);
                float f26 = this.f19741f - (this.f19744i / 2);
                float height3 = this.f19742g - (createScaledBitmap.getHeight() / 2);
                Paint paint4 = this.f19747n;
                canvas.drawBitmap(createScaledBitmap, f26, height3, paint4);
                int i14 = min3 / 2;
                float width2 = (this.f19741f - ((getWidth() / 2) - i14)) + f24 + ((getWidth() / 2) - i14);
                int i15 = height2 / 2;
                float dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen._42sdp) / f10) + i15;
                floatValue = ((Number) ((r) this.f19739c).getValue()).floatValue();
                if (-0.4f > floatValue && floatValue <= 0.4f) {
                    createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_horizontal), min3 / 8, min3 / 12, false);
                } else {
                    createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_horizontal_red), min3 / 8, min3 / 12, false);
                }
                j.b(createScaledBitmap2);
                canvas.drawBitmap(createScaledBitmap2, width2 - (createScaledBitmap2.getWidth() / 2), dimensionPixelSize - (createScaledBitmap2.getHeight() / 2), paint4);
                int width3 = getWidth() / 50;
                float f27 = this.f19755v - i14;
                float f28 = (this.f19742g - f27) + f27;
                int i16 = width3 + i15;
                floatValue2 = ((Number) ((r) this.f19740d).getValue()).floatValue();
                if (-0.4f > floatValue2 && floatValue2 <= 0.4f) {
                    createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_vertical), min3 / 12, min3 / 8, false);
                } else {
                    createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_vertical_red), min3 / 12, min3 / 8, false);
                }
                j.b(createScaledBitmap3);
                canvas.drawBitmap(createScaledBitmap3, i16 - (createScaledBitmap3.getWidth() / 2.0f), f28 - (createScaledBitmap3.getHeight() / 2.0f), paint4);
                floatValue3 = ((Number) ((r) this.f19739c).getValue()).floatValue();
                if (-0.1f <= floatValue3 && floatValue3 <= 0.1f) {
                    floatValue4 = ((Number) ((r) this.f19740d).getValue()).floatValue();
                    if (-0.1f <= floatValue4 && floatValue4 <= 0.1f) {
                        int width4 = getWidth() / 2;
                        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.background_alignment);
                        Context context9 = getContext();
                        j.d(context9, "getContext(...)");
                        int L12 = (int) c.L(110, context9);
                        Context context10 = getContext();
                        j.d(context10, "getContext(...)");
                        Bitmap createScaledBitmap7 = Bitmap.createScaledBitmap(decodeResource, L12, (int) c.L(45, context10), false);
                        j.d(createScaledBitmap7, "createScaledBitmap(...)");
                        String string = h.getString(getContext(), R.string.alignment);
                        j.d(string, "getString(...)");
                        Paint paint5 = this.f19753t;
                        paint5.getTextBounds(string, 0, string.length(), this.f19754u);
                        float f29 = width4;
                        float f30 = f23 / 2.0f;
                        canvas.drawBitmap(createScaledBitmap7, (f29 - (createScaledBitmap7.getWidth() / 2.0f)) + f30, getHeight() / 8.0f, this.f19752s);
                        canvas.drawText(h.getString(getContext(), R.string.alignment), f30 + f29, (r11.height() / 4.0f) + (createScaledBitmap7.getHeight() / 2.0f) + (getHeight() / 8.0f), paint5);
                    }
                }
                canvas.restore();
            }
        }
        int i17 = (int) (min3 / 5.5f);
        createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_center_red), i17, i17, false);
        j.b(createScaledBitmap);
        float f262 = this.f19741f - (this.f19744i / 2);
        float height32 = this.f19742g - (createScaledBitmap.getHeight() / 2);
        Paint paint42 = this.f19747n;
        canvas.drawBitmap(createScaledBitmap, f262, height32, paint42);
        int i142 = min3 / 2;
        float width22 = (this.f19741f - ((getWidth() / 2) - i142)) + f24 + ((getWidth() / 2) - i142);
        int i152 = height2 / 2;
        float dimensionPixelSize2 = (getResources().getDimensionPixelSize(R.dimen._42sdp) / f10) + i152;
        floatValue = ((Number) ((r) this.f19739c).getValue()).floatValue();
        if (-0.4f > floatValue) {
        }
        createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_horizontal_red), min3 / 8, min3 / 12, false);
        j.b(createScaledBitmap2);
        canvas.drawBitmap(createScaledBitmap2, width22 - (createScaledBitmap2.getWidth() / 2), dimensionPixelSize2 - (createScaledBitmap2.getHeight() / 2), paint42);
        int width32 = getWidth() / 50;
        float f272 = this.f19755v - i142;
        float f282 = (this.f19742g - f272) + f272;
        int i162 = width32 + i152;
        floatValue2 = ((Number) ((r) this.f19740d).getValue()).floatValue();
        if (-0.4f > floatValue2) {
        }
        createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_bubble_vertical_red), min3 / 12, min3 / 8, false);
        j.b(createScaledBitmap3);
        canvas.drawBitmap(createScaledBitmap3, i162 - (createScaledBitmap3.getWidth() / 2.0f), f282 - (createScaledBitmap3.getHeight() / 2.0f), paint42);
        floatValue3 = ((Number) ((r) this.f19739c).getValue()).floatValue();
        if (-0.1f <= floatValue3) {
            floatValue4 = ((Number) ((r) this.f19740d).getValue()).floatValue();
            if (-0.1f <= floatValue4) {
                int width42 = getWidth() / 2;
                Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.background_alignment);
                Context context92 = getContext();
                j.d(context92, "getContext(...)");
                int L122 = (int) c.L(110, context92);
                Context context102 = getContext();
                j.d(context102, "getContext(...)");
                Bitmap createScaledBitmap72 = Bitmap.createScaledBitmap(decodeResource2, L122, (int) c.L(45, context102), false);
                j.d(createScaledBitmap72, "createScaledBitmap(...)");
                String string2 = h.getString(getContext(), R.string.alignment);
                j.d(string2, "getString(...)");
                Paint paint52 = this.f19753t;
                paint52.getTextBounds(string2, 0, string2.length(), this.f19754u);
                float f292 = width42;
                float f302 = f23 / 2.0f;
                canvas.drawBitmap(createScaledBitmap72, (f292 - (createScaledBitmap72.getWidth() / 2.0f)) + f302, getHeight() / 8.0f, this.f19752s);
                canvas.drawText(h.getString(getContext(), R.string.alignment), f302 + f292, (r11.height() / 4.0f) + (createScaledBitmap72.getHeight() / 2.0f) + (getHeight() / 8.0f), paint52);
            }
        }
        canvas.restore();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        j.e(sensorEvent, NotificationCompat.CATEGORY_EVENT);
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f9 = fArr[0];
            float f10 = fArr[1];
            this.f19745j = f9;
            this.f19746k = f10;
            float f11 = (-f9) + this.l;
            float f12 = (-f10) + this.m;
            o oVar = this.f19739c;
            Float valueOf = Float.valueOf(-f11);
            r rVar = (r) oVar;
            rVar.getClass();
            rVar.c(null, valueOf);
            o oVar2 = this.f19740d;
            Float valueOf2 = Float.valueOf(-f12);
            r rVar2 = (r) oVar2;
            rVar2.getClass();
            rVar2.c(null, valueOf2);
            float min = Math.min(getWidth(), getHeight()) / 3;
            float f13 = min - (min / 4.0f);
            float f14 = 10;
            float width = (getWidth() / 2) - ((f11 * min) / f14);
            float f15 = ((f12 * min) / f14) + this.f19755v;
            float f16 = this.f19741f;
            float a6 = AbstractC2914a.a(width, f16, 0.15f, f16);
            this.f19741f = a6;
            float f17 = this.f19742g;
            this.f19742g = AbstractC2914a.a(f15, f17, 0.15f, f17);
            float width2 = (this.f19741f - (getWidth() / 2)) * (a6 - (getWidth() / 2));
            float f18 = this.f19742g - this.f19755v;
            float sqrt = (float) Math.sqrt((f18 * f18) + width2);
            if (sqrt > f13) {
                float f19 = f13 / sqrt;
                this.f19741f = ((this.f19741f - (getWidth() / 2)) * f19) + (getWidth() / 2);
                float f20 = this.f19742g;
                float f21 = this.f19755v;
                this.f19742g = AbstractC2914a.a(f20, f21, f19, f21);
            }
            invalidate();
        }
    }

    public final void setXSensor(o oVar) {
        j.e(oVar, "<set-?>");
        this.f19739c = oVar;
    }

    public final void setYSensor(o oVar) {
        j.e(oVar, "<set-?>");
        this.f19740d = oVar;
    }
}
