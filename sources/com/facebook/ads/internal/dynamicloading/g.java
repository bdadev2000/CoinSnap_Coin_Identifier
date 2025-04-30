package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13468a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i9) {
        this.f13468a = i9;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f13468a) {
            case 0:
                if (!"toString".equals(method.getName())) {
                    ((h) this.b).f13469a = method;
                    return null;
                }
                return null;
            default:
                Object obj2 = this.b;
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
                } catch (InvocationTargetException e4) {
                    throw e4.getTargetException();
                } catch (ReflectiveOperationException e9) {
                    throw new RuntimeException("Reflection failed for method " + method, e9);
                }
        }
    }
}
