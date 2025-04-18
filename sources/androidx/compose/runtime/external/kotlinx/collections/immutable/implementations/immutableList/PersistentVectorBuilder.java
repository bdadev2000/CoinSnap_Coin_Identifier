package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.c;
import e0.i;
import e0.q;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.e;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentVectorBuilder<E> extends i implements PersistentList.Builder<E> {

    /* renamed from: a, reason: collision with root package name */
    public PersistentList f14174a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14175b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f14176c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public MutabilityOwnership f14177f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public Object[] f14178g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f14179h;

    /* renamed from: i, reason: collision with root package name */
    public int f14180i;

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
    public PersistentVectorBuilder(PersistentList persistentList, Object[] objArr, Object[] objArr2, int i2) {
        this.f14174a = persistentList;
        this.f14175b = objArr;
        this.f14176c = objArr2;
        this.d = i2;
        this.f14178g = objArr;
        this.f14179h = objArr2;
        this.f14180i = persistentList.size();
    }

    public static void e(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    public final Object[] A(Object[] objArr, int i2, int i3, Iterator it) {
        if (!it.hasNext()) {
            PreconditionsKt.a("invalid buffersIterator");
            throw null;
        }
        if (!(i3 >= 0)) {
            PreconditionsKt.a("negative shift");
            throw null;
        }
        if (i3 == 0) {
            return (Object[]) it.next();
        }
        Object[] p2 = p(objArr);
        int a2 = UtilsKt.a(i2, i3);
        int i4 = i3 - 5;
        p2[a2] = A((Object[]) p2[a2], i2, i4, it);
        while (true) {
            a2++;
            if (a2 >= 32 || !it.hasNext()) {
                break;
            }
            p2[a2] = A((Object[]) p2[a2], 0, i4, it);
        }
        return p2;
    }

    public final Object[] B(Object[] objArr, int i2, Object[][] objArr2) {
        c t2 = e.t(objArr2);
        int i3 = i2 >> 5;
        int i4 = this.d;
        Object[] A = i3 < (1 << i4) ? A(objArr, i2, i4, t2) : p(objArr);
        while (t2.hasNext()) {
            this.d += 5;
            A = t(A);
            int i5 = this.d;
            A(A, 1 << i5, i5, t2);
        }
        return A;
    }

    public final void C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f14180i;
        int i3 = i2 >> 5;
        int i4 = this.d;
        if (i3 > (1 << i4)) {
            this.f14178g = G(this.d + 5, t(objArr), objArr2);
            this.f14179h = objArr3;
            this.d += 5;
            this.f14180i++;
            return;
        }
        if (objArr == null) {
            this.f14178g = objArr2;
            this.f14179h = objArr3;
            this.f14180i = i2 + 1;
        } else {
            this.f14178g = G(i4, objArr, objArr2);
            this.f14179h = objArr3;
            this.f14180i++;
        }
    }

    public final Object[] G(int i2, Object[] objArr, Object[] objArr2) {
        int a2 = UtilsKt.a(b() - 1, i2);
        Object[] p2 = p(objArr);
        if (i2 == 5) {
            p2[a2] = objArr2;
        } else {
            p2[a2] = G(i2 - 5, (Object[]) p2[a2], objArr2);
        }
        return p2;
    }

    public final int H(l lVar, Object[] objArr, int i2, int i3, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = objectRef.f14170a;
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj2 = objArr[i4];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i3 == 32) {
                    objArr3 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i3 = 0;
                }
                objArr3[i3] = obj2;
                i3++;
            }
        }
        objectRef.f14170a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i3;
    }

    public final int I(l lVar, Object[] objArr, int i2, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i3 = i2;
        boolean z2 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = p(objArr);
                    z2 = true;
                    i3 = i4;
                }
            } else if (z2) {
                objArr2[i3] = obj;
                i3++;
            }
        }
        objectRef.f14170a = objArr2;
        return i3;
    }

    public final int J(l lVar, int i2, ObjectRef objectRef) {
        int I = I(lVar, this.f14179h, i2, objectRef);
        if (I == i2) {
            return i2;
        }
        Object obj = objectRef.f14170a;
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, I, i2, (Object) null);
        this.f14179h = objArr;
        this.f14180i -= i2 - I;
        return I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0 != r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (J(r19, r10, r11) != r10) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(q0.l r19) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.K(q0.l):boolean");
    }

    public final Object[] L(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            Object obj = objArr[a2];
            Object[] p2 = p(objArr);
            q.P(a2, a2 + 1, objArr, 32, p2);
            p2[31] = objectRef.f14170a;
            objectRef.f14170a = obj;
            return p2;
        }
        int a3 = objArr[31] == null ? UtilsKt.a(N() - 1, i2) : 31;
        Object[] p3 = p(objArr);
        int i4 = i2 - 5;
        int i5 = a2 + 1;
        if (i5 <= a3) {
            while (true) {
                Object obj2 = p3[a3];
                a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                p3[a3] = L((Object[]) obj2, i4, 0, objectRef);
                if (a3 == i5) {
                    break;
                }
                a3--;
            }
        }
        Object obj3 = p3[a2];
        a.q(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p3[a2] = L((Object[]) obj3, i4, i3, objectRef);
        return p3;
    }

    public final Object M(Object[] objArr, int i2, int i3, int i4) {
        int i5 = this.f14180i - i2;
        if (i5 == 1) {
            Object obj = this.f14179h[0];
            z(i2, i3, objArr);
            return obj;
        }
        Object[] objArr2 = this.f14179h;
        Object obj2 = objArr2[i4];
        Object[] p2 = p(objArr2);
        q.P(i4, i4 + 1, objArr2, i5, p2);
        p2[i5 - 1] = null;
        this.f14178g = objArr;
        this.f14179h = p2;
        this.f14180i = (i2 + i5) - 1;
        this.d = i3;
        return obj2;
    }

    public final int N() {
        int i2 = this.f14180i;
        if (i2 <= 32) {
            return 0;
        }
        return (i2 - 1) & (-32);
    }

    public final Object[] O(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        int a2 = UtilsKt.a(i3, i2);
        Object[] p2 = p(objArr);
        if (i2 != 0) {
            Object obj2 = p2[a2];
            a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p2[a2] = O((Object[]) obj2, i2 - 5, i3, obj, objectRef);
            return p2;
        }
        if (p2 != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.f14170a = p2[a2];
        p2[a2] = obj;
        return p2;
    }

    public final void P(Collection collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] r2;
        if (i4 < 1) {
            PreconditionsKt.a("requires at least one nullBuffer");
            throw null;
        }
        Object[] p2 = p(objArr);
        objArr2[0] = p2;
        int i5 = i2 & 31;
        int size = ((collection.size() + i2) - 1) & 31;
        int i6 = (i3 - i5) + size;
        if (i6 < 32) {
            q.P(size + 1, i5, p2, i3, objArr3);
        } else {
            int i7 = i6 - 31;
            if (i4 == 1) {
                r2 = p2;
            } else {
                r2 = r();
                i4--;
                objArr2[i4] = r2;
            }
            int i8 = i3 - i7;
            q.P(0, i8, p2, i3, objArr3);
            q.P(size + 1, i5, p2, i8, r2);
            objArr3 = r2;
        }
        Iterator<E> it = collection.iterator();
        e(p2, i5, it);
        for (int i9 = 1; i9 < i4; i9++) {
            Object[] r3 = r();
            e(r3, 0, it);
            objArr2[i9] = r3;
        }
        e(objArr3, 0, it);
    }

    public final int Q() {
        int i2 = this.f14180i;
        return i2 <= 32 ? i2 : i2 - ((i2 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        ListImplementation.b(i2, b());
        if (i2 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int N = N();
        if (i2 >= N) {
            k(obj, this.f14178g, i2 - N);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f14178g;
        a.p(objArr);
        k(objectRef.f14170a, j(objArr, this.d, i2, obj, objectRef), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int Q = Q();
        Iterator<E> it = collection.iterator();
        if (32 - Q >= collection.size()) {
            Object[] p2 = p(this.f14179h);
            e(p2, Q, it);
            this.f14179h = p2;
            this.f14180i = collection.size() + this.f14180i;
        } else {
            int size = ((collection.size() + Q) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] p3 = p(this.f14179h);
            e(p3, Q, it);
            objArr[0] = p3;
            for (int i2 = 1; i2 < size; i2++) {
                Object[] r2 = r();
                e(r2, 0, it);
                objArr[i2] = r2;
            }
            this.f14178g = B(this.f14178g, N(), objArr);
            Object[] r3 = r();
            e(r3, 0, it);
            this.f14179h = r3;
            this.f14180i = collection.size() + this.f14180i;
        }
        return true;
    }

    @Override // e0.i
    public final int b() {
        return this.f14180i;
    }

    @Override // e0.i
    public final Object c(int i2) {
        ListImplementation.a(i2, b());
        ((AbstractList) this).modCount++;
        int N = N();
        if (i2 >= N) {
            return M(this.f14178g, N, this.d, i2 - N);
        }
        ObjectRef objectRef = new ObjectRef(this.f14179h[0]);
        Object[] objArr = this.f14178g;
        a.p(objArr);
        M(L(objArr, this.d, i2, objectRef), N, this.d, 0);
        return objectRef.f14170a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
    public final PersistentList d() {
        PersistentList persistentVector;
        Object[] objArr = this.f14178g;
        if (objArr == this.f14175b && this.f14179h == this.f14176c) {
            persistentVector = this.f14174a;
        } else {
            this.f14177f = new Object();
            this.f14175b = objArr;
            Object[] objArr2 = this.f14179h;
            this.f14176c = objArr2;
            if (objArr != null) {
                a.p(objArr);
                persistentVector = new PersistentVector(objArr, b(), this.d, this.f14179h);
            } else if (objArr2.length == 0) {
                persistentVector = SmallPersistentVector.f14187b;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f14179h, b());
                a.r(copyOf, "copyOf(this, newSize)");
                persistentVector = new SmallPersistentVector(copyOf);
            }
        }
        this.f14174a = persistentVector;
        return persistentVector;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.f14178g == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i5 = i2 >> 5;
        AbstractListIterator m2 = m(N() >> 5);
        int i6 = i4;
        Object[] objArr3 = objArr2;
        while (m2.previousIndex() != i5) {
            Object[] objArr4 = (Object[]) m2.previous();
            q.P(0, 32 - i3, objArr4, 32, objArr3);
            objArr3 = q(i3, objArr4);
            i6--;
            objArr[i6] = objArr3;
        }
        Object[] objArr5 = (Object[]) m2.previous();
        int N = i4 - (((N() >> 5) - 1) - i5);
        if (N < i4) {
            objArr2 = objArr[N];
            a.p(objArr2);
        }
        P(collection, i2, objArr5, 32, objArr, N, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        ListImplementation.a(i2, b());
        if (N() <= i2) {
            objArr = this.f14179h;
        } else {
            objArr = this.f14178g;
            a.p(objArr);
            for (int i3 = this.d; i3 > 0; i3 -= 5) {
                Object obj = objArr[UtilsKt.a(i2, i3)];
                a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            objectRef.f14170a = objArr[31];
            Object[] p2 = p(objArr);
            q.P(a2 + 1, a2, objArr, 31, p2);
            p2[a2] = obj;
            return p2;
        }
        Object[] p3 = p(objArr);
        int i4 = i2 - 5;
        Object obj3 = p3[a2];
        a.q(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p3[a2] = j((Object[]) obj3, i4, i3, obj, objectRef);
        while (true) {
            a2++;
            if (a2 >= 32 || (obj2 = p3[a2]) == null) {
                break;
            }
            p3[a2] = j((Object[]) obj2, i4, 0, objectRef.f14170a, objectRef);
        }
        return p3;
    }

    public final void k(Object obj, Object[] objArr, int i2) {
        int Q = Q();
        Object[] p2 = p(this.f14179h);
        if (Q >= 32) {
            Object[] objArr2 = this.f14179h;
            Object obj2 = objArr2[31];
            q.P(i2 + 1, i2, objArr2, 31, p2);
            p2[i2] = obj;
            C(objArr, p2, t(obj2));
            return;
        }
        q.P(i2 + 1, i2, this.f14179h, Q, p2);
        p2[i2] = obj;
        this.f14178g = objArr;
        this.f14179h = p2;
        this.f14180i++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f14177f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        ListImplementation.b(i2, b());
        return new PersistentVectorMutableIterator(this, i2);
    }

    public final AbstractListIterator m(int i2) {
        Object[] objArr = this.f14178g;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int N = N() >> 5;
        ListImplementation.b(i2, N);
        int i3 = this.d;
        return i3 == 0 ? new SingleElementListIterator(objArr, i2) : new TrieIterator(objArr, i2, N, i3 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] r2 = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        q.T(objArr, r2, 0, length, 6);
        return r2;
    }

    public final Object[] q(int i2, Object[] objArr) {
        if (l(objArr)) {
            q.P(i2, 0, objArr, 32 - i2, objArr);
            return objArr;
        }
        Object[] r2 = r();
        q.P(i2, 0, objArr, 32 - i2, r2);
        return r2;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f14177f;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return K(new PersistentVectorBuilder$removeAll$1(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        ListImplementation.a(i2, b());
        if (N() > i2) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.f14178g;
            a.p(objArr);
            this.f14178g = O(objArr, this.d, i2, obj, objectRef);
            return objectRef.f14170a;
        }
        Object[] p2 = p(this.f14179h);
        if (p2 != this.f14179h) {
            ((AbstractList) this).modCount++;
        }
        int i3 = i2 & 31;
        Object obj2 = p2[i3];
        p2[i3] = obj;
        this.f14179h = p2;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f14177f;
        return objArr;
    }

    public final Object[] w(int i2, int i3, Object[] objArr) {
        if (!(i3 >= 0)) {
            PreconditionsKt.a("shift should be positive");
            throw null;
        }
        if (i3 == 0) {
            return objArr;
        }
        int a2 = UtilsKt.a(i2, i3);
        Object obj = objArr[a2];
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object w = w(i2, i3 - 5, (Object[]) obj);
        if (a2 < 31) {
            int i4 = a2 + 1;
            if (objArr[i4] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] r2 = r();
                q.P(0, 0, objArr, i4, r2);
                objArr = r2;
            }
        }
        if (w == objArr[a2]) {
            return objArr;
        }
        Object[] p2 = p(objArr);
        p2[a2] = w;
        return p2;
    }

    public final Object[] x(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] x;
        int a2 = UtilsKt.a(i3 - 1, i2);
        if (i2 == 5) {
            objectRef.f14170a = objArr[a2];
            x = null;
        } else {
            Object obj = objArr[a2];
            a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            x = x((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (x == null && a2 == 0) {
            return null;
        }
        Object[] p2 = p(objArr);
        p2[a2] = x;
        return p2;
    }

    public final void z(int i2, int i3, Object[] objArr) {
        if (i3 == 0) {
            this.f14178g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f14179h = objArr;
            this.f14180i = i2;
            this.d = i3;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        a.p(objArr);
        Object[] x = x(objArr, i3, i2, objectRef);
        a.p(x);
        Object obj = objectRef.f14170a;
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f14179h = (Object[]) obj;
        this.f14180i = i2;
        if (x[1] == null) {
            this.f14178g = (Object[]) x[0];
            this.d = i3 - 5;
        } else {
            this.f14178g = x;
            this.d = i3;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int Q = Q();
        if (Q < 32) {
            Object[] p2 = p(this.f14179h);
            p2[Q] = obj;
            this.f14179h = p2;
            this.f14180i = b() + 1;
        } else {
            C(this.f14178g, this.f14179h, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        Object[] r2;
        ListImplementation.b(i2, this.f14180i);
        if (i2 == this.f14180i) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = ((collection.size() + (this.f14180i - i3)) - 1) / 32;
        if (size == 0) {
            int i4 = i2 & 31;
            int size2 = ((collection.size() + i2) - 1) & 31;
            Object[] objArr = this.f14179h;
            Object[] p2 = p(objArr);
            q.P(size2 + 1, i4, objArr, Q(), p2);
            e(p2, i4, collection.iterator());
            this.f14179h = p2;
            this.f14180i = collection.size() + this.f14180i;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int Q = Q();
        int size3 = collection.size() + this.f14180i;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i2 >= N()) {
            r2 = r();
            P(collection, i2, this.f14179h, Q, objArr2, size, r2);
        } else if (size3 > Q) {
            int i5 = size3 - Q;
            r2 = q(i5, this.f14179h);
            g(collection, i2, i5, objArr2, size, r2);
        } else {
            Object[] objArr3 = this.f14179h;
            r2 = r();
            int i6 = Q - size3;
            q.P(0, i6, objArr3, Q, r2);
            int i7 = 32 - i6;
            Object[] q2 = q(i7, this.f14179h);
            int i8 = size - 1;
            objArr2[i8] = q2;
            g(collection, i2, i7, objArr2, i8, q2);
        }
        this.f14178g = B(this.f14178g, i3, objArr2);
        this.f14179h = r2;
        this.f14180i = collection.size() + this.f14180i;
        return true;
    }
}
