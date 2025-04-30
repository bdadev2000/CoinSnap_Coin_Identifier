package com.google.firebase.sessions;

import G7.j;
import N4.b;
import O4.e;
import Q7.AbstractC0251t;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import h3.f;
import java.util.List;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;
import p4.i;
import p5.C2549D;
import p5.C2562m;
import p5.C2564o;
import p5.H;
import p5.InterfaceC2569u;
import p5.K;
import p5.M;
import p5.T;
import p5.U;
import r5.C2678j;
import u7.AbstractC2817h;
import w7.k;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C2564o Companion = new Object();
    private static final q firebaseApp = q.a(C2296f.class);
    private static final q firebaseInstallationsApi = q.a(e.class);
    private static final q backgroundDispatcher = new q(InterfaceC2477a.class, AbstractC0251t.class);
    private static final q blockingDispatcher = new q(InterfaceC2478b.class, AbstractC0251t.class);
    private static final q transportFactory = q.a(f.class);
    private static final q sessionsSettings = q.a(C2678j.class);
    private static final q sessionLifecycleServiceBinder = q.a(T.class);

    public static final C2562m getComponents$lambda$0(InterfaceC2497c interfaceC2497c) {
        Object f9 = interfaceC2497c.f(firebaseApp);
        j.d(f9, "container[firebaseApp]");
        Object f10 = interfaceC2497c.f(sessionsSettings);
        j.d(f10, "container[sessionsSettings]");
        Object f11 = interfaceC2497c.f(backgroundDispatcher);
        j.d(f11, "container[backgroundDispatcher]");
        Object f12 = interfaceC2497c.f(sessionLifecycleServiceBinder);
        j.d(f12, "container[sessionLifecycleServiceBinder]");
        return new C2562m((C2296f) f9, (C2678j) f10, (k) f11, (T) f12);
    }

    public static final M getComponents$lambda$1(InterfaceC2497c interfaceC2497c) {
        return new M();
    }

    public static final H getComponents$lambda$2(InterfaceC2497c interfaceC2497c) {
        Object f9 = interfaceC2497c.f(firebaseApp);
        j.d(f9, "container[firebaseApp]");
        C2296f c2296f = (C2296f) f9;
        Object f10 = interfaceC2497c.f(firebaseInstallationsApi);
        j.d(f10, "container[firebaseInstallationsApi]");
        e eVar = (e) f10;
        Object f11 = interfaceC2497c.f(sessionsSettings);
        j.d(f11, "container[sessionsSettings]");
        C2678j c2678j = (C2678j) f11;
        b g9 = interfaceC2497c.g(transportFactory);
        j.d(g9, "container.getProvider(transportFactory)");
        com.bumptech.glide.f fVar = new com.bumptech.glide.f(g9, 12);
        Object f12 = interfaceC2497c.f(backgroundDispatcher);
        j.d(f12, "container[backgroundDispatcher]");
        return new K(c2296f, eVar, c2678j, fVar, (k) f12);
    }

    public static final C2678j getComponents$lambda$3(InterfaceC2497c interfaceC2497c) {
        Object f9 = interfaceC2497c.f(firebaseApp);
        j.d(f9, "container[firebaseApp]");
        Object f10 = interfaceC2497c.f(blockingDispatcher);
        j.d(f10, "container[blockingDispatcher]");
        Object f11 = interfaceC2497c.f(backgroundDispatcher);
        j.d(f11, "container[backgroundDispatcher]");
        Object f12 = interfaceC2497c.f(firebaseInstallationsApi);
        j.d(f12, "container[firebaseInstallationsApi]");
        return new C2678j((C2296f) f9, (k) f10, (k) f11, (e) f12);
    }

    public static final InterfaceC2569u getComponents$lambda$4(InterfaceC2497c interfaceC2497c) {
        C2296f c2296f = (C2296f) interfaceC2497c.f(firebaseApp);
        c2296f.a();
        Context context = c2296f.f20433a;
        j.d(context, "container[firebaseApp].applicationContext");
        Object f9 = interfaceC2497c.f(backgroundDispatcher);
        j.d(f9, "container[backgroundDispatcher]");
        return new C2549D(context, (k) f9);
    }

    public static final T getComponents$lambda$5(InterfaceC2497c interfaceC2497c) {
        Object f9 = interfaceC2497c.f(firebaseApp);
        j.d(f9, "container[firebaseApp]");
        return new U((C2296f) f9);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        C2495a a6 = C2496b.a(C2562m.class);
        a6.f21938a = LIBRARY_NAME;
        q qVar = firebaseApp;
        a6.a(C2502h.c(qVar));
        q qVar2 = sessionsSettings;
        a6.a(C2502h.c(qVar2));
        q qVar3 = backgroundDispatcher;
        a6.a(C2502h.c(qVar3));
        a6.a(C2502h.c(sessionLifecycleServiceBinder));
        a6.f21942f = new i(3);
        a6.c(2);
        C2496b b = a6.b();
        C2495a a9 = C2496b.a(M.class);
        a9.f21938a = "session-generator";
        a9.f21942f = new i(4);
        C2496b b8 = a9.b();
        C2495a a10 = C2496b.a(H.class);
        a10.f21938a = "session-publisher";
        a10.a(new C2502h(qVar, 1, 0));
        q qVar4 = firebaseInstallationsApi;
        a10.a(C2502h.c(qVar4));
        a10.a(new C2502h(qVar2, 1, 0));
        a10.a(new C2502h(transportFactory, 1, 1));
        a10.a(new C2502h(qVar3, 1, 0));
        a10.f21942f = new i(5);
        C2496b b9 = a10.b();
        C2495a a11 = C2496b.a(C2678j.class);
        a11.f21938a = "sessions-settings";
        a11.a(new C2502h(qVar, 1, 0));
        a11.a(C2502h.c(blockingDispatcher));
        a11.a(new C2502h(qVar3, 1, 0));
        a11.a(new C2502h(qVar4, 1, 0));
        a11.f21942f = new i(6);
        C2496b b10 = a11.b();
        C2495a a12 = C2496b.a(InterfaceC2569u.class);
        a12.f21938a = "sessions-datastore";
        a12.a(new C2502h(qVar, 1, 0));
        a12.a(new C2502h(qVar3, 1, 0));
        a12.f21942f = new i(7);
        C2496b b11 = a12.b();
        C2495a a13 = C2496b.a(T.class);
        a13.f21938a = "sessions-service-binder";
        a13.a(new C2502h(qVar, 1, 0));
        a13.f21942f = new i(8);
        return AbstractC2817h.B(b, b8, b9, b10, b11, a13.b(), R2.b.k(LIBRARY_NAME, "2.0.3"));
    }
}
