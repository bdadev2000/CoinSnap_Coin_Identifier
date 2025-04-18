package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class j extends i {
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1377f;

    public j(byte[] bArr) {
        bArr.getClass();
        this.f1377f = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public byte a(int i10) {
        return this.f1377f[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public void d(byte[] bArr, int i10) {
        System.arraycopy(this.f1377f, 0, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public byte e(int i10) {
        return this.f1377f[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k) || size() != ((k) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int i10 = this.f1391b;
            int i11 = jVar.f1391b;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size <= jVar.size()) {
                if (0 + size <= jVar.size()) {
                    int g10 = g() + size;
                    int g11 = g();
                    int g12 = jVar.g() + 0;
                    while (g11 < g10) {
                        if (this.f1377f[g11] != jVar.f1377f[g12]) {
                            return false;
                        }
                        g11++;
                        g12++;
                    }
                    return true;
                }
                StringBuilder m10 = a4.j.m("Ran off end of other: 0, ", size, ", ");
                m10.append(jVar.size());
                throw new IllegalArgumentException(m10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public int g() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public int size() {
        return this.f1377f.length;
    }
}
