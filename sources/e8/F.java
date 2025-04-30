package e8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class F extends AbstractC2226a {

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f20121a;
    public final a8.b b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20122c;

    /* renamed from: d, reason: collision with root package name */
    public final E f20123d;

    public F(a8.b bVar, a8.b bVar2, byte b) {
        this.f20121a = bVar;
        this.b = bVar2;
    }

    @Override // e8.AbstractC2226a
    public final Object a() {
        switch (this.f20122c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // e8.AbstractC2226a
    public final int b(Object obj) {
        switch (this.f20122c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                G7.j.e(hashMap, "<this>");
                return hashMap.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                G7.j.e(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // e8.AbstractC2226a
    public final Iterator c(Object obj) {
        switch (this.f20122c) {
            case 0:
                Map map = (Map) obj;
                G7.j.e(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                G7.j.e(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        switch (this.f20122c) {
            case 0:
                Map map = (Map) obj;
                G7.j.e(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                G7.j.e(map2, "<this>");
                return map2.size();
        }
    }

    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        switch (this.f20122c) {
            case 0:
                G7.j.e(null, "<this>");
                return new HashMap((Map) null);
            default:
                G7.j.e(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        switch (this.f20122c) {
            case 0:
                return this.f20123d;
            default:
                return this.f20123d;
        }
    }

    @Override // e8.AbstractC2226a
    public final Object h(Object obj) {
        switch (this.f20122c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                G7.j.e(hashMap, "<this>");
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                G7.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // e8.AbstractC2226a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void f(d8.a aVar, int i9, Map map, boolean z8) {
        int i10;
        Object A8;
        G7.j.e(map, "builder");
        Object A9 = aVar.A(getDescriptor(), i9, this.f20121a, null);
        if (z8) {
            i10 = aVar.h(getDescriptor());
            if (i10 != i9 + 1) {
                throw new IllegalArgumentException(Q7.n0.e(i9, i10, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            i10 = i9 + 1;
        }
        boolean containsKey = map.containsKey(A9);
        a8.b bVar = this.b;
        if (containsKey && !(bVar.getDescriptor().getKind() instanceof c8.f)) {
            A8 = aVar.A(getDescriptor(), i10, bVar, AbstractC2829t.W(map, A9));
        } else {
            A8 = aVar.A(getDescriptor(), i10, bVar, null);
        }
        map.put(A9, A8);
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        int d2 = d(obj);
        c8.g descriptor = getDescriptor();
        d8.b s5 = dVar.s(descriptor, d2);
        Iterator c9 = c(obj);
        int i9 = 0;
        while (c9.hasNext()) {
            Map.Entry entry = (Map.Entry) c9.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i9 + 1;
            s5.m(getDescriptor(), i9, this.f20121a, key);
            i9 += 2;
            s5.m(getDescriptor(), i10, this.b, value);
        }
        s5.c(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(a8.b bVar, a8.b bVar2, int i9) {
        this(bVar, bVar2, (byte) 0);
        this.f20122c = i9;
        switch (i9) {
            case 1:
                G7.j.e(bVar, "kSerializer");
                G7.j.e(bVar2, "vSerializer");
                this(bVar, bVar2, (byte) 0);
                c8.g descriptor = bVar.getDescriptor();
                c8.g descriptor2 = bVar2.getDescriptor();
                G7.j.e(descriptor, "keyDesc");
                G7.j.e(descriptor2, "valueDesc");
                this.f20123d = new E("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                return;
            default:
                G7.j.e(bVar, "kSerializer");
                G7.j.e(bVar2, "vSerializer");
                c8.g descriptor3 = bVar.getDescriptor();
                c8.g descriptor4 = bVar2.getDescriptor();
                G7.j.e(descriptor3, "keyDesc");
                G7.j.e(descriptor4, "valueDesc");
                this.f20123d = new E("kotlin.collections.HashMap", descriptor3, descriptor4);
                return;
        }
    }
}
