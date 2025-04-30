package com.google.firebase.messaging;

import E4.b;
import K4.c;
import L4.h;
import M4.a;
import O4.e;
import U4.p;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.mbridge.msdk.foundation.entity.o;
import g4.C2296f;
import h3.f;
import j5.C2399b;
import java.util.Arrays;
import java.util.List;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(q qVar, p pVar) {
        return lambda$getComponents$0(qVar, pVar);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, InterfaceC2497c interfaceC2497c) {
        C2296f c2296f = (C2296f) interfaceC2497c.b(C2296f.class);
        o.v(interfaceC2497c.b(a.class));
        return new FirebaseMessaging(c2296f, interfaceC2497c.c(C2399b.class), interfaceC2497c.c(h.class), (e) interfaceC2497c.b(e.class), interfaceC2497c.g(qVar), (c) interfaceC2497c.b(c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C2496b> getComponents() {
        q qVar = new q(b.class, f.class);
        C2495a a6 = C2496b.a(FirebaseMessaging.class);
        a6.f21938a = LIBRARY_NAME;
        a6.a(C2502h.b(C2296f.class));
        a6.a(new C2502h(a.class, 0, 0));
        a6.a(C2502h.a(C2399b.class));
        a6.a(C2502h.a(h.class));
        a6.a(C2502h.b(e.class));
        a6.a(new C2502h(qVar, 0, 1));
        a6.a(C2502h.b(c.class));
        a6.f21942f = new L4.b(qVar, 1);
        a6.c(1);
        return Arrays.asList(a6.b(), R2.b.k(LIBRARY_NAME, "24.0.0"));
    }
}
