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
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Iterator;
import v8.u0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f11856p = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f11857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11858c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11859d;

    /* renamed from: f, reason: collision with root package name */
    public final int f11860f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11861g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f11862h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f11863i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11864j;

    /* renamed from: k, reason: collision with root package name */
    public float f11865k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11866l;

    /* renamed from: m, reason: collision with root package name */
    public double f11867m;

    /* renamed from: n, reason: collision with root package name */
    public int f11868n;

    /* renamed from: o, reason: collision with root package name */
    public int f11869o;

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11857b = valueAnimator;
        this.f11859d = new ArrayList();
        Paint paint = new Paint();
        this.f11862h = paint;
        this.f11863i = new RectF();
        this.f11869o = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24023e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        u0.g0(context, R.attr.motionDurationLong2, 200);
        u0.h0(context, R.attr.motionEasingEmphasizedInterpolator, s9.a.f24933b);
        this.f11868n = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f11860f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f11864j = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f11861g = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = ClockHandView.f11856p;
                ClockHandView clockHandView = ClockHandView.this;
                clockHandView.getClass();
                clockHandView.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f11868n * 0.66f) : this.f11868n;
    }

    public final void b(float f10) {
        this.f11857b.cancel();
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.f11865k = f11;
        this.f11867m = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a = a(this.f11869o);
        float cos = (((float) Math.cos(this.f11867m)) * a) + width;
        float sin = (a * ((float) Math.sin(this.f11867m))) + height;
        float f12 = this.f11860f;
        this.f11863i.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f11859d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.I - f11) > 0.001f) {
                clockFaceView.I = f11;
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
        float f10 = width;
        float a = a(this.f11869o);
        float cos = (((float) Math.cos(this.f11867m)) * a) + f10;
        float f11 = height;
        float sin = (a * ((float) Math.sin(this.f11867m))) + f11;
        Paint paint = this.f11862h;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f11860f, paint);
        double sin2 = Math.sin(this.f11867m);
        paint.setStrokeWidth(this.f11864j);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f11867m) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f10, f11, this.f11861g, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f11857b.isRunning()) {
            b(this.f11865k);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.f11866l;
                if (this.f11858c) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y4 - (getHeight() / 2))) <= a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f11869o = i10;
                }
                z10 = false;
            }
        } else {
            this.f11866l = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.f11866l;
        int degrees = ((int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = degrees;
        if (this.f11865k != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f10);
            }
            this.f11866l = z14 | z13;
            return true;
        }
        z13 = true;
        this.f11866l = z14 | z13;
        return true;
    }
}
