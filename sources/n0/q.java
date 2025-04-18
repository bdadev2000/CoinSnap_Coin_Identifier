package n0;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class q {
    public final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f22341b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22342c = new HashMap();

    public q(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f22341b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.q0) ((s) it.next())).a.dispatchOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(s sVar) {
        this.f22341b.remove(sVar);
        p pVar = (p) this.f22342c.remove(sVar);
        if (pVar != null) {
            pVar.a.b(pVar.f22339b);
            pVar.f22339b = null;
        }
        this.a.run();
    }
}
