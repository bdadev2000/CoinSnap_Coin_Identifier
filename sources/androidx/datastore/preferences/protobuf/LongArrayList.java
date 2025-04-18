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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: b, reason: collision with root package name */
    public long[] f19277b;

    /* renamed from: c, reason: collision with root package name */
    public int f19278c;

    static {
        new LongArrayList(new long[0], 0).f19103a = false;
    }

    public LongArrayList(long[] jArr, int i2) {
        this.f19277b = jArr;
        this.f19278c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19278c)) {
            long[] jArr = this.f19277b;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[a.z(i3, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.f19277b, i2, jArr2, i2 + 1, this.f19278c - i2);
                this.f19277b = jArr2;
            }
            this.f19277b[i2] = longValue;
            this.f19278c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19278c);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f19251a;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i2 = longArrayList.f19278c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19278c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f19277b;
        if (i4 > jArr.length) {
            this.f19277b = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(longArrayList.f19277b, 0, this.f19277b, this.f19278c, longArrayList.f19278c);
        this.f19278c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j2) {
        a();
        int i2 = this.f19278c;
        long[] jArr = this.f19277b;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[a.z(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f19277b = jArr2;
        }
        long[] jArr3 = this.f19277b;
        int i3 = this.f19278c;
        this.f19278c = i3 + 1;
        jArr3[i3] = j2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f19278c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19278c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    public final long d(int i2) {
        c(i2);
        return this.f19277b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f19278c != longArrayList.f19278c) {
            return false;
        }
        long[] jArr = longArrayList.f19277b;
        for (int i2 = 0; i2 < this.f19278c; i2++) {
            if (this.f19277b[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Long.valueOf(d(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19278c; i3++) {
            i2 = (i2 * 31) + Internal.a(this.f19277b[i3]);
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f19278c; i2++) {
            if (obj.equals(Long.valueOf(this.f19277b[i2]))) {
                long[] jArr = this.f19277b;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f19278c - i2) - 1);
                this.f19278c--;
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
        long[] jArr = this.f19277b;
        System.arraycopy(jArr, i3, jArr, i2, this.f19278c - i3);
        this.f19278c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i2);
        long[] jArr = this.f19277b;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19278c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 >= this.f19278c) {
            return new LongArrayList(Arrays.copyOf(this.f19277b, i2), this.f19278c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        long[] jArr = this.f19277b;
        long j2 = jArr[i2];
        if (i2 < this.f19278c - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f19278c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
