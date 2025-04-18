package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.appevents.g;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.b;
import db.j;
import java.util.Arrays;
import java.util.List;
import s7.h1;
import xa.a;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.b(Context.class), bVar.d(za.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<db.a> getComponents() {
        h1 b3 = db.a.b(a.class);
        b3.a = LIBRARY_NAME;
        b3.a(j.b(Context.class));
        b3.a(new j(za.b.class, 0, 1));
        b3.f24390f = new m(0);
        return Arrays.asList(b3.b(), g.d(LIBRARY_NAME, "21.1.1"));
    }
}
