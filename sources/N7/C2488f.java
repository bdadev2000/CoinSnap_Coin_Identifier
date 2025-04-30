package n7;

import C2.m;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.o;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: n7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2488f {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f21858a = new HashSet();

    public final void a() {
        if (m.f535a == null) {
            m.f535a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == m.f535a) {
            Iterator it = this.f21858a.iterator();
            if (!it.hasNext()) {
                return;
            }
            o.v(it.next());
            throw null;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
