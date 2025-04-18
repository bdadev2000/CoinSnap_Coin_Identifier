package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    public static final ProtobufArrayList d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19328b;

    /* renamed from: c, reason: collision with root package name */
    public int f19329c;

    static {
        ProtobufArrayList protobufArrayList = new ProtobufArrayList(new Object[0], 0);
        d = protobufArrayList;
        protobufArrayList.f19103a = false;
    }

    public ProtobufArrayList(Object[] objArr, int i2) {
        this.f19328b = objArr;
        this.f19329c = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.f19329c;
        Object[] objArr = this.f19328b;
        if (i2 == objArr.length) {
            this.f19328b = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f19328b;
        int i3 = this.f19329c;
        this.f19329c = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f19329c) {
            StringBuilder t2 = d.t("Index:", i2, ", Size:");
            t2.append(this.f19329c);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.f19328b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.f19328b;
        Object obj = objArr[i2];
        if (i2 < this.f19329c - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f19329c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.f19328b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19329c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 >= this.f19329c) {
            return new ProtobufArrayList(Arrays.copyOf(this.f19328b, i2), this.f19329c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f19329c)) {
            Object[] objArr = this.f19328b;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[a.z(i3, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f19328b, i2, objArr2, i2 + 1, this.f19329c - i2);
                this.f19328b = objArr2;
            }
            this.f19328b[i2] = obj;
            this.f19329c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder t2 = d.t("Index:", i2, ", Size:");
        t2.append(this.f19329c);
        throw new IndexOutOfBoundsException(t2.toString());
    }
}
