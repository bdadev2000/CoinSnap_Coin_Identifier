package T;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentTransaction;
import n1.C2475f;

/* loaded from: classes.dex */
public class H0 extends com.bumptech.glide.d {
    public final Window l;
    public final E1.c m;

    public H0(Window window, E1.c cVar) {
        this.l = window;
        this.m = cVar;
    }

    @Override // com.bumptech.glide.d
    public final void O(int i9) {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((C2475f) this.m.f972c).r();
                        }
                    } else {
                        b0(2);
                    }
                } else {
                    b0(4);
                }
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean P() {
        if ((this.l.getDecorView().getSystemUiVisibility() & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.d
    public final void V(boolean z8) {
        if (z8) {
            Window window = this.l;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            b0(FragmentTransaction.TRANSIT_EXIT_MASK);
            return;
        }
        c0(FragmentTransaction.TRANSIT_EXIT_MASK);
    }

    @Override // com.bumptech.glide.d
    public final void X() {
        c0(2048);
        b0(4096);
    }

    @Override // com.bumptech.glide.d
    public final void Y() {
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((8 & i9) != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 8) {
                            ((C2475f) this.m.f972c).x();
                        }
                    } else {
                        c0(2);
                    }
                } else {
                    c0(4);
                    this.l.clearFlags(1024);
                }
            }
        }
    }

    public final void b0(int i9) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility(i9 | decorView.getSystemUiVisibility());
    }

    public final void c0(int i9) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility((~i9) & decorView.getSystemUiVisibility());
    }
}
