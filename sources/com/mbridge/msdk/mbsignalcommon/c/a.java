package com.mbridge.msdk.mbsignalcommon.c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0168a f16596a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0168a {
        boolean a(b.C0169a c0169a);
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0169a extends Throwable {

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f16597a;
            private String b;

            public C0169a(String str) {
                super(str);
            }

            public final void a(Class<?> cls) {
                this.f16597a = cls;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return C0169a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public C0169a(Exception exc) {
                super(exc);
            }

            public final void a(String str) {
                this.b = str;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f16598a;

        public c(Class<C> cls) {
            this.f16598a = cls;
        }

        public final d a(String str, Class<?>... clsArr) throws b.C0169a {
            return new d(this.f16598a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0169a c0169a) throws b.C0169a {
        InterfaceC0168a interfaceC0168a = f16596a;
        if (interfaceC0168a != null) {
            if (interfaceC0168a.a(c0169a)) {
                return;
            } else {
                throw c0169a;
            }
        }
        throw c0169a;
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0169a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e4) {
            b(new b.C0169a(e4));
            return new c<>(null);
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f16599a;

        public d(Class<?> cls, String str, Class<?>[] clsArr, int i9) throws b.C0169a {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e4) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e4.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e9) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e9.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e10) {
                            b.C0169a c0169a = new b.C0169a(e10);
                            c0169a.a(cls);
                            c0169a.a(str);
                            a.b(c0169a);
                        }
                    } finally {
                        this.f16599a = method;
                    }
                }
            }
            if (method != null) {
                if (i9 > 0 && (method.getModifiers() & i9) != i9) {
                    a.b(new b.C0169a(method + " does not match modifiers: " + i9));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f16599a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e4) {
                ad.a("MappingedMethod", "invoke error:" + e4.getMessage());
                return null;
            }
        }

        public final Method a() {
            return this.f16599a;
        }
    }
}
