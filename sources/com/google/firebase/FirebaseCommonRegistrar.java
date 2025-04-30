package com.google.firebase;

import L4.b;
import L4.e;
import L4.f;
import L4.h;
import android.content.Context;
import android.os.Build;
import com.applovin.impl.sdk.ad.g;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import j5.C2398a;
import j5.C2399b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n4.InterfaceC2477a;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.q;
import t7.C2716e;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C2495a a6 = C2496b.a(C2399b.class);
        a6.a(new C2502h(C2398a.class, 2, 0));
        a6.f21942f = new g(24);
        arrayList.add(a6.b());
        q qVar = new q(InterfaceC2477a.class, Executor.class);
        C2495a c2495a = new C2495a(e.class, new Class[]{L4.g.class, h.class});
        c2495a.a(C2502h.b(Context.class));
        c2495a.a(C2502h.b(C2296f.class));
        c2495a.a(new C2502h(f.class, 2, 0));
        c2495a.a(new C2502h(C2399b.class, 1, 1));
        c2495a.a(new C2502h(qVar, 1, 0));
        c2495a.f21942f = new b(qVar, 0);
        arrayList.add(c2495a.b());
        arrayList.add(R2.b.k("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(R2.b.k("fire-core", "21.0.0"));
        arrayList.add(R2.b.k("device-name", a(Build.PRODUCT)));
        arrayList.add(R2.b.k("device-model", a(Build.DEVICE)));
        arrayList.add(R2.b.k("device-brand", a(Build.BRAND)));
        arrayList.add(R2.b.n("android-target-sdk", new g(18)));
        arrayList.add(R2.b.n("android-min-sdk", new g(19)));
        arrayList.add(R2.b.n("android-platform", new g(20)));
        arrayList.add(R2.b.n("android-installer", new g(21)));
        try {
            C2716e.f23017c.getClass();
            str = "2.0.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(R2.b.k("kotlin", str));
        }
        return arrayList;
    }
}
