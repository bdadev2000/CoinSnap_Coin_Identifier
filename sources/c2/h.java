package C2;

import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static h f500u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f504a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f505c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f506d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f507e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f508f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f509g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f510h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f511i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f512j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f513k;
    public final Method l;
    public final Method m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f514n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f515o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f516p;

    /* renamed from: q, reason: collision with root package name */
    public final l f517q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet f518r = new CopyOnWriteArraySet();

    /* renamed from: s, reason: collision with root package name */
    public static final e f498s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f499t = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f501v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public static final ConcurrentHashMap f502w = new ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final ConcurrentHashMap f503x = new ConcurrentHashMap();

    public h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f504a = context;
        this.b = obj;
        this.f505c = cls;
        this.f506d = cls2;
        this.f507e = cls3;
        this.f508f = cls4;
        this.f509g = cls5;
        this.f510h = cls6;
        this.f511i = cls7;
        this.f512j = method;
        this.f513k = method2;
        this.l = method3;
        this.m = method4;
        this.f514n = method5;
        this.f515o = method6;
        this.f516p = method7;
        this.f517q = lVar;
    }

    public static final /* synthetic */ h a() {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            return f500u;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public final void b(b bVar) {
        List list;
        String str;
        if (O2.a.b(this)) {
            return;
        }
        try {
            Object t9 = m.t(this.f506d, this.f513k, m.t(this.f505c, this.f512j, this.b, "inapp"), new Object[0]);
            if (t9 instanceof List) {
                list = (List) t9;
            } else {
                list = null;
            }
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object t10 = m.t(this.f507e, this.l, it.next(), new Object[0]);
                    if (t10 instanceof String) {
                        str = (String) t10;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            ConcurrentHashMap concurrentHashMap = f502w;
                            G7.j.d(string, "skuID");
                            concurrentHashMap.put(string, jSONObject);
                        }
                    }
                }
                d(arrayList, bVar);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void c(b bVar) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            A4.d dVar = new A4.d(2, this, bVar);
            Class cls = this.f511i;
            if (!O2.a.b(this)) {
                try {
                    m.t(this.f505c, this.f516p, this.b, "inapp", Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new g(this, dVar)));
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class cls = this.f510h;
        if (O2.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new g(this, runnable));
            m.t(this.f505c, this.f515o, this.b, this.f517q.a(arrayList), newProxyInstance);
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void e() {
        Method s5;
        Class cls = this.f505c;
        if (O2.a.b(this)) {
            return;
        }
        try {
            Class n2 = m.n("com.android.billingclient.api.BillingClientStateListener");
            if (n2 == null || (s5 = m.s(cls, "startConnection", n2)) == null) {
                return;
            }
            m.t(cls, s5, this.b, Proxy.newProxyInstance(n2.getClassLoader(), new Class[]{n2}, new f(0)));
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
