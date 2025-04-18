package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.android.gms.common.api.Api;
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
/* loaded from: classes2.dex */
public class w3 extends AbstractMap implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient int[] f27666a;

    /* renamed from: b, reason: collision with root package name */
    transient long[] f27667b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f27668c;
    transient Object[] d;

    /* renamed from: f, reason: collision with root package name */
    transient float f27669f;

    /* renamed from: g, reason: collision with root package name */
    transient int f27670g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f27671h;

    /* renamed from: i, reason: collision with root package name */
    private transient int f27672i;

    /* renamed from: j, reason: collision with root package name */
    private transient Set f27673j;

    /* renamed from: k, reason: collision with root package name */
    private transient Set f27674k;

    /* renamed from: l, reason: collision with root package name */
    private transient Collection f27675l;

    /* loaded from: classes2.dex */
    public class a extends e {
        public a() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        public Object a(int i2) {
            return w3.this.f27668c[i2];
        }
    }

    /* loaded from: classes2.dex */
    public class b extends e {
        public b() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(int i2) {
            return new g(i2);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends e {
        public c() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        public Object a(int i2) {
            return w3.this.d[i2];
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = w3.this.a(entry.getKey());
            return a2 != -1 && Objects.equal(w3.this.d[a2], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return w3.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = w3.this.a(entry.getKey());
            if (a2 == -1 || !Objects.equal(w3.this.d[a2], entry.getValue())) {
                return false;
            }
            w3.this.f(a2);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w3.this.f27672i;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return w3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return w3.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int a2 = w3.this.a(obj);
            if (a2 == -1) {
                return false;
            }
            w3.this.f(a2);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w3.this.f27672i;
        }
    }

    /* loaded from: classes2.dex */
    public final class g extends com.applovin.impl.g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f27684a;

        /* renamed from: b, reason: collision with root package name */
        private int f27685b;

        public g(int i2) {
            this.f27684a = w3.this.f27668c[i2];
            this.f27685b = i2;
        }

        private void a() {
            int i2 = this.f27685b;
            if (i2 == -1 || i2 >= w3.this.size() || !Objects.equal(this.f27684a, w3.this.f27668c[this.f27685b])) {
                this.f27685b = w3.this.a(this.f27684a);
            }
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getKey() {
            return this.f27684a;
        }

        @Override // com.applovin.impl.g, java.util.Map.Entry
        public Object getValue() {
            a();
            int i2 = this.f27685b;
            if (i2 == -1) {
                return null;
            }
            return w3.this.d[i2];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i2 = this.f27685b;
            if (i2 == -1) {
                w3.this.put(this.f27684a, obj);
                return null;
            }
            Object[] objArr = w3.this.d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return w3.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return w3.this.f27672i;
        }
    }

    public w3() {
        a(3, 1.0f);
    }

    private static long[] d(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] e(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int g() {
        return this.f27666a.length - 1;
    }

    private void h(int i2) {
        int length = this.f27667b.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (max != length) {
                g(max);
            }
        }
    }

    private void i(int i2) {
        if (this.f27666a.length >= 1073741824) {
            this.f27671h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i3 = ((int) (i2 * this.f27669f)) + 1;
        int[] e2 = e(i2);
        long[] jArr = this.f27667b;
        int length = e2.length - 1;
        for (int i4 = 0; i4 < this.f27672i; i4++) {
            int a2 = a(jArr[i4]);
            int i5 = a2 & length;
            int i6 = e2[i5];
            e2[i5] = i4;
            jArr[i4] = (a2 << 32) | (i6 & 4294967295L);
        }
        this.f27671h = i3;
        this.f27666a = e2;
    }

    public int a(int i2, int i3) {
        return i2 - 1;
    }

    public int b(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f27672i) {
            return i3;
        }
        return -1;
    }

    public void c(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f27668c;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.d;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f27667b;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int a2 = a(j2) & g();
            int[] iArr = this.f27666a;
            int i3 = iArr[a2];
            if (i3 == size) {
                iArr[a2] = i2;
                return;
            }
            while (true) {
                long j3 = this.f27667b[i3];
                int b2 = b(j3);
                if (b2 == size) {
                    this.f27667b[i3] = a(j3, i2);
                    return;
                }
                i3 = b2;
            }
        } else {
            this.f27668c[i2] = null;
            this.d[i2] = null;
            this.f27667b[i2] = -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f27670g++;
        Arrays.fill(this.f27668c, 0, this.f27672i, (Object) null);
        Arrays.fill(this.d, 0, this.f27672i, (Object) null);
        Arrays.fill(this.f27666a, -1);
        Arrays.fill(this.f27667b, -1L);
        this.f27672i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i2 = 0; i2 < this.f27672i; i2++) {
            if (Objects.equal(obj, this.d[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f27674k;
        if (set != null) {
            return set;
        }
        Set b2 = b();
        this.f27674k = b2;
        return b2;
    }

    public int f() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int a2 = a(obj);
        a(a2);
        if (a2 == -1) {
            return null;
        }
        return this.d[a2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f27672i == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f27673j;
        if (set != null) {
            return set;
        }
        Set c2 = c();
        this.f27673j = c2;
        return c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.f27667b;
        Object[] objArr = this.f27668c;
        Object[] objArr2 = this.d;
        int a2 = ka.a(obj);
        int g2 = g() & a2;
        int i2 = this.f27672i;
        int[] iArr = this.f27666a;
        int i3 = iArr[g2];
        if (i3 == -1) {
            iArr[g2] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (a(j2) == a2 && Objects.equal(obj, objArr[i3])) {
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = obj2;
                    a(i3);
                    return obj3;
                }
                int b2 = b(j2);
                if (b2 == -1) {
                    jArr[i3] = a(j2, i2);
                    break;
                }
                i3 = b2;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        h(i4);
        a(i2, obj, obj2, a2);
        this.f27672i = i4;
        if (i2 >= this.f27671h) {
            i(this.f27666a.length * 2);
        }
        this.f27670g++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return a(obj, ka.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f27672i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f27675l;
        if (collection != null) {
            return collection;
        }
        Collection d2 = d();
        this.f27675l = d2;
        return d2;
    }

    private static int a(long j2) {
        return (int) (j2 >>> 32);
    }

    private static int b(long j2) {
        return (int) j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object f(int i2) {
        return a(this.f27668c[i2], a(this.f27667b[i2]));
    }

    public void g(int i2) {
        this.f27668c = Arrays.copyOf(this.f27668c, i2);
        this.d = Arrays.copyOf(this.d, i2);
        long[] jArr = this.f27667b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1L);
        }
        this.f27667b = copyOf;
    }

    /* loaded from: classes2.dex */
    public abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f27680a;

        /* renamed from: b, reason: collision with root package name */
        int f27681b;

        /* renamed from: c, reason: collision with root package name */
        int f27682c;

        private e() {
            this.f27680a = w3.this.f27670g;
            this.f27681b = w3.this.f();
            this.f27682c = -1;
        }

        private void a() {
            if (w3.this.f27670g != this.f27680a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object a(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27681b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f27681b;
            this.f27682c = i2;
            Object a2 = a(i2);
            this.f27681b = w3.this.b(this.f27681b);
            return a2;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            p3.a(this.f27682c >= 0);
            this.f27680a++;
            w3.this.f(this.f27682c);
            this.f27681b = w3.this.a(this.f27681b, this.f27682c);
            this.f27682c = -1;
        }

        public /* synthetic */ e(w3 w3Var, a aVar) {
            this();
        }
    }

    private static long a(long j2, int i2) {
        return (j2 & (-4294967296L)) | (i2 & 4294967295L);
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

    public void a(int i2) {
    }

    public Iterator h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Object obj) {
        int a2 = ka.a(obj);
        int i2 = this.f27666a[g() & a2];
        while (i2 != -1) {
            long j2 = this.f27667b[i2];
            if (a(j2) == a2 && Objects.equal(obj, this.f27668c[i2])) {
                return i2;
            }
            i2 = b(j2);
        }
        return -1;
    }

    public Iterator i() {
        return new c();
    }

    public void a(int i2, float f2) {
        Preconditions.checkArgument(i2 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f2 > 0.0f, "Illegal load factor");
        int a2 = ka.a(i2, f2);
        this.f27666a = e(a2);
        this.f27669f = f2;
        this.f27668c = new Object[i2];
        this.d = new Object[i2];
        this.f27667b = d(i2);
        this.f27671h = Math.max(1, (int) (a2 * f2));
    }

    public Set c() {
        return new f();
    }

    public void a(int i2, Object obj, Object obj2, int i3) {
        this.f27667b[i2] = (i3 << 32) | 4294967295L;
        this.f27668c[i2] = obj;
        this.d[i2] = obj2;
    }

    private Object a(Object obj, int i2) {
        int g2 = g() & i2;
        int i3 = this.f27666a[g2];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (a(this.f27667b[i3]) == i2 && Objects.equal(obj, this.f27668c[i3])) {
                Object obj2 = this.d[i3];
                if (i4 == -1) {
                    this.f27666a[g2] = b(this.f27667b[i3]);
                } else {
                    long[] jArr = this.f27667b;
                    jArr[i4] = a(jArr[i4], b(jArr[i3]));
                }
                c(i3);
                this.f27672i--;
                this.f27670g++;
                return obj2;
            }
            int b2 = b(this.f27667b[i3]);
            if (b2 == -1) {
                return null;
            }
            i4 = i3;
            i3 = b2;
        }
    }

    public static w3 a() {
        return new w3();
    }
}
