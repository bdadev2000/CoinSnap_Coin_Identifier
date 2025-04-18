package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    /* renamed from: b, reason: collision with root package name */
    public static final SmallPersistentVector f14187b = new SmallPersistentVector(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14188a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public SmallPersistentVector(Object[] objArr) {
        this.f14188a = objArr;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(Object obj) {
        int size = size();
        Object[] objArr = this.f14188a;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
            a.r(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = obj;
            return new SmallPersistentVector(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PersistentVector(objArr, size() + 1, 0, objArr2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList addAll(Collection collection) {
        if (collection.size() + size() > 32) {
            PersistentVectorBuilder builder = builder();
            builder.addAll(collection);
            return builder.d();
        }
        Object[] copyOf = Arrays.copyOf(this.f14188a, collection.size() + size());
        a.r(copyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, null, this.f14188a, 0);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        ListImplementation.a(i2, size());
        return this.f14188a[i2];
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14188a.length;
    }

    @Override // e0.f, java.util.List
    public final int indexOf(Object obj) {
        return q.d0(this.f14188a, obj);
    }

    @Override // e0.f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f14188a;
        a.s(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i3 = length2 - 1;
                if (a.g(obj, objArr[length2])) {
                    return length2;
                }
                if (i3 < 0) {
                    return -1;
                }
                length2 = i3;
            }
        }
    }

    @Override // e0.f, java.util.List
    public final ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new BufferIterator(this.f14188a, i2, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList n(int i2) {
        ListImplementation.a(i2, size());
        if (size() == 1) {
            return f14187b;
        }
        int size = size() - 1;
        Object[] objArr = this.f14188a;
        Object[] copyOf = Arrays.copyOf(objArr, size);
        a.r(copyOf, "copyOf(this, newSize)");
        q.P(i2, i2 + 1, objArr, size(), copyOf);
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList o(l lVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f14188a;
        Object[] objArr2 = objArr;
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) ((AbstractPersistentList$removeAll$1) lVar).invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    a.r(objArr2, "copyOf(this, size)");
                    z2 = true;
                    size = i2;
                }
            } else if (z2) {
                objArr2[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f14187b : new SmallPersistentVector(q.V(0, size, objArr2));
    }

    @Override // e0.f, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList set(int i2, Object obj) {
        ListImplementation.a(i2, size());
        Object[] objArr = this.f14188a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[i2] = obj;
        return new SmallPersistentVector(copyOf);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList add(int i2, Object obj) {
        ListImplementation.b(i2, size());
        if (i2 == size()) {
            return add(obj);
        }
        int size = size();
        Object[] objArr = this.f14188a;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            q.T(objArr, objArr2, 0, i2, 6);
            q.P(i2 + 1, i2, objArr, size(), objArr2);
            objArr2[i2] = obj;
            return new SmallPersistentVector(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        q.P(i2 + 1, i2, objArr, size() - 1, copyOf);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new PersistentVector(copyOf, size() + 1, 0, objArr3);
    }
}
