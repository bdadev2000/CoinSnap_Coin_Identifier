package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.facebook.appevents.g;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.b;
import db.j;
import db.s;
import f7.f;
import g7.a;
import i7.r;
import java.util.Arrays;
import java.util.List;
import s7.h1;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        r.b((Context) bVar.b(Context.class));
        return r.a().c(a.f18231f);
    }

    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        r.b((Context) bVar.b(Context.class));
        return r.a().c(a.f18231f);
    }

    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        r.b((Context) bVar.b(Context.class));
        return r.a().c(a.f18230e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<db.a> getComponents() {
        h1 b3 = db.a.b(f.class);
        b3.a = LIBRARY_NAME;
        b3.a(j.b(Context.class));
        b3.f24390f = new m(5);
        h1 a = db.a.a(new s(tb.a.class, f.class));
        a.a(j.b(Context.class));
        a.f24390f = new m(6);
        h1 a10 = db.a.a(new s(tb.b.class, f.class));
        a10.a(j.b(Context.class));
        a10.f24390f = new m(7);
        return Arrays.asList(b3.b(), a.b(), a10.b(), g.d(LIBRARY_NAME, "19.0.0"));
    }
}
