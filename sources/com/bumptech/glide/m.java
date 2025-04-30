package com.bumptech.glide;

import a2.C0333b;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import c2.C0592c;
import c2.InterfaceC0591b;
import c2.InterfaceC0596g;
import c2.InterfaceC0598i;
import c2.InterfaceC0602m;
import c2.p;
import c2.q;
import f2.AbstractC2263a;
import f2.C2267e;
import f2.InterfaceC2265c;
import g2.InterfaceC2289c;
import i2.AbstractC2339b;
import i2.C2338a;
import i2.C2341d;
import j2.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m implements ComponentCallbacks2, InterfaceC0598i {
    public static final C2267e m;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12867c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0596g f12868d;

    /* renamed from: f, reason: collision with root package name */
    public final p f12869f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0602m f12870g;

    /* renamed from: h, reason: collision with root package name */
    public final q f12871h;

    /* renamed from: i, reason: collision with root package name */
    public final B3.k f12872i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0591b f12873j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f12874k;
    public final C2267e l;

    static {
        C2267e c2267e = (C2267e) new AbstractC2263a().c(Bitmap.class);
        c2267e.f20285v = true;
        m = c2267e;
        ((C2267e) new AbstractC2263a().c(C0333b.class)).f20285v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [c2.i, c2.b] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [c2.g] */
    /* JADX WARN: Type inference failed for: r8v10, types: [f2.a, f2.e] */
    public m(b bVar, InterfaceC0596g interfaceC0596g, InterfaceC0602m interfaceC0602m, Context context) {
        boolean z8;
        ?? r02;
        C2267e c2267e;
        String str;
        p pVar = new p();
        L4.f fVar = bVar.f12795h;
        this.f12871h = new q();
        B3.k kVar = new B3.k(this, 12);
        this.f12872i = kVar;
        this.b = bVar;
        this.f12868d = interfaceC0596g;
        this.f12870g = interfaceC0602m;
        this.f12869f = pVar;
        this.f12867c = context;
        Context applicationContext = context.getApplicationContext();
        l lVar = new l(this, pVar);
        fVar.getClass();
        if (I.h.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z8) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z8) {
            r02 = new C0592c(applicationContext, lVar);
        } else {
            r02 = new Object();
        }
        this.f12873j = r02;
        synchronized (bVar.f12796i) {
            if (!bVar.f12796i.contains(this)) {
                bVar.f12796i.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = n.f21025a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            n.f().post(kVar);
        } else {
            interfaceC0596g.g(this);
        }
        interfaceC0596g.g(r02);
        this.f12874k = new CopyOnWriteArrayList(bVar.f12792d.f12813e);
        e eVar = bVar.f12792d;
        synchronized (eVar) {
            try {
                if (eVar.f12818j == null) {
                    eVar.f12812d.getClass();
                    ?? abstractC2263a = new AbstractC2263a();
                    abstractC2263a.f20285v = true;
                    eVar.f12818j = abstractC2263a;
                }
                c2267e = eVar.f12818j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            C2267e c2267e2 = (C2267e) c2267e.clone();
            if (c2267e2.f20285v && !c2267e2.f20287x) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c2267e2.f20287x = true;
            c2267e2.f20285v = true;
            this.l = c2267e2;
        }
    }

    public final void i(InterfaceC2289c interfaceC2289c) {
        if (interfaceC2289c == null) {
            return;
        }
        boolean m2 = m(interfaceC2289c);
        InterfaceC2265c g9 = interfaceC2289c.g();
        if (!m2) {
            b bVar = this.b;
            synchronized (bVar.f12796i) {
                try {
                    Iterator it = bVar.f12796i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((m) it.next()).m(interfaceC2289c)) {
                            }
                        } else if (g9 != null) {
                            interfaceC2289c.a(null);
                            g9.clear();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final k j(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        k kVar = new k(this.b, this, Drawable.class, this.f12867c);
        k y4 = kVar.y(num);
        Context context = kVar.f12834C;
        k kVar2 = (k) y4.o(context.getTheme());
        ConcurrentHashMap concurrentHashMap = AbstractC2339b.f20642a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = AbstractC2339b.f20642a;
        N1.f fVar = (N1.f) concurrentHashMap2.get(packageName);
        if (fVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e4);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            C2341d c2341d = new C2341d(uuid);
            fVar = (N1.f) concurrentHashMap2.putIfAbsent(packageName, c2341d);
            if (fVar == null) {
                fVar = c2341d;
            }
        }
        return (k) kVar2.m(new C2338a(context.getResources().getConfiguration().uiMode & 48, fVar));
    }

    public final synchronized void k() {
        p pVar = this.f12869f;
        pVar.f5403d = true;
        Iterator it = n.e((Set) pVar.f5404f).iterator();
        while (it.hasNext()) {
            InterfaceC2265c interfaceC2265c = (InterfaceC2265c) it.next();
            if (interfaceC2265c.isRunning()) {
                interfaceC2265c.pause();
                ((HashSet) pVar.f5402c).add(interfaceC2265c);
            }
        }
    }

    public final synchronized void l() {
        p pVar = this.f12869f;
        pVar.f5403d = false;
        Iterator it = n.e((Set) pVar.f5404f).iterator();
        while (it.hasNext()) {
            InterfaceC2265c interfaceC2265c = (InterfaceC2265c) it.next();
            if (!interfaceC2265c.i() && !interfaceC2265c.isRunning()) {
                interfaceC2265c.h();
            }
        }
        ((HashSet) pVar.f5402c).clear();
    }

    public final synchronized boolean m(InterfaceC2289c interfaceC2289c) {
        InterfaceC2265c g9 = interfaceC2289c.g();
        if (g9 == null) {
            return true;
        }
        if (this.f12869f.a(g9)) {
            this.f12871h.b.remove(interfaceC2289c);
            interfaceC2289c.a(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // c2.InterfaceC0598i
    public final synchronized void onDestroy() {
        this.f12871h.onDestroy();
        synchronized (this) {
            try {
                Iterator it = n.e(this.f12871h.b).iterator();
                while (it.hasNext()) {
                    i((InterfaceC2289c) it.next());
                }
                this.f12871h.b.clear();
            } finally {
            }
        }
        p pVar = this.f12869f;
        Iterator it2 = n.e((Set) pVar.f5404f).iterator();
        while (it2.hasNext()) {
            pVar.a((InterfaceC2265c) it2.next());
        }
        ((HashSet) pVar.f5402c).clear();
        this.f12868d.d(this);
        this.f12868d.d(this.f12873j);
        n.f().removeCallbacks(this.f12872i);
        this.b.c(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // c2.InterfaceC0598i
    public final synchronized void onStart() {
        l();
        this.f12871h.onStart();
    }

    @Override // c2.InterfaceC0598i
    public final synchronized void onStop() {
        this.f12871h.onStop();
        k();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12869f + ", treeNode=" + this.f12870g + "}";
    }
}
