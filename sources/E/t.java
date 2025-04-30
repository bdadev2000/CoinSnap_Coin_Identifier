package E;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class t extends c {

    /* renamed from: j, reason: collision with root package name */
    public boolean f965j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f966k;

    @Override // E.c
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // E.c
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 6) {
                    this.f965j = true;
                } else if (index == 22) {
                    this.f966k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(B.g gVar, int i9, int i10);

    @Override // E.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f965j || this.f966k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i9 = 0; i9 < this.f766c; i9++) {
                    View view = (View) constraintLayout.b.get(this.b[i9]);
                    if (view != null) {
                        if (this.f965j) {
                            view.setVisibility(visibility);
                        }
                        if (this.f966k && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        d();
    }
}
