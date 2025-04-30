package C2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static l f528g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f529h = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final Class f530a;
    public final Class b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f531c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f532d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f533e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f534f;

    public l(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.f530a = cls;
        this.b = cls2;
        this.f531c = method;
        this.f532d = method2;
        this.f533e = method3;
        this.f534f = method4;
    }

    public final Object a(ArrayList arrayList) {
        Object t9;
        Object t10;
        Class cls = this.b;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            Object t11 = m.t(this.f530a, this.f531c, null, new Object[0]);
            if (t11 != null && (t9 = m.t(cls, this.f532d, t11, "inapp")) != null && (t10 = m.t(cls, this.f533e, t9, arrayList)) != null) {
                return m.t(cls, this.f534f, t10, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
