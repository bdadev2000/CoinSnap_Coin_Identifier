package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f12899a;
    private final com.bykv.vk.openvk.preload.a.e b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.d f12900c;

    /* renamed from: d, reason: collision with root package name */
    private final d f12901d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b.b f12902e = com.bykv.vk.openvk.preload.a.b.b.b.a();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: h, reason: collision with root package name */
        final String f12910h;

        /* renamed from: i, reason: collision with root package name */
        final boolean f12911i;

        /* renamed from: j, reason: collision with root package name */
        final boolean f12912j;

        public b(String str, boolean z8, boolean z9) {
            this.f12910h = str;
            this.f12911i = z8;
            this.f12912j = z9;
        }

        public abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean a(Object obj) throws IOException, IllegalAccessException;
    }

    public i(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.e eVar, com.bykv.vk.openvk.preload.a.b.d dVar, d dVar2) {
        this.f12899a = cVar;
        this.b = eVar;
        this.f12900c = dVar;
        this.f12901d = dVar2;
    }

    private boolean a(Field field, boolean z8) {
        com.bykv.vk.openvk.preload.a.b.d dVar = this.f12900c;
        if (dVar.a(field.getType()) || dVar.a(z8) || (dVar.f13011c & field.getModifiers()) != 0) {
            return false;
        }
        if ((dVar.b != -1.0d && !dVar.a((com.bykv.vk.openvk.preload.a.a.d) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class), (com.bykv.vk.openvk.preload.a.a.e) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.e.class))) || field.isSynthetic()) {
            return false;
        }
        if (dVar.f13013e) {
            com.bykv.vk.openvk.preload.a.a.a aVar = (com.bykv.vk.openvk.preload.a.a.a) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
            if (aVar == null) {
                return false;
            }
            if (z8) {
                if (!aVar.a()) {
                    return false;
                }
            } else if (!aVar.b()) {
                return false;
            }
        }
        if ((!dVar.f13012d && com.bykv.vk.openvk.preload.a.b.d.c(field.getType())) || com.bykv.vk.openvk.preload.a.b.d.b(field.getType())) {
            return false;
        }
        List<com.bykv.vk.openvk.preload.a.b> list = z8 ? dVar.f13014f : dVar.f13015g;
        if (list.isEmpty()) {
            return true;
        }
        new com.bykv.vk.openvk.preload.a.c(field);
        Iterator<com.bykv.vk.openvk.preload.a.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return false;
            }
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static final class a<T> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<T> f12909a;
        private final Map<String, b> b;

        public a(com.bykv.vk.openvk.preload.a.b.i<T> iVar, Map<String, b> map) {
            this.f12909a = iVar;
            this.b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            T a6 = this.f12909a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.b.get(aVar.h());
                    if (bVar != null && bVar.f12912j) {
                        bVar.a(aVar, a6);
                    }
                    aVar.o();
                }
                aVar.d();
                return a6;
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (IllegalStateException e9) {
                throw new r(e9);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
            if (t9 == null) {
                cVar.e();
                return;
            }
            cVar.c();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t9)) {
                        cVar.a(bVar.f12910h);
                        bVar.a(cVar, t9);
                    }
                }
                cVar.d();
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    private List<String> a(Field field) {
        com.bykv.vk.openvk.preload.a.a.c cVar = (com.bykv.vk.openvk.preload.a.a.c) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String a6 = cVar.a();
        String[] b8 = cVar.b();
        if (b8.length == 0) {
            return Collections.singletonList(a6);
        }
        ArrayList arrayList = new ArrayList(b8.length + 1);
        arrayList.add(a6);
        for (String str : b8) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private Map<String, b> a(final com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, Class<?> cls) {
        com.bykv.vk.openvk.preload.a.c.a<?> aVar2;
        int i9;
        boolean z8;
        int i10;
        Field[] fieldArr;
        Class<?> cls2;
        Type type;
        i iVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = aVar.f13052c;
        Class<?> cls3 = cls;
        com.bykv.vk.openvk.preload.a.c.a<?> aVar3 = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z9 = false;
            int i11 = 0;
            while (i11 < length) {
                final Field field = declaredFields[i11];
                boolean a6 = iVar.a(field, true);
                boolean a9 = iVar.a(field, z9);
                if (a6 || a9) {
                    iVar.f12902e.a(field);
                    Type a10 = com.bykv.vk.openvk.preload.a.b.b.a(aVar3.f13052c, cls3, field.getGenericType());
                    List<String> a11 = iVar.a(field);
                    int size = a11.size();
                    ?? r12 = z9;
                    aVar2 = aVar3;
                    b bVar = null;
                    while (r12 < size) {
                        Type type3 = type2;
                        String str = a11.get(r12);
                        boolean z10 = r12 != 0 ? z9 : a6;
                        final com.bykv.vk.openvk.preload.a.c.a<?> a12 = com.bykv.vk.openvk.preload.a.c.a.a(a10);
                        Class<? super Object> cls4 = a12.b;
                        boolean z11 = (cls4 instanceof Class) && cls4.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.b bVar2 = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
                        t<?> a13 = bVar2 != null ? d.a(iVar.f12899a, fVar, a12, bVar2) : null;
                        boolean z12 = a13 != null;
                        if (a13 == null) {
                            a13 = fVar.a((com.bykv.vk.openvk.preload.a.c.a) a12);
                        }
                        final t<?> tVar = a13;
                        int i12 = r12;
                        int i13 = size;
                        List<String> list = a11;
                        Field field2 = field;
                        int i14 = i11;
                        final boolean z13 = z12;
                        int i15 = length;
                        Field[] fieldArr2 = declaredFields;
                        Class<?> cls5 = cls3;
                        final boolean z14 = z11;
                        b bVar3 = (b) linkedHashMap.put(str, new b(str, z10, a9) { // from class: com.bykv.vk.openvk.preload.a.b.a.i.1
                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException, IllegalAccessException {
                                (z13 ? tVar : new m(fVar, tVar, a12.f13052c)).a(cVar, field.get(obj));
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.a aVar4, Object obj) throws IOException, IllegalAccessException {
                                Object a14 = tVar.a(aVar4);
                                if (a14 == null && z14) {
                                    return;
                                }
                                field.set(obj, a14);
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final boolean a(Object obj) throws IOException, IllegalAccessException {
                                return this.f12911i && field.get(obj) != obj;
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar3;
                        }
                        iVar = this;
                        cls3 = cls5;
                        a6 = z10;
                        type2 = type3;
                        z9 = false;
                        length = i15;
                        size = i13;
                        a11 = list;
                        field = field2;
                        i11 = i14;
                        declaredFields = fieldArr2;
                        r12 = i12 + 1;
                    }
                    i9 = i11;
                    z8 = z9;
                    i10 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f12910h);
                    }
                } else {
                    i9 = i11;
                    z8 = z9;
                    i10 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    aVar2 = aVar3;
                }
                i11 = i9 + 1;
                iVar = this;
                aVar3 = aVar2;
                cls3 = cls2;
                type2 = type;
                z9 = z8;
                length = i10;
                declaredFields = fieldArr;
            }
            Class<?> cls6 = cls3;
            aVar3 = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.b.a(aVar3.f13052c, cls6, cls6.getGenericSuperclass()));
            cls3 = aVar3.b;
            iVar = this;
        }
        return linkedHashMap;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Class<? super T> cls = aVar.b;
        if (Object.class.isAssignableFrom(cls)) {
            return new a(this.f12899a.a(aVar), a(fVar, aVar, cls));
        }
        return null;
    }
}
