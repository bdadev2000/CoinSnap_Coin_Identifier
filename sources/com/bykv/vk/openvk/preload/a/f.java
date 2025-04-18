package com.bykv.vk.openvk.preload.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: r, reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f9931r = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);
    final List<u> a;

    /* renamed from: b, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.a.b.d f9932b;

    /* renamed from: c, reason: collision with root package name */
    final e f9933c;

    /* renamed from: d, reason: collision with root package name */
    final Map<Type, h<?>> f9934d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f9935e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f9936f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f9937g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f9938h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f9939i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9940j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f9941k;

    /* renamed from: l, reason: collision with root package name */
    final String f9942l;

    /* renamed from: m, reason: collision with root package name */
    final int f9943m;

    /* renamed from: n, reason: collision with root package name */
    final int f9944n;

    /* renamed from: o, reason: collision with root package name */
    final s f9945o;

    /* renamed from: p, reason: collision with root package name */
    final List<u> f9946p;

    /* renamed from: q, reason: collision with root package name */
    final List<u> f9947q;

    /* renamed from: s, reason: collision with root package name */
    private final ThreadLocal<Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>>> f9948s;

    /* renamed from: t, reason: collision with root package name */
    private final Map<com.bykv.vk.openvk.preload.a.c.a<?>, t<?>> f9949t;
    private final com.bykv.vk.openvk.preload.a.b.c u;

    /* renamed from: v, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.a.d f9950v;

    public f() {
        this(com.bykv.vk.openvk.preload.a.b.d.a, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f9935e + ",factories:" + this.a + ",instanceCreators:" + this.u + "}";
    }

    /* loaded from: classes.dex */
    public static class a<T> extends t<T> {
        t<T> a;

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            t<T> tVar = this.a;
            if (tVar != null) {
                return tVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t5) throws IOException {
            t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a(cVar, t5);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z10;
        t<T> tVar = (t) this.f9949t.get(aVar == null ? f9931r : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>> map = this.f9948s.get();
        if (map == null) {
            map = new HashMap<>();
            this.f9948s.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<u> it = this.a.iterator();
            while (it.hasNext()) {
                t<T> a10 = it.next().a(this, aVar);
                if (a10 != null) {
                    if (aVar3.a == null) {
                        aVar3.a = a10;
                        this.f9949t.put(aVar, a10);
                        return a10;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f9948s.remove();
            }
        }
    }

    public f(com.bykv.vk.openvk.preload.a.b.d dVar, e eVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, s sVar, String str, int i10, int i11, List<u> list, List<u> list2, List<u> list3) {
        final t<Number> tVar;
        t<Number> tVar2;
        t<Number> tVar3;
        this.f9948s = new ThreadLocal<>();
        this.f9949t = new ConcurrentHashMap();
        this.f9932b = dVar;
        this.f9933c = eVar;
        this.f9934d = map;
        com.bykv.vk.openvk.preload.a.b.c cVar = new com.bykv.vk.openvk.preload.a.b.c(map);
        this.u = cVar;
        this.f9935e = z10;
        this.f9936f = z11;
        this.f9937g = z12;
        this.f9938h = z13;
        this.f9939i = z14;
        this.f9940j = z15;
        this.f9941k = z16;
        this.f9945o = sVar;
        this.f9942l = str;
        this.f9943m = i10;
        this.f9944n = i11;
        this.f9946p = list;
        this.f9947q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.Y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.h.a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.D);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9817m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9811g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9813i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9815k);
        if (sVar == s.DEFAULT) {
            tVar = com.bykv.vk.openvk.preload.a.b.a.n.f9824t;
        } else {
            tVar = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.3
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                    } else {
                        cVar2.b(number2.toString());
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Long.valueOf(aVar.m());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(Long.TYPE, Long.class, tVar));
        Class cls = Double.TYPE;
        if (z16) {
            tVar2 = com.bykv.vk.openvk.preload.a.b.a.n.f9825v;
        } else {
            tVar2 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.1
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                    } else {
                        f.a(number2.doubleValue());
                        cVar2.a(number2);
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Double.valueOf(aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(cls, Double.class, tVar2));
        Class cls2 = Float.TYPE;
        if (z16) {
            tVar3 = com.bykv.vk.openvk.preload.a.b.a.n.u;
        } else {
            tVar3 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.2
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                    } else {
                        f.a(number2.floatValue());
                        cVar2.a(number2);
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Float.valueOf((float) aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(cls2, Float.class, tVar3));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9827x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9819o);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9821q);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(AtomicLong.class, new t<AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.f.4
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, AtomicLong atomicLong) throws IOException {
                t.this.a(cVar2, Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicLong a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return new AtomicLong(((Number) t.this.a(aVar)).longValue());
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(AtomicLongArray.class, new t<AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.f.5
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar2.a();
                int length = atomicLongArray2.length();
                for (int i12 = 0; i12 < length; i12++) {
                    t.this.a(cVar2, Long.valueOf(atomicLongArray2.get(i12)));
                }
                cVar2.b();
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicLongArray a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList2.add(Long.valueOf(((Number) t.this.a(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicLongArray.set(i12, ((Long) arrayList2.get(i12)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9823s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9829z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.F);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.H);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.n.B));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.n.C));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.J);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.L);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.P);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.R);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.W);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.N);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9808d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.U);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.k.a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.S);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f9806b);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(cVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.g(cVar, z11));
        com.bykv.vk.openvk.preload.a.b.a.d dVar2 = new com.bykv.vk.openvk.preload.a.b.a.d(cVar);
        this.f9950v = dVar2;
        arrayList.add(dVar2);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.Z);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.i(cVar, eVar, dVar, dVar2));
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final <T> t<T> a(u uVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.a.contains(uVar)) {
            uVar = this.f9950v;
        }
        boolean z10 = false;
        for (u uVar2 : this.a) {
            if (z10) {
                t<T> a10 = uVar2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> t<T> a(Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        if (obj == null) {
            return a((k) m.a);
        }
        return a(obj, obj.getClass());
    }

    private String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private void a(Object obj, Type type, Appendable appendable) throws l {
        try {
            a(obj, type, a(com.bykv.vk.openvk.preload.a.b.k.a(appendable)));
        } catch (IOException e2) {
            throw new l(e2);
        }
    }

    private void a(Object obj, Type type, com.bykv.vk.openvk.preload.a.d.c cVar) throws l {
        t a10 = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
        boolean z10 = cVar.f9922c;
        cVar.f9922c = true;
        boolean z11 = cVar.f9923d;
        cVar.f9923d = this.f9938h;
        boolean z12 = cVar.f9924e;
        cVar.f9924e = this.f9935e;
        try {
            try {
                try {
                    a10.a(cVar, obj);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e10) {
                throw new l(e10);
            }
        } finally {
            cVar.f9922c = z10;
            cVar.f9923d = z11;
            cVar.f9924e = z12;
        }
    }

    private String a(k kVar) {
        StringWriter stringWriter = new StringWriter();
        a(kVar, stringWriter);
        return stringWriter.toString();
    }

    private void a(k kVar, Appendable appendable) throws l {
        try {
            a(kVar, a(com.bykv.vk.openvk.preload.a.b.k.a(appendable)));
        } catch (IOException e2) {
            throw new l(e2);
        }
    }

    private com.bykv.vk.openvk.preload.a.d.c a(Writer writer) throws IOException {
        if (this.f9937g) {
            writer.write(")]}'\n");
        }
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        if (this.f9939i) {
            cVar.c("  ");
        }
        cVar.f9924e = this.f9935e;
        return cVar;
    }

    public static void a(Object obj, com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (obj != null) {
            try {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                } else {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e2) {
                throw new r(e2);
            } catch (IOException e10) {
                throw new l(e10);
            }
        }
    }

    private void a(k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws l {
        boolean z10 = cVar.f9922c;
        cVar.f9922c = true;
        boolean z11 = cVar.f9923d;
        cVar.f9923d = this.f9938h;
        boolean z12 = cVar.f9924e;
        cVar.f9924e = this.f9935e;
        try {
            try {
                com.bykv.vk.openvk.preload.a.b.k.a(kVar, cVar);
            } catch (IOException e2) {
                throw new l(e2);
            } catch (AssertionError e10) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e10.getMessage());
                assertionError.initCause(e10);
                throw assertionError;
            }
        } finally {
            cVar.f9922c = z10;
            cVar.f9923d = z11;
            cVar.f9924e = z12;
        }
    }

    public final <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, Type type) throws l, r {
        boolean z10 = aVar.a;
        boolean z11 = true;
        aVar.a = true;
        try {
            try {
                try {
                    aVar.f();
                    z11 = false;
                    return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                } catch (IOException e2) {
                    throw new r(e2);
                } catch (IllegalStateException e10) {
                    throw new r(e10);
                }
            } catch (EOFException e11) {
                if (z11) {
                    aVar.a = z10;
                    return null;
                }
                throw new r(e11);
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            }
        } finally {
            aVar.a = z10;
        }
    }
}
