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
    private transient int[] a;

    /* renamed from: b, reason: collision with root package name */
    transient long[] f8329b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f8330c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f8331d;

    /* renamed from: f, reason: collision with root package name */
    transient float f8332f;

    /* renamed from: g, reason: collision with root package name */
    transient int f8333g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f8334h;

    /* renamed from: i, reason: collision with root package name */
    private transient int f8335i;

    /* renamed from: j, reason: collision with root package name */
    private transient Set f8336j;

    /* renamed from: k, reason: collision with root package name */
    private transient Set f8337k;

    /* renamed from: l, reason: collision with root package name */
    private transient Collection f8338l;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        public Object a(int i10) {
            return u3.this.f8330c[i10];
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i10) {
            return new g(i10);
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {
        public c() {
            super(u3.this, null);
        }

        @Override // com.applovin.impl.u3.e
        public Object a(int i10) {
            return u3.this.f8331d[i10];
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
            int a = u3.this.a(entry.getKey());
            if (a == -1 || !Objects.equal(u3.this.f8331d[a], entry.getValue())) {
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
                int a = u3.this.a(entry.getKey());
                if (a != -1 && Objects.equal(u3.this.f8331d[a], entry.getValue())) {
                    u3.this.f(a);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.f8335i;
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
            int a = u3.this.a(obj);
            if (a != -1) {
                u3.this.f(a);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u3.this.f8335i;
        }
    }

    /* loaded from: classes.dex */
    public final class g extends com.applovin.impl.g {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private int f8345b;

        public g(int i10) {
            this.a = u3.this.f8330c[i10];
            this.f8345b = i10;
        }

        private void a() {
            int i10 = this.f8345b;
            if (i10 == -1 || i10 >= u3.this.size() || !Objects.equal(this.a, u3.this.f8330c[this.f8345b])) {
                this.f8345b = u3.this.a(this.a);
            }
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getValue() {
            a();
            int i10 = this.f8345b;
            if (i10 == -1) {
                return null;
            }
            return u3.this.f8331d[i10];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i10 = this.f8345b;
            if (i10 == -1) {
                u3.this.put(this.a, obj);
                return null;
            }
            Object[] objArr = u3.this.f8331d;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
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
            return u3.this.f8335i;
        }
    }

    public u3() {
        a(3, 1.0f);
    }

    private static int b(long j3) {
        return (int) j3;
    }

    private static long[] d(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] e(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int g() {
        return this.a.length - 1;
    }

    private void h(int i10) {
        int length = this.f8329b.length;
        if (i10 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                g(max);
            }
        }
    }

    private void i(int i10) {
        if (this.a.length >= 1073741824) {
            this.f8334h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f8332f)) + 1;
        int[] e2 = e(i10);
        long[] jArr = this.f8329b;
        int length = e2.length - 1;
        for (int i12 = 0; i12 < this.f8335i; i12++) {
            int a10 = a(jArr[i12]);
            int i13 = a10 & length;
            int i14 = e2[i13];
            e2[i13] = i12;
            jArr[i12] = (a10 << 32) | (i14 & 4294967295L);
        }
        this.f8334h = i11;
        this.a = e2;
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    public void c(int i10) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f8330c;
            objArr[i10] = objArr[size];
            Object[] objArr2 = this.f8331d;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f8329b;
            long j3 = jArr[size];
            jArr[i10] = j3;
            jArr[size] = -1;
            int a10 = a(j3) & g();
            int[] iArr = this.a;
            int i11 = iArr[a10];
            if (i11 == size) {
                iArr[a10] = i10;
                return;
            }
            while (true) {
                long j10 = this.f8329b[i11];
                int b3 = b(j10);
                if (b3 == size) {
                    this.f8329b[i11] = a(j10, i10);
                    return;
                }
                i11 = b3;
            }
        } else {
            this.f8330c[i10] = null;
            this.f8331d[i10] = null;
            this.f8329b[i10] = -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f8333g++;
        Arrays.fill(this.f8330c, 0, this.f8335i, (Object) null);
        Arrays.fill(this.f8331d, 0, this.f8335i, (Object) null);
        Arrays.fill(this.a, -1);
        Arrays.fill(this.f8329b, -1L);
        this.f8335i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i10 = 0; i10 < this.f8335i; i10++) {
            if (Objects.equal(obj, this.f8331d[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f8337k;
        if (set != null) {
            return set;
        }
        Set b3 = b();
        this.f8337k = b3;
        return b3;
    }

    public int f() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int a10 = a(obj);
        a(a10);
        if (a10 == -1) {
            return null;
        }
        return this.f8331d[a10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f8335i == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f8336j;
        if (set != null) {
            return set;
        }
        Set c10 = c();
        this.f8336j = c10;
        return c10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.f8329b;
        Object[] objArr = this.f8330c;
        Object[] objArr2 = this.f8331d;
        int a10 = ia.a(obj);
        int g10 = g() & a10;
        int i10 = this.f8335i;
        int[] iArr = this.a;
        int i11 = iArr[g10];
        if (i11 == -1) {
            iArr[g10] = i10;
        } else {
            while (true) {
                long j3 = jArr[i11];
                if (a(j3) == a10 && Objects.equal(obj, objArr[i11])) {
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = obj2;
                    a(i11);
                    return obj3;
                }
                int b3 = b(j3);
                if (b3 == -1) {
                    jArr[i11] = a(j3, i10);
                    break;
                }
                i11 = b3;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            int i12 = i10 + 1;
            h(i12);
            a(i10, obj, obj2, a10);
            this.f8335i = i12;
            if (i10 >= this.f8334h) {
                i(this.a.length * 2);
            }
            this.f8333g++;
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
        return this.f8335i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f8338l;
        if (collection != null) {
            return collection;
        }
        Collection d10 = d();
        this.f8338l = d10;
        return d10;
    }

    private static int a(long j3) {
        return (int) (j3 >>> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object f(int i10) {
        return a(this.f8330c[i10], a(this.f8329b[i10]));
    }

    public int b(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f8335i) {
            return i11;
        }
        return -1;
    }

    public void g(int i10) {
        this.f8330c = Arrays.copyOf(this.f8330c, i10);
        this.f8331d = Arrays.copyOf(this.f8331d, i10);
        long[] jArr = this.f8329b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.f8329b = copyOf;
    }

    private static long a(long j3, int i10) {
        return (j3 & (-4294967296L)) | (i10 & 4294967295L);
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
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f8342b;

        /* renamed from: c, reason: collision with root package name */
        int f8343c;

        private e() {
            this.a = u3.this.f8333g;
            this.f8342b = u3.this.f();
            this.f8343c = -1;
        }

        private void a() {
            if (u3.this.f8333g != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8342b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i10 = this.f8342b;
                this.f8343c = i10;
                Object a = a(i10);
                this.f8342b = u3.this.b(this.f8342b);
                return a;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f8343c >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n3.a(z10);
            this.a++;
            u3.this.f(this.f8343c);
            this.f8342b = u3.this.a(this.f8342b, this.f8343c);
            this.f8343c = -1;
        }

        public /* synthetic */ e(u3 u3Var, a aVar) {
            this();
        }
    }

    public void a(int i10) {
    }

    public Iterator h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Object obj) {
        int a10 = ia.a(obj);
        int i10 = this.a[g() & a10];
        while (i10 != -1) {
            long j3 = this.f8329b[i10];
            if (a(j3) == a10 && Objects.equal(obj, this.f8330c[i10])) {
                return i10;
            }
            i10 = b(j3);
        }
        return -1;
    }

    public void a(int i10, float f10) {
        Preconditions.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f10 > 0.0f, "Illegal load factor");
        int a10 = ia.a(i10, f10);
        this.a = e(a10);
        this.f8332f = f10;
        this.f8330c = new Object[i10];
        this.f8331d = new Object[i10];
        this.f8329b = d(i10);
        this.f8334h = Math.max(1, (int) (a10 * f10));
    }

    public Iterator i() {
        return new c();
    }

    public Set c() {
        return new f();
    }

    public void a(int i10, Object obj, Object obj2, int i11) {
        this.f8329b[i10] = (i11 << 32) | 4294967295L;
        this.f8330c[i10] = obj;
        this.f8331d[i10] = obj2;
    }

    private Object a(Object obj, int i10) {
        int g10 = g() & i10;
        int i11 = this.a[g10];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (a(this.f8329b[i11]) == i10 && Objects.equal(obj, this.f8330c[i11])) {
                Object obj2 = this.f8331d[i11];
                if (i12 == -1) {
                    this.a[g10] = b(this.f8329b[i11]);
                } else {
                    long[] jArr = this.f8329b;
                    jArr[i12] = a(jArr[i12], b(jArr[i11]));
                }
                c(i11);
                this.f8335i--;
                this.f8333g++;
                return obj2;
            }
            int b3 = b(this.f8329b[i11]);
            if (b3 == -1) {
                return null;
            }
            i12 = i11;
            i11 = b3;
        }
    }

    public static u3 a() {
        return new u3();
    }
}
