package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import b7.InterfaceC0576a;
import f7.C2275b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f1 {
    public static final ServiceLocator$Companion Companion = new ServiceLocator$Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile f1 INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, Q0> creators;
    private final Context ctx;

    public /* synthetic */ f1(Context context, G7.f fVar) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.e.class, new W0(this));
        this.creators.put(com.vungle.ads.internal.task.j.class, new X0(this));
        this.creators.put(com.vungle.ads.internal.network.y.class, new Y0(this));
        this.creators.put(com.vungle.ads.internal.platform.d.class, new Z0(this));
        this.creators.put(com.vungle.ads.internal.executor.a.class, new a1(this));
        this.creators.put(e7.d.class, new b1(this));
        this.creators.put(e7.f.class, new c1(this));
        this.creators.put(C2275b.class, new d1(this));
        this.creators.put(InterfaceC0576a.class, new e1(this));
        this.creators.put(com.vungle.ads.internal.bidding.e.class, new R0(this));
        this.creators.put(com.vungle.ads.internal.util.x.class, new S0(this));
        this.creators.put(com.vungle.ads.internal.downloader.p.class, new T0(this));
        this.creators.put(com.vungle.ads.internal.util.k.class, new U0(this));
        this.creators.put(com.vungle.ads.internal.signals.j.class, new V0(this));
    }

    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t9 = (T) this.cache.get(serviceClass);
        if (t9 == null) {
            Q0 q02 = this.creators.get(serviceClass);
            if (q02 != null) {
                T t10 = (T) q02.create();
                if (q02.isSingleton()) {
                    this.cache.put(serviceClass, t10);
                }
                return t10;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t9;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> cls, T t9) {
        G7.j.e(cls, "serviceClass");
        this.cache.put(cls, t9);
    }

    public final synchronized <T> T getService(Class<T> cls) {
        G7.j.e(cls, "serviceClass");
        return (T) getOrBuild(cls);
    }

    public final synchronized <T> boolean isCreated(Class<T> cls) {
        G7.j.e(cls, "serviceClass");
        return this.cache.containsKey(getServiceClass(cls));
    }

    private f1(Context context) {
        Context applicationContext = context.getApplicationContext();
        G7.j.d(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
