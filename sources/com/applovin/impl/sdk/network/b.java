package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.emoji2.text.n;
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
    private final k a;

    /* renamed from: b */
    private final t f7906b;

    /* renamed from: c */
    private final int f7907c;

    /* renamed from: d */
    private final c f7908d;

    /* renamed from: f */
    private final Object f7909f = new Object();

    /* renamed from: g */
    private final List f7910g;

    /* renamed from: h */
    private final Set f7911h;

    /* renamed from: i */
    private final List f7912i;

    /* loaded from: classes.dex */
    public class a implements AppLovinPostbackListener {
        final /* synthetic */ d a;

        /* renamed from: b */
        final /* synthetic */ AppLovinPostbackListener f7913b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.a = dVar;
            this.f7913b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            t unused = b.this.f7906b;
            if (t.a()) {
                b.this.f7906b.d("PersistentPostbackManager", "Failed to submit postback: " + this.a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.a);
            bc.a(this.f7913b, str, i10);
            if (this.a.c() == 1) {
                b.this.a.B().a("dispatchPostback", str, i10);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.a);
            t unused = b.this.f7906b;
            if (t.a()) {
                b.this.f7906b.a("PersistentPostbackManager", "Successfully submit postback: " + this.a);
            }
            b.this.c();
            bc.a(this.f7913b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f7910g = arrayList;
        this.f7911h = new HashSet();
        this.f7912i = new ArrayList();
        if (kVar != null) {
            this.a = kVar;
            this.f7906b = kVar.L();
            int intValue = ((Integer) kVar.a(oj.W2)).intValue();
            this.f7907c = intValue;
            if (((Boolean) kVar.a(oj.Z2)).booleanValue()) {
                c cVar = new c(this, kVar);
                this.f7908d = cVar;
                if (zp.a(oj.f6713n1, kVar) && zp.h()) {
                    a((Runnable) new f(this, 0), true, true);
                } else {
                    arrayList.addAll(cVar.a(intValue));
                }
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f7908d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.a.l0().a((xl) this.f7908d, sm.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f7909f) {
            while (this.f7910g.size() > this.f7907c) {
                this.f7910g.remove(0);
            }
            this.f7910g.add(dVar);
        }
        if (t.a()) {
            this.f7906b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public /* synthetic */ void f() {
        synchronized (this.f7909f) {
            this.f7910g.addAll(0, this.f7908d.a(this.f7907c));
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f7909f) {
            if (((Boolean) this.a.a(oj.Y2)).booleanValue()) {
                arrayList.ensureCapacity(this.f7912i.size());
                arrayList.addAll(this.f7912i);
            } else {
                arrayList.ensureCapacity(this.f7910g.size());
                arrayList.addAll(this.f7910g);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f7909f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.f7909f) {
            Iterator it = new ArrayList(this.f7910g).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z10, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.f7906b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new n(6, this, dVar, appLovinPostbackListener), zp.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new f(this, 1), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    public void c() {
        synchronized (this.f7909f) {
            Iterator it = this.f7912i.iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
            this.f7912i.clear();
        }
    }

    public void a() {
        synchronized (this.f7909f) {
            this.f7910g.clear();
            this.f7912i.clear();
        }
        this.a.l0().a((xl) this.f7908d, sm.b.OTHER);
    }

    public void d(d dVar) {
        synchronized (this.f7909f) {
            this.f7911h.remove(dVar);
            this.f7912i.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (t.a()) {
            this.f7906b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.a.A0() && !dVar.m()) {
            if (t.a()) {
                this.f7906b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (t.a()) {
                this.f7906b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f7909f) {
            if (this.f7911h.contains(dVar)) {
                if (t.a()) {
                    this.f7906b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            Integer num = (Integer) this.a.a(oj.V2);
            if (dVar.c() > num.intValue()) {
                if (t.a()) {
                    this.f7906b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
                return;
            }
            synchronized (this.f7909f) {
                this.f7911h.add(dVar);
            }
            e a10 = e.b(this.a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
            if (t.a()) {
                this.f7906b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
            }
            this.a.a0().dispatchPostbackRequest(a10, new a(dVar, appLovinPostbackListener));
        }
    }

    public void a(d dVar) {
        synchronized (this.f7909f) {
            this.f7911h.remove(dVar);
            this.f7910g.remove(dVar);
        }
        if (t.a()) {
            this.f7906b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.a.l0().a((xl) new kn(this.a, z11, "runPostbackTask", runnable), sm.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
