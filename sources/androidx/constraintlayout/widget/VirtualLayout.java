package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes3.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public boolean f18352i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18353j;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f18327b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f18352i = true;
                } else if (index == 13) {
                    this.f18353j = true;
                }
            }
        }
    }

    public void n(androidx.constraintlayout.solver.widgets.VirtualLayout virtualLayout, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f18352i || this.f18353j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f18192b; i2++) {
                View viewById = constraintLayout.getViewById(this.f18191a[i2]);
                if (viewById != null) {
                    if (this.f18352i) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f18353j && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        e();
    }
}
