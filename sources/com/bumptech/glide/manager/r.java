package com.bumptech.glide.manager;

import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import s7.f0;

/* loaded from: classes.dex */
public final class r implements k8.k, lb.j {

    /* renamed from: g, reason: collision with root package name */
    public static volatile r f9740g;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9741b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9742c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9743d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9744f;

    public r() {
        this.f9741b = 1;
        this.f9742c = Collections.newSetFromMap(new WeakHashMap());
        this.f9744f = new HashSet();
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + c6.c.i("r8-abstract-class");
        }
        return null;
    }

    public static r f(Context context) {
        if (f9740g == null) {
            synchronized (r.class) {
                if (f9740g == null) {
                    f9740g = new r(context.getApplicationContext());
                }
            }
        }
        return f9740g;
    }

    @Override // lb.j
    public final void a(lb.i iVar, int i10) {
        boolean z10 = this.f9743d;
        Object obj = this.f9744f;
        if (z10) {
            this.f9743d = false;
        } else {
            ((StringBuilder) obj).append(", ");
        }
        ((StringBuilder) obj).append(i10);
    }

    public final boolean c(s4.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f9742c).remove(cVar);
        if (!((Set) this.f9744f).remove(cVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    @Override // k8.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k8.c e(k8.j jVar) {
        MediaCodec mediaCodec;
        String str = jVar.a.a;
        k8.c cVar = null;
        try {
            c6.k.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                k8.c cVar2 = new k8.c(mediaCodec, (HandlerThread) ((ra.p) this.f9744f).get(), (HandlerThread) ((ra.p) this.f9742c).get(), this.f9743d);
                try {
                    c6.k.k();
                    k8.c.n(cVar2, jVar.f20324b, jVar.f20326d, jVar.f20327e);
                    return cVar2;
                } catch (Exception e2) {
                    e = e2;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uc.n g(com.google.gson.reflect.TypeToken r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.r.g(com.google.gson.reflect.TypeToken):uc.n");
    }

    public final void h() {
        boolean z10;
        if (!this.f9743d && !((Set) this.f9742c).isEmpty()) {
            h3.a aVar = (h3.a) ((p) this.f9744f);
            boolean z11 = true;
            if (((ConnectivityManager) ((w4.f) aVar.f18724f).get()).getActiveNetwork() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.f18722c = z10;
            try {
                ((ConnectivityManager) ((w4.f) aVar.f18724f).get()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) aVar.f18725g);
            } catch (RuntimeException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e2);
                }
                z11 = false;
            }
            this.f9743d = z11;
        }
    }

    public final void i() {
        if (this.f9743d && ((Set) this.f9742c).isEmpty()) {
            h3.a aVar = (h3.a) ((p) this.f9744f);
            ((ConnectivityManager) ((w4.f) aVar.f18724f).get()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) aVar.f18725g);
            this.f9743d = false;
        }
    }

    public final void j() {
        Iterator it = w4.m.d((Set) this.f9742c).iterator();
        while (it.hasNext()) {
            s4.c cVar = (s4.c) it.next();
            if (!cVar.g() && !cVar.f()) {
                cVar.clear();
                if (!this.f9743d) {
                    cVar.j();
                } else {
                    ((Set) this.f9744f).add(cVar);
                }
            }
        }
    }

    public final void k() {
        this.f9743d = false;
        Iterator it = w4.m.d((Set) this.f9742c).iterator();
        while (it.hasNext()) {
            s4.c cVar = (s4.c) it.next();
            if (!cVar.g() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        ((Set) this.f9744f).clear();
    }

    public final void l(boolean z10) {
        if (this.f9743d) {
            ((Context) this.f9744f).unregisterReceiver((s7.a) this.f9742c);
            this.f9743d = false;
        }
    }

    public final String toString() {
        switch (this.f9741b) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.f9742c).size() + ", isPaused=" + this.f9743d + "}";
            case 5:
                return ((Map) this.f9744f).toString();
            default:
                return super.toString();
        }
    }

    public r(Context context, Handler handler, f0 f0Var) {
        this.f9741b = 2;
        this.f9744f = context.getApplicationContext();
        this.f9742c = new s7.a(this, handler, f0Var);
    }

    public r(List list, Map map) {
        this.f9741b = 5;
        this.f9744f = map;
        this.f9743d = true;
        this.f9742c = list;
    }

    public r(Context context) {
        this.f9741b = 0;
        this.f9742c = new HashSet();
        this.f9744f = new h3.a(new g4.q(new j(this, context)), new o(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [k8.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k8.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(final int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 3
            r3.f9741b = r0
            k8.b r0 = new k8.b
            r1 = 0
            r0.<init>()
            k8.b r1 = new k8.b
            r2 = 1
            r1.<init>()
            r3.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.r.<init>(int, boolean):void");
    }

    public r(k8.b bVar, k8.b bVar2, boolean z10) {
        this.f9741b = 3;
        this.f9744f = bVar;
        this.f9742c = bVar2;
        this.f9743d = z10;
    }

    public r(lb.k kVar, StringBuilder sb2) {
        this.f9741b = 4;
        this.f9742c = kVar;
        this.f9744f = sb2;
        this.f9743d = true;
    }
}
