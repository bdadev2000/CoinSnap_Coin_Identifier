package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f11366b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11367c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11368d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f11366b = new Paint();
        e eVar = new e();
        this.f11367c = eVar;
        this.f11368d = true;
        setWillNotDraw(false);
        eVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).d());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
            } else {
                bVar = new b(0);
            }
            a(bVar.e(obtainStyledAttributes).d());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(c cVar) {
        boolean z10;
        PorterDuff.Mode mode;
        e eVar = this.f11367c;
        eVar.f11394f = cVar;
        if (cVar != null) {
            Paint paint = eVar.f11390b;
            if (eVar.f11394f.f11384p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        eVar.b();
        if (eVar.f11394f != null) {
            ValueAnimator valueAnimator = eVar.f11393e;
            if (valueAnimator != null) {
                z10 = valueAnimator.isStarted();
                eVar.f11393e.cancel();
                eVar.f11393e.removeAllUpdateListeners();
            } else {
                z10 = false;
            }
            c cVar2 = eVar.f11394f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (cVar2.f11388t / cVar2.f11387s)) + 1.0f);
            eVar.f11393e = ofFloat;
            ofFloat.setRepeatMode(eVar.f11394f.f11386r);
            eVar.f11393e.setRepeatCount(eVar.f11394f.f11385q);
            ValueAnimator valueAnimator2 = eVar.f11393e;
            c cVar3 = eVar.f11394f;
            valueAnimator2.setDuration(cVar3.f11387s + cVar3.f11388t);
            eVar.f11393e.addUpdateListener(eVar.a);
            if (z10) {
                eVar.f11393e.start();
            }
        }
        eVar.invalidateSelf();
        if (cVar != null && cVar.f11382n) {
            setLayerType(2, this.f11366b);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        boolean z10;
        e eVar = this.f11367c;
        ValueAnimator valueAnimator = eVar.f11393e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                eVar.f11393e.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11368d) {
            this.f11367c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11367c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f11367c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11367c;
    }
}
