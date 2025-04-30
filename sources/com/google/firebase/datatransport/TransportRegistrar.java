package com.google.firebase.datatransport;

import A4.a;
import E4.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import h3.f;
import i3.C2342a;
import java.util.Arrays;
import java.util.List;
import k3.s;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(InterfaceC2497c interfaceC2497c) {
        s.b((Context) interfaceC2497c.b(Context.class));
        return s.a().c(C2342a.f20646f);
    }

    public static /* synthetic */ f lambda$getComponents$1(InterfaceC2497c interfaceC2497c) {
        s.b((Context) interfaceC2497c.b(Context.class));
        return s.a().c(C2342a.f20646f);
    }

    public static /* synthetic */ f lambda$getComponents$2(InterfaceC2497c interfaceC2497c) {
        s.b((Context) interfaceC2497c.b(Context.class));
        return s.a().c(C2342a.f20645e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C2496b> getComponents() {
        C2495a a6 = C2496b.a(f.class);
        a6.f21938a = LIBRARY_NAME;
        a6.a(C2502h.b(Context.class));
        a6.f21942f = new a(2);
        C2496b b = a6.b();
        C2495a b8 = C2496b.b(new q(E4.a.class, f.class));
        b8.a(C2502h.b(Context.class));
        b8.f21942f = new a(3);
        C2496b b9 = b8.b();
        C2495a b10 = C2496b.b(new q(b.class, f.class));
        b10.a(C2502h.b(Context.class));
        b10.f21942f = new a(4);
        return Arrays.asList(b, b9, b10.b(), R2.b.k(LIBRARY_NAME, "19.0.0"));
    }
}
