package com.google.firebase.crashlytics;

import O4.e;
import R2.b;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k4.InterfaceC2433b;
import n5.InterfaceC2479a;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import q4.C2645d;
import q5.C2646a;
import q5.c;
import q5.d;
import r4.a;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14326a = 0;

    static {
        d dVar = d.b;
        Map map = c.b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new C2646a(new Y7.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C2495a a6 = C2496b.a(C2645d.class);
        a6.f21938a = "fire-cls";
        a6.a(C2502h.b(C2296f.class));
        a6.a(C2502h.b(e.class));
        a6.a(new C2502h(a.class, 0, 2));
        a6.a(new C2502h(InterfaceC2433b.class, 0, 2));
        a6.a(new C2502h(InterfaceC2479a.class, 0, 2));
        a6.f21942f = new F2.d(this, 25);
        a6.c(2);
        return Arrays.asList(a6.b(), b.k("fire-cls", "19.0.3"));
    }
}
