package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Iterator;
import w3.AbstractC2861a;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    public final ValueAnimator b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14220c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14221d;

    /* renamed from: f, reason: collision with root package name */
    public final int f14222f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14223g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f14224h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f14225i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14226j;

    /* renamed from: k, reason: collision with root package name */
    public float f14227k;
    public boolean l;
    public double m;

    /* renamed from: n, reason: collision with root package name */
    public int f14228n;

    /* renamed from: o, reason: collision with root package name */
    public int f14229o;

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.b = new ValueAnimator();
        this.f14221d = new ArrayList();
        Paint paint = new Paint();
        this.f14224h = paint;
        this.f14225i = new RectF();
        this.f14229o = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23665e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC2947c.u(context, R.attr.motionDurationLong2, 200);
        AbstractC2947c.v(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.b);
        this.f14228n = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f14222f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f14226j = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f14223g = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i9) {
        if (i9 == 2) {
            return Math.round(this.f14228n * 0.66f);
        }
        return this.f14228n;
    }

    public final void b(float f9) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f9);
    }

    public final void c(float f9) {
        float f10 = f9 % 360.0f;
        this.f14227k = f10;
        this.m = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a6 = a(this.f14229o);
        float cos = (((float) Math.cos(this.m)) * a6) + width;
        float sin = (a6 * ((float) Math.sin(this.m))) + height;
        float f11 = this.f14222f;
        this.f14225i.set(cos - f11, sin - f11, cos + f11, sin + f11);
        Iterator it = this.f14221d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f14215K - f10) > 0.001f) {
                clockFaceView.f14215K = f10;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f9 = width;
        float a6 = a(this.f14229o);
        float cos = (((float) Math.cos(this.m)) * a6) + f9;
        float f10 = height;
        float sin = (a6 * ((float) Math.sin(this.m))) + f10;
        Paint paint = this.f14224h;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f14222f, paint);
        double sin2 = Math.sin(this.m);
        paint.setStrokeWidth(this.f14226j);
        canvas.drawLine(f9, f10, width + ((int) (Math.cos(this.m) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f9, f10, this.f14223g, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        if (!this.b.isRunning()) {
            b(this.f14227k);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z9 = false;
                z8 = false;
            } else {
                z9 = this.l;
                if (this.f14220c) {
                    if (((float) Math.hypot(x9 - (getWidth() / 2), y4 - (getHeight() / 2))) <= a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i9 = 2;
                    } else {
                        i9 = 1;
                    }
                    this.f14229o = i9;
                }
                z8 = false;
            }
        } else {
            this.l = false;
            z8 = true;
            z9 = false;
        }
        boolean z12 = this.l;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f9 = i10;
        if (this.f14227k != f9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z10) {
            if (z10 || z9) {
                b(f9);
            }
            this.l = z12 | z11;
            return true;
        }
        z11 = true;
        this.l = z12 | z11;
        return true;
    }
}
