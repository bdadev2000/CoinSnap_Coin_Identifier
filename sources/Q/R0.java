package q;

import androidx.appcompat.widget.Toolbar;
import p.C2535n;

/* loaded from: classes.dex */
public final /* synthetic */ class R0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f22589c;

    public /* synthetic */ R0(Toolbar toolbar, int i9) {
        this.b = i9;
        this.f22589c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2535n c2535n;
        switch (this.b) {
            case 0:
                T0 t02 = this.f22589c.f4290N;
                if (t02 == null) {
                    c2535n = null;
                } else {
                    c2535n = t02.f22594c;
                }
                if (c2535n != null) {
                    c2535n.collapseActionView();
                    return;
                }
                return;
            default:
                this.f22589c.n();
                return;
        }
    }
}
