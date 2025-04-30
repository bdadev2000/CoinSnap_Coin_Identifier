package q;

import android.view.View;
import p.InterfaceC2531j;
import p.MenuC2533l;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2601h implements Runnable {
    public final C2597f b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2605j f22659c;

    public RunnableC2601h(C2605j c2605j, C2597f c2597f) {
        this.f22659c = c2605j;
        this.b = c2597f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2531j interfaceC2531j;
        C2605j c2605j = this.f22659c;
        MenuC2533l menuC2533l = c2605j.f22661d;
        if (menuC2533l != null && (interfaceC2531j = menuC2533l.f22105g) != null) {
            interfaceC2531j.g(menuC2533l);
        }
        View view = (View) c2605j.f22666j;
        if (view != null && view.getWindowToken() != null) {
            C2597f c2597f = this.b;
            if (!c2597f.b()) {
                if (c2597f.f22162f != null) {
                    c2597f.d(0, 0, false, false);
                }
            }
            c2605j.f22675u = c2597f;
        }
        c2605j.f22677w = null;
    }
}
