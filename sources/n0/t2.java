package n0;

import android.view.Window;

/* loaded from: classes.dex */
public class t2 extends s2 {
    public t2(Window window, fb.c cVar) {
        super(window, cVar);
    }

    @Override // ka.e
    public final boolean o() {
        return (this.f22349d.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // ka.e
    public final void s(boolean z10) {
        if (z10) {
            Window window = this.f22349d;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            w(8192);
            return;
        }
        x(8192);
    }
}
