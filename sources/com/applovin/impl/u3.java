package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u3 extends AbstractMap implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient int[] f11540a;
    transient long[] b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f11541c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f11542d;

    /* renamed from: f, reason: collision with root package name */
    transient float f11543f;

    /* renamed from: g, reason: collision with root package name */
    transient int f11544g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f11545h;

    /* renamed from: i, reason: collision with root package name */
    private transient int f11546i;

    /* renamed from: j, reason: collision with root package name */
    private transient Set f11547j;

    /* renamed from: k, reason: collision with root package name */
    private transient Set f11548k;
    private transient Collection l;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        public Object a(int i9) {
            return u3.this.f11541c[i9];
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i9) {
            return new g(i9);
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {
        public c() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        public Object a(int i9) {
            return u3.this.f11542d[i9];
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a6 = u3.this.a(entry.getKey());
            if (a6 == -1 || !Objects.equal(u3.this.f11542d[a6], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return u3.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int a6 = u3.this.a(entry.getKey());
                if (a6 != -1 && Objects.equal(u3.this.f11542d[a6], entry.getValue())) {
                    u3.this.f(a6);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.f11546i;
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return u3.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int a6 = u3.this.a(obj);
            if (a6 != -1) {
                u3.this.f(a6);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.f11546i;
        }
    }

    /* loaded from: classes.dex */
    public final class g extends AbstractC0697g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f11557a;
        private int b;

        public g(int i9) {
            this.f11557a = u3.this.f11541c[i9];
            this.b = i9;
        }

        private void a() {
            int i9 = this.b;
            if (i9 == -1 || i9 >= u3.this.size() || !Objects.equal(this.f11557a, u3.this.f11541c[this.b])) {
                this.b = u3.this.a(this.f11557a);
            }
        }

        @Override // com.applovin.impl.AbstractC0697g, java.util.Map.Entry
        public Object getKey() {
            return this.f11557a;
        }

        @Override // com.applovin.impl.AbstractC0697g, java.util.Map.Entry
        public Object getValue() {
            a();
            int i9 = this.b;
            if (i9 == -1) {
                return null;
            }
            return u3.this.f11542d[i9];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i9 = this.b;
            if (i9 == -1) {
                u3.this.put(this.f11557a, obj);
                return null;
            }
            Object[] objArr = u3.this.f11542d;
            Object obj2 = objArr[i9];
            objArr[i9] = obj;
            return obj2;
        }
    }

    /* loaded from: classes.dex */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            u3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return u3.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return u3.this.f11546i;
        }
    }

    public u3() {
        a(3, 1.0f);
    }

    private static int b(long j7) {
        return (int) j7;
    }

    private static long[] d(int i9) {
        long[] jArr = new long[i9];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] e(int i9) {
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int g() {
        return this.f11540a.length - 1;
    }

    private void h(int i9) {
        int length = this.b.length;
        if (i9 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                g(max);
            }
        }
    }

    private void i(int i9) {
        if (this.f11540a.length >= 1073741824) {
            this.f11545h = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (i9 * this.f11543f)) + 1;
        int[] e4 = e(i9);
        long[] jArr = this.b;
        int length = e4.length - 1;
        for (int i11 = 0; i11 < this.f11546i; i11++) {
            int a6 = a(jArr[i11]);
            int i12 = a6 & length;
            int i13 = e4[i12];
            e4[i12] = i11;
            jArr[i11] = (a6 << 32) | (i13 & 4294967295L);
        }
        this.f11545h = i10;
        this.f11540a = e4;
    }

    public int a(int i9, int i10) {
        return i9 - 1;
    }

    public void c(int i9) {
        int size = size() - 1;
        if (i9 < size) {
            Object[] objArr = this.f11541c;
            objArr[i9] = objArr[size];
            Object[] objArr2 = this.f11542d;
            objArr2[i9] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.b;
            long j7 = jArr[size];
            jArr[i9] = j7;
            jArr[size] = -1;
            int a6 = a(j7) & g();
            int[] iArr = this.f11540a;
            int i10 = iArr[a6];
            if (i10 == size) {
                iArr[a6] = i9;
                return;
            }
            while (true) {
                long j9 = this.b[i10];
                int b8 = b(j9);
                if (b8 == size) {
                    this.b[i10] = a(j9, i9);
                    return;
                }
                i10 = b8;
            }
        } else {
            this.f11541c[i9] = null;
            this.f11542d[i9] = null;
            this.b[i9] = -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f11544g++;
        Arrays.fill(this.f11541c, 0, this.f11546i, (Object) null);
        Arrays.fill(this.f11542d, 0, this.f11546i, (Object) null);
        Arrays.fill(this.f11540a, -1);
        Arrays.fill(this.b, -1L);
        this.f11546i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i9 = 0; i9 < this.f11546i; i9++) {
            if (Objects.equal(obj, this.f11542d[i9])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f11548k;
        if (set == null) {
            Set b8 = b();
            this.f11548k = b8;
            return b8;
        }
        return set;
    }

    public int f() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int a6 = a(obj);
        a(a6);
        if (a6 == -1) {
            return null;
        }
        return this.f11542d[a6];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (this.f11546i == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f11547j;
        if (set == null) {
            Set c9 = c();
            this.f11547j = c9;
            return c9;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.b;
        Object[] objArr = this.f11541c;
        Object[] objArr2 = this.f11542d;
        int a6 = ia.a(obj);
        int g9 = g() & a6;
        int i9 = this.f11546i;
        int[] iArr = this.f11540a;
        int i10 = iArr[g9];
        if (i10 == -1) {
            iArr[g9] = i9;
        } else {
            while (true) {
                long j7 = jArr[i10];
                if (a(j7) == a6 && Objects.equal(obj, objArr[i10])) {
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = obj2;
                    a(i10);
                    return obj3;
                }
                int b8 = b(j7);
                if (b8 == -1) {
                    jArr[i10] = a(j7, i9);
                    break;
                }
                i10 = b8;
            }
        }
        if (i9 != Integer.MAX_VALUE) {
            int i11 = i9 + 1;
            h(i11);
            a(i9, obj, obj2, a6);
            this.f11546i = i11;
            if (i9 >= this.f11545h) {
                i(this.f11540a.length * 2);
            }
            this.f11544g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return a(obj, ia.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11546i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.l;
        if (collection == null) {
            Collection d2 = d();
            this.l = d2;
            return d2;
        }
        return collection;
    }

    private static int a(long j7) {
        return (int) (j7 >>> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object f(int i9) {
        return a(this.f11541c[i9], a(this.b[i9]));
    }

    public int b(int i9) {
        int i10 = i9 + 1;
        if (i10 < this.f11546i) {
            return i10;
        }
        return -1;
    }

    public void g(int i9) {
        this.f11541c = Arrays.copyOf(this.f11541c, i9);
        this.f11542d = Arrays.copyOf(this.f11542d, i9);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i9);
        if (i9 > length) {
            Arrays.fill(copyOf, length, i9, -1L);
        }
        this.b = copyOf;
    }

    private static long a(long j7, int i9) {
        return (j7 & (-4294967296L)) | (i9 & 4294967295L);
    }

    public Set b() {
        return new d();
    }

    public Collection d() {
        return new h();
    }

    public Iterator e() {
        return new b();
    }

    /* loaded from: classes.dex */
    public abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f11553a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f11554c;

        private e() {
            this.f11553a = u3.this.f11544g;
            this.b = u3.this.f();
            this.f11554c = -1;
        }

        private void a() {
            if (u3.this.f11544g != this.f11553a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object a(int i9);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i9 = this.b;
                this.f11554c = i9;
                Object a6 = a(i9);
                this.b = u3.this.b(this.b);
                return a6;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z8;
            a();
            if (this.f11554c >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            n3.a(z8);
            this.f11553a++;
            u3.this.f(this.f11554c);
            this.b = u3.this.a(this.b, this.f11554c);
            this.f11554c = -1;
        }

        public /* synthetic */ e(u3 u3Var, a aVar) {
            this();
        }
    }

    public void a(int i9) {
    }

    public Iterator h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Object obj) {
        int a6 = ia.a(obj);
        int i9 = this.f11540a[g() & a6];
        while (i9 != -1) {
            long j7 = this.b[i9];
            if (a(j7) == a6 && Objects.equal(obj, this.f11541c[i9])) {
                return i9;
            }
            i9 = b(j7);
        }
        return -1;
    }

    public void a(int i9, float f9) {
        Preconditions.checkArgument(i9 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f9 > 0.0f, "Illegal load factor");
        int a6 = ia.a(i9, f9);
        this.f11540a = e(a6);
        this.f11543f = f9;
        this.f11541c = new Object[i9];
        this.f11542d = new Object[i9];
        this.b = d(i9);
        this.f11545h = Math.max(1, (int) (a6 * f9));
    }

    public Iterator i() {
        return new c();
    }

    public Set c() {
        return new f();
    }

    public void a(int i9, Object obj, Object obj2, int i10) {
        this.b[i9] = (i10 << 32) | 4294967295L;
        this.f11541c[i9] = obj;
        this.f11542d[i9] = obj2;
    }

    private Object a(Object obj, int i9) {
        int g9 = g() & i9;
        int i10 = this.f11540a[g9];
        if (i10 == -1) {
            return null;
        }
        int i11 = -1;
        while (true) {
            if (a(this.b[i10]) == i9 && Objects.equal(obj, this.f11541c[i10])) {
                Object obj2 = this.f11542d[i10];
                if (i11 == -1) {
                    this.f11540a[g9] = b(this.b[i10]);
                } else {
                    long[] jArr = this.b;
                    jArr[i11] = a(jArr[i11], b(jArr[i10]));
                }
                c(i10);
                this.f11546i--;
                this.f11544g++;
                return obj2;
            }
            int b8 = b(this.b[i10]);
            if (b8 == -1) {
                return null;
            }
            i11 = i10;
            i10 = b8;
        }
    }

    public static u3 a() {
        return new u3();
    }
}
