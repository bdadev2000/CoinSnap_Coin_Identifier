package com.applovin.impl.sdk;

import com.applovin.impl.h8;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7625b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f7626c;

    /* renamed from: d, reason: collision with root package name */
    private ho f7627d;

    private b(h8 h8Var, a.InterfaceC0033a interfaceC0033a, k kVar) {
        this.f7625b = new WeakReference(h8Var);
        this.f7626c = new WeakReference(interfaceC0033a);
        this.a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.a.f().a(this);
    }

    public h8 b() {
        return (h8) this.f7625b.get();
    }

    public void d() {
        a();
        h8 b3 = b();
        if (b3 == null) {
            return;
        }
        b3.setExpired();
        a.InterfaceC0033a interfaceC0033a = (a.InterfaceC0033a) this.f7626c.get();
        if (interfaceC0033a == null) {
            return;
        }
        interfaceC0033a.onAdExpired(b3);
    }

    public static b a(h8 h8Var, a.InterfaceC0033a interfaceC0033a, k kVar) {
        b bVar = new b(h8Var, interfaceC0033a, kVar);
        bVar.a(h8Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j3) {
        a();
        if (((Boolean) this.a.a(oj.f6721o1)).booleanValue() || !this.a.f0().isApplicationPaused()) {
            this.f7627d = ho.a(j3, this.a, new z(this, 1));
        }
    }

    public void a() {
        ho hoVar = this.f7627d;
        if (hoVar != null) {
            hoVar.a();
            this.f7627d = null;
        }
    }
}
