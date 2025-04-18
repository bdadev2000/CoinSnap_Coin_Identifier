package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class c0 extends AbstractMap implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f11913l = new Object();

    /* renamed from: b, reason: collision with root package name */
    public transient Object f11914b;

    /* renamed from: c, reason: collision with root package name */
    public transient int[] f11915c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f11916d;

    /* renamed from: f, reason: collision with root package name */
    public transient Object[] f11917f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f11918g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f11919h;

    /* renamed from: i, reason: collision with root package name */
    public transient y f11920i;

    /* renamed from: j, reason: collision with root package name */
    public transient y f11921j;

    /* renamed from: k, reason: collision with root package name */
    public transient b0 f11922k;

    public c0() {
        c(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            c(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a4.j.c(25, "Invalid size: ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator xVar;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map a = a();
        if (a != null) {
            xVar = a.entrySet().iterator();
        } else {
            xVar = new x(this, 1);
        }
        while (xVar.hasNext()) {
            Map.Entry entry = (Map.Entry) xVar.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map a() {
        Object obj = this.f11914b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int b(Object obj) {
        if (f()) {
            return -1;
        }
        int L = a6.k.L(obj);
        int i10 = (1 << (this.f11918g & 31)) - 1;
        Object obj2 = this.f11914b;
        Objects.requireNonNull(obj2);
        int A = c6.k.A(L & i10, obj2);
        if (A == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = L & i11;
        do {
            int i13 = A - 1;
            int i14 = h()[i13];
            if ((i14 & i11) == i12 && v8.u0.t(obj, d(i13))) {
                return i13;
            }
            A = i14 & i10;
        } while (A != 0);
        return -1;
    }

    public final void c(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11918g = c6.c.c(i10, 1);
            return;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f11918g += 32;
        Map a = a();
        if (a != null) {
            this.f11918g = c6.c.c(size(), 3);
            a.clear();
            this.f11914b = null;
            this.f11919h = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f11919h, (Object) null);
        Arrays.fill(j(), 0, this.f11919h, (Object) null);
        Object obj = this.f11914b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f11919h, 0);
        this.f11919h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsKey(obj);
        }
        if (b(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f11919h; i10++) {
            if (v8.u0.t(obj, l(i10))) {
                return true;
            }
        }
        return false;
    }

    public final Object d(int i10) {
        return i()[i10];
    }

    public final void e(int i10, int i11) {
        Object obj = this.f11914b;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        Object[] i12 = i();
        Object[] j3 = j();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = i12[size];
            i12[i10] = obj2;
            j3[i10] = j3[size];
            i12[size] = null;
            j3[size] = null;
            h10[i10] = h10[size];
            h10[size] = 0;
            int L = a6.k.L(obj2) & i11;
            int A = c6.k.A(L, obj);
            int i13 = size + 1;
            if (A == i13) {
                c6.k.B(L, i10 + 1, obj);
                return;
            }
            while (true) {
                int i14 = A - 1;
                int i15 = h10[i14];
                int i16 = i15 & i11;
                if (i16 == i13) {
                    h10[i14] = ((i10 + 1) & i11) | (i15 & (~i11));
                    return;
                }
                A = i16;
            }
        } else {
            i12[i10] = null;
            j3[i10] = null;
            h10[i10] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        y yVar = this.f11921j;
        if (yVar == null) {
            y yVar2 = new y(this, 0);
            this.f11921j = yVar2;
            return yVar2;
        }
        return yVar;
    }

    public final boolean f() {
        return this.f11914b == null;
    }

    public final Object g(Object obj) {
        boolean f10 = f();
        Object obj2 = f11913l;
        if (f10) {
            return obj2;
        }
        int i10 = (1 << (this.f11918g & 31)) - 1;
        Object obj3 = this.f11914b;
        Objects.requireNonNull(obj3);
        int u = c6.k.u(obj, null, i10, obj3, h(), i(), null);
        if (u == -1) {
            return obj2;
        }
        Object l10 = l(u);
        e(u, i10);
        this.f11919h--;
        this.f11918g += 32;
        return l10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a = a();
        if (a != null) {
            return a.get(obj);
        }
        int b3 = b(obj);
        if (b3 == -1) {
            return null;
        }
        return l(b3);
    }

    public final int[] h() {
        int[] iArr = this.f11915c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f11916d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f11917f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object j3 = c6.k.j(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            c6.k.B(i12 & i14, i13 + 1, j3);
        }
        Object obj = this.f11914b;
        Objects.requireNonNull(obj);
        int[] h10 = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int A = c6.k.A(i15, obj);
            while (A != 0) {
                int i16 = A - 1;
                int i17 = h10[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int A2 = c6.k.A(i19, j3);
                c6.k.B(i19, A, j3);
                h10[i16] = ((~i14) & i18) | (A2 & i14);
                A = i17 & i10;
            }
        }
        this.f11914b = j3;
        this.f11918g = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f11918g & (-32));
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        y yVar = this.f11920i;
        if (yVar == null) {
            y yVar2 = new y(this, 1);
            this.f11920i = yVar2;
            return yVar2;
        }
        return yVar;
    }

    public final Object l(int i10) {
        return j()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11;
        if (f()) {
            v8.u0.n("Arrays already allocated", f());
            int i12 = this.f11918g;
            int max = Math.max(i12 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d))) {
                int i13 = highestOneBit << 1;
                if (i13 <= 0) {
                    i13 = 1073741824;
                }
                highestOneBit = i13;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f11914b = c6.k.j(max2);
            this.f11918g = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f11918g & (-32));
            this.f11915c = new int[i12];
            this.f11916d = new Object[i12];
            this.f11917f = new Object[i12];
        }
        Map a = a();
        if (a != null) {
            return a.put(obj, obj2);
        }
        int[] h10 = h();
        Object[] i14 = i();
        Object[] j3 = j();
        int i15 = this.f11919h;
        int i16 = i15 + 1;
        int L = a6.k.L(obj);
        int i17 = (1 << (this.f11918g & 31)) - 1;
        int i18 = L & i17;
        Object obj3 = this.f11914b;
        Objects.requireNonNull(obj3);
        int A = c6.k.A(i18, obj3);
        int i19 = 0;
        if (A == 0) {
            if (i16 > i17) {
                if (i17 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i17 = k(i17, (i17 + 1) * i11, L, i15);
            } else {
                Object obj4 = this.f11914b;
                Objects.requireNonNull(obj4);
                c6.k.B(i18, i16, obj4);
            }
        } else {
            int i20 = ~i17;
            int i21 = L & i20;
            int i22 = 0;
            while (true) {
                int i23 = A - 1;
                int i24 = h10[i23];
                int i25 = i24 & i20;
                if (i25 == i21 && v8.u0.t(obj, i14[i23])) {
                    Object obj5 = j3[i23];
                    j3[i23] = obj2;
                    return obj5;
                }
                int i26 = i24 & i17;
                int i27 = i21;
                int i28 = i22 + 1;
                if (i26 == 0) {
                    if (i28 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.f11918g & 31)) - 1) + 1, 1.0f);
                        if (isEmpty()) {
                            i19 = -1;
                        }
                        int i29 = i19;
                        while (i29 >= 0) {
                            linkedHashMap.put(d(i29), l(i29));
                            i29++;
                            if (i29 >= this.f11919h) {
                                i29 = -1;
                            }
                        }
                        this.f11914b = linkedHashMap;
                        this.f11915c = null;
                        this.f11916d = null;
                        this.f11917f = null;
                        this.f11918g += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i16 > i17) {
                        if (i17 < 32) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        i17 = k(i17, (i17 + 1) * i10, L, i15);
                    } else {
                        h10[i23] = (i16 & i17) | i25;
                    }
                } else {
                    A = i26;
                    i22 = i28;
                    i21 = i27;
                }
            }
        }
        int length = h().length;
        if (i16 > length && (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f11915c = Arrays.copyOf(h(), min);
            this.f11916d = Arrays.copyOf(i(), min);
            this.f11917f = Arrays.copyOf(j(), min);
        }
        h()[i15] = ((~i17) & L) | (i17 & 0);
        i()[i15] = obj;
        j()[i15] = obj2;
        this.f11919h = i16;
        this.f11918g += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a = a();
        if (a != null) {
            return a.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f11913l) {
            return null;
        }
        return g10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a = a();
        if (a != null) {
            return a.size();
        }
        return this.f11919h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b0 b0Var = this.f11922k;
        if (b0Var == null) {
            b0 b0Var2 = new b0(this);
            this.f11922k = b0Var2;
            return b0Var2;
        }
        return b0Var;
    }

    public c0(int i10) {
        c(i10);
    }
}
