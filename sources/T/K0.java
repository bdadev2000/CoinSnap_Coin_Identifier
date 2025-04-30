package T;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.fragment.app.FragmentTransaction;
import n1.C2475f;

/* loaded from: classes.dex */
public final class K0 extends com.bumptech.glide.d {
    public final WindowInsetsController l;
    public final E1.c m;

    /* renamed from: n, reason: collision with root package name */
    public Window f2868n;

    public K0(WindowInsetsController windowInsetsController, E1.c cVar) {
        this.l = windowInsetsController;
        this.m = cVar;
    }

    @Override // com.bumptech.glide.d
    public final void O(int i9) {
        if ((i9 & 8) != 0) {
            ((C2475f) this.m.f972c).r();
        }
        this.l.hide(i9 & (-9));
    }

    @Override // com.bumptech.glide.d
    public final boolean P() {
        int systemBarsAppearance;
        this.l.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.l.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.d
    public final void U(boolean z8) {
        Window window = this.f2868n;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.l.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.l.setSystemBarsAppearance(0, 16);
    }

    @Override // com.bumptech.glide.d
    public final void V(boolean z8) {
        Window window = this.f2868n;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | FragmentTransaction.TRANSIT_EXIT_MASK);
            }
            this.l.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.l.setSystemBarsAppearance(0, 8);
    }

    @Override // com.bumptech.glide.d
    public final void X() {
        this.l.setSystemBarsBehavior(2);
    }

    @Override // com.bumptech.glide.d
    public final void Y() {
        ((C2475f) this.m.f972c).x();
        this.l.show(0);
    }
}
