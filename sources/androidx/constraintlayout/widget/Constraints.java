package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public ConstraintSet f18309a;

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: m0, reason: collision with root package name */
        public float f18310m0 = 1.0f;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f18311n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public float f18312o0 = 0.0f;

        /* renamed from: p0, reason: collision with root package name */
        public float f18313p0 = 0.0f;

        /* renamed from: q0, reason: collision with root package name */
        public float f18314q0 = 0.0f;

        /* renamed from: r0, reason: collision with root package name */
        public float f18315r0 = 0.0f;

        /* renamed from: s0, reason: collision with root package name */
        public float f18316s0 = 1.0f;

        /* renamed from: t0, reason: collision with root package name */
        public float f18317t0 = 1.0f;

        /* renamed from: u0, reason: collision with root package name */
        public float f18318u0 = 0.0f;

        /* renamed from: v0, reason: collision with root package name */
        public float f18319v0 = 0.0f;

        /* renamed from: w0, reason: collision with root package name */
        public float f18320w0 = 0.0f;

        /* renamed from: x0, reason: collision with root package name */
        public float f18321x0 = 0.0f;

        /* renamed from: y0, reason: collision with root package name */
        public float f18322y0 = 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.Constraints$LayoutParams, android.view.ViewGroup$LayoutParams, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ConstraintLayout.LayoutParams(context, attributeSet);
        layoutParams.f18310m0 = 1.0f;
        layoutParams.f18311n0 = false;
        layoutParams.f18312o0 = 0.0f;
        layoutParams.f18313p0 = 0.0f;
        layoutParams.f18314q0 = 0.0f;
        layoutParams.f18315r0 = 0.0f;
        layoutParams.f18316s0 = 1.0f;
        layoutParams.f18317t0 = 1.0f;
        layoutParams.f18318u0 = 0.0f;
        layoutParams.f18319v0 = 0.0f;
        layoutParams.f18320w0 = 0.0f;
        layoutParams.f18321x0 = 0.0f;
        layoutParams.f18322y0 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18328c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 15) {
                layoutParams.f18310m0 = obtainStyledAttributes.getFloat(index, layoutParams.f18310m0);
            } else if (index == 28) {
                layoutParams.f18312o0 = obtainStyledAttributes.getFloat(index, layoutParams.f18312o0);
                layoutParams.f18311n0 = true;
            } else if (index == 23) {
                layoutParams.f18314q0 = obtainStyledAttributes.getFloat(index, layoutParams.f18314q0);
            } else if (index == 24) {
                layoutParams.f18315r0 = obtainStyledAttributes.getFloat(index, layoutParams.f18315r0);
            } else if (index == 22) {
                layoutParams.f18313p0 = obtainStyledAttributes.getFloat(index, layoutParams.f18313p0);
            } else if (index == 20) {
                layoutParams.f18316s0 = obtainStyledAttributes.getFloat(index, layoutParams.f18316s0);
            } else if (index == 21) {
                layoutParams.f18317t0 = obtainStyledAttributes.getFloat(index, layoutParams.f18317t0);
            } else if (index == 16) {
                layoutParams.f18318u0 = obtainStyledAttributes.getFloat(index, layoutParams.f18318u0);
            } else if (index == 17) {
                layoutParams.f18319v0 = obtainStyledAttributes.getFloat(index, layoutParams.f18319v0);
            } else if (index == 18) {
                layoutParams.f18320w0 = obtainStyledAttributes.getFloat(index, layoutParams.f18320w0);
            } else if (index == 19) {
                layoutParams.f18321x0 = obtainStyledAttributes.getFloat(index, layoutParams.f18321x0);
            } else if (index == 27) {
                layoutParams.f18322y0 = obtainStyledAttributes.getFloat(index, layoutParams.f18322y0);
            }
        }
        return layoutParams;
    }

    public ConstraintSet getConstraintSet() {
        if (this.f18309a == null) {
            this.f18309a = new ConstraintSet();
        }
        ConstraintSet constraintSet = this.f18309a;
        constraintSet.getClass();
        int childCount = getChildCount();
        HashMap hashMap = constraintSet.f18250c;
        hashMap.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f18249b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new ConstraintSet.Constraint());
            }
            ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) hashMap.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                constraint.c(id, layoutParams);
                if (constraintHelper instanceof Barrier) {
                    ConstraintSet.Layout layout = constraint.d;
                    layout.f18262d0 = 1;
                    Barrier barrier = (Barrier) constraintHelper;
                    layout.f18259b0 = barrier.getType();
                    layout.f18263e0 = barrier.getReferencedIds();
                    layout.f18261c0 = barrier.getMargin();
                }
            }
            constraint.c(id, layoutParams);
        }
        return this.f18309a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }
}
