package t9;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class c extends b0.a {
    public d a;

    /* renamed from: b, reason: collision with root package name */
    public int f25371b;

    public c() {
        this.f25371b = 0;
    }

    @Override // b0.a
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        w(coordinatorLayout, view, i10);
        if (this.a == null) {
            this.a = new d(view);
        }
        d dVar = this.a;
        View view2 = dVar.a;
        dVar.f25372b = view2.getTop();
        dVar.f25373c = view2.getLeft();
        this.a.a();
        int i11 = this.f25371b;
        if (i11 != 0) {
            d dVar2 = this.a;
            if (dVar2.f25374d != i11) {
                dVar2.f25374d = i11;
                dVar2.a();
            }
            this.f25371b = 0;
            return true;
        }
        return true;
    }

    public void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(i10, view);
    }

    public c(int i10) {
        super(0);
        this.f25371b = 0;
    }
}
