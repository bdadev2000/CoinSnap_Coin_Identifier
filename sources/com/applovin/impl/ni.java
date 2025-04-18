package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ni extends gb {

    /* renamed from: i, reason: collision with root package name */
    static final gb f25712i = new ni(null, new Object[0], 0);

    /* renamed from: f, reason: collision with root package name */
    private final transient int[] f25713f;

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f25714g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f25715h;

    /* loaded from: classes.dex */
    public static class a extends ib {

        /* renamed from: c, reason: collision with root package name */
        private final transient gb f25716c;
        private final transient Object[] d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f25717f;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f25718g;

        /* renamed from: com.applovin.impl.ni$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0089a extends eb {
            public C0089a() {
            }

            @Override // java.util.List
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i2) {
                Preconditions.checkElementIndex(i2, a.this.f25718g);
                int i3 = i2 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.d[a.this.f25717f + i3], a.this.d[i3 + (a.this.f25717f ^ 1)]);
            }

            @Override // com.applovin.impl.cb
            public boolean e() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f25718g;
            }
        }

        public a(gb gbVar, Object[] objArr, int i2, int i3) {
            this.f25716c = gbVar;
            this.d = objArr;
            this.f25717f = i2;
            this.f25718g = i3;
        }

        @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f25716c.get(key));
        }

        @Override // com.applovin.impl.cb
        public boolean e() {
            return true;
        }

        @Override // com.applovin.impl.ib
        public eb f() {
            return new C0089a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public pp iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f25718g;
        }

        @Override // com.applovin.impl.cb
        public int a(Object[] objArr, int i2) {
            return a().a(objArr, i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ib {

        /* renamed from: c, reason: collision with root package name */
        private final transient gb f25720c;
        private final transient eb d;

        public b(gb gbVar, eb ebVar) {
            this.f25720c = gbVar;
            this.d = ebVar;
        }

        @Override // com.applovin.impl.ib, com.applovin.impl.cb
        public eb a() {
            return this.d;
        }

        @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f25720c.get(obj) != null;
        }

        @Override // com.applovin.impl.cb
        public boolean e() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public pp iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f25720c.size();
        }

        @Override // com.applovin.impl.cb
        public int a(Object[] objArr, int i2) {
            return a().a(objArr, i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends eb {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f25721c;
        private final transient int d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f25722f;

        public c(Object[] objArr, int i2, int i3) {
            this.f25721c = objArr;
            this.d = i2;
            this.f25722f = i3;
        }

        @Override // com.applovin.impl.cb
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.checkElementIndex(i2, this.f25722f);
            return this.f25721c[(i2 * 2) + this.d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f25722f;
        }
    }

    private ni(int[] iArr, Object[] objArr, int i2) {
        this.f25713f = iArr;
        this.f25714g = objArr;
        this.f25715h = i2;
    }

    public static ni a(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (ni) f25712i;
        }
        if (i2 == 1) {
            p3.a(objArr[0], objArr[1]);
            return new ni(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i2, objArr.length >> 1);
        return new ni(a(objArr, i2, ib.a(i2), 0), objArr, i2);
    }

    @Override // com.applovin.impl.gb
    public ib b() {
        return new a(this, this.f25714g, 0, this.f25715h);
    }

    @Override // com.applovin.impl.gb
    public ib c() {
        return new b(this, new c(this.f25714g, 0, this.f25715h));
    }

    @Override // com.applovin.impl.gb
    public cb d() {
        return new c(this.f25714g, 1, this.f25715h);
    }

    @Override // com.applovin.impl.gb
    public boolean f() {
        return false;
    }

    @Override // com.applovin.impl.gb, java.util.Map
    public Object get(Object obj) {
        return a(this.f25713f, this.f25714g, this.f25715h, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f25715h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.impl.p3.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L74
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.impl.p3.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.impl.ka.a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Multiple entries with same key: "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ni.a(java.lang.Object[], int, int, int):int[]");
    }

    public static Object a(int[] iArr, Object[] objArr, int i2, int i3, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int a2 = ka.a(obj.hashCode());
        while (true) {
            int i4 = a2 & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            a2 = i4 + 1;
        }
    }
}
