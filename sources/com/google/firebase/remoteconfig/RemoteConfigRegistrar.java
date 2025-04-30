package com.google.firebase.remoteconfig;

import L4.b;
import O4.e;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import h4.c;
import i4.C2345a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k4.InterfaceC2433b;
import k5.k;
import n4.InterfaceC2478b;
import n5.InterfaceC2479a;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static k lambda$getComponents$0(q qVar, InterfaceC2497c interfaceC2497c) {
        c cVar;
        Context context = (Context) interfaceC2497c.b(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC2497c.f(qVar);
        C2296f c2296f = (C2296f) interfaceC2497c.b(C2296f.class);
        e eVar = (e) interfaceC2497c.b(e.class);
        C2345a c2345a = (C2345a) interfaceC2497c.b(C2345a.class);
        synchronized (c2345a) {
            try {
                if (!c2345a.f20656a.containsKey("frc")) {
                    c2345a.f20656a.put("frc", new c(c2345a.f20657c));
                }
                cVar = (c) c2345a.f20656a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new k(context, scheduledExecutorService, c2296f, eVar, cVar, interfaceC2497c.c(InterfaceC2433b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        q qVar = new q(InterfaceC2478b.class, ScheduledExecutorService.class);
        C2495a c2495a = new C2495a(k.class, new Class[]{InterfaceC2479a.class});
        c2495a.f21938a = LIBRARY_NAME;
        c2495a.a(C2502h.b(Context.class));
        c2495a.a(new C2502h(qVar, 1, 0));
        c2495a.a(C2502h.b(C2296f.class));
        c2495a.a(C2502h.b(e.class));
        c2495a.a(C2502h.b(C2345a.class));
        c2495a.a(C2502h.a(InterfaceC2433b.class));
        c2495a.f21942f = new b(qVar, 3);
        c2495a.c(2);
        return Arrays.asList(c2495a.b(), R2.b.k(LIBRARY_NAME, "22.0.0"));
    }
}
