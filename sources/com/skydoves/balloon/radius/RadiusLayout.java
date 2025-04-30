package com.skydoves.balloon.radius;

import G7.j;
import G7.l;
import G7.s;
import M7.c;
import a7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import z2.i;

/* loaded from: classes3.dex */
public final class RadiusLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f19626d;
    public final Path b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19627c;

    static {
        l lVar = new l(RadiusLayout.class, "radius", "getRadius()F");
        s.f1335a.getClass();
        f19626d = new c[]{lVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        this.b = new Path();
        this.f19627c = i.r(this, Float.valueOf(0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
    }

    public final float getRadius() {
        return ((Number) this.f19627c.r(f19626d[0], this)).floatValue();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.b.addRoundRect(new RectF(0.0f, 0.0f, i9, i10), getRadius(), getRadius(), Path.Direction.CW);
    }

    public final void setRadius(float f9) {
        this.f19627c.B(f19626d[0], Float.valueOf(f9));
    }
}
