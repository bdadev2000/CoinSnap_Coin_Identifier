package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g implements InvocationHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10918b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.f10918b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i10 = this.a;
        Object obj2 = this.f10918b;
        switch (i10) {
            case 0:
                if (!"toString".equals(method.getName())) {
                    ((h) obj2).a = method;
                    return null;
                }
                return null;
            default:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getTargetException();
                } catch (ReflectiveOperationException e10) {
                    throw new RuntimeException("Reflection failed for method " + method, e10);
                }
        }
    }
}
