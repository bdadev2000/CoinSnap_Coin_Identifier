package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ji extends cb {

    /* renamed from: i, reason: collision with root package name */
    static final cb f8465i = new ji(null, new Object[0], 0);

    /* renamed from: f, reason: collision with root package name */
    private final transient int[] f8466f;

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f8467g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f8468h;

    /* loaded from: classes.dex */
    public static class a extends eb {

        /* renamed from: c, reason: collision with root package name */
        private final transient cb f8469c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f8470d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f8471f;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f8472g;

        /* renamed from: com.applovin.impl.ji$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0019a extends ab {
            public C0019a() {
            }

            @Override // java.util.List
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i9) {
                Preconditions.checkElementIndex(i9, a.this.f8472g);
                int i10 = i9 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f8470d[a.this.f8471f + i10], a.this.f8470d[i10 + (a.this.f8471f ^ 1)]);
            }

            @Override // com.applovin.impl.ya
            public boolean e() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f8472g;
            }
        }

        public a(cb cbVar, Object[] objArr, int i9, int i10) {
            this.f8469c = cbVar;
            this.f8470d = objArr;
            this.f8471f = i9;
            this.f8472g = i10;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f8469c.get(key))) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // com.applovin.impl.eb
        public ab f() {
            return new C0019a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public qp iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f8472g;
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i9) {
            return a().a(objArr, i9);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends eb {

        /* renamed from: c, reason: collision with root package name */
        private final transient cb f8474c;

        /* renamed from: d, reason: collision with root package name */
        private final transient ab f8475d;

        public b(cb cbVar, ab abVar) {
            this.f8474c = cbVar;
            this.f8475d = abVar;
        }

        @Override // com.applovin.impl.eb, com.applovin.impl.ya
        public ab a() {
            return this.f8475d;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (this.f8474c.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public qp iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f8474c.size();
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i9) {
            return a().a(objArr, i9);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ab {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f8476c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f8477d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f8478f;

        public c(Object[] objArr, int i9, int i10) {
            this.f8476c = objArr;
            this.f8477d = i9;
            this.f8478f = i10;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i9) {
            Preconditions.checkElementIndex(i9, this.f8478f);
            return this.f8476c[(i9 * 2) + this.f8477d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f8478f;
        }
    }

    private ji(int[] iArr, Object[] objArr, int i9) {
        this.f8466f = iArr;
        this.f8467g = objArr;
        this.f8468h = i9;
    }

    public static ji a(int i9, Object[] objArr) {
        if (i9 == 0) {
            return (ji) f8465i;
        }
        if (i9 == 1) {
            n3.a(objArr[0], objArr[1]);
            return new ji(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i9, objArr.length >> 1);
        return new ji(a(objArr, i9, eb.a(i9), 0), objArr, i9);
    }

    @Override // com.applovin.impl.cb
    public eb b() {
        return new a(this, this.f8467g, 0, this.f8468h);
    }

    @Override // com.applovin.impl.cb
    public eb c() {
        return new b(this, new c(this.f8467g, 0, this.f8468h));
    }

    @Override // com.applovin.impl.cb
    public ya d() {
        return new c(this.f8467g, 1, this.f8468h);
    }

    @Override // com.applovin.impl.cb
    public boolean f() {
        return false;
    }

    @Override // com.applovin.impl.cb, java.util.Map
    public Object get(Object obj) {
        return a(this.f8466f, this.f8467g, this.f8468h, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f8468h;
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
            com.applovin.impl.n3.a(r11, r10)
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
            com.applovin.impl.n3.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.impl.ia.a(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ji.a(java.lang.Object[], int, int, int):int[]");
    }

    public static Object a(int[] iArr, Object[] objArr, int i9, int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i9 == 1) {
            if (objArr[i10].equals(obj)) {
                return objArr[i10 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int a6 = ia.a(obj.hashCode());
        while (true) {
            int i11 = a6 & length;
            int i12 = iArr[i11];
            if (i12 == -1) {
                return null;
            }
            if (objArr[i12].equals(obj)) {
                return objArr[i12 ^ 1];
            }
            a6 = i11 + 1;
        }
    }
}
