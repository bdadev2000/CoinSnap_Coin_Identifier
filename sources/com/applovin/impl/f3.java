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

/* loaded from: classes.dex */
public class f3 extends View {

    /* renamed from: x, reason: collision with root package name */
    private static final int f4579x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f4580y = Color.rgb(66, 145, 241);

    /* renamed from: z, reason: collision with root package name */
    private static final int f4581z = Color.rgb(66, 145, 241);
    private Paint a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f4582b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f4583c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f4584d;

    /* renamed from: f, reason: collision with root package name */
    private RectF f4585f;

    /* renamed from: g, reason: collision with root package name */
    private float f4586g;

    /* renamed from: h, reason: collision with root package name */
    private int f4587h;

    /* renamed from: i, reason: collision with root package name */
    private int f4588i;

    /* renamed from: j, reason: collision with root package name */
    private int f4589j;

    /* renamed from: k, reason: collision with root package name */
    private int f4590k;

    /* renamed from: l, reason: collision with root package name */
    private int f4591l;

    /* renamed from: m, reason: collision with root package name */
    private float f4592m;

    /* renamed from: n, reason: collision with root package name */
    private int f4593n;

    /* renamed from: o, reason: collision with root package name */
    private String f4594o;

    /* renamed from: p, reason: collision with root package name */
    private String f4595p;

    /* renamed from: q, reason: collision with root package name */
    private float f4596q;

    /* renamed from: r, reason: collision with root package name */
    private String f4597r;

    /* renamed from: s, reason: collision with root package name */
    private float f4598s;

    /* renamed from: t, reason: collision with root package name */
    private final float f4599t;
    private final float u;

    /* renamed from: v, reason: collision with root package name */
    private final float f4600v;

    /* renamed from: w, reason: collision with root package name */
    private final int f4601w;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public f3(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f4590k) * 360.0f;
    }

    public void a() {
        this.f4591l = f4579x;
        this.f4587h = f4580y;
        this.f4586g = this.u;
        setMax(100);
        setProgress(0);
        this.f4592m = this.f4599t;
        this.f4593n = 0;
        this.f4596q = this.f4600v;
        this.f4588i = f4581z;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f4583c = textPaint;
        textPaint.setColor(this.f4587h);
        this.f4583c.setTextSize(this.f4586g);
        this.f4583c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f4584d = textPaint2;
        textPaint2.setColor(this.f4588i);
        this.f4584d.setTextSize(this.f4596q);
        this.f4584d.setAntiAlias(true);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(this.f4591l);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setAntiAlias(true);
        this.a.setStrokeWidth(this.f4592m);
        Paint paint2 = new Paint();
        this.f4582b = paint2;
        paint2.setColor(this.f4593n);
        this.f4582b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f4591l;
    }

    public float getFinishedStrokeWidth() {
        return this.f4592m;
    }

    public int getInnerBackgroundColor() {
        return this.f4593n;
    }

    public String getInnerBottomText() {
        return this.f4597r;
    }

    public int getInnerBottomTextColor() {
        return this.f4588i;
    }

    public float getInnerBottomTextSize() {
        return this.f4596q;
    }

    public int getMax() {
        return this.f4590k;
    }

    public String getPrefixText() {
        return this.f4594o;
    }

    public int getProgress() {
        return this.f4589j;
    }

    public String getSuffixText() {
        return this.f4595p;
    }

    public int getTextColor() {
        return this.f4587h;
    }

    public float getTextSize() {
        return this.f4586g;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f4592m;
        this.f4585f.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f4592m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f4582b);
        canvas.drawArc(this.f4585f, 270.0f, -getProgressAngle(), false, this.a);
        String str = this.f4594o + this.f4589j + this.f4595p;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f4583c.measureText(str)) / 2.0f, (getWidth() - (this.f4583c.ascent() + this.f4583c.descent())) / 2.0f, this.f4583c);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f4584d.setTextSize(this.f4596q);
            canvas.drawText(getInnerBottomText(), (getWidth() - this.f4584d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f4598s) - ((this.f4583c.ascent() + this.f4583c.descent()) / 2.0f), this.f4584d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f4598s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f4587h = bundle.getInt("text_color");
            this.f4586g = bundle.getFloat("text_size");
            this.f4596q = bundle.getFloat("inner_bottom_text_size");
            this.f4597r = bundle.getString("inner_bottom_text");
            this.f4588i = bundle.getInt("inner_bottom_text_color");
            this.f4591l = bundle.getInt("finished_stroke_color");
            this.f4592m = bundle.getFloat("finished_stroke_width");
            this.f4593n = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
            this.f4594o = bundle.getString("prefix");
            this.f4595p = bundle.getString("suffix");
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

    public void setFinishedStrokeColor(int i10) {
        this.f4591l = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f4592m = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f4593n = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f4597r = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f4588i = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f4596q = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f4590k = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f4594o = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f4589j = i10;
        if (i10 > getMax()) {
            this.f4589j %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f4595p = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f4587h = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f4586g = f10;
        invalidate();
    }

    public f3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f3(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4585f = new RectF();
        this.f4589j = 0;
        this.f4594o = "";
        this.f4595p = "";
        this.f4597r = "";
        this.u = a.d(getResources(), 14.0f);
        this.f4601w = (int) a.c(getResources(), 100.0f);
        this.f4599t = a.c(getResources(), 4.0f);
        this.f4600v = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f4601w;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
