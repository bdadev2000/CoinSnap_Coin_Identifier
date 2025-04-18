package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class g implements u {
    final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f9777b;

    public g(com.bykv.vk.openvk.preload.a.b.c cVar, boolean z10) {
        this.f9777b = cVar;
        this.a = z10;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        t<Boolean> tVar;
        Type type = aVar.f9889c;
        if (!Map.class.isAssignableFrom(aVar.f9888b)) {
            return null;
        }
        Type[] b3 = com.bykv.vk.openvk.preload.a.b.b.b(type, com.bykv.vk.openvk.preload.a.b.b.b(type));
        Type type2 = b3[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            tVar = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type2));
        } else {
            tVar = n.f9810f;
        }
        t<T> a10 = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(b3[1]));
        com.bykv.vk.openvk.preload.a.b.i<T> a11 = this.f9777b.a(aVar);
        return new a(fVar, b3[0], tVar, b3[1], a10, a11);
    }

    /* loaded from: classes.dex */
    public final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private final t<K> f9778b;

        /* renamed from: c, reason: collision with root package name */
        private final t<V> f9779c;

        /* renamed from: d, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> f9780d;

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<K> tVar, Type type2, t<V> tVar2, com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> iVar) {
            this.f9778b = new m(fVar, tVar, type);
            this.f9779c = new m(fVar, tVar2, type2);
            this.f9780d = iVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.e();
                return;
            }
            if (!g.this.a) {
                cVar.c();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.f9779c.a(cVar, entry.getValue());
                }
                cVar.d();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.bykv.vk.openvk.preload.a.k a = this.f9778b.a((t<K>) entry2.getKey());
                arrayList.add(a);
                arrayList2.add(entry2.getValue());
                z10 |= (a instanceof com.bykv.vk.openvk.preload.a.i) || (a instanceof com.bykv.vk.openvk.preload.a.n);
            }
            if (z10) {
                cVar.a();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.a();
                    com.bykv.vk.openvk.preload.a.b.k.a((com.bykv.vk.openvk.preload.a.k) arrayList.get(i10), cVar);
                    this.f9779c.a(cVar, arrayList2.get(i10));
                    cVar.b();
                    i10++;
                }
                cVar.b();
                return;
            }
            cVar.c();
            int size2 = arrayList.size();
            while (i10 < size2) {
                com.bykv.vk.openvk.preload.a.k kVar = (com.bykv.vk.openvk.preload.a.k) arrayList.get(i10);
                if (kVar instanceof p) {
                    p g10 = kVar.g();
                    Object obj2 = g10.a;
                    if (obj2 instanceof Number) {
                        str = String.valueOf(g10.a());
                    } else if (obj2 instanceof Boolean) {
                        str = Boolean.toString(g10.f());
                    } else if (obj2 instanceof String) {
                        str = g10.b();
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m)) {
                        throw new AssertionError();
                    }
                    str = AbstractJsonLexerKt.NULL;
                }
                cVar.a(str);
                this.f9779c.a(cVar, arrayList2.get(i10));
                i10++;
            }
            cVar.d();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
            if (f10 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Map<K, V> a = this.f9780d.a();
            if (f10 == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K a10 = this.f9778b.a(aVar);
                    if (a.put(a10, this.f9779c.a(aVar)) == null) {
                        aVar.b();
                    } else {
                        throw new r("duplicate key: ".concat(String.valueOf(a10)));
                    }
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.f.a.a(aVar);
                    K a11 = this.f9778b.a(aVar);
                    if (a.put(a11, this.f9779c.a(aVar)) != null) {
                        throw new r("duplicate key: ".concat(String.valueOf(a11)));
                    }
                }
                aVar.d();
            }
            return a;
        }
    }
}
