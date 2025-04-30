package w8;

import java.security.MessageDigest;
import u7.AbstractC2815f;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class w extends i {

    /* renamed from: g, reason: collision with root package name */
    public final transient byte[][] f24049g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int[] f24050h;

    public w(byte[][] bArr, int[] iArr) {
        super(i.f24015f.b);
        this.f24049g = bArr;
        this.f24050h = iArr;
    }

    private final Object writeReplace() {
        return new i(l());
    }

    @Override // w8.i
    public final String a() {
        throw null;
    }

    @Override // w8.i
    public final i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f24049g;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int[] iArr = this.f24050h;
            int i11 = iArr[length + i9];
            int i12 = iArr[i9];
            messageDigest.update(bArr[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        G7.j.d(digest, "digestBytes");
        return new i(digest);
    }

    @Override // w8.i
    public final int c() {
        return this.f24050h[this.f24049g.length - 1];
    }

    @Override // w8.i
    public final String d() {
        return new i(l()).d();
    }

    @Override // w8.i
    public final byte[] e() {
        return l();
    }

    @Override // w8.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.c() == c() && h(iVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // w8.i
    public final byte f(int i9) {
        int i10;
        byte[][] bArr = this.f24049g;
        int length = bArr.length - 1;
        int[] iArr = this.f24050h;
        AbstractC2947c.h(iArr[length], i9, 1L);
        int b = x8.b.b(this, i9);
        if (b == 0) {
            i10 = 0;
        } else {
            i10 = iArr[b - 1];
        }
        return bArr[b][(i9 - i10) + iArr[bArr.length + b]];
    }

    @Override // w8.i
    public final boolean g(int i9, byte[] bArr, int i10, int i11) {
        int i12;
        G7.j.e(bArr, "other");
        if (i9 < 0 || i9 > c() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i13 = i11 + i9;
        int b = x8.b.b(this, i9);
        while (i9 < i13) {
            int[] iArr = this.f24050h;
            if (b == 0) {
                i12 = 0;
            } else {
                i12 = iArr[b - 1];
            }
            int i14 = iArr[b] - i12;
            byte[][] bArr2 = this.f24049g;
            int i15 = iArr[bArr2.length + b];
            int min = Math.min(i13, i14 + i12) - i9;
            if (!AbstractC2947c.a(bArr2[b], (i9 - i12) + i15, bArr, i10, min)) {
                return false;
            }
            i10 += min;
            i9 += min;
            b++;
        }
        return true;
    }

    @Override // w8.i
    public final boolean h(i iVar, int i9) {
        int i10;
        G7.j.e(iVar, "other");
        if (c() - i9 < 0) {
            return false;
        }
        int b = x8.b.b(this, 0);
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int[] iArr = this.f24050h;
            if (b == 0) {
                i10 = 0;
            } else {
                i10 = iArr[b - 1];
            }
            int i13 = iArr[b] - i10;
            byte[][] bArr = this.f24049g;
            int i14 = iArr[bArr.length + b];
            int min = Math.min(i9, i13 + i10) - i11;
            if (!iVar.g(i12, bArr[b], (i11 - i10) + i14, min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            b++;
        }
        return true;
    }

    @Override // w8.i
    public final int hashCode() {
        int i9 = this.f24016c;
        if (i9 == 0) {
            byte[][] bArr = this.f24049g;
            int length = bArr.length;
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            while (i10 < length) {
                int[] iArr = this.f24050h;
                int i13 = iArr[length + i10];
                int i14 = iArr[i10];
                byte[] bArr2 = bArr[i10];
                int i15 = (i14 - i12) + i13;
                while (i13 < i15) {
                    i11 = (i11 * 31) + bArr2[i13];
                    i13++;
                }
                i10++;
                i12 = i14;
            }
            this.f24016c = i11;
            return i11;
        }
        return i9;
    }

    @Override // w8.i
    public final i i() {
        return new i(l()).i();
    }

    @Override // w8.i
    public final void k(f fVar, int i9) {
        int i10;
        G7.j.e(fVar, "buffer");
        int b = x8.b.b(this, 0);
        int i11 = 0;
        while (i11 < i9) {
            int[] iArr = this.f24050h;
            if (b == 0) {
                i10 = 0;
            } else {
                i10 = iArr[b - 1];
            }
            int i12 = iArr[b] - i10;
            byte[][] bArr = this.f24049g;
            int i13 = iArr[bArr.length + b];
            int min = Math.min(i9, i12 + i10) - i11;
            int i14 = (i11 - i10) + i13;
            u uVar = new u(bArr[b], i14, i14 + min, true);
            u uVar2 = fVar.b;
            if (uVar2 == null) {
                uVar.f24046g = uVar;
                uVar.f24045f = uVar;
                fVar.b = uVar;
            } else {
                u uVar3 = uVar2.f24046g;
                G7.j.b(uVar3);
                uVar3.b(uVar);
            }
            i11 += min;
            b++;
        }
        fVar.f24014c += i9;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f24049g;
        int length = bArr2.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int[] iArr = this.f24050h;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            int i14 = i13 - i10;
            AbstractC2815f.v(bArr2[i9], i11, i12, bArr, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // w8.i
    public final String toString() {
        return new i(l()).toString();
    }
}
