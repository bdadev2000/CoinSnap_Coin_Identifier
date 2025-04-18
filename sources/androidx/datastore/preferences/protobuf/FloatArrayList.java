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

/* loaded from: classes4.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: b, reason: collision with root package name */
    public float[] f19233b;

    /* renamed from: c, reason: collision with root package name */
    public int f19234c;

    static {
        new FloatArrayList(0, new float[0]).f19103a = false;
    }

    public FloatArrayList(int i2, float[] fArr) {
        this.f19233b = fArr;
        this.f19234c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19234c)) {
            float[] fArr = this.f19233b;
            if (i3 < fArr.length) {
                System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
            } else {
                float[] fArr2 = new float[a.z(i3, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                System.arraycopy(this.f19233b, i2, fArr2, i2 + 1, this.f19234c - i2);
                this.f19233b = fArr2;
            }
            this.f19233b[i2] = floatValue;
            this.f19234c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19234c);
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f19251a;
        collection.getClass();
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i2 = floatArrayList.f19234c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19234c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f19233b;
        if (i4 > fArr.length) {
            this.f19233b = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(floatArrayList.f19233b, 0, this.f19233b, this.f19234c, floatArrayList.f19234c);
        this.f19234c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f2) {
        a();
        int i2 = this.f19234c;
        float[] fArr = this.f19233b;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[a.z(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f19233b = fArr2;
        }
        float[] fArr3 = this.f19233b;
        int i3 = this.f19234c;
        this.f19234c = i3 + 1;
        fArr3[i3] = f2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f19234c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19234c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f19234c != floatArrayList.f19234c) {
            return false;
        }
        float[] fArr = floatArrayList.f19233b;
        for (int i2 = 0; i2 < this.f19234c; i2++) {
            if (Float.floatToIntBits(this.f19233b[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return Float.valueOf(this.f19233b[i2]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19234c; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f19233b[i3]);
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f19234c; i2++) {
            if (obj.equals(Float.valueOf(this.f19233b[i2]))) {
                float[] fArr = this.f19233b;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f19234c - i2) - 1);
                this.f19234c--;
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
        float[] fArr = this.f19233b;
        System.arraycopy(fArr, i3, fArr, i2, this.f19234c - i3);
        this.f19234c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i2);
        float[] fArr = this.f19233b;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19234c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 < this.f19234c) {
            throw new IllegalArgumentException();
        }
        return new FloatArrayList(this.f19234c, Arrays.copyOf(this.f19233b, i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        float[] fArr = this.f19233b;
        float f2 = fArr[i2];
        if (i2 < this.f19234c - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f19234c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
