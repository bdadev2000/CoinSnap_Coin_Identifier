package androidx.constraintlayout.widget;

import E.c;
import E.e;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Group extends c {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // E.c
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // E.c
    public final void j() {
        e eVar = (e) getLayoutParams();
        eVar.f825p0.O(0);
        eVar.f825p0.L(0);
    }

    @Override // E.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
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
