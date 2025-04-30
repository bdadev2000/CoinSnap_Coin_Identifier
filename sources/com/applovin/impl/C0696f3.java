package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;

/* renamed from: com.applovin.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0696f3 extends View {

    /* renamed from: x, reason: collision with root package name */
    private static final int f7532x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f7533y = Color.rgb(66, 145, 241);

    /* renamed from: z, reason: collision with root package name */
    private static final int f7534z = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f7535a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f7536c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f7537d;

    /* renamed from: f, reason: collision with root package name */
    private RectF f7538f;

    /* renamed from: g, reason: collision with root package name */
    private float f7539g;

    /* renamed from: h, reason: collision with root package name */
    private int f7540h;

    /* renamed from: i, reason: collision with root package name */
    private int f7541i;

    /* renamed from: j, reason: collision with root package name */
    private int f7542j;

    /* renamed from: k, reason: collision with root package name */
    private int f7543k;
    private int l;
    private float m;

    /* renamed from: n, reason: collision with root package name */
    private int f7544n;

    /* renamed from: o, reason: collision with root package name */
    private String f7545o;

    /* renamed from: p, reason: collision with root package name */
    private String f7546p;

    /* renamed from: q, reason: collision with root package name */
    private float f7547q;

    /* renamed from: r, reason: collision with root package name */
    private String f7548r;

    /* renamed from: s, reason: collision with root package name */
    private float f7549s;

    /* renamed from: t, reason: collision with root package name */
    private final float f7550t;

    /* renamed from: u, reason: collision with root package name */
    private final float f7551u;

    /* renamed from: v, reason: collision with root package name */
    private final float f7552v;

    /* renamed from: w, reason: collision with root package name */
    private final int f7553w;

    /* renamed from: com.applovin.impl.f3$a */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f9) {
            return (f9 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f9) {
            return f9 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C0696f3(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f7543k) * 360.0f;
    }

    public void a() {
        this.l = f7532x;
        this.f7540h = f7533y;
        this.f7539g = this.f7551u;
        setMax(100);
        setProgress(0);
        this.m = this.f7550t;
        this.f7544n = 0;
        this.f7547q = this.f7552v;
        this.f7541i = f7534z;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f7536c = textPaint;
        textPaint.setColor(this.f7540h);
        this.f7536c.setTextSize(this.f7539g);
        this.f7536c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f7537d = textPaint2;
        textPaint2.setColor(this.f7541i);
        this.f7537d.setTextSize(this.f7547q);
        this.f7537d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f7535a = paint;
        paint.setColor(this.l);
        this.f7535a.setStyle(Paint.Style.STROKE);
        this.f7535a.setAntiAlias(true);
        this.f7535a.setStrokeWidth(this.m);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(this.f7544n);
        this.b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.l;
    }

    public float getFinishedStrokeWidth() {
        return this.m;
    }

    public int getInnerBackgroundColor() {
        return this.f7544n;
    }

    public String getInnerBottomText() {
        return this.f7548r;
    }

    public int getInnerBottomTextColor() {
        return this.f7541i;
    }

    public float getInnerBottomTextSize() {
        return this.f7547q;
    }

    public int getMax() {
        return this.f7543k;
    }

    public String getPrefixText() {
        return this.f7545o;
    }

    public int getProgress() {
        return this.f7542j;
    }

    public String getSuffixText() {
        return this.f7546p;
    }

    public int getTextColor() {
        return this.f7540h;
    }

    public float getTextSize() {
        return this.f7539g;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f9 = this.m;
        this.f7538f.set(f9, f9, getWidth() - f9, getHeight() - f9);
        float width = getWidth();
        float f10 = this.m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f10) + f10) / 2.0f, this.b);
        canvas.drawArc(this.f7538f, 270.0f, -getProgressAngle(), false, this.f7535a);
        String str = this.f7545o + this.f7542j + this.f7546p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f7536c.measureText(str)) / 2.0f, (getWidth() - (this.f7536c.ascent() + this.f7536c.descent())) / 2.0f, this.f7536c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f7537d.setTextSize(this.f7547q);
            canvas.drawText(getInnerBottomText(), (getWidth() - this.f7537d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f7549s) - ((this.f7536c.ascent() + this.f7536c.descent()) / 2.0f), this.f7537d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(a(i9), a(i10));
        this.f7549s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7540h = bundle.getInt("text_color");
            this.f7539g = bundle.getFloat("text_size");
            this.f7547q = bundle.getFloat("inner_bottom_text_size");
            this.f7548r = bundle.getString("inner_bottom_text");
            this.f7541i = bundle.getInt("inner_bottom_text_color");
            this.l = bundle.getInt("finished_stroke_color");
            this.m = bundle.getFloat("finished_stroke_width");
            this.f7544n = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
            this.f7545o = bundle.getString("prefix");
            this.f7546p = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i9) {
        this.l = i9;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f9) {
        this.m = f9;
        invalidate();
    }

    public void setInnerBackgroundColor(int i9) {
        this.f7544n = i9;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f7548r = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i9) {
        this.f7541i = i9;
        invalidate();
    }

    public void setInnerBottomTextSize(float f9) {
        this.f7547q = f9;
        invalidate();
    }

    public void setMax(int i9) {
        if (i9 > 0) {
            this.f7543k = i9;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f7545o = str;
        invalidate();
    }

    public void setProgress(int i9) {
        this.f7542j = i9;
        if (i9 > getMax()) {
            this.f7542j %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f7546p = str;
        invalidate();
    }

    public void setTextColor(int i9) {
        this.f7540h = i9;
        invalidate();
    }

    public void setTextSize(float f9) {
        this.f7539g = f9;
        invalidate();
    }

    public C0696f3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0696f3(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f7538f = new RectF();
        this.f7542j = 0;
        this.f7545o = "";
        this.f7546p = "";
        this.f7548r = "";
        this.f7551u = a.d(getResources(), 14.0f);
        this.f7553w = (int) a.c(getResources(), 100.0f);
        this.f7550t = a.c(getResources(), 4.0f);
        this.f7552v = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == 1073741824) {
            return size;
        }
        int i10 = this.f7553w;
        return mode == Integer.MIN_VALUE ? Math.min(i10, size) : i10;
    }
}
