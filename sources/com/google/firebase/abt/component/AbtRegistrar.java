package com.google.firebase.abt.component;

import R2.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.applovin.impl.sdk.ad.g;
import com.google.firebase.components.ComponentRegistrar;
import i4.C2345a;
import java.util.Arrays;
import java.util.List;
import k4.InterfaceC2433b;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C2345a lambda$getComponents$0(InterfaceC2497c interfaceC2497c) {
        return new C2345a((Context) interfaceC2497c.b(Context.class), interfaceC2497c.c(InterfaceC2433b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2496b> getComponents() {
        C2495a a6 = C2496b.a(C2345a.class);
        a6.f21938a = LIBRARY_NAME;
        a6.a(C2502h.b(Context.class));
        a6.a(C2502h.a(InterfaceC2433b.class));
        a6.f21942f = new g(23);
        return Arrays.asList(a6.b(), b.k(LIBRARY_NAME, "21.1.1"));
    }
}
