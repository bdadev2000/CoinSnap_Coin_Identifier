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

/* loaded from: classes3.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f19120b;

    /* renamed from: c, reason: collision with root package name */
    public int f19121c;

    static {
        new BooleanArrayList(new boolean[0], 0).f19103a = false;
    }

    public BooleanArrayList(boolean[] zArr, int i2) {
        this.f19120b = zArr;
        this.f19121c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19121c)) {
            boolean[] zArr = this.f19120b;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[a.z(i3, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.f19120b, i2, zArr2, i2 + 1, this.f19121c - i2);
                this.f19120b = zArr2;
            }
            this.f19120b[i2] = booleanValue;
            this.f19121c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19121c);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f19251a;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.f19121c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19121c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f19120b;
        if (i4 > zArr.length) {
            this.f19120b = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(booleanArrayList.f19120b, 0, this.f19120b, this.f19121c, booleanArrayList.f19121c);
        this.f19121c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z2) {
        a();
        int i2 = this.f19121c;
        boolean[] zArr = this.f19120b;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[a.z(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f19120b = zArr2;
        }
        boolean[] zArr3 = this.f19120b;
        int i3 = this.f19121c;
        this.f19121c = i3 + 1;
        zArr3[i3] = z2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f19121c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19121c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f19121c != booleanArrayList.f19121c) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f19120b;
        for (int i2 = 0; i2 < this.f19121c; i2++) {
            if (this.f19120b[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return Boolean.valueOf(this.f19120b[i2]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19121c; i3++) {
            int i4 = i2 * 31;
            boolean z2 = this.f19120b[i3];
            Charset charset = Internal.f19251a;
            i2 = i4 + (z2 ? 1231 : 1237);
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f19121c; i2++) {
            if (obj.equals(Boolean.valueOf(this.f19120b[i2]))) {
                boolean[] zArr = this.f19120b;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f19121c - i2) - 1);
                this.f19121c--;
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
        boolean[] zArr = this.f19120b;
        System.arraycopy(zArr, i3, zArr, i2, this.f19121c - i3);
        this.f19121c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i2);
        boolean[] zArr = this.f19120b;
        boolean z2 = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19121c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 >= this.f19121c) {
            return new BooleanArrayList(Arrays.copyOf(this.f19120b, i2), this.f19121c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        boolean[] zArr = this.f19120b;
        boolean z2 = zArr[i2];
        if (i2 < this.f19121c - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f19121c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
