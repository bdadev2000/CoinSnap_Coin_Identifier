package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Method f13469a;
    public final g b = new g(this, 0);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
    }
}
