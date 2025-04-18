package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.gc;
import com.applovin.impl.jn;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final j f26787a;

    /* renamed from: b */
    private final n f26788b;

    /* renamed from: c */
    private final int f26789c;
    private final c d;

    /* renamed from: f */
    private final Object f26790f = new Object();

    /* renamed from: g */
    private final List f26791g;

    /* renamed from: h */
    private final Set f26792h;

    /* renamed from: i */
    private final List f26793i;

    /* loaded from: classes3.dex */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a */
        final /* synthetic */ d f26794a;

        /* renamed from: b */
        final /* synthetic */ AppLovinPostbackListener f26795b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f26794a = dVar;
            this.f26795b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i2) {
            n unused = b.this.f26788b;
            if (n.a()) {
                b.this.f26788b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f26794a + " with error code: " + i2 + "; will retry later...");
            }
            b.this.d(this.f26794a);
            gc.a(this.f26795b, str, i2);
            if (this.f26794a.c() == 1) {
                b.this.f26787a.E().a("dispatchPostback", str, i2);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f26794a);
            n unused = b.this.f26788b;
            if (n.a()) {
                b.this.f26788b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f26794a);
            }
            b.this.c();
            gc.a(this.f26795b, str);
        }
    }

    public b(j jVar) {
        ArrayList arrayList = new ArrayList();
        this.f26791g = arrayList;
        this.f26792h = new HashSet();
        this.f26793i = new ArrayList();
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f26787a = jVar;
        this.f26788b = jVar.J();
        int intValue = ((Integer) jVar.a(sj.c3)).intValue();
        this.f26789c = intValue;
        if (!((Boolean) jVar.a(sj.f3)).booleanValue()) {
            this.d = null;
            return;
        }
        c cVar = new c(this, jVar);
        this.d = cVar;
        if (yp.a(sj.m1, jVar) && yp.h()) {
            a((Runnable) new f(this, 0), true, true);
        } else {
            arrayList.addAll(cVar.a(intValue));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f26787a.j0().a((yl) this.d, tm.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f26790f) {
            while (this.f26791g.size() > this.f26789c) {
                try {
                    this.f26791g.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f26791g.add(dVar);
        }
        if (n.a()) {
            this.f26788b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public /* synthetic */ void f() {
        synchronized (this.f26790f) {
            this.f26791g.addAll(0, this.d.a(this.f26789c));
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f26790f) {
            try {
                if (((Boolean) this.f26787a.a(sj.e3)).booleanValue()) {
                    arrayList.ensureCapacity(this.f26793i.size());
                    arrayList.addAll(this.f26793i);
                } else {
                    arrayList.ensureCapacity(this.f26791g.size());
                    arrayList.addAll(this.f26791g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f26790f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.f26790f) {
            try {
                Iterator it = new ArrayList(this.f26791g).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z2) {
        a(dVar, z2, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z2, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (n.a()) {
                this.f26788b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z2) {
                dVar.a();
            }
            a(new androidx.room.e(this, 2, dVar, appLovinPostbackListener), yp.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new f(this, 1), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    public void c() {
        synchronized (this.f26790f) {
            try {
                Iterator it = this.f26793i.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f26793i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f26790f) {
            this.f26791g.clear();
            this.f26793i.clear();
        }
        this.f26787a.j0().a((yl) this.d, tm.b.OTHER);
    }

    public void d(d dVar) {
        synchronized (this.f26790f) {
            this.f26792h.remove(dVar);
            this.f26793i.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (n.a()) {
            this.f26788b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f26787a.x0() && !dVar.m()) {
            if (n.a()) {
                this.f26788b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (n.a()) {
                this.f26788b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f26790f) {
            try {
                if (this.f26792h.contains(dVar)) {
                    if (n.a()) {
                        this.f26788b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f26787a.a(sj.b3);
                if (dVar.c() > num.intValue()) {
                    if (n.a()) {
                        this.f26788b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f26790f) {
                    this.f26792h.add(dVar);
                }
                e a2 = e.b(this.f26787a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (n.a()) {
                    this.f26788b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f26787a.Y().dispatchPostbackRequest(a2, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f26790f) {
            this.f26792h.remove(dVar);
            this.f26791g.remove(dVar);
        }
        if (n.a()) {
            this.f26788b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z2, boolean z3) {
        if (z2) {
            this.f26787a.j0().a((yl) new jn(this.f26787a, z3, "runPostbackTask", runnable), tm.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
