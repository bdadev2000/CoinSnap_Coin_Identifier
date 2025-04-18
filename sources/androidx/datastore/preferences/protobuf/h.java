package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes.dex */
public final class h extends j {
    private static final long serialVersionUID = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f1369g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1370h;

    public h(byte[] bArr, int i10, int i11) {
        super(bArr);
        k.b(i10, i10 + i11, bArr.length);
        this.f1369g = i10;
        this.f1370h = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.k
    public final byte a(int i10) {
        int i11 = this.f1370h;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(eb.j.i("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(a4.j.e("Index > length: ", i10, ", ", i11));
        }
        return this.f1377f[this.f1369g + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.k
    public final void d(byte[] bArr, int i10) {
        System.arraycopy(this.f1377f, this.f1369g + 0, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.k
    public final byte e(int i10) {
        return this.f1377f[this.f1369g + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int g() {
        return this.f1369g;
    }

    @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.k
    public final int size() {
        return this.f1370h;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = h0.f1371b;
        } else {
            byte[] bArr2 = new byte[size];
            d(bArr2, size);
            bArr = bArr2;
        }
        return new j(bArr);
    }
}
