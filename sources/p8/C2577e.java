package p8;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import u7.AbstractC2815f;

/* renamed from: p8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2577e {
    public final w8.f b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22406d;

    /* renamed from: h, reason: collision with root package name */
    public int f22410h;

    /* renamed from: i, reason: collision with root package name */
    public int f22411i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22404a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f22405c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f22407e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C2575c[] f22408f = new C2575c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f22409g = 7;

    public C2577e(w8.f fVar) {
        this.b = fVar;
    }

    public final void a(int i9) {
        int i10;
        if (i9 > 0) {
            int length = this.f22408f.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f22409g;
                if (length < i10 || i9 <= 0) {
                    break;
                }
                C2575c c2575c = this.f22408f[length];
                G7.j.b(c2575c);
                i9 -= c2575c.f22397c;
                int i12 = this.f22411i;
                C2575c c2575c2 = this.f22408f[length];
                G7.j.b(c2575c2);
                this.f22411i = i12 - c2575c2.f22397c;
                this.f22410h--;
                i11++;
                length--;
            }
            C2575c[] c2575cArr = this.f22408f;
            int i13 = i10 + 1;
            System.arraycopy(c2575cArr, i13, c2575cArr, i13 + i11, this.f22410h);
            C2575c[] c2575cArr2 = this.f22408f;
            int i14 = this.f22409g + 1;
            Arrays.fill(c2575cArr2, i14, i14 + i11, (Object) null);
            this.f22409g += i11;
        }
    }

    public final void b(C2575c c2575c) {
        int i9 = this.f22407e;
        int i10 = c2575c.f22397c;
        if (i10 > i9) {
            C2575c[] c2575cArr = this.f22408f;
            AbstractC2815f.y(c2575cArr, 0, c2575cArr.length);
            this.f22409g = this.f22408f.length - 1;
            this.f22410h = 0;
            this.f22411i = 0;
            return;
        }
        a((this.f22411i + i10) - i9);
        int i11 = this.f22410h + 1;
        C2575c[] c2575cArr2 = this.f22408f;
        if (i11 > c2575cArr2.length) {
            C2575c[] c2575cArr3 = new C2575c[c2575cArr2.length * 2];
            System.arraycopy(c2575cArr2, 0, c2575cArr3, c2575cArr2.length, c2575cArr2.length);
            this.f22409g = this.f22408f.length - 1;
            this.f22408f = c2575cArr3;
        }
        int i12 = this.f22409g;
        this.f22409g = i12 - 1;
        this.f22408f[i12] = c2575c;
        this.f22410h++;
        this.f22411i += i10;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, w8.f] */
    public final void c(w8.i iVar) {
        G7.j.e(iVar, DataSchemeDataSource.SCHEME_DATA);
        boolean z8 = this.f22404a;
        w8.f fVar = this.b;
        int i9 = 0;
        if (z8) {
            int[] iArr = B.f22379a;
            int c9 = iVar.c();
            int i10 = 0;
            long j7 = 0;
            while (i10 < c9) {
                int i11 = i10 + 1;
                byte f9 = iVar.f(i10);
                byte[] bArr = j8.b.f21214a;
                j7 += B.b[f9 & 255];
                i10 = i11;
            }
            if (((int) ((j7 + 7) >> 3)) < iVar.c()) {
                ?? obj = new Object();
                int[] iArr2 = B.f22379a;
                int c10 = iVar.c();
                long j9 = 0;
                int i12 = 0;
                while (i9 < c10) {
                    int i13 = i9 + 1;
                    byte f10 = iVar.f(i9);
                    byte[] bArr2 = j8.b.f21214a;
                    int i14 = f10 & 255;
                    int i15 = B.f22379a[i14];
                    byte b = B.b[i14];
                    j9 = (j9 << b) | i15;
                    i12 += b;
                    while (i12 >= 8) {
                        i12 -= 8;
                        obj.n((int) (j9 >> i12));
                    }
                    i9 = i13;
                }
                if (i12 > 0) {
                    obj.n((int) ((255 >>> i12) | (j9 << (8 - i12))));
                }
                w8.i readByteString = obj.readByteString(obj.f24014c);
                e(readByteString.c(), 127, 128);
                fVar.l(readByteString);
                return;
            }
        }
        e(iVar.c(), 127, 0);
        fVar.l(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i9;
        int i10;
        if (this.f22406d) {
            int i11 = this.f22405c;
            if (i11 < this.f22407e) {
                e(i11, 31, 32);
            }
            this.f22406d = false;
            this.f22405c = Integer.MAX_VALUE;
            e(this.f22407e, 31, 32);
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            C2575c c2575c = (C2575c) arrayList.get(i12);
            w8.i i14 = c2575c.f22396a.i();
            Integer num = (Integer) f.b.get(i14);
            w8.i iVar = c2575c.b;
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    C2575c[] c2575cArr = f.f22412a;
                    if (G7.j.a(c2575cArr[intValue].b, iVar)) {
                        i9 = i10;
                    } else if (G7.j.a(c2575cArr[i10].b, iVar)) {
                        i10 = intValue + 2;
                        i9 = i10;
                    }
                }
                i9 = i10;
                i10 = -1;
            } else {
                i9 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i15 = this.f22409g + 1;
                int length = this.f22408f.length;
                while (true) {
                    if (i15 >= length) {
                        break;
                    }
                    int i16 = i15 + 1;
                    C2575c c2575c2 = this.f22408f[i15];
                    G7.j.b(c2575c2);
                    if (G7.j.a(c2575c2.f22396a, i14)) {
                        C2575c c2575c3 = this.f22408f[i15];
                        G7.j.b(c2575c3);
                        if (G7.j.a(c2575c3.b, iVar)) {
                            i10 = f.f22412a.length + (i15 - this.f22409g);
                            break;
                        } else if (i9 == -1) {
                            i9 = f.f22412a.length + (i15 - this.f22409g);
                        }
                    }
                    i15 = i16;
                }
            }
            if (i10 != -1) {
                e(i10, 127, 128);
            } else if (i9 == -1) {
                this.b.n(64);
                c(i14);
                c(iVar);
                b(c2575c);
            } else {
                w8.i iVar2 = C2575c.f22390d;
                i14.getClass();
                G7.j.e(iVar2, "prefix");
                if (i14.h(iVar2, iVar2.c()) && !G7.j.a(C2575c.f22395i, i14)) {
                    e(i9, 15, 0);
                    c(iVar);
                } else {
                    e(i9, 63, 64);
                    c(iVar);
                    b(c2575c);
                }
            }
            i12 = i13;
        }
    }

    public final void e(int i9, int i10, int i11) {
        w8.f fVar = this.b;
        if (i9 < i10) {
            fVar.n(i9 | i11);
            return;
        }
        fVar.n(i11 | i10);
        int i12 = i9 - i10;
        while (i12 >= 128) {
            fVar.n(128 | (i12 & 127));
            i12 >>>= 7;
        }
        fVar.n(i12);
    }
}
