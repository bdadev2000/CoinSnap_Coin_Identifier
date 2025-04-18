package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class q0 extends k2 implements s0 {
    public CharSequence E;
    public ListAdapter F;
    public final Rect G;
    public int H;
    public final /* synthetic */ t0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.I = t0Var;
        this.G = new Rect();
        this.f904q = t0Var;
        this.A = true;
        this.B.setFocusable(true);
        this.f905r = new h.d(1, this, t0Var);
    }

    @Override // androidx.appcompat.widget.s0
    public final CharSequence d() {
        return this.E;
    }

    @Override // androidx.appcompat.widget.s0
    public final void f(CharSequence charSequence) {
        this.E = charSequence;
    }

    @Override // androidx.appcompat.widget.s0
    public final void i(int i10) {
        this.H = i10;
    }

    @Override // androidx.appcompat.widget.s0
    public final void j(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        boolean a = a();
        r();
        d0 d0Var = this.B;
        d0Var.setInputMethodMode(2);
        show();
        y1 y1Var = this.f892d;
        y1Var.setChoiceMode(1);
        l0.d(y1Var, i10);
        l0.c(y1Var, i11);
        t0 t0Var = this.I;
        int selectedItemPosition = t0Var.getSelectedItemPosition();
        y1 y1Var2 = this.f892d;
        if (a() && y1Var2 != null) {
            y1Var2.setListSelectionHidden(false);
            y1Var2.setSelection(selectedItemPosition);
            if (y1Var2.getChoiceMode() != 0) {
                y1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!a && (viewTreeObserver = t0Var.getViewTreeObserver()) != null) {
            k.e eVar = new k.e(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
            d0Var.setOnDismissListener(new p0(this, eVar));
        }
    }

    @Override // androidx.appcompat.widget.k2, androidx.appcompat.widget.s0
    public final void l(ListAdapter listAdapter) {
        super.l(listAdapter);
        this.F = listAdapter;
    }

    public final void r() {
        int i10;
        int i11;
        Drawable e2 = e();
        t0 t0Var = this.I;
        if (e2 != null) {
            e2.getPadding(t0Var.f1038j);
            if (f4.a(t0Var)) {
                i10 = t0Var.f1038j.right;
            } else {
                i10 = -t0Var.f1038j.left;
            }
        } else {
            Rect rect = t0Var.f1038j;
            rect.right = 0;
            rect.left = 0;
            i10 = 0;
        }
        int paddingLeft = t0Var.getPaddingLeft();
        int paddingRight = t0Var.getPaddingRight();
        int width = t0Var.getWidth();
        int i12 = t0Var.f1037i;
        if (i12 == -2) {
            int a = t0Var.a((SpinnerAdapter) this.F, e());
            int i13 = t0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = t0Var.f1038j;
            int i14 = (i13 - rect2.left) - rect2.right;
            if (a > i14) {
                a = i14;
            }
            p(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i12);
        }
        if (f4.a(t0Var)) {
            i11 = (((width - paddingRight) - this.f894g) - this.H) + i10;
        } else {
            i11 = paddingLeft + this.H + i10;
        }
        this.f895h = i11;
    }
}
