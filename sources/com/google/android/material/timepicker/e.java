package com.google.android.material.timepicker;

import R3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: u, reason: collision with root package name */
    public final D3.b f14233u;

    /* renamed from: v, reason: collision with root package name */
    public int f14234v;

    /* renamed from: w, reason: collision with root package name */
    public final R3.g f14235w;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        R3.g gVar = new R3.g();
        this.f14235w = gVar;
        R3.h hVar = new R3.h(0.5f);
        j e4 = gVar.b.f2643a.e();
        e4.f2685e = hVar;
        e4.f2686f = hVar;
        e4.f2687g = hVar;
        e4.f2688h = hVar;
        gVar.setShapeAppearanceModel(e4.a());
        this.f14235w.k(ColorStateList.valueOf(-1));
        ViewCompat.setBackground(this, this.f14235w);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23678t, R.attr.materialClockStyle, 0);
        this.f14234v = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14233u = new D3.b(this, 28);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            D3.b bVar = this.f14233u;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            D3.b bVar = this.f14233u;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i9) {
        this.f14235w.k(ColorStateList.valueOf(i9));
    }
}
