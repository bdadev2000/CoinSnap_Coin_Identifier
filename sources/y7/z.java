package y7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28015c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28016d;

    public z(int i10, byte[] bArr, int i11, int i12) {
        this.a = i10;
        this.f28014b = bArr;
        this.f28015c = i11;
        this.f28016d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.a == zVar.a && this.f28015c == zVar.f28015c && this.f28016d == zVar.f28016d && Arrays.equals(this.f28014b, zVar.f28014b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f28014b) + (this.a * 31)) * 31) + this.f28015c) * 31) + this.f28016d;
    }
}
