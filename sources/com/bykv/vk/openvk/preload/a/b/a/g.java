package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    final boolean f12893a;
    private final com.bykv.vk.openvk.preload.a.b.c b;

    public g(com.bykv.vk.openvk.preload.a.b.c cVar, boolean z8) {
        this.b = cVar;
        this.f12893a = z8;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        t<Boolean> tVar;
        Type type = aVar.f13052c;
        if (!Map.class.isAssignableFrom(aVar.b)) {
            return null;
        }
        Type[] b = com.bykv.vk.openvk.preload.a.b.b.b(type, com.bykv.vk.openvk.preload.a.b.b.b(type));
        Type type2 = b[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            tVar = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type2));
        } else {
            tVar = n.f12953f;
        }
        return new a(fVar, b[0], tVar, b[1], fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(b[1])), this.b.a(aVar));
    }

    /* loaded from: classes.dex */
    public final class a<K, V> extends t<Map<K, V>> {
        private final t<K> b;

        /* renamed from: c, reason: collision with root package name */
        private final t<V> f12895c;

        /* renamed from: d, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> f12896d;

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<K> tVar, Type type2, t<V> tVar2, com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> iVar) {
            this.b = new m(fVar, tVar, type);
            this.f12895c = new m(fVar, tVar2, type2);
            this.f12896d = iVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.e();
                return;
            }
            if (!g.this.f12893a) {
                cVar.c();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.f12895c.a(cVar, entry.getValue());
                }
                cVar.d();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i9 = 0;
            boolean z8 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.bykv.vk.openvk.preload.a.k a6 = this.b.a((t<K>) entry2.getKey());
                arrayList.add(a6);
                arrayList2.add(entry2.getValue());
                z8 |= (a6 instanceof com.bykv.vk.openvk.preload.a.i) || (a6 instanceof com.bykv.vk.openvk.preload.a.n);
            }
            if (z8) {
                cVar.a();
                int size = arrayList.size();
                while (i9 < size) {
                    cVar.a();
                    com.bykv.vk.openvk.preload.a.b.k.a((com.bykv.vk.openvk.preload.a.k) arrayList.get(i9), cVar);
                    this.f12895c.a(cVar, arrayList2.get(i9));
                    cVar.b();
                    i9++;
                }
                cVar.b();
                return;
            }
            cVar.c();
            int size2 = arrayList.size();
            while (i9 < size2) {
                com.bykv.vk.openvk.preload.a.k kVar = (com.bykv.vk.openvk.preload.a.k) arrayList.get(i9);
                if (kVar instanceof p) {
                    p g9 = kVar.g();
                    Object obj2 = g9.f13132a;
                    if (obj2 instanceof Number) {
                        str = String.valueOf(g9.a());
                    } else if (obj2 instanceof Boolean) {
                        str = Boolean.toString(g9.f());
                    } else if (obj2 instanceof String) {
                        str = g9.b();
                    } else {
                        throw new AssertionError();
                    }
                } else if (kVar instanceof com.bykv.vk.openvk.preload.a.m) {
                    str = "null";
                } else {
                    throw new AssertionError();
                }
                cVar.a(str);
                this.f12895c.a(cVar, arrayList2.get(i9));
                i9++;
            }
            cVar.d();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            com.bykv.vk.openvk.preload.a.d.b f9 = aVar.f();
            if (f9 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Map<K, V> a6 = this.f12896d.a();
            if (f9 == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K a9 = this.b.a(aVar);
                    if (a6.put(a9, this.f12895c.a(aVar)) == null) {
                        aVar.b();
                    } else {
                        throw new r("duplicate key: ".concat(String.valueOf(a9)));
                    }
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.f.f13022a.a(aVar);
                    K a10 = this.b.a(aVar);
                    if (a6.put(a10, this.f12895c.a(aVar)) != null) {
                        throw new r("duplicate key: ".concat(String.valueOf(a10)));
                    }
                }
                aVar.d();
            }
            return a6;
        }
    }
}
