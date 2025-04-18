package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e;
import p0.a;
import r0.f;

/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1 implements Set<Map.Entry<Object, Object>>, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1488a = null;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a.s((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        a.s(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1488a.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!e.s(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        a.s(entry, "element");
        return a.g(this.f1488a.c(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        a.s(collection, "elements");
        Collection<Map.Entry> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection2) {
            if (!a.g(this.f1488a.c(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1488a.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.f1488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            boolean r0 = kotlin.jvm.internal.e.s(r19)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r19
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r2 = "element"
            p0.a.s(r0, r2)
            java.lang.Object r2 = r0.getKey()
            if (r2 == 0) goto L1c
            int r3 = r2.hashCode()
            goto L1d
        L1c:
            r3 = r1
        L1d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            r5 = r18
            androidx.collection.MutableScatterMap r6 = r5.f1488a
            int r7 = r6.d
            int r3 = r3 >>> 7
            r3 = r3 & r7
            r8 = r1
        L30:
            long[] r9 = r6.f1557a
            int r10 = r3 >> 3
            r11 = r3 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L5c:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L7c
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r3
            r15 = r15 & r7
            java.lang.Object[] r1 = r6.f1558b
            r1 = r1[r15]
            boolean r1 = p0.a.g(r1, r2)
            if (r1 == 0) goto L75
            goto L86
        L75:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r1 = 0
            goto L5c
        L7c:
            long r11 = ~r9
            r1 = 6
            long r11 = r11 << r1
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r1 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r1 == 0) goto L9d
            r15 = -1
        L86:
            if (r15 < 0) goto L9b
            java.lang.Object[] r1 = r6.f1559c
            r1 = r1[r15]
            java.lang.Object r0 = r0.getValue()
            boolean r0 = p0.a.g(r1, r0)
            if (r0 == 0) goto L9b
            r6.j(r15)
            r1 = 1
            goto L9c
        L9b:
            r1 = 0
        L9c:
            return r1
        L9d:
            int r8 = r8 + 8
            int r3 = r3 + r8
            r3 = r3 & r7
            r1 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean z2;
        int i2;
        a.s(collection, "elements");
        MutableScatterMap mutableScatterMap = this.f1488a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (a.g(entry.getKey(), mutableScatterMap.f1558b[i7]) && a.g(entry.getValue(), mutableScatterMap.f1559c[i7])) {
                                    mutableScatterMap.j(i7);
                                    z3 = true;
                                    break;
                                }
                            }
                            i2 = 8;
                        } else {
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                    }
                    if (i5 != i4) {
                        return z3;
                    }
                }
                if (i3 == length) {
                    z2 = z3;
                    break;
                }
                i3++;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z2;
        int i2;
        a.s(collection, "elements");
        MutableScatterMap mutableScatterMap = this.f1488a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mutableScatterMap.j(i7);
                                    z3 = true;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (a.g(entry.getKey(), mutableScatterMap.f1558b[i7]) && a.g(entry.getValue(), mutableScatterMap.f1559c[i7])) {
                                    break;
                                }
                            }
                            i2 = 8;
                        } else {
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                    }
                    if (i5 != i4) {
                        return z3;
                    }
                }
                if (i3 == length) {
                    z2 = z3;
                    break;
                }
                i3++;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1488a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        a.s(objArr, "array");
        return e.D(this, objArr);
    }
}
