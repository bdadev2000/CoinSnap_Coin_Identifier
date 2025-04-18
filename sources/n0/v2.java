package n0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class v2 extends ka.e {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f22356d;

    /* renamed from: f, reason: collision with root package name */
    public final fb.c f22357f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f22358g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v2(android.view.Window r2, fb.c r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = n0.p2.e(r2)
            r1.<init>(r0, r3)
            r1.f22358g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.v2.<init>(android.view.Window, fb.c):void");
    }

    @Override // ka.e
    public final void m() {
        this.f22356d.hide(7);
    }

    @Override // ka.e
    public final boolean o() {
        int systemBarsAppearance;
        WindowInsetsController windowInsetsController = this.f22356d;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // ka.e
    public final void r(boolean z10) {
        WindowInsetsController windowInsetsController = this.f22356d;
        Window window = this.f22358g;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // ka.e
    public final void s(boolean z10) {
        WindowInsetsController windowInsetsController = this.f22356d;
        Window window = this.f22358g;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // ka.e
    public final void u() {
        this.f22356d.setSystemBarsBehavior(2);
    }

    @Override // ka.e
    public final void v() {
        ((ac.e) this.f22357f.f17773c).u();
        this.f22356d.show(0);
    }

    public v2(WindowInsetsController windowInsetsController, fb.c cVar) {
        this.f22356d = windowInsetsController;
        this.f22357f = cVar;
    }
}
