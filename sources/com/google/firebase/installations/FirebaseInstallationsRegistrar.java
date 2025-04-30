package com.google.firebase.installations;

import A4.a;
import L4.f;
import L4.g;
import O4.d;
import O4.e;
import R2.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;
import p4.k;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(InterfaceC2497c interfaceC2497c) {
        return new d((C2296f) interfaceC2497c.b(C2296f.class), interfaceC2497c.c(g.class), (ExecutorService) interfaceC2497c.f(new q(InterfaceC2477a.class, ExecutorService.class)), new k((Executor) interfaceC2497c.f(new q(InterfaceC2478b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        C2495a a6 = C2496b.a(e.class);
        a6.f21938a = LIBRARY_NAME;
        a6.a(C2502h.b(C2296f.class));
        a6.a(C2502h.a(g.class));
        a6.a(new C2502h(new q(InterfaceC2477a.class, ExecutorService.class), 1, 0));
        a6.a(new C2502h(new q(InterfaceC2478b.class, Executor.class), 1, 0));
        a6.f21942f = new a(14);
        C2496b b = a6.b();
        f fVar = new f(0);
        C2495a a9 = C2496b.a(f.class);
        a9.f21941e = 1;
        a9.f21942f = new F2.d(fVar, 19);
        return Arrays.asList(b, a9.b(), b.k(LIBRARY_NAME, "18.0.0"));
    }
}
