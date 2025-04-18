package com.applovin.impl.sdk;

import com.applovin.impl.go;
import com.applovin.impl.j8;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sj;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a */
    private final j f26580a;

    /* renamed from: b */
    private final WeakReference f26581b;

    /* renamed from: c */
    private final WeakReference f26582c;
    private go d;

    private b(j8 j8Var, a.InterfaceC0096a interfaceC0096a, j jVar) {
        this.f26581b = new WeakReference(j8Var);
        this.f26582c = new WeakReference(interfaceC0096a);
        this.f26580a = jVar;
    }

    public /* synthetic */ void c() {
        d();
        this.f26580a.f().a(this);
    }

    public j8 b() {
        return (j8) this.f26581b.get();
    }

    public void d() {
        a();
        j8 b2 = b();
        if (b2 == null) {
            return;
        }
        b2.setExpired();
        a.InterfaceC0096a interfaceC0096a = (a.InterfaceC0096a) this.f26582c.get();
        if (interfaceC0096a == null) {
            return;
        }
        interfaceC0096a.onAdExpired(b2);
    }

    public static b a(j8 j8Var, a.InterfaceC0096a interfaceC0096a, j jVar) {
        b bVar = new b(j8Var, interfaceC0096a, jVar);
        bVar.a(j8Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j2) {
        a();
        if (((Boolean) this.f26580a.a(sj.q1)).booleanValue() || !this.f26580a.f0().isApplicationPaused()) {
            this.d = go.a(j2, this.f26580a, new s(this, 1));
        }
    }

    public void a() {
        go goVar = this.d;
        if (goVar != null) {
            goVar.a();
            this.d = null;
        }
    }
}
