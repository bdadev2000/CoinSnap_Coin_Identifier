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

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final d f13817c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13818d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.b = new Paint();
        d dVar = new d();
        this.f13817c = dVar;
        this.f13818d = true;
        setWillNotDraw(false);
        dVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).f());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13819a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
                ((c) bVar.f273c).f13833p = false;
            } else {
                bVar = new b(0);
            }
            a(bVar.h(obtainStyledAttributes).f());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(c cVar) {
        boolean z8;
        PorterDuff.Mode mode;
        d dVar = this.f13817c;
        dVar.f13842f = cVar;
        if (cVar != null) {
            Paint paint = dVar.b;
            if (dVar.f13842f.f13833p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        dVar.b();
        if (dVar.f13842f != null) {
            ValueAnimator valueAnimator = dVar.f13841e;
            if (valueAnimator != null) {
                z8 = valueAnimator.isStarted();
                dVar.f13841e.cancel();
                dVar.f13841e.removeAllUpdateListeners();
            } else {
                z8 = false;
            }
            c cVar2 = dVar.f13842f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (cVar2.f13837t / cVar2.f13836s)) + 1.0f);
            dVar.f13841e = ofFloat;
            ofFloat.setRepeatMode(dVar.f13842f.f13835r);
            dVar.f13841e.setRepeatCount(dVar.f13842f.f13834q);
            ValueAnimator valueAnimator2 = dVar.f13841e;
            c cVar3 = dVar.f13842f;
            valueAnimator2.setDuration(cVar3.f13836s + cVar3.f13837t);
            dVar.f13841e.addUpdateListener(dVar.f13838a);
            if (z8) {
                dVar.f13841e.start();
            }
        }
        dVar.invalidateSelf();
        if (cVar != null && cVar.f13831n) {
            setLayerType(2, this.b);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        d dVar = this.f13817c;
        ValueAnimator valueAnimator = dVar.f13841e;
        if (valueAnimator != null && valueAnimator != null && valueAnimator.isStarted()) {
            dVar.f13841e.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f13818d) {
            this.f13817c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13817c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        this.f13817c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f13817c) {
            return false;
        }
        return true;
    }
}
