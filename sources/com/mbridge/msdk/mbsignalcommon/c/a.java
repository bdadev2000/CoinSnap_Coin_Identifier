package com.mbridge.msdk.mbsignalcommon.c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a {
    private static InterfaceC0180a a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0180a {
        boolean a(b.C0181a c0181a);
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0181a extends Throwable {
            private Class<?> a;

            /* renamed from: b, reason: collision with root package name */
            private String f14086b;

            public C0181a(String str) {
                super(str);
            }

            public final void a(Class<?> cls) {
                this.a = cls;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return C0181a.class.getName() + ": " + getCause();
            }

            public C0181a(Exception exc) {
                super(exc);
            }

            public final void a(String str) {
                this.f14086b = str;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c<C> {
        protected Class<C> a;

        public c(Class<C> cls) {
            this.a = cls;
        }

        public final d a(String str, Class<?>... clsArr) throws b.C0181a {
            return new d(this.a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0181a c0181a) throws b.C0181a {
        InterfaceC0180a interfaceC0180a = a;
        if (interfaceC0180a == null) {
            throw c0181a;
        }
        if (!interfaceC0180a.a(c0181a)) {
            throw c0181a;
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0181a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.C0181a(e2));
            return new c<>(null);
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        protected final Method a;

        public d(Class<?> cls, String str, Class<?>[] clsArr, int i10) throws b.C0181a {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (true) {
                if (cls == Object.class || cls == null) {
                    break;
                }
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e2) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e2.printStackTrace();
                    }
                } catch (SecurityException e10) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e10.printStackTrace();
                            }
                        } catch (Exception e11) {
                            b.C0181a c0181a = new b.C0181a(e11);
                            c0181a.a(cls);
                            c0181a.a(str);
                            a.b(c0181a);
                        }
                    } finally {
                        this.a = method;
                    }
                }
                cls = cls.getSuperclass();
            }
            if (method != null) {
                if (i10 > 0 && (method.getModifiers() & i10) != i10) {
                    a.b(new b.C0181a(method + " does not match modifiers: " + i10));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e2) {
                ad.a("MappingedMethod", "invoke error:" + e2.getMessage());
                return null;
            }
        }

        public final Method a() {
            return this.a;
        }
    }
}
