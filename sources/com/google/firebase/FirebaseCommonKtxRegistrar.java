package com.google.firebase;

import Q7.AbstractC0251t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2297g;
import java.util.List;
import java.util.concurrent.Executor;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import n4.c;
import n4.d;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.q;
import u7.AbstractC2817h;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        C2495a b = C2496b.b(new q(InterfaceC2477a.class, AbstractC0251t.class));
        b.a(new C2502h(new q(InterfaceC2477a.class, Executor.class), 1, 0));
        b.f21942f = C2297g.f20442c;
        C2496b b8 = b.b();
        C2495a b9 = C2496b.b(new q(c.class, AbstractC0251t.class));
        b9.a(new C2502h(new q(c.class, Executor.class), 1, 0));
        b9.f21942f = C2297g.f20443d;
        C2496b b10 = b9.b();
        C2495a b11 = C2496b.b(new q(InterfaceC2478b.class, AbstractC0251t.class));
        b11.a(new C2502h(new q(InterfaceC2478b.class, Executor.class), 1, 0));
        b11.f21942f = C2297g.f20444f;
        C2496b b12 = b11.b();
        C2495a b13 = C2496b.b(new q(d.class, AbstractC0251t.class));
        b13.a(new C2502h(new q(d.class, Executor.class), 1, 0));
        b13.f21942f = C2297g.f20445g;
        return AbstractC2817h.B(b8, b10, b12, b13.b());
    }
}
