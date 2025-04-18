package com.google.firebase.messaging;

import a4.j;
import androidx.annotation.Keep;
import bc.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import db.b;
import db.s;
import dc.e;
import f7.f;
import java.util.Arrays;
import java.util.List;
import s7.h1;
import va.g;
import zb.c;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s sVar, b bVar) {
        g gVar = (g) bVar.b(g.class);
        j.t(bVar.b(a.class));
        return new FirebaseMessaging(gVar, bVar.d(kc.b.class), bVar.d(ac.g.class), (e) bVar.b(e.class), bVar.a(sVar), (c) bVar.b(c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<db.a> getComponents() {
        s sVar = new s(tb.b.class, f.class);
        h1 b3 = db.a.b(FirebaseMessaging.class);
        b3.a = LIBRARY_NAME;
        b3.a(db.j.b(g.class));
        b3.a(new db.j(a.class, 0, 0));
        b3.a(new db.j(kc.b.class, 0, 1));
        b3.a(new db.j(ac.g.class, 0, 1));
        b3.a(db.j.b(e.class));
        b3.a(new db.j(sVar, 0, 1));
        b3.a(db.j.b(c.class));
        b3.f24390f = new ac.b(sVar, 1);
        b3.g(1);
        return Arrays.asList(b3.b(), com.facebook.appevents.g.d(LIBRARY_NAME, "24.1.0"));
    }
}
