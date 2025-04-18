package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final g f11876s;

    /* renamed from: t, reason: collision with root package name */
    public int f11877t;
    public ka.i u;

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ka.i iVar = new ka.i();
        this.u = iVar;
        ka.j jVar = new ka.j(0.5f);
        ka.l lVar = iVar.f20557b.a;
        lVar.getClass();
        h7.l lVar2 = new h7.l(lVar);
        lVar2.f18829e = jVar;
        lVar2.f18830f = jVar;
        lVar2.f18831g = jVar;
        lVar2.f18832h = jVar;
        iVar.setShapeAppearanceModel(new ka.l(lVar2));
        this.u.k(ColorStateList.valueOf(-1));
        setBackground(this.u);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24038t, R.attr.materialClockStyle, 0);
        this.f11877t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11876s = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f11876s;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
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
            g gVar = this.f11876s;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.u.k(ColorStateList.valueOf(i10));
    }
}
