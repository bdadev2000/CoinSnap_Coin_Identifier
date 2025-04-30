package W0;

import V0.c;
import V0.k;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.o;
import d1.C2168i;
import e1.h;
import j5.C2400c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b implements c, Z0.b, V0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3552k = o.g("GreedyScheduler");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3553c;

    /* renamed from: d, reason: collision with root package name */
    public final Z0.c f3554d;

    /* renamed from: g, reason: collision with root package name */
    public final a f3556g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3557h;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f3559j;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f3555f = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final Object f3558i = new Object();

    public b(Context context, androidx.work.b bVar, C.c cVar, k kVar) {
        this.b = context;
        this.f3553c = kVar;
        this.f3554d = new Z0.c(context, cVar, this);
        this.f3556g = new a(this, bVar.f5198e);
    }

    @Override // Z0.b
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.e().b(f3552k, AbstractC2914a.d("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f3553c.A(str);
        }
    }

    @Override // V0.c
    public final boolean b() {
        return false;
    }

    @Override // V0.a
    public final void c(String str, boolean z8) {
        synchronized (this.f3558i) {
            try {
                Iterator it = this.f3555f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2168i c2168i = (C2168i) it.next();
                    if (c2168i.f19801a.equals(str)) {
                        o.e().b(f3552k, "Stopping tracking for " + str, new Throwable[0]);
                        this.f3555f.remove(c2168i);
                        this.f3554d.b(this.f3555f);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.c
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f3559j;
        k kVar = this.f3553c;
        if (bool == null) {
            this.f3559j = Boolean.valueOf(h.a(this.b, kVar.b));
        }
        boolean booleanValue = this.f3559j.booleanValue();
        String str2 = f3552k;
        if (!booleanValue) {
            o.e().f(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f3557h) {
            kVar.f3421f.a(this);
            this.f3557h = true;
        }
        o.e().b(str2, AbstractC2914a.d("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f3556g;
        if (aVar != null && (runnable = (Runnable) aVar.f3551c.remove(str)) != null) {
            ((Handler) aVar.b.f21107c).removeCallbacks(runnable);
        }
        kVar.A(str);
    }

    @Override // V0.c
    public final void e(C2168i... c2168iArr) {
        if (this.f3559j == null) {
            this.f3559j = Boolean.valueOf(h.a(this.b, this.f3553c.b));
        }
        if (!this.f3559j.booleanValue()) {
            o.e().f(f3552k, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f3557h) {
            this.f3553c.f3421f.a(this);
            this.f3557h = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C2168i c2168i : c2168iArr) {
            long a6 = c2168i.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c2168i.b == 1) {
                if (currentTimeMillis < a6) {
                    a aVar = this.f3556g;
                    if (aVar != null) {
                        HashMap hashMap = aVar.f3551c;
                        Runnable runnable = (Runnable) hashMap.remove(c2168i.f19801a);
                        C2400c c2400c = aVar.b;
                        if (runnable != null) {
                            ((Handler) c2400c.f21107c).removeCallbacks(runnable);
                        }
                        f4.b bVar = new f4.b(10, aVar, c2168i, false);
                        hashMap.put(c2168i.f19801a, bVar);
                        ((Handler) c2400c.f21107c).postDelayed(bVar, c2168i.a() - System.currentTimeMillis());
                    }
                } else if (c2168i.b()) {
                    androidx.work.c cVar = c2168i.f19809j;
                    if (cVar.f5204c) {
                        o.e().b(f3552k, "Ignoring WorkSpec " + c2168i + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar.f5209h.f5211a.size() > 0) {
                        o.e().b(f3552k, "Ignoring WorkSpec " + c2168i + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(c2168i);
                        hashSet2.add(c2168i.f19801a);
                    }
                } else {
                    o.e().b(f3552k, AbstractC2914a.d("Starting work for ", c2168i.f19801a), new Throwable[0]);
                    this.f3553c.z(c2168i.f19801a, null);
                }
            }
        }
        synchronized (this.f3558i) {
            try {
                if (!hashSet.isEmpty()) {
                    o.e().b(f3552k, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f3555f.addAll(hashSet);
                    this.f3554d.b(this.f3555f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z0.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.e().b(f3552k, AbstractC2914a.d("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f3553c.z(str, null);
        }
    }
}
