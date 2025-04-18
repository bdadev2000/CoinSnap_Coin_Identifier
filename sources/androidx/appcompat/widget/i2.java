package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class i2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ k2 a;

    public i2(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        boolean z10 = true;
        if (i10 == 1) {
            k2 k2Var = this.a;
            if (k2Var.B.getInputMethodMode() != 2) {
                z10 = false;
            }
            if (!z10 && k2Var.B.getContentView() != null) {
                Handler handler = k2Var.f910x;
                d2 d2Var = k2Var.f907t;
                handler.removeCallbacks(d2Var);
                d2Var.run();
            }
        }
    }
}
