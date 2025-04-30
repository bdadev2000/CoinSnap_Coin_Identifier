package com.applovin.impl.sdk;

import com.applovin.impl.h8;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.C0749a;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.b */
/* loaded from: classes.dex */
public class C0750b {

    /* renamed from: a */
    private final k f10771a;
    private final WeakReference b;

    /* renamed from: c */
    private final WeakReference f10772c;

    /* renamed from: d */
    private ho f10773d;

    private C0750b(h8 h8Var, C0749a.InterfaceC0033a interfaceC0033a, k kVar) {
        this.b = new WeakReference(h8Var);
        this.f10772c = new WeakReference(interfaceC0033a);
        this.f10771a = kVar;
    }

    public /* synthetic */ void c() {
        d();
        this.f10771a.f().a(this);
    }

    public h8 b() {
        return (h8) this.b.get();
    }

    public void d() {
        a();
        h8 b = b();
        if (b == null) {
            return;
        }
        b.setExpired();
        C0749a.InterfaceC0033a interfaceC0033a = (C0749a.InterfaceC0033a) this.f10772c.get();
        if (interfaceC0033a == null) {
            return;
        }
        interfaceC0033a.onAdExpired(b);
    }

    public static C0750b a(h8 h8Var, C0749a.InterfaceC0033a interfaceC0033a, k kVar) {
        C0750b c0750b = new C0750b(h8Var, interfaceC0033a, kVar);
        c0750b.a(h8Var.getTimeToLiveMillis());
        return c0750b;
    }

    public void a(long j7) {
        a();
        if (((Boolean) this.f10771a.a(oj.f9817o1)).booleanValue() || !this.f10771a.f0().isApplicationPaused()) {
            this.f10773d = ho.a(j7, this.f10771a, new z(this, 1));
        }
    }

    public void a() {
        ho hoVar = this.f10773d;
        if (hoVar != null) {
            hoVar.a();
            this.f10773d = null;
        }
    }
}
