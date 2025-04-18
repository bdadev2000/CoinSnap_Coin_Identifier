package com.google.firebase.installations;

import ac.f;
import androidx.annotation.Keep;
import androidx.core.app.h;
import cb.a;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.b;
import db.j;
import db.s;
import dc.d;
import dc.e;
import eb.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s7.h1;
import va.g;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(b bVar) {
        return new d((g) bVar.b(g.class), bVar.d(f.class), (ExecutorService) bVar.e(new s(a.class, ExecutorService.class)), new k((Executor) bVar.e(new s(cb.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<db.a> getComponents() {
        h1 b3 = db.a.b(e.class);
        b3.a = LIBRARY_NAME;
        b3.a(j.b(g.class));
        b3.a(new j(f.class, 0, 1));
        b3.a(new j(new s(a.class, ExecutorService.class), 1, 0));
        b3.a(new j(new s(cb.b.class, Executor.class), 1, 0));
        b3.f24390f = new m(8);
        ac.e eVar = new ac.e();
        h1 b10 = db.a.b(ac.e.class);
        b10.f24387c = 1;
        b10.f24390f = new h(eVar, 0);
        return Arrays.asList(b3.b(), b10.b(), com.facebook.appevents.g.d(LIBRARY_NAME, "18.0.0"));
    }
}
