package a6;

import android.content.Context;
import com.applovin.impl.sdk.g0;
import com.facebook.r0;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {
    public static f u;
    public final Context a;

    /* renamed from: b */
    public final Object f260b;

    /* renamed from: c */
    public final Class f261c;

    /* renamed from: d */
    public final Class f262d;

    /* renamed from: e */
    public final Class f263e;

    /* renamed from: f */
    public final Class f264f;

    /* renamed from: g */
    public final Class f265g;

    /* renamed from: h */
    public final Class f266h;

    /* renamed from: i */
    public final Class f267i;

    /* renamed from: j */
    public final Method f268j;

    /* renamed from: k */
    public final Method f269k;

    /* renamed from: l */
    public final Method f270l;

    /* renamed from: m */
    public final Method f271m;

    /* renamed from: n */
    public final Method f272n;

    /* renamed from: o */
    public final Method f273o;

    /* renamed from: p */
    public final Method f274p;

    /* renamed from: q */
    public final j f275q;

    /* renamed from: r */
    public final CopyOnWriteArraySet f276r = new CopyOnWriteArraySet();

    /* renamed from: s */
    public static final com.facebook.c f255s = new com.facebook.c(23, 0);

    /* renamed from: t */
    public static final AtomicBoolean f256t = new AtomicBoolean(false);

    /* renamed from: v */
    public static final AtomicBoolean f257v = new AtomicBoolean(false);

    /* renamed from: w */
    public static final ConcurrentHashMap f258w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final ConcurrentHashMap f259x = new ConcurrentHashMap();

    public f(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, j jVar) {
        this.a = context;
        this.f260b = obj;
        this.f261c = cls;
        this.f262d = cls2;
        this.f263e = cls3;
        this.f264f = cls4;
        this.f265g = cls5;
        this.f266h = cls6;
        this.f267i = cls7;
        this.f268j = method;
        this.f269k = method2;
        this.f270l = method3;
        this.f271m = method4;
        this.f272n = method5;
        this.f273o = method6;
        this.f274p = method7;
        this.f275q = jVar;
    }

    public static final /* synthetic */ f a() {
        if (m6.a.b(f.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th2) {
            m6.a.a(f.class, th2);
            return null;
        }
    }

    public final void b(g0 querySkuRunnable) {
        List list;
        String str;
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter("inapp", "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            Object D = k.D(this.f262d, k.D(this.f261c, this.f260b, this.f268j, "inapp"), this.f269k, new Object[0]);
            if (D instanceof List) {
                list = (List) D;
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
                    Object D2 = k.D(this.f263e, it.next(), this.f270l, new Object[0]);
                    if (D2 instanceof String) {
                        str = (String) D2;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            ConcurrentHashMap concurrentHashMap = f258w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            concurrentHashMap.put(skuID, jSONObject);
                        }
                    }
                }
                d(arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void c(r0 r0Var) {
        Class cls = this.f267i;
        if (m6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e(this, r0Var, 0));
            k.D(this.f261c, this.f260b, this.f274p, "inapp", newProxyInstance);
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class cls = this.f266h;
        if (m6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e(this, runnable, 1));
            Object a = this.f275q.a(arrayList);
            k.D(this.f261c, this.f260b, this.f273o, a, newProxyInstance);
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void e() {
        Class cls = this.f261c;
        if (m6.a.b(this)) {
            return;
        }
        try {
            Class v10 = k.v("com.android.billingclient.api.BillingClientStateListener");
            if (v10 == null) {
                return;
            }
            int i10 = 0;
            Method x10 = k.x(cls, "startConnection", v10);
            if (x10 == null) {
                return;
            }
            k.D(cls, this.f260b, x10, Proxy.newProxyInstance(v10.getClassLoader(), new Class[]{v10}, new d(i10)));
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
