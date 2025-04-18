package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.Internal;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: b, reason: collision with root package name */
    public int[] f19249b;

    /* renamed from: c, reason: collision with root package name */
    public int f19250c;

    static {
        new IntArrayList(new int[0], 0).f19103a = false;
    }

    public IntArrayList(int[] iArr, int i2) {
        this.f19249b = iArr;
        this.f19250c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19250c)) {
            int[] iArr = this.f19249b;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
            } else {
                int[] iArr2 = new int[a.z(i3, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.f19249b, i2, iArr2, i2 + 1, this.f19250c - i2);
                this.f19249b = iArr2;
            }
            this.f19249b[i2] = intValue;
            this.f19250c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19250c);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f19251a;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.f19250c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19250c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f19249b;
        if (i4 > iArr.length) {
            this.f19249b = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(intArrayList.f19249b, 0, this.f19249b, this.f19250c, intArrayList.f19250c);
        this.f19250c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        a();
        int i3 = this.f19250c;
        int[] iArr = this.f19249b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[a.z(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f19249b = iArr2;
        }
        int[] iArr3 = this.f19249b;
        int i4 = this.f19250c;
        this.f19250c = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f19250c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19250c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    public final int d(int i2) {
        c(i2);
        return this.f19249b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f19250c != intArrayList.f19250c) {
            return false;
        }
        int[] iArr = intArrayList.f19249b;
        for (int i2 = 0; i2 < this.f19250c; i2++) {
            if (this.f19249b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Integer.valueOf(d(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19250c; i3++) {
            i2 = (i2 * 31) + this.f19249b[i3];
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f19250c; i2++) {
            if (obj.equals(Integer.valueOf(this.f19249b[i2]))) {
                int[] iArr = this.f19249b;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f19250c - i2) - 1);
                this.f19250c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19249b;
        System.arraycopy(iArr, i3, iArr, i2, this.f19250c - i3);
        this.f19250c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i2);
        int[] iArr = this.f19249b;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19250c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 >= this.f19250c) {
            return new IntArrayList(Arrays.copyOf(this.f19249b, i2), this.f19250c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        int[] iArr = this.f19249b;
        int i3 = iArr[i2];
        if (i2 < this.f19250c - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f19250c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
