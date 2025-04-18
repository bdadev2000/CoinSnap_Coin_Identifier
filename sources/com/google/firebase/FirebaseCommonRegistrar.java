package com.google.firebase;

import ac.d;
import ac.e;
import ac.f;
import ac.g;
import android.content.Context;
import android.os.Build;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.a;
import db.j;
import db.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kc.b;
import kotlin.KotlinVersion;
import n0.h;
import s7.h1;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        h1 b3 = a.b(b.class);
        b3.a(new j(kc.a.class, 2, 0));
        b3.f24390f = new m(9);
        arrayList.add(b3.b());
        s sVar = new s(cb.a.class, Executor.class);
        h1 h1Var = new h1(d.class, new Class[]{f.class, g.class});
        h1Var.a(j.b(Context.class));
        h1Var.a(j.b(va.g.class));
        h1Var.a(new j(e.class, 2, 0));
        h1Var.a(new j(b.class, 1, 1));
        h1Var.a(new j(sVar, 1, 0));
        h1Var.f24390f = new ac.b(sVar, 0);
        arrayList.add(h1Var.b());
        arrayList.add(com.facebook.appevents.g.d("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.facebook.appevents.g.d("fire-core", "21.0.0"));
        arrayList.add(com.facebook.appevents.g.d("device-name", a(Build.PRODUCT)));
        arrayList.add(com.facebook.appevents.g.d("device-model", a(Build.DEVICE)));
        arrayList.add(com.facebook.appevents.g.d("device-brand", a(Build.BRAND)));
        arrayList.add(com.facebook.appevents.g.j("android-target-sdk", new h(14)));
        arrayList.add(com.facebook.appevents.g.j("android-min-sdk", new h(15)));
        arrayList.add(com.facebook.appevents.g.j("android-platform", new h(16)));
        arrayList.add(com.facebook.appevents.g.j("android-installer", new h(17)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(com.facebook.appevents.g.d("kotlin", str));
        }
        return arrayList;
    }
}
