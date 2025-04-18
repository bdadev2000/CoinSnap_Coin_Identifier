package nh;

import a4.j;
import android.os.Looper;
import com.facebook.internal.i;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class g {
    public final HashSet a = new HashSet();

    public final void a() {
        boolean z10;
        if (i.f11038b == null) {
            i.f11038b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == i.f11038b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator it = this.a.iterator();
            if (!it.hasNext()) {
                return;
            }
            j.t(it.next());
            throw null;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
