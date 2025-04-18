package n2;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.d;
import androidx.work.p;
import androidx.work.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m2.c;
import m2.k;
import u2.j;
import v2.h;

/* loaded from: classes.dex */
public final class b implements c, q2.b, m2.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f22388k = p.g("GreedyScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f22389b;

    /* renamed from: c, reason: collision with root package name */
    public final k f22390c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.c f22391d;

    /* renamed from: g, reason: collision with root package name */
    public final a f22393g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22394h;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f22396j;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f22392f = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final Object f22395i = new Object();

    public b(Context context, androidx.work.b bVar, h.c cVar, k kVar) {
        this.f22389b = context;
        this.f22390c = kVar;
        this.f22391d = new q2.c(context, cVar, this);
        this.f22393g = new a(this, bVar.f2181e);
    }

    @Override // m2.c
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f22396j;
        k kVar = this.f22390c;
        if (bool == null) {
            this.f22396j = Boolean.valueOf(h.a(this.f22389b, kVar.f21459j));
        }
        boolean booleanValue = this.f22396j.booleanValue();
        String str2 = f22388k;
        if (!booleanValue) {
            p.e().f(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f22394h) {
            kVar.f21463n.a(this);
            this.f22394h = true;
        }
        p.e().b(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f22393g;
        if (aVar != null && (runnable = (Runnable) aVar.f22387c.remove(str)) != null) {
            ((Handler) aVar.f22386b.f20640c).removeCallbacks(runnable);
        }
        kVar.A(str);
    }

    @Override // q2.b
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.e().b(f22388k, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f22390c.A(str);
        }
    }

    @Override // m2.c
    public final boolean c() {
        return false;
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        synchronized (this.f22395i) {
            Iterator it = this.f22392f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                if (jVar.a.equals(str)) {
                    p.e().b(f22388k, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f22392f.remove(jVar);
                    this.f22391d.b(this.f22392f);
                    break;
                }
            }
        }
    }

    @Override // m2.c
    public final void e(j... jVarArr) {
        boolean z10;
        if (this.f22396j == null) {
            this.f22396j = Boolean.valueOf(h.a(this.f22389b, this.f22390c.f21459j));
        }
        if (!this.f22396j.booleanValue()) {
            p.e().f(f22388k, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f22394h) {
            this.f22390c.f21463n.a(this);
            this.f22394h = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (j jVar : jVarArr) {
            long a = jVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (jVar.f25452b == y.ENQUEUED) {
                if (currentTimeMillis < a) {
                    a aVar = this.f22393g;
                    if (aVar != null) {
                        HashMap hashMap = aVar.f22387c;
                        Runnable runnable = (Runnable) hashMap.remove(jVar.a);
                        kc.c cVar = aVar.f22386b;
                        if (runnable != null) {
                            ((Handler) cVar.f20640c).removeCallbacks(runnable);
                        }
                        androidx.appcompat.widget.j jVar2 = new androidx.appcompat.widget.j(4, aVar, jVar);
                        hashMap.put(jVar.a, jVar2);
                        ((Handler) cVar.f20640c).postDelayed(jVar2, jVar.a() - System.currentTimeMillis());
                    }
                } else if (jVar.b()) {
                    d dVar = jVar.f25460j;
                    if (dVar.f2189c) {
                        p.e().b(f22388k, String.format("Ignoring WorkSpec %s, Requires device idle.", jVar), new Throwable[0]);
                    } else {
                        if (dVar.f2194h.a.size() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            p.e().b(f22388k, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", jVar), new Throwable[0]);
                        } else {
                            hashSet.add(jVar);
                            hashSet2.add(jVar.a);
                        }
                    }
                } else {
                    p.e().b(f22388k, String.format("Starting work for %s", jVar.a), new Throwable[0]);
                    this.f22390c.z(jVar.a, null);
                }
            }
        }
        synchronized (this.f22395i) {
            if (!hashSet.isEmpty()) {
                p.e().b(f22388k, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f22392f.addAll(hashSet);
                this.f22391d.b(this.f22392f);
            }
        }
    }

    @Override // q2.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.e().b(f22388k, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f22390c.z(str, null);
        }
    }
}
