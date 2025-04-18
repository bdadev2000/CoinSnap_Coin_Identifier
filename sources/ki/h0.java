package ki;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends l {

    /* renamed from: g, reason: collision with root package name */
    public final transient byte[][] f20991g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int[] f20992h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(byte[][] segments, int[] directory) {
        super(l.f20996f.f20997b);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f20991g = segments;
        this.f20992h = directory;
    }

    private final Object writeReplace() {
        l t5 = t();
        Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type java.lang.Object");
        return t5;
    }

    @Override // ki.l
    public final String a() {
        throw null;
    }

    @Override // ki.l
    public final l c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f20991g;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f20992h;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new l(digestBytes);
    }

    @Override // ki.l
    public final int d() {
        return this.f20992h[this.f20991g.length - 1];
    }

    @Override // ki.l
    public final String e() {
        return t().e();
    }

    @Override // ki.l
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (lVar.d() != d() || !l(0, lVar, d())) {
                return false;
            }
        }
        return true;
    }

    @Override // ki.l
    public final int f(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().f(other, i10);
    }

    @Override // ki.l
    public final byte[] h() {
        return s();
    }

    @Override // ki.l
    public final int hashCode() {
        int i10 = this.f20998c;
        if (i10 == 0) {
            byte[][] bArr = this.f20991g;
            int length = bArr.length;
            int i11 = 0;
            int i12 = 1;
            int i13 = 0;
            while (i11 < length) {
                int[] iArr = this.f20992h;
                int i14 = iArr[length + i11];
                int i15 = iArr[i11];
                byte[] bArr2 = bArr[i11];
                int i16 = (i15 - i13) + i14;
                while (i14 < i16) {
                    i12 = (i12 * 31) + bArr2[i14];
                    i14++;
                }
                i11++;
                i13 = i15;
            }
            this.f20998c = i12;
            return i12;
        }
        return i10;
    }

    @Override // ki.l
    public final byte i(int i10) {
        int i11;
        byte[][] bArr = this.f20991g;
        int length = bArr.length - 1;
        int[] iArr = this.f20992h;
        mi.a.c(iArr[length], i10, 1L);
        int a = li.d.a(this, i10);
        if (a == 0) {
            i11 = 0;
        } else {
            i11 = iArr[a - 1];
        }
        return bArr[a][(i10 - i11) + iArr[bArr.length + a]];
    }

    @Override // ki.l
    public final int j(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().j(other, i10);
    }

    @Override // ki.l
    public final boolean l(int i10, l other, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > d() - i11) {
            return false;
        }
        int i13 = i11 + i10;
        int a = li.d.a(this, i10);
        int i14 = 0;
        while (i10 < i13) {
            int[] iArr = this.f20992h;
            if (a == 0) {
                i12 = 0;
            } else {
                i12 = iArr[a - 1];
            }
            int i15 = iArr[a] - i12;
            byte[][] bArr = this.f20991g;
            int i16 = iArr[bArr.length + a];
            int min = Math.min(i13, i15 + i12) - i10;
            if (!other.m(i14, bArr[a], (i10 - i12) + i16, min)) {
                return false;
            }
            i14 += min;
            i10 += min;
            a++;
        }
        return true;
    }

    @Override // ki.l
    public final boolean m(int i10, byte[] other, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int a = li.d.a(this, i10);
        while (i10 < i14) {
            int[] iArr = this.f20992h;
            if (a == 0) {
                i13 = 0;
            } else {
                i13 = iArr[a - 1];
            }
            int i15 = iArr[a] - i13;
            byte[][] bArr = this.f20991g;
            int i16 = iArr[bArr.length + a];
            int min = Math.min(i14, i15 + i13) - i10;
            if (!mi.a.a(bArr[a], (i10 - i13) + i16, other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            a++;
        }
        return true;
    }

    @Override // ki.l
    public final l n(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int o10 = mi.a.o(this, i11);
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (o10 <= d()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i13 = o10 - i10;
                if (i13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 0 && o10 == d()) {
                        return this;
                    }
                    if (i10 == o10) {
                        return l.f20996f;
                    }
                    int a = li.d.a(this, i10);
                    int a10 = li.d.a(this, o10 - 1);
                    byte[][] bArr = this.f20991g;
                    byte[][] bArr2 = (byte[][]) ArraysKt.copyOfRange(bArr, a, a10 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int[] iArr2 = this.f20992h;
                    if (a <= a10) {
                        int i14 = 0;
                        int i15 = a;
                        while (true) {
                            iArr[i14] = Math.min(iArr2[i15] - i10, i13);
                            int i16 = i14 + 1;
                            iArr[i14 + bArr2.length] = iArr2[bArr.length + i15];
                            if (i15 == a10) {
                                break;
                            }
                            i15++;
                            i14 = i16;
                        }
                    }
                    if (a != 0) {
                        i12 = iArr2[a - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i10 - i12) + iArr[length];
                    return new h0(bArr2, iArr);
                }
                throw new IllegalArgumentException(a4.j.e("endIndex=", o10, " < beginIndex=", i10).toString());
            }
            StringBuilder m10 = a4.j.m("endIndex=", o10, " > length(");
            m10.append(d());
            m10.append(')');
            throw new IllegalArgumentException(m10.toString().toString());
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("beginIndex=", i10, " < 0").toString());
    }

    @Override // ki.l
    public final l p() {
        return t().p();
    }

    @Override // ki.l
    public final void r(i buffer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = 0 + i10;
        int a = li.d.a(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            int[] iArr = this.f20992h;
            if (a == 0) {
                i11 = 0;
            } else {
                i11 = iArr[a - 1];
            }
            int i14 = iArr[a] - i11;
            byte[][] bArr = this.f20991g;
            int i15 = iArr[bArr.length + a];
            int min = Math.min(i12, i14 + i11) - i13;
            int i16 = (i13 - i11) + i15;
            f0 f0Var = new f0(bArr[a], i16, i16 + min, true);
            f0 f0Var2 = buffer.f20993b;
            if (f0Var2 == null) {
                f0Var.f20984g = f0Var;
                f0Var.f20983f = f0Var;
                buffer.f20993b = f0Var;
            } else {
                Intrinsics.checkNotNull(f0Var2);
                f0 f0Var3 = f0Var2.f20984g;
                Intrinsics.checkNotNull(f0Var3);
                f0Var3.b(f0Var);
            }
            i13 += min;
            a++;
        }
        buffer.f20994c += i10;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f20991g;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f20992h;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(bArr2[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final l t() {
        return new l(s());
    }

    @Override // ki.l
    public final String toString() {
        return t().toString();
    }
}
