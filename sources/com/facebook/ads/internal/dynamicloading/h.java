package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class h {
    public Method a;

    /* renamed from: b, reason: collision with root package name */
    public final g f10919b = new g(this, 0);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f10919b));
    }
}
