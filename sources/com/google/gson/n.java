package com.google.gson;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import vc.e1;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: l, reason: collision with root package name */
    public static final j f12107l = j.f12102d;

    /* renamed from: m, reason: collision with root package name */
    public static final a f12108m = h.f12100b;

    /* renamed from: n, reason: collision with root package name */
    public static final w f12109n = a0.f12097b;

    /* renamed from: o, reason: collision with root package name */
    public static final x f12110o = a0.f12098c;
    public final ThreadLocal a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12111b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f12112c;

    /* renamed from: d, reason: collision with root package name */
    public final vc.j f12113d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12114e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f12115f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12116g;

    /* renamed from: h, reason: collision with root package name */
    public final j f12117h;

    /* renamed from: i, reason: collision with root package name */
    public final List f12118i;

    /* renamed from: j, reason: collision with root package name */
    public final List f12119j;

    /* renamed from: k, reason: collision with root package name */
    public final List f12120k;

    public n() {
        vc.d dVar;
        vc.d dVar2;
        uc.f fVar = uc.f.f25759h;
        a aVar = f12108m;
        Map emptyMap = Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        this.a = new ThreadLocal();
        this.f12111b = new ConcurrentHashMap();
        this.f12115f = emptyMap;
        com.bumptech.glide.manager.r rVar = new com.bumptech.glide.manager.r(emptyList4, emptyMap);
        this.f12112c = rVar;
        int i10 = 1;
        this.f12116g = true;
        this.f12117h = f12107l;
        this.f12118i = emptyList;
        this.f12119j = emptyList2;
        this.f12120k = emptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e1.A);
        w wVar = a0.f12097b;
        w wVar2 = f12109n;
        if (wVar2 == wVar) {
            dVar = vc.p.f26458c;
        } else {
            dVar = new vc.d(wVar2, 2);
        }
        arrayList.add(dVar);
        arrayList.add(fVar);
        arrayList.addAll(emptyList3);
        arrayList.add(e1.f26433p);
        arrayList.add(e1.f26424g);
        arrayList.add(e1.f26421d);
        arrayList.add(e1.f26422e);
        arrayList.add(e1.f26423f);
        vc.z zVar = e1.f26428k;
        arrayList.add(e1.b(Long.TYPE, Long.class, zVar));
        int i11 = 0;
        arrayList.add(e1.b(Double.TYPE, Double.class, new k(this, i11)));
        arrayList.add(e1.b(Float.TYPE, Float.class, new k(this, i10)));
        x xVar = a0.f12098c;
        x xVar2 = f12110o;
        if (xVar2 == xVar) {
            dVar2 = vc.o.f26457b;
        } else {
            dVar2 = new vc.d(new vc.o(xVar2), i10);
        }
        arrayList.add(dVar2);
        arrayList.add(e1.f26425h);
        arrayList.add(e1.f26426i);
        arrayList.add(e1.a(AtomicLong.class, new l(zVar, i11).a()));
        arrayList.add(e1.a(AtomicLongArray.class, new l(zVar, i10).a()));
        arrayList.add(e1.f26427j);
        arrayList.add(e1.f26429l);
        arrayList.add(e1.f26434q);
        arrayList.add(e1.f26435r);
        arrayList.add(e1.a(BigDecimal.class, e1.f26430m));
        arrayList.add(e1.a(BigInteger.class, e1.f26431n));
        arrayList.add(e1.a(uc.h.class, e1.f26432o));
        arrayList.add(e1.f26436s);
        arrayList.add(e1.f26437t);
        arrayList.add(e1.f26438v);
        arrayList.add(e1.f26439w);
        arrayList.add(e1.f26441y);
        arrayList.add(e1.u);
        arrayList.add(e1.f26419b);
        arrayList.add(vc.h.f26443c);
        arrayList.add(e1.f26440x);
        if (yc.g.a) {
            arrayList.add(yc.g.f28165c);
            arrayList.add(yc.g.f28164b);
            arrayList.add(yc.g.f28166d);
        }
        arrayList.add(vc.b.f26413c);
        arrayList.add(e1.a);
        arrayList.add(new vc.d(rVar, i11));
        arrayList.add(new vc.n(rVar));
        vc.j jVar = new vc.j(rVar);
        this.f12113d = jVar;
        arrayList.add(jVar);
        arrayList.add(e1.B);
        arrayList.add(new vc.v(rVar, aVar, fVar, jVar, emptyList4));
        this.f12114e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, com.google.gson.reflect.TypeToken r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r6)
            zc.a r6 = new zc.a
            r6.<init>(r1)
            r1 = 2
            r6.e0(r1)
            java.lang.String r2 = "AssertionError (GSON 2.11.0): "
            int r3 = r6.f28729q
            r4 = 1
            if (r3 != r1) goto L1b
            r6.f28729q = r4
        L1b:
            r6.b0()     // Catch: java.lang.AssertionError -> L2a java.io.IOException -> L41 java.lang.Throwable -> L48 java.lang.IllegalStateException -> L4a java.io.EOFException -> L51
            com.google.gson.c0 r7 = r5.c(r7)     // Catch: java.io.EOFException -> L27 java.lang.AssertionError -> L2a java.io.IOException -> L41 java.lang.Throwable -> L48 java.lang.IllegalStateException -> L4a
            java.lang.Object r0 = r7.b(r6)     // Catch: java.io.EOFException -> L27 java.lang.AssertionError -> L2a java.io.IOException -> L41 java.lang.Throwable -> L48 java.lang.IllegalStateException -> L4a
            goto L54
        L27:
            r7 = move-exception
            r4 = 0
            goto L52
        L2a:
            r7 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L48
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L48
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L41:
            r7 = move-exception
            com.google.gson.v r0 = new com.google.gson.v     // Catch: java.lang.Throwable -> L48
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L48:
            r7 = move-exception
            goto L7f
        L4a:
            r7 = move-exception
            com.google.gson.v r0 = new com.google.gson.v     // Catch: java.lang.Throwable -> L48
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L51:
            r7 = move-exception
        L52:
            if (r4 == 0) goto L79
        L54:
            r6.e0(r3)
            if (r0 == 0) goto L78
            int r6 = r6.b0()     // Catch: java.io.IOException -> L6a zc.c -> L71
            r7 = 10
            if (r6 != r7) goto L62
            goto L78
        L62:
            com.google.gson.v r6 = new com.google.gson.v     // Catch: java.io.IOException -> L6a zc.c -> L71
            java.lang.String r7 = "JSON document was not fully consumed."
            r6.<init>(r7)     // Catch: java.io.IOException -> L6a zc.c -> L71
            throw r6     // Catch: java.io.IOException -> L6a zc.c -> L71
        L6a:
            r6 = move-exception
            com.google.gson.q r7 = new com.google.gson.q
            r7.<init>(r6)
            throw r7
        L71:
            r6 = move-exception
            com.google.gson.v r7 = new com.google.gson.v
            r7.<init>(r6)
            throw r7
        L78:
            return r0
        L79:
            com.google.gson.v r0 = new com.google.gson.v     // Catch: java.lang.Throwable -> L48
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L7f:
            r6.e0(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.n.b(java.lang.String, com.google.gson.reflect.TypeToken):java.lang.Object");
    }

    public final c0 c(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f12111b;
        c0 c0Var = (c0) concurrentHashMap.get(typeToken);
        if (c0Var != null) {
            return c0Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            c0 c0Var2 = (c0) map.get(typeToken);
            if (c0Var2 != null) {
                return c0Var2;
            }
            z10 = false;
        }
        try {
            m mVar = new m();
            map.put(typeToken, mVar);
            Iterator it = this.f12114e.iterator();
            c0 c0Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c0Var3 = ((d0) it.next()).a(this, typeToken);
                if (c0Var3 != null) {
                    if (mVar.a == null) {
                        mVar.a = c0Var3;
                        map.put(typeToken, c0Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (c0Var3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return c0Var3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + typeToken);
        } finally {
            if (z10) {
                threadLocal.remove();
            }
        }
    }

    public final zc.b d(Writer writer) {
        zc.b bVar = new zc.b(writer);
        bVar.v(this.f12117h);
        bVar.f28741k = this.f12116g;
        bVar.w(2);
        bVar.f28743m = false;
        return bVar;
    }

    public final String e(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new q(e2);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(obj, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new q(e10);
        }
    }

    public final void f(Object obj, Class cls, zc.b bVar) {
        c0 c10 = c(new TypeToken(cls));
        int i10 = bVar.f28740j;
        if (i10 == 2) {
            bVar.f28740j = 1;
        }
        boolean z10 = bVar.f28741k;
        boolean z11 = bVar.f28743m;
        bVar.f28741k = this.f12116g;
        bVar.f28743m = false;
        try {
            try {
                c10.c(bVar, obj);
            } catch (IOException e2) {
                throw new q(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.w(i10);
            bVar.f28741k = z10;
            bVar.f28743m = z11;
        }
    }

    public final void g(zc.b bVar) {
        r rVar = r.f12122b;
        int i10 = bVar.f28740j;
        boolean z10 = bVar.f28741k;
        boolean z11 = bVar.f28743m;
        bVar.f28741k = this.f12116g;
        bVar.f28743m = false;
        if (i10 == 2) {
            bVar.f28740j = 1;
        }
        try {
            try {
                try {
                    com.facebook.appevents.g.M(rVar, bVar);
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e2.getMessage(), e2);
                }
            } catch (IOException e10) {
                throw new q(e10);
            }
        } finally {
            bVar.w(i10);
            bVar.f28741k = z10;
            bVar.f28743m = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f12114e + ",instanceCreators:" + this.f12112c + "}";
    }
}
