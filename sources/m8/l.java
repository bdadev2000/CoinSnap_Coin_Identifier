package m8;

import androidx.core.app.NotificationCompat;
import i8.C2364a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f21812a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.b f21813c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.g f21814d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f21815e;

    public l(l8.c cVar, TimeUnit timeUnit) {
        G7.j.e(cVar, "taskRunner");
        this.f21812a = 5;
        this.b = timeUnit.toNanos(5L);
        this.f21813c = cVar.f();
        this.f21814d = new k8.g(this, G7.j.j(" ConnectionPool", j8.b.f21219g), 2);
        this.f21815e = new ConcurrentLinkedQueue();
    }

    public final boolean a(C2364a c2364a, i iVar, ArrayList arrayList, boolean z8) {
        G7.j.e(c2364a, "address");
        G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
        Iterator it = this.f21815e.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            G7.j.d(kVar, "connection");
            synchronized (kVar) {
                if (z8) {
                    if (kVar.f21803g == null) {
                        continue;
                    }
                }
                if (kVar.h(c2364a, arrayList)) {
                    iVar.b(kVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(k kVar, long j7) {
        byte[] bArr = j8.b.f21214a;
        ArrayList arrayList = kVar.f21810p;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i9);
            if (reference.get() != null) {
                i9++;
            } else {
                String str = "A connection to " + kVar.b.f20791a.f20805h + " was leaked. Did you forget to close a response body?";
                r8.m mVar = r8.m.f22950a;
                r8.m.f22950a.j(str, ((g) reference).f21781a);
                arrayList.remove(i9);
                kVar.f21806j = true;
                if (arrayList.isEmpty()) {
                    kVar.f21811q = j7 - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
