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
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class h3 extends View {
    private static final int x = Color.rgb(66, Opcodes.I2B, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f24197y = Color.rgb(66, Opcodes.I2B, 241);

    /* renamed from: z, reason: collision with root package name */
    private static final int f24198z = Color.rgb(66, Opcodes.I2B, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f24199a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f24200b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f24201c;
    protected Paint d;

    /* renamed from: f, reason: collision with root package name */
    private RectF f24202f;

    /* renamed from: g, reason: collision with root package name */
    private float f24203g;

    /* renamed from: h, reason: collision with root package name */
    private int f24204h;

    /* renamed from: i, reason: collision with root package name */
    private int f24205i;

    /* renamed from: j, reason: collision with root package name */
    private int f24206j;

    /* renamed from: k, reason: collision with root package name */
    private int f24207k;

    /* renamed from: l, reason: collision with root package name */
    private int f24208l;

    /* renamed from: m, reason: collision with root package name */
    private float f24209m;

    /* renamed from: n, reason: collision with root package name */
    private int f24210n;

    /* renamed from: o, reason: collision with root package name */
    private String f24211o;

    /* renamed from: p, reason: collision with root package name */
    private String f24212p;

    /* renamed from: q, reason: collision with root package name */
    private float f24213q;

    /* renamed from: r, reason: collision with root package name */
    private String f24214r;

    /* renamed from: s, reason: collision with root package name */
    private float f24215s;

    /* renamed from: t, reason: collision with root package name */
    private final float f24216t;

    /* renamed from: u, reason: collision with root package name */
    private final float f24217u;

    /* renamed from: v, reason: collision with root package name */
    private final float f24218v;
    private final int w;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f2) {
            return (f2 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f2) {
            return f2 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public h3(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f24207k) * 360.0f;
    }

    public void a() {
        this.f24208l = x;
        this.f24204h = f24197y;
        this.f24203g = this.f24217u;
        setMax(100);
        setProgress(0);
        this.f24209m = this.f24216t;
        this.f24210n = 0;
        this.f24213q = this.f24218v;
        this.f24205i = f24198z;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f24201c = textPaint;
        textPaint.setColor(this.f24204h);
        this.f24201c.setTextSize(this.f24203g);
        this.f24201c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.d = textPaint2;
        textPaint2.setColor(this.f24205i);
        this.d.setTextSize(this.f24213q);
        this.d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f24199a = paint;
        paint.setColor(this.f24208l);
        this.f24199a.setStyle(Paint.Style.STROKE);
        this.f24199a.setAntiAlias(true);
        this.f24199a.setStrokeWidth(this.f24209m);
        Paint paint2 = new Paint();
        this.f24200b = paint2;
        paint2.setColor(this.f24210n);
        this.f24200b.setAntiAlias(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public int getFinishedStrokeColor() {
        return this.f24208l;
    }

    public float getFinishedStrokeWidth() {
        return this.f24209m;
    }

    public int getInnerBackgroundColor() {
        return this.f24210n;
    }

    public String getInnerBottomText() {
        return this.f24214r;
    }

    public int getInnerBottomTextColor() {
        return this.f24205i;
    }

    public float getInnerBottomTextSize() {
        return this.f24213q;
    }

    public int getMax() {
        return this.f24207k;
    }

    public String getPrefixText() {
        return this.f24211o;
    }

    public int getProgress() {
        return this.f24206j;
    }

    public String getSuffixText() {
        return this.f24212p;
    }

    public int getTextColor() {
        return this.f24204h;
    }

    public float getTextSize() {
        return this.f24203g;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f2 = this.f24209m;
        this.f24202f.set(f2, f2, getWidth() - f2, getHeight() - f2);
        float width = getWidth();
        float f3 = this.f24209m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f3) + f3) / 2.0f, this.f24200b);
        canvas.drawArc(this.f24202f, 270.0f, -getProgressAngle(), false, this.f24199a);
        String str = this.f24211o + this.f24206j + this.f24212p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f24201c.measureText(str)) / 2.0f, (getWidth() - (this.f24201c.ascent() + this.f24201c.descent())) / 2.0f, this.f24201c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.d.setTextSize(this.f24213q);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f24215s) - ((this.f24201c.ascent() + this.f24201c.descent()) / 2.0f), this.d);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(a(i2), a(i3));
        this.f24215s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f24204h = bundle.getInt("text_color");
        this.f24203g = bundle.getFloat("text_size");
        this.f24213q = bundle.getFloat("inner_bottom_text_size");
        this.f24214r = bundle.getString("inner_bottom_text");
        this.f24205i = bundle.getInt("inner_bottom_text_color");
        this.f24208l = bundle.getInt("finished_stroke_color");
        this.f24209m = bundle.getFloat("finished_stroke_width");
        this.f24210n = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f24211o = bundle.getString("prefix");
        this.f24212p = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
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
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i2) {
        this.f24208l = i2;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f2) {
        this.f24209m = f2;
        invalidate();
    }

    public void setInnerBackgroundColor(int i2) {
        this.f24210n = i2;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f24214r = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i2) {
        this.f24205i = i2;
        invalidate();
    }

    public void setInnerBottomTextSize(float f2) {
        this.f24213q = f2;
        invalidate();
    }

    public void setMax(int i2) {
        if (i2 > 0) {
            this.f24207k = i2;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f24211o = str;
        invalidate();
    }

    public void setProgress(int i2) {
        this.f24206j = i2;
        if (i2 > getMax()) {
            this.f24206j %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f24212p = str;
        invalidate();
    }

    public void setTextColor(int i2) {
        this.f24204h = i2;
        invalidate();
    }

    public void setTextSize(float f2) {
        this.f24203g = f2;
        invalidate();
    }

    public h3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h3(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24202f = new RectF();
        this.f24206j = 0;
        this.f24211o = "";
        this.f24212p = "";
        this.f24214r = "";
        this.f24217u = a.d(getResources(), 14.0f);
        this.w = (int) a.c(getResources(), 100.0f);
        this.f24216t = a.c(getResources(), 4.0f);
        this.f24218v = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int i3 = this.w;
        return mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
    }
}
