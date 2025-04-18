package f0;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes4.dex */
public final class g implements Map, Serializable, r0.e {

    /* renamed from: o, reason: collision with root package name */
    public static final g f30429o;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f30430a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f30431b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f30432c;
    public int[] d;

    /* renamed from: f, reason: collision with root package name */
    public int f30433f;

    /* renamed from: g, reason: collision with root package name */
    public int f30434g;

    /* renamed from: h, reason: collision with root package name */
    public int f30435h;

    /* renamed from: i, reason: collision with root package name */
    public int f30436i;

    /* renamed from: j, reason: collision with root package name */
    public int f30437j;

    /* renamed from: k, reason: collision with root package name */
    public h f30438k;

    /* renamed from: l, reason: collision with root package name */
    public i f30439l;

    /* renamed from: m, reason: collision with root package name */
    public h f30440m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30441n;

    static {
        g gVar = new g(0);
        gVar.f30441n = true;
        f30429o = gVar;
    }

    public g() {
        this(8);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f0.k, java.lang.Object] */
    private final Object writeReplace() {
        if (!this.f30441n) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        ?? obj = new Object();
        obj.f30447a = this;
        return obj;
    }

    public final int b(Object obj) {
        c();
        while (true) {
            int j2 = j(obj);
            int i2 = this.f30433f * 2;
            int length = this.d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[j2];
                if (i4 <= 0) {
                    int i5 = this.f30434g;
                    Object[] objArr = this.f30430a;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f30434g = i6;
                        objArr[i5] = obj;
                        this.f30432c[i5] = j2;
                        iArr[j2] = i6;
                        this.f30437j++;
                        this.f30436i++;
                        if (i3 > this.f30433f) {
                            this.f30433f = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (p0.a.g(this.f30430a[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        k(this.d.length * 2);
                        break;
                    }
                    j2 = j2 == 0 ? this.d.length - 1 : j2 - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f30441n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        w0.f it = new w0.e(0, this.f30434g - 1, 1).iterator();
        while (it.f31411c) {
            int b2 = it.b();
            int[] iArr = this.f30432c;
            int i2 = iArr[b2];
            if (i2 >= 0) {
                this.d[i2] = 0;
                iArr[b2] = -1;
            }
        }
        q.k(0, this.f30434g, this.f30430a);
        Object[] objArr = this.f30431b;
        if (objArr != null) {
            q.k(0, this.f30434g, objArr);
        }
        this.f30437j = 0;
        this.f30434g = 0;
        this.f30436i++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        p0.a.s(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        p0.a.s(entry, "entry");
        int g2 = g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        Object[] objArr = this.f30431b;
        p0.a.p(objArr);
        return p0.a.g(objArr[g2], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f30440m;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f30440m = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f30437j != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f30430a;
        int length = objArr2.length;
        int i3 = this.f30434g;
        int i4 = length - i3;
        int i5 = i3 - this.f30437j;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= objArr2.length / 4) {
            k(this.d.length);
            return;
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr2.length) {
            e0.b bVar = e0.f.Companion;
            int length2 = objArr2.length;
            bVar.getClass();
            int d = e0.b.d(length2, i6);
            Object[] objArr3 = this.f30430a;
            p0.a.s(objArr3, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr3, d);
            p0.a.r(copyOf, "copyOf(...)");
            this.f30430a = copyOf;
            Object[] objArr4 = this.f30431b;
            if (objArr4 != null) {
                objArr = Arrays.copyOf(objArr4, d);
                p0.a.r(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f30431b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f30432c, d);
            p0.a.r(copyOf2, "copyOf(...)");
            this.f30432c = copyOf2;
            if (d < 1) {
                d = 1;
            }
            int highestOneBit = Integer.highestOneBit(d * 3);
            if (highestOneBit > this.d.length) {
                k(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int j2 = j(obj);
        int i2 = this.f30433f;
        while (true) {
            int i3 = this.d[j2];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (p0.a.g(this.f30430a[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            j2 = j2 == 0 ? this.d.length - 1 : j2 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f30431b;
        p0.a.p(objArr);
        return objArr[g2];
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i2 = 0;
        while (dVar.hasNext()) {
            int i3 = dVar.f30427b;
            g gVar = dVar.f30426a;
            if (i3 >= gVar.f30434g) {
                throw new NoSuchElementException();
            }
            dVar.f30427b = i3 + 1;
            dVar.f30428c = i3;
            Object obj = gVar.f30430a[i3];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f30431b;
            p0.a.p(objArr);
            Object obj2 = objArr[dVar.f30428c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        int i2 = this.f30434g;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f30432c[i2] >= 0) {
                Object[] objArr = this.f30431b;
                p0.a.p(objArr);
                if (p0.a.g(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f30437j == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f30435h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        r3[r0] = r7;
        r6.f30432c[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7) {
        /*
            r6 = this;
            int r0 = r6.f30436i
            int r0 = r0 + 1
            r6.f30436i = r0
            int r0 = r6.f30434g
            int r1 = r6.f30437j
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.f30431b
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.f30434g
            if (r1 >= r4) goto L2c
            int[] r4 = r6.f30432c
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.f30430a
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.f30430a
            kotlin.jvm.internal.q.k(r3, r4, r1)
            if (r0 == 0) goto L38
            int r1 = r6.f30434g
            kotlin.jvm.internal.q.k(r3, r1, r0)
        L38:
            r6.f30434g = r3
        L3a:
            int[] r0 = r6.d
            int r1 = r0.length
            if (r7 == r1) goto L4c
            int[] r0 = new int[r7]
            r6.d = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f30435h = r7
            goto L50
        L4c:
            int r7 = r0.length
            java.util.Arrays.fill(r0, r2, r7, r2)
        L50:
            int r7 = r6.f30434g
            if (r2 >= r7) goto L84
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f30430a
            r0 = r0[r2]
            int r0 = r6.j(r0)
            int r1 = r6.f30433f
        L60:
            int[] r3 = r6.d
            r4 = r3[r0]
            if (r4 != 0) goto L6e
            r3[r0] = r7
            int[] r1 = r6.f30432c
            r1[r2] = r0
            r2 = r7
            goto L50
        L6e:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7c
            int r4 = r0 + (-1)
            if (r0 != 0) goto L7a
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L60
        L7a:
            r0 = r4
            goto L60
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f30438k;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f30438k = hVar2;
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x001e->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f30430a
            java.lang.String r1 = "<this>"
            p0.a.s(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f30432c
            r0 = r0[r12]
            int r1 = r11.f30433f
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L28
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f30433f
            r6 = -1
            if (r4 <= r5) goto L35
            int[] r0 = r11.d
            r0[r1] = r2
            goto L66
        L35:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L3e
            r5[r1] = r2
            goto L66
        L3e:
            if (r7 >= 0) goto L45
            r5[r1] = r6
        L42:
            r1 = r0
            r4 = r2
            goto L5f
        L45:
            java.lang.Object[] r5 = r11.f30430a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L5f
            r9[r1] = r7
            int[] r4 = r11.f30432c
            r4[r8] = r1
            goto L42
        L5f:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.d
            r0[r1] = r6
        L66:
            int[] r0 = r11.f30432c
            r0[r12] = r6
            int r12 = r11.f30437j
            int r12 = r12 + r6
            r11.f30437j = r12
            int r12 = r11.f30436i
            int r12 = r12 + 1
            r11.f30436i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int b2 = b(obj);
        Object[] objArr = this.f30431b;
        if (objArr == null) {
            int length = this.f30430a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.f30431b = objArr;
        }
        if (b2 >= 0) {
            objArr[b2] = obj2;
            return null;
        }
        int i2 = (-b2) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        p0.a.s(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int b2 = b(entry.getKey());
            Object[] objArr = this.f30431b;
            if (objArr == null) {
                int length = this.f30430a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.f30431b = objArr;
            }
            if (b2 >= 0) {
                objArr[b2] = entry.getValue();
            } else {
                int i2 = (-b2) - 1;
                if (!p0.a.g(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g2 = g(obj);
        if (g2 < 0) {
            g2 = -1;
        } else {
            l(g2);
        }
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f30431b;
        p0.a.p(objArr);
        Object obj2 = objArr[g2];
        objArr[g2] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30437j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f30437j * 3) + 2);
        sb.append("{");
        int i2 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = dVar.f30427b;
            g gVar = dVar.f30426a;
            if (i3 >= gVar.f30434g) {
                throw new NoSuchElementException();
            }
            dVar.f30427b = i3 + 1;
            dVar.f30428c = i3;
            Object obj = gVar.f30430a[i3];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object[] objArr = gVar.f30431b;
            p0.a.p(objArr);
            Object obj2 = objArr[dVar.f30428c];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f30439l;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f30439l = iVar2;
        return iVar2;
    }

    public g(int i2) {
        if (i2 >= 0) {
            Object[] objArr = new Object[i2];
            int[] iArr = new int[i2];
            int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
            this.f30430a = objArr;
            this.f30431b = null;
            this.f30432c = iArr;
            this.d = new int[highestOneBit];
            this.f30433f = 2;
            this.f30434g = 0;
            this.f30435h = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
