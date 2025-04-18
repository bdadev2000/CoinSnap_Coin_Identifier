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

/* loaded from: classes.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: b, reason: collision with root package name */
    public double[] f19169b;

    /* renamed from: c, reason: collision with root package name */
    public int f19170c;

    static {
        new DoubleArrayList(0, new double[0]).f19103a = false;
    }

    public DoubleArrayList(int i2, double[] dArr) {
        this.f19169b = dArr;
        this.f19170c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19170c)) {
            double[] dArr = this.f19169b;
            if (i3 < dArr.length) {
                System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
            } else {
                double[] dArr2 = new double[a.z(i3, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i2);
                System.arraycopy(this.f19169b, i2, dArr2, i2 + 1, this.f19170c - i2);
                this.f19169b = dArr2;
            }
            this.f19169b[i2] = doubleValue;
            this.f19170c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19170c);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f19251a;
        collection.getClass();
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.f19170c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19170c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f19169b;
        if (i4 > dArr.length) {
            this.f19169b = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(doubleArrayList.f19169b, 0, this.f19169b, this.f19170c, doubleArrayList.f19170c);
        this.f19170c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d) {
        a();
        int i2 = this.f19170c;
        double[] dArr = this.f19169b;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[a.z(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f19169b = dArr2;
        }
        double[] dArr3 = this.f19169b;
        int i3 = this.f19170c;
        this.f19170c = i3 + 1;
        dArr3[i3] = d;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f19170c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19170c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f19170c != doubleArrayList.f19170c) {
            return false;
        }
        double[] dArr = doubleArrayList.f19169b;
        for (int i2 = 0; i2 < this.f19170c; i2++) {
            if (Double.doubleToLongBits(this.f19169b[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return Double.valueOf(this.f19169b[i2]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19170c; i3++) {
            i2 = (i2 * 31) + Internal.a(Double.doubleToLongBits(this.f19169b[i3]));
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f19170c; i2++) {
            if (obj.equals(Double.valueOf(this.f19169b[i2]))) {
                double[] dArr = this.f19169b;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f19170c - i2) - 1);
                this.f19170c--;
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
        double[] dArr = this.f19169b;
        System.arraycopy(dArr, i3, dArr, i2, this.f19170c - i3);
        this.f19170c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i2);
        double[] dArr = this.f19169b;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19170c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 < this.f19170c) {
            throw new IllegalArgumentException();
        }
        return new DoubleArrayList(this.f19170c, Arrays.copyOf(this.f19169b, i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        double[] dArr = this.f19169b;
        double d = dArr[i2];
        if (i2 < this.f19170c - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f19170c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
