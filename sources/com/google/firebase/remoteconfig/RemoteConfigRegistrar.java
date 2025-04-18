package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import db.b;
import db.s;
import dc.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import lc.j;
import s7.h1;
import va.g;
import wa.c;
import xa.a;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static j lambda$getComponents$0(s sVar, b bVar) {
        c cVar;
        Context context = (Context) bVar.b(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.e(sVar);
        g gVar = (g) bVar.b(g.class);
        e eVar = (e) bVar.b(e.class);
        a aVar = (a) bVar.b(a.class);
        synchronized (aVar) {
            if (!aVar.a.containsKey("frc")) {
                aVar.a.put("frc", new c(aVar.f27615c));
            }
            cVar = (c) aVar.a.get("frc");
        }
        return new j(context, scheduledExecutorService, gVar, eVar, cVar, bVar.d(za.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<db.a> getComponents() {
        s sVar = new s(cb.b.class, ScheduledExecutorService.class);
        h1 h1Var = new h1(j.class, new Class[]{oc.a.class});
        h1Var.a = LIBRARY_NAME;
        h1Var.a(db.j.b(Context.class));
        h1Var.a(new db.j(sVar, 1, 0));
        h1Var.a(db.j.b(g.class));
        h1Var.a(db.j.b(e.class));
        h1Var.a(db.j.b(a.class));
        h1Var.a(new db.j(za.b.class, 0, 1));
        h1Var.f24390f = new ac.b(sVar, 2);
        h1Var.g(2);
        return Arrays.asList(h1Var.b(), com.facebook.appevents.g.d(LIBRARY_NAME, "22.0.1"));
    }
}
