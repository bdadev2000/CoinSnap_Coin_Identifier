package androidx.appcompat.widget;

import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class d2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f854c;

    public /* synthetic */ d2(k2 k2Var, int i10) {
        this.f853b = i10;
        this.f854c = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f853b;
        k2 k2Var = this.f854c;
        switch (i10) {
            case 1:
                y1 y1Var = k2Var.f892d;
                if (y1Var != null) {
                    y1Var.setListSelectionHidden(true);
                    y1Var.requestLayout();
                    return;
                }
                return;
            default:
                y1 y1Var2 = k2Var.f892d;
                if (y1Var2 != null && ViewCompat.isAttachedToWindow(y1Var2) && k2Var.f892d.getCount() > k2Var.f892d.getChildCount() && k2Var.f892d.getChildCount() <= k2Var.f902o) {
                    k2Var.B.setInputMethodMode(2);
                    k2Var.show();
                    return;
                }
                return;
        }
    }
}
