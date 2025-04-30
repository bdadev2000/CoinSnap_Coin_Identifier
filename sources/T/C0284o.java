package T;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: T.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284o {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2915a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2916c = new HashMap();

    public C0284o(Runnable runnable) {
        this.f2915a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.Z) ((InterfaceC0286q) it.next())).f4692a.dispatchOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0286q interfaceC0286q) {
        this.b.remove(interfaceC0286q);
        C0283n c0283n = (C0283n) this.f2916c.remove(interfaceC0286q);
        if (c0283n != null) {
            c0283n.f2910a.b(c0283n.b);
            c0283n.b = null;
        }
        this.f2915a.run();
    }
}
