package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class a2 {
    public final z1 a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f1861b = new y1(0);

    public a2(s0 s0Var) {
        this.a = s0Var;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        View childAt;
        s0 s0Var = (s0) this.a;
        int i15 = s0Var.f2031b;
        Object obj = s0Var.f2032c;
        switch (i15) {
            case 0:
                paddingTop = ((v0) obj).getPaddingLeft();
                break;
            default:
                paddingTop = ((v0) obj).getPaddingTop();
                break;
        }
        int l10 = s0Var.l();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            int i16 = s0Var.f2031b;
            Object obj2 = s0Var.f2032c;
            switch (i16) {
                case 0:
                    childAt = ((v0) obj2).getChildAt(i10);
                    break;
                default:
                    childAt = ((v0) obj2).getChildAt(i10);
                    break;
            }
            int k10 = s0Var.k(childAt);
            int j3 = s0Var.j(childAt);
            y1 y1Var = this.f1861b;
            y1Var.f2084b = paddingTop;
            y1Var.f2085c = l10;
            y1Var.f2086d = k10;
            y1Var.f2087e = j3;
            if (i12 != 0) {
                y1Var.a = i12 | 0;
                if (y1Var.a()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                y1Var.a = i13 | 0;
                if (y1Var.a()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        int paddingTop;
        s0 s0Var = (s0) this.a;
        int i10 = s0Var.f2031b;
        Object obj = s0Var.f2032c;
        switch (i10) {
            case 0:
                paddingTop = ((v0) obj).getPaddingLeft();
                break;
            default:
                paddingTop = ((v0) obj).getPaddingTop();
                break;
        }
        int l10 = s0Var.l();
        int k10 = s0Var.k(view);
        int j3 = s0Var.j(view);
        y1 y1Var = this.f1861b;
        y1Var.f2084b = paddingTop;
        y1Var.f2085c = l10;
        y1Var.f2086d = k10;
        y1Var.f2087e = j3;
        y1Var.a = 24579 | 0;
        return y1Var.a();
    }
}
