package com.applovin.impl.sdk.network;

import U4.RunnableC0311g;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final k f11074a;
    private final t b;

    /* renamed from: c */
    private final int f11075c;

    /* renamed from: d */
    private final c f11076d;

    /* renamed from: f */
    private final Object f11077f = new Object();

    /* renamed from: g */
    private final List f11078g;

    /* renamed from: h */
    private final Set f11079h;

    /* renamed from: i */
    private final List f11080i;

    /* loaded from: classes.dex */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a */
        final /* synthetic */ d f11081a;
        final /* synthetic */ AppLovinPostbackListener b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f11081a = dVar;
            this.b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i9) {
            t unused = b.this.b;
            if (t.a()) {
                b.this.b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f11081a + " with error code: " + i9 + "; will retry later...");
            }
            b.this.d(this.f11081a);
            bc.a(this.b, str, i9);
            if (this.f11081a.c() == 1) {
                b.this.f11074a.B().a("dispatchPostback", str, i9);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f11081a);
            t unused = b.this.b;
            if (t.a()) {
                b.this.b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f11081a);
            }
            b.this.c();
            bc.a(this.b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f11078g = arrayList;
        this.f11079h = new HashSet();
        this.f11080i = new ArrayList();
        if (kVar != null) {
            this.f11074a = kVar;
            this.b = kVar.L();
            int intValue = ((Integer) kVar.a(oj.W2)).intValue();
            this.f11075c = intValue;
            if (((Boolean) kVar.a(oj.f9717Z2)).booleanValue()) {
                c cVar = new c(this, kVar);
                this.f11076d = cVar;
                if (zp.a(oj.f9810n1, kVar) && zp.h()) {
                    a((Runnable) new f(this, 1), true, true);
                } else {
                    arrayList.addAll(cVar.a(intValue));
                }
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f11076d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f11074a.l0().a((xl) this.f11076d, sm.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f11077f) {
            while (this.f11078g.size() > this.f11075c) {
                try {
                    this.f11078g.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11078g.add(dVar);
        }
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public /* synthetic */ void f() {
        synchronized (this.f11077f) {
            this.f11078g.addAll(0, this.f11076d.a(this.f11075c));
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f11077f) {
            try {
                if (((Boolean) this.f11074a.a(oj.f9711Y2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f11080i.size());
                    arrayList.addAll(this.f11080i);
                } else {
                    arrayList.ensureCapacity(this.f11078g.size());
                    arrayList.addAll(this.f11078g);
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
        synchronized (this.f11077f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.f11077f) {
            try {
                Iterator it = new ArrayList(this.f11078g).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z8) {
        a(dVar, z8, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z8, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z8) {
                dVar.a();
            }
            a(new RunnableC0311g(this, dVar, appLovinPostbackListener, 4), zp.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new f(this, 0), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    public void c() {
        synchronized (this.f11077f) {
            try {
                Iterator it = this.f11080i.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f11080i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f11077f) {
            this.f11078g.clear();
            this.f11080i.clear();
        }
        this.f11074a.l0().a((xl) this.f11076d, sm.b.OTHER);
    }

    public void d(d dVar) {
        synchronized (this.f11077f) {
            this.f11079h.remove(dVar);
            this.f11080i.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f11074a.A0() && !dVar.m()) {
            if (t.a()) {
                this.b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f11077f) {
            try {
                if (this.f11079h.contains(dVar)) {
                    if (t.a()) {
                        this.b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f11074a.a(oj.f9691V2);
                if (dVar.c() > num.intValue()) {
                    if (t.a()) {
                        this.b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f11077f) {
                    this.f11079h.add(dVar);
                }
                e a6 = e.b(this.f11074a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (t.a()) {
                    this.b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f11074a.a0().dispatchPostbackRequest(a6, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f11077f) {
            this.f11079h.remove(dVar);
            this.f11078g.remove(dVar);
        }
        if (t.a()) {
            this.b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z8, boolean z9) {
        if (z8) {
            this.f11074a.l0().a((xl) new kn(this.f11074a, z9, "runPostbackTask", runnable), sm.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
