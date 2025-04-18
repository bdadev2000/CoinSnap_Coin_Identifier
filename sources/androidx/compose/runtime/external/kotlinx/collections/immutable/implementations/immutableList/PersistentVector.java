package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.Arrays;
import java.util.ListIterator;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14171a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14173c;
    public final int d;

    public PersistentVector(Object[] objArr, int i2, int i3, Object[] objArr2) {
        this.f14171a = objArr;
        this.f14172b = objArr2;
        this.f14173c = i2;
        this.d = i3;
        if (size() > 32) {
            size();
            size();
            int length = objArr2.length;
        } else {
            PreconditionsKt.a("Trie-based persistent vector should have at least 33 elements, got " + size());
            throw null;
        }
    }

    public static Object[] c(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object[] copyOf;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            if (a2 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                a.r(copyOf, "copyOf(this, newSize)");
            }
            q.P(a2 + 1, a2, objArr, 31, copyOf);
            objectRef.f14170a = objArr[31];
            copyOf[a2] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        a.r(copyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        Object obj2 = objArr[a2];
        a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a2] = c((Object[]) obj2, i4, i3, obj, objectRef);
        while (true) {
            a2++;
            if (a2 >= 32 || copyOf2[a2] == null) {
                break;
            }
            Object obj3 = objArr[a2];
            a.q(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[a2] = c((Object[]) obj3, i4, 0, objectRef.f14170a, objectRef);
        }
        return copyOf2;
    }

    public static Object[] e(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] e;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 5) {
            objectRef.f14170a = objArr[a2];
            e = null;
        } else {
            Object obj = objArr[a2];
            a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            e = e((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (e == null && a2 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        a.r(copyOf, "copyOf(this, newSize)");
        copyOf[a2] = e;
        return copyOf;
    }

    public static Object[] m(int i2, int i3, Object obj, Object[] objArr) {
        int a2 = UtilsKt.a(i3, i2);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        a.r(copyOf, "copyOf(this, newSize)");
        if (i2 == 0) {
            copyOf[a2] = obj;
        } else {
            Object obj2 = copyOf[a2];
            a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a2] = m(i2 - 5, i3, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(Object obj) {
        int size = size() - l();
        Object[] objArr = this.f14171a;
        Object[] objArr2 = this.f14172b;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            a.r(copyOf, "copyOf(this, newSize)");
            copyOf[size] = obj;
            return new PersistentVector(objArr, size() + 1, this.d, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return f(objArr, objArr2, objArr3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, this.f14171a, this.f14172b, this.d);
    }

    public final PersistentVector d(Object obj, Object[] objArr, int i2) {
        int size = size() - l();
        Object[] objArr2 = this.f14172b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        a.r(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            q.P(i2 + 1, i2, objArr2, size, copyOf);
            copyOf[i2] = obj;
            return new PersistentVector(objArr, size() + 1, this.d, copyOf);
        }
        Object obj2 = objArr2[31];
        q.P(i2 + 1, i2, objArr2, size - 1, copyOf);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return f(objArr, copyOf, objArr3);
    }

    public final PersistentVector f(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.d;
        if (size <= (1 << i2)) {
            return new PersistentVector(g(i2, objArr, objArr2), size() + 1, i2, objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i3 = i2 + 5;
        return new PersistentVector(g(i3, objArr4, objArr2), size() + 1, i3, objArr3);
    }

    public final Object[] g(int i2, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int a2 = UtilsKt.a(size() - 1, i2);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            a.r(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i2 == 5) {
            objArr3[a2] = objArr2;
        } else {
            objArr3[a2] = g(i2 - 5, (Object[]) objArr3[a2], objArr2);
        }
        return objArr3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        ListImplementation.a(i2, size());
        if (l() <= i2) {
            objArr = this.f14172b;
        } else {
            objArr = this.f14171a;
            for (int i3 = this.d; i3 > 0; i3 -= 5) {
                Object obj = objArr[UtilsKt.a(i2, i3)];
                a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14173c;
    }

    public final Object[] j(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] copyOf;
        int a2 = UtilsKt.a(i3, i2);
        if (i2 == 0) {
            if (a2 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                a.r(copyOf, "copyOf(this, newSize)");
            }
            q.P(a2, a2 + 1, objArr, 32, copyOf);
            copyOf[31] = objectRef.f14170a;
            objectRef.f14170a = objArr[a2];
            return copyOf;
        }
        int a3 = objArr[31] == null ? UtilsKt.a(l() - 1, i2) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        a.r(copyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        int i5 = a2 + 1;
        if (i5 <= a3) {
            while (true) {
                Object obj = copyOf2[a3];
                a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a3] = j((Object[]) obj, i4, 0, objectRef);
                if (a3 == i5) {
                    break;
                }
                a3--;
            }
        }
        Object obj2 = copyOf2[a2];
        a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a2] = j((Object[]) obj2, i4, i3, objectRef);
        return copyOf2;
    }

    public final AbstractPersistentList k(Object[] objArr, int i2, int i3, int i4) {
        PersistentVector persistentVector;
        int size = size() - i2;
        if (size != 1) {
            Object[] objArr2 = this.f14172b;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            a.r(copyOf, "copyOf(this, newSize)");
            int i5 = size - 1;
            if (i4 < i5) {
                q.P(i4, i4 + 1, objArr2, size, copyOf);
            }
            copyOf[i5] = null;
            return new PersistentVector(objArr, (i2 + size) - 1, i3, copyOf);
        }
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                a.r(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] e = e(objArr, i3, i2 - 1, objectRef);
        a.p(e);
        Object obj = objectRef.f14170a;
        a.q(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (e[1] == null) {
            Object obj2 = e[0];
            a.q(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            persistentVector = new PersistentVector((Object[]) obj2, i2, i3 - 5, objArr3);
        } else {
            persistentVector = new PersistentVector(e, i2, i3, objArr3);
        }
        return persistentVector;
    }

    public final int l() {
        return (size() - 1) & (-32);
    }

    @Override // e0.f, java.util.List
    public final ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new PersistentVectorIterator(i2, size(), this.f14171a, (this.d / 5) + 1, this.f14172b);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList n(int i2) {
        ListImplementation.a(i2, size());
        int l2 = l();
        Object[] objArr = this.f14171a;
        int i3 = this.d;
        return i2 >= l2 ? k(objArr, l2, i3, i2 - l2) : k(j(objArr, i3, i2, new ObjectRef(this.f14172b[0])), l2, i3, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList o(l lVar) {
        PersistentVectorBuilder builder = builder();
        builder.K(lVar);
        return builder.d();
    }

    @Override // e0.f, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        int l2 = l();
        Object[] objArr = this.f14171a;
        Object[] objArr2 = this.f14172b;
        int i3 = this.d;
        if (l2 > i2) {
            return new PersistentVector(m(i3, i2, obj, objArr), size(), i3, objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        a.r(copyOf, "copyOf(this, newSize)");
        copyOf[i2 & 31] = obj;
        return new PersistentVector(objArr, size(), i3, copyOf);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(int i2, Object obj) {
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            return add(obj);
        }
        int l2 = l();
        Object[] objArr = this.f14171a;
        if (i2 >= l2) {
            return d(obj, objArr, i2 - l2);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return d(objectRef.f14170a, c(objArr, this.d, i2, obj, objectRef), 0);
    }
}
