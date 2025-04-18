package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class t extends c {

    /* renamed from: j, reason: collision with root package name */
    public boolean f28454j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28455k;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // z.c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // z.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f28445b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f28454j = true;
                } else if (index == 22) {
                    this.f28455k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(w.h hVar, int i10, int i11);

    @Override // z.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28454j || this.f28455k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f28307c; i10++) {
                    View view = (View) constraintLayout.f1129b.get(this.f28306b[i10]);
                    if (view != null) {
                        if (this.f28454j) {
                            view.setVisibility(visibility);
                        }
                        if (this.f28455k && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
