package n0;

import android.view.View;
import android.view.Window;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class s2 extends ka.e {

    /* renamed from: d, reason: collision with root package name */
    public final Window f22349d;

    /* renamed from: f, reason: collision with root package name */
    public final fb.c f22350f;

    public s2(Window window, fb.c cVar) {
        this.f22349d = window;
        this.f22350f = cVar;
    }

    @Override // ka.e
    public final void m() {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((7 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((ac.e) this.f22350f.f17773c).o();
                        }
                    } else {
                        w(2);
                    }
                } else {
                    w(4);
                }
            }
        }
    }

    @Override // ka.e
    public final void u() {
        x(2048);
        w(4096);
    }

    @Override // ka.e
    public final void v() {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((8 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((ac.e) this.f22350f.f17773c).u();
                        }
                    } else {
                        x(2);
                    }
                } else {
                    x(4);
                    this.f22349d.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                }
            }
        }
    }

    public final void w(int i10) {
        View decorView = this.f22349d.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void x(int i10) {
        View decorView = this.f22349d.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
