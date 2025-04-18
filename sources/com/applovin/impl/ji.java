package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ji extends cb {

    /* renamed from: i, reason: collision with root package name */
    static final cb f5507i = new ji(null, new Object[0], 0);

    /* renamed from: f, reason: collision with root package name */
    private final transient int[] f5508f;

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f5509g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f5510h;

    /* loaded from: classes.dex */
    public static class a extends eb {

        /* renamed from: c, reason: collision with root package name */
        private final transient cb f5511c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f5512d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f5513f;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f5514g;

        /* renamed from: com.applovin.impl.ji$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0019a extends ab {
            public C0019a() {
            }

            @Override // java.util.List
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                Preconditions.checkElementIndex(i10, a.this.f5514g);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f5512d[a.this.f5513f + i11], a.this.f5512d[i11 + (a.this.f5513f ^ 1)]);
            }

            @Override // com.applovin.impl.ya
            public boolean e() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f5514g;
            }
        }

        public a(cb cbVar, Object[] objArr, int i10, int i11) {
            this.f5511c = cbVar;
            this.f5512d = objArr;
            this.f5513f = i10;
            this.f5514g = i11;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f5511c.get(key))) {
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
            return this.f5514g;
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i10) {
            return a().a(objArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends eb {

        /* renamed from: c, reason: collision with root package name */
        private final transient cb f5516c;

        /* renamed from: d, reason: collision with root package name */
        private final transient ab f5517d;

        public b(cb cbVar, ab abVar) {
            this.f5516c = cbVar;
            this.f5517d = abVar;
        }

        @Override // com.applovin.impl.eb, com.applovin.impl.ya
        public ab a() {
            return this.f5517d;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f5516c.get(obj) != null;
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
            return this.f5516c.size();
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i10) {
            return a().a(objArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ab {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f5518c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f5519d;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f5520f;

        public c(Object[] objArr, int i10, int i11) {
            this.f5518c = objArr;
            this.f5519d = i10;
            this.f5520f = i11;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f5520f);
            return this.f5518c[(i10 * 2) + this.f5519d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f5520f;
        }
    }

    private ji(int[] iArr, Object[] objArr, int i10) {
        this.f5508f = iArr;
        this.f5509g = objArr;
        this.f5510h = i10;
    }

    public static ji a(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (ji) f5507i;
        }
        if (i10 == 1) {
            n3.a(objArr[0], objArr[1]);
            return new ji(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i10, objArr.length >> 1);
        return new ji(a(objArr, i10, eb.a(i10), 0), objArr, i10);
    }

    @Override // com.applovin.impl.cb
    public eb b() {
        return new a(this, this.f5509g, 0, this.f5510h);
    }

    @Override // com.applovin.impl.cb
    public eb c() {
        return new b(this, new c(this.f5509g, 0, this.f5510h));
    }

    @Override // com.applovin.impl.cb
    public ya d() {
        return new c(this.f5509g, 1, this.f5510h);
    }

    @Override // com.applovin.impl.cb
    public boolean f() {
        return false;
    }

    @Override // com.applovin.impl.cb, java.util.Map
    public Object get(Object obj) {
        return a(this.f5508f, this.f5509g, this.f5510h, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f5510h;
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

    public static Object a(int[] iArr, Object[] objArr, int i10, int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int a10 = ia.a(obj.hashCode());
        while (true) {
            int i12 = a10 & length;
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            a10 = i12 + 1;
        }
    }
}
