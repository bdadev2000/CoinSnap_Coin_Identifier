package y3;

import G.b;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2950a extends b {

    /* renamed from: a, reason: collision with root package name */
    public J5.a f24431a;
    public int b = 0;

    public AbstractC2950a() {
    }

    @Override // G.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        v(coordinatorLayout, view, i9);
        if (this.f24431a == null) {
            this.f24431a = new J5.a(view);
        }
        J5.a aVar = this.f24431a;
        View view2 = (View) aVar.f1591d;
        aVar.f1589a = view2.getTop();
        aVar.b = view2.getLeft();
        this.f24431a.a();
        int i10 = this.b;
        if (i10 != 0) {
            J5.a aVar2 = this.f24431a;
            if (aVar2.f1590c != i10) {
                aVar2.f1590c = i10;
                aVar2.a();
            }
            this.b = 0;
            return true;
        }
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i9) {
        coordinatorLayout.q(view, i9);
    }

    public AbstractC2950a(int i9) {
    }
}
