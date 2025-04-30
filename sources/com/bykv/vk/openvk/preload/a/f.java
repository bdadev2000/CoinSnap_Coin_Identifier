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
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f13092r = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);

    /* renamed from: a, reason: collision with root package name */
    final List<u> f13093a;
    final com.bykv.vk.openvk.preload.a.b.d b;

    /* renamed from: c, reason: collision with root package name */
    final e f13094c;

    /* renamed from: d, reason: collision with root package name */
    final Map<Type, h<?>> f13095d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f13096e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f13097f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f13098g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f13099h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f13100i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13101j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f13102k;
    final String l;
    final int m;

    /* renamed from: n, reason: collision with root package name */
    final int f13103n;

    /* renamed from: o, reason: collision with root package name */
    final s f13104o;

    /* renamed from: p, reason: collision with root package name */
    final List<u> f13105p;

    /* renamed from: q, reason: collision with root package name */
    final List<u> f13106q;

    /* renamed from: s, reason: collision with root package name */
    private final ThreadLocal<Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>>> f13107s;

    /* renamed from: t, reason: collision with root package name */
    private final Map<com.bykv.vk.openvk.preload.a.c.a<?>, t<?>> f13108t;

    /* renamed from: u, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f13109u;

    /* renamed from: v, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.a.d f13110v;

    public f() {
        this(com.bykv.vk.openvk.preload.a.b.d.f13010a, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f13096e + ",factories:" + this.f13093a + ",instanceCreators:" + this.f13109u + "}";
    }

    /* loaded from: classes.dex */
    public static class a<T> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        t<T> f13115a;

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            t<T> tVar = this.f13115a;
            if (tVar != null) {
                return tVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
            t<T> tVar = this.f13115a;
            if (tVar != null) {
                tVar.a(cVar, t9);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z8;
        t<T> tVar = (t) this.f13108t.get(aVar == null ? f13092r : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>> map = this.f13107s.get();
        if (map == null) {
            map = new HashMap<>();
            this.f13107s.set(map);
            z8 = true;
        } else {
            z8 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<u> it = this.f13093a.iterator();
            while (it.hasNext()) {
                t<T> a6 = it.next().a(this, aVar);
                if (a6 != null) {
                    if (aVar3.f13115a == null) {
                        aVar3.f13115a = a6;
                        this.f13108t.put(aVar, a6);
                        return a6;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z8) {
                this.f13107s.remove();
            }
        }
    }

    public f(com.bykv.vk.openvk.preload.a.b.d dVar, e eVar, Map<Type, h<?>> map, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, s sVar, String str, int i9, int i10, List<u> list, List<u> list2, List<u> list3) {
        final t<Number> tVar;
        t<Number> tVar2;
        t<Number> tVar3;
        this.f13107s = new ThreadLocal<>();
        this.f13108t = new ConcurrentHashMap();
        this.b = dVar;
        this.f13094c = eVar;
        this.f13095d = map;
        com.bykv.vk.openvk.preload.a.b.c cVar = new com.bykv.vk.openvk.preload.a.b.c(map);
        this.f13109u = cVar;
        this.f13096e = z8;
        this.f13097f = z9;
        this.f13098g = z10;
        this.f13099h = z11;
        this.f13100i = z12;
        this.f13101j = z13;
        this.f13102k = z14;
        this.f13104o = sVar;
        this.l = str;
        this.m = i9;
        this.f13103n = i10;
        this.f13105p = list;
        this.f13106q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12947Y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.h.f12897a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12927D);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12954g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12956i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12958k);
        if (sVar == s.DEFAULT) {
            tVar = com.bykv.vk.openvk.preload.a.b.a.n.f12965t;
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
        if (z14) {
            tVar2 = com.bykv.vk.openvk.preload.a.b.a.n.f12967v;
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
        if (z14) {
            tVar3 = com.bykv.vk.openvk.preload.a.b.a.n.f12966u;
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
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12969x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12960o);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12962q);
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
                for (int i11 = 0; i11 < length; i11++) {
                    t.this.a(cVar2, Long.valueOf(atomicLongArray2.get(i11)));
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
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList2.get(i11)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12964s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12971z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12929F);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12931H);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.n.f12925B));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.n.f12926C));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12933J);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12935L);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12938P);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12940R);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12945W);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12937N);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12951d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.f12881a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12943U);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.k.f12914a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.f12913a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12941S);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.f12876a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.b);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(cVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.g(cVar, z9));
        com.bykv.vk.openvk.preload.a.b.a.d dVar2 = new com.bykv.vk.openvk.preload.a.b.a.d(cVar);
        this.f13110v = dVar2;
        arrayList.add(dVar2);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f12948Z);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.i(cVar, eVar, dVar, dVar2));
        this.f13093a = Collections.unmodifiableList(arrayList);
    }

    public final <T> t<T> a(u uVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.f13093a.contains(uVar)) {
            uVar = this.f13110v;
        }
        boolean z8 = false;
        for (u uVar2 : this.f13093a) {
            if (z8) {
                t<T> a6 = uVar2.a(this, aVar);
                if (a6 != null) {
                    return a6;
                }
            } else if (uVar2 == uVar) {
                z8 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> t<T> a(Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        if (obj == null) {
            return a((k) m.f13130a);
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
        } catch (IOException e4) {
            throw new l(e4);
        }
    }

    private void a(Object obj, Type type, com.bykv.vk.openvk.preload.a.d.c cVar) throws l {
        t a6 = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
        boolean z8 = cVar.f13083c;
        cVar.f13083c = true;
        boolean z9 = cVar.f13084d;
        cVar.f13084d = this.f13099h;
        boolean z10 = cVar.f13085e;
        cVar.f13085e = this.f13096e;
        try {
            try {
                try {
                    a6.a(cVar, obj);
                } catch (AssertionError e4) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e4.getMessage());
                    assertionError.initCause(e4);
                    throw assertionError;
                }
            } catch (IOException e9) {
                throw new l(e9);
            }
        } finally {
            cVar.f13083c = z8;
            cVar.f13084d = z9;
            cVar.f13085e = z10;
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
        } catch (IOException e4) {
            throw new l(e4);
        }
    }

    private com.bykv.vk.openvk.preload.a.d.c a(Writer writer) throws IOException {
        if (this.f13098g) {
            writer.write(")]}'\n");
        }
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        if (this.f13100i) {
            cVar.c("  ");
        }
        cVar.f13085e = this.f13096e;
        return cVar;
    }

    public static void a(Object obj, com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (obj != null) {
            try {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                } else {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e4) {
                throw new r(e4);
            } catch (IOException e9) {
                throw new l(e9);
            }
        }
    }

    private void a(k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws l {
        boolean z8 = cVar.f13083c;
        cVar.f13083c = true;
        boolean z9 = cVar.f13084d;
        cVar.f13084d = this.f13099h;
        boolean z10 = cVar.f13085e;
        cVar.f13085e = this.f13096e;
        try {
            try {
                com.bykv.vk.openvk.preload.a.b.k.a(kVar, cVar);
            } catch (IOException e4) {
                throw new l(e4);
            } catch (AssertionError e9) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e9.getMessage());
                assertionError.initCause(e9);
                throw assertionError;
            }
        } finally {
            cVar.f13083c = z8;
            cVar.f13084d = z9;
            cVar.f13085e = z10;
        }
    }

    public final <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, Type type) throws l, r {
        boolean z8 = aVar.f13060a;
        boolean z9 = true;
        aVar.f13060a = true;
        try {
            try {
                try {
                    aVar.f();
                    z9 = false;
                    return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                } catch (EOFException e4) {
                    if (z9) {
                        aVar.f13060a = z8;
                        return null;
                    }
                    throw new r(e4);
                } catch (IOException e9) {
                    throw new r(e9);
                }
            } catch (AssertionError e10) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e10.getMessage());
                assertionError.initCause(e10);
                throw assertionError;
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        } finally {
            aVar.f13060a = z8;
        }
    }
}
