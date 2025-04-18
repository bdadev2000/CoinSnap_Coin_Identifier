package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.t;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o implements ComponentCallbacks2, com.bumptech.glide.manager.h {

    /* renamed from: m, reason: collision with root package name */
    public static final s4.f f9751m;

    /* renamed from: b, reason: collision with root package name */
    public final b f9752b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9753c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.manager.g f9754d;

    /* renamed from: f, reason: collision with root package name */
    public final r f9755f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.manager.n f9756g;

    /* renamed from: h, reason: collision with root package name */
    public final t f9757h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.activity.i f9758i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.manager.c f9759j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f9760k;

    /* renamed from: l, reason: collision with root package name */
    public s4.f f9761l;

    static {
        s4.f fVar = (s4.f) new s4.f().c(Bitmap.class);
        fVar.f24202v = true;
        f9751m = fVar;
        ((s4.f) new s4.f().c(p4.c.class)).f24202v = true;
    }

    public o(b bVar, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.n nVar, Context context) {
        boolean z10;
        com.bumptech.glide.manager.c kVar;
        s4.f fVar;
        String str;
        r rVar = new r();
        z1.d dVar = bVar.f9611h;
        this.f9757h = new t();
        androidx.activity.i iVar = new androidx.activity.i(this, 13);
        this.f9758i = iVar;
        this.f9752b = bVar;
        this.f9754d = gVar;
        this.f9756g = nVar;
        this.f9755f = rVar;
        this.f9753c = context;
        Context applicationContext = context.getApplicationContext();
        n nVar2 = new n(this, rVar);
        dVar.getClass();
        if (d0.h.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            kVar = new com.bumptech.glide.manager.d(applicationContext, nVar2);
        } else {
            kVar = new com.bumptech.glide.manager.k();
        }
        this.f9759j = kVar;
        synchronized (bVar.f9612i) {
            if (!bVar.f9612i.contains(this)) {
                bVar.f9612i.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = w4.m.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            w4.m.e().post(iVar);
        } else {
            gVar.k(this);
        }
        gVar.k(kVar);
        this.f9760k = new CopyOnWriteArrayList(bVar.f9608d.f9667e);
        g gVar2 = bVar.f9608d;
        synchronized (gVar2) {
            if (gVar2.f9672j == null) {
                gVar2.f9666d.getClass();
                s4.f fVar2 = new s4.f();
                fVar2.f24202v = true;
                gVar2.f9672j = fVar2;
            }
            fVar = gVar2.f9672j;
        }
        synchronized (this) {
            s4.f fVar3 = (s4.f) fVar.clone();
            if (fVar3.f24202v && !fVar3.f24204x) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            fVar3.f24204x = true;
            fVar3.f24202v = true;
            this.f9761l = fVar3;
        }
    }

    public final void i(t4.e eVar) {
        boolean z10;
        if (eVar == null) {
            return;
        }
        boolean l10 = l(eVar);
        s4.c e2 = eVar.e();
        if (!l10) {
            b bVar = this.f9752b;
            synchronized (bVar.f9612i) {
                Iterator it = bVar.f9612i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((o) it.next()).l(eVar)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10 && e2 != null) {
                eVar.a(null);
                e2.clear();
            }
        }
    }

    public final m j(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        m mVar = new m(this.f9752b, this, Drawable.class, this.f9753c);
        m y4 = mVar.y(num);
        Context context = mVar.C;
        m mVar2 = (m) y4.n(context.getTheme());
        ConcurrentHashMap concurrentHashMap = v4.b.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = v4.b.a;
        e4.j jVar = (e4.j) concurrentHashMap2.get(packageName);
        if (jVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            v4.d dVar = new v4.d(uuid);
            jVar = (e4.j) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (jVar == null) {
                jVar = dVar;
            }
        }
        return (m) mVar2.l(new v4.a(context.getResources().getConfiguration().uiMode & 48, jVar));
    }

    public final synchronized void k() {
        r rVar = this.f9755f;
        rVar.f9743d = true;
        Iterator it = w4.m.d((Set) rVar.f9742c).iterator();
        while (it.hasNext()) {
            s4.c cVar = (s4.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((Set) rVar.f9744f).add(cVar);
            }
        }
    }

    public final synchronized boolean l(t4.e eVar) {
        s4.c e2 = eVar.e();
        if (e2 == null) {
            return true;
        }
        if (this.f9755f.c(e2)) {
            this.f9757h.f9749b.remove(eVar);
            eVar.a(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onDestroy() {
        this.f9757h.onDestroy();
        Iterator it = w4.m.d(this.f9757h.f9749b).iterator();
        while (it.hasNext()) {
            i((t4.e) it.next());
        }
        this.f9757h.f9749b.clear();
        r rVar = this.f9755f;
        Iterator it2 = w4.m.d((Set) rVar.f9742c).iterator();
        while (it2.hasNext()) {
            rVar.c((s4.c) it2.next());
        }
        ((Set) rVar.f9744f).clear();
        this.f9754d.e(this);
        this.f9754d.e(this.f9759j);
        w4.m.e().removeCallbacks(this.f9758i);
        this.f9752b.d(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStart() {
        synchronized (this) {
            this.f9755f.k();
        }
        this.f9757h.onStart();
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStop() {
        k();
        this.f9757h.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9755f + ", treeNode=" + this.f9756g + "}";
    }
}
