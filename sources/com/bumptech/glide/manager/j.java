package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements n, w4.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9721b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9722c;

    public /* synthetic */ j(Object obj, Object obj2) {
        this.f9722c = obj;
        this.f9721b = obj2;
    }

    public final com.bumptech.glide.o a(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.p pVar, FragmentManager fragmentManager, boolean z10) {
        w4.m.a();
        w4.m.a();
        Object obj = this.f9721b;
        com.bumptech.glide.o oVar = (com.bumptech.glide.o) ((Map) obj).get(pVar);
        if (oVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(pVar);
            z1.d dVar = (z1.d) this.f9722c;
            j jVar = new j(this, fragmentManager);
            dVar.getClass();
            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(bVar, lifecycleLifecycle, jVar, context);
            ((Map) obj).put(pVar, oVar2);
            lifecycleLifecycle.k(new i(this, pVar));
            if (z10) {
                oVar2.onStart();
            }
            return oVar2;
        }
        return oVar;
    }

    @Override // w4.f
    public final Object get() {
        return (ConnectivityManager) ((Context) this.f9721b).getSystemService("connectivity");
    }

    public j(z1.d dVar) {
        this.f9721b = new HashMap();
        this.f9722c = dVar;
    }
}
