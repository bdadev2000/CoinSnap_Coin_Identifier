package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class d0 extends PopupWindow {
    public d0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        i3 i3Var = new i3(context, context.obtainStyledAttributes(attributeSet, g.a.f17896s, i10, i11));
        if (i3Var.l(2)) {
            t0.l.c(this, i3Var.a(2, false));
        }
        setBackgroundDrawable(i3Var.e(0));
        i3Var.o();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
    }
}
