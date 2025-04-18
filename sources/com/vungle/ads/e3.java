package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e3 {
    public static final ServiceLocator$Companion Companion = new ServiceLocator$Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile e3 INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, p2> creators;
    private final Context ctx;

    public /* synthetic */ e3(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ e3 access$getINSTANCE$cp() {
        return INSTANCE;
    }

    public static final /* synthetic */ void access$setINSTANCE$cp(e3 e3Var) {
        INSTANCE = e3Var;
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.e.class, new v2(this));
        this.creators.put(com.vungle.ads.internal.task.j.class, new w2(this));
        this.creators.put(com.vungle.ads.internal.network.y.class, new x2(this));
        this.creators.put(com.vungle.ads.internal.platform.d.class, new y2(this));
        this.creators.put(com.vungle.ads.internal.executor.a.class, new z2(this));
        this.creators.put(dh.d.class, new a3(this));
        this.creators.put(dh.f.class, new b3(this));
        this.creators.put(eh.b.class, new c3(this));
        this.creators.put(ah.a.class, new d3(this));
        this.creators.put(com.vungle.ads.internal.bidding.e.class, new q2(this));
        this.creators.put(com.vungle.ads.internal.util.x.class, new r2(this));
        this.creators.put(com.vungle.ads.internal.downloader.p.class, new s2(this));
        this.creators.put(com.vungle.ads.internal.util.k.class, new t2(this));
        this.creators.put(com.vungle.ads.internal.signals.j.class, new u2(this));
    }

    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t5 = (T) this.cache.get(serviceClass);
        if (t5 == null) {
            p2 p2Var = this.creators.get(serviceClass);
            if (p2Var != null) {
                T t10 = (T) p2Var.create();
                if (p2Var.isSingleton()) {
                    this.cache.put(serviceClass, t10);
                }
                return t10;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t5;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T t5) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t5);
    }

    public final synchronized <T> T getService(Class<T> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(Class<T> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private e3(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
