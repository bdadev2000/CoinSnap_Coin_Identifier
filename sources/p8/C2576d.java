package p8;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import u7.AbstractC2815f;

/* renamed from: p8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2576d {

    /* renamed from: c, reason: collision with root package name */
    public final w8.t f22399c;

    /* renamed from: f, reason: collision with root package name */
    public int f22402f;

    /* renamed from: g, reason: collision with root package name */
    public int f22403g;

    /* renamed from: a, reason: collision with root package name */
    public int f22398a = 4096;
    public final ArrayList b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C2575c[] f22400d = new C2575c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f22401e = 7;

    public C2576d(v vVar) {
        this.f22399c = r8.k.f(vVar);
    }

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        if (i9 > 0) {
            int length = this.f22400d.length;
            while (true) {
                length--;
                i10 = this.f22401e;
                if (length < i10 || i9 <= 0) {
                    break;
                }
                C2575c c2575c = this.f22400d[length];
                G7.j.b(c2575c);
                int i12 = c2575c.f22397c;
                i9 -= i12;
                this.f22403g -= i12;
                this.f22402f--;
                i11++;
            }
            C2575c[] c2575cArr = this.f22400d;
            System.arraycopy(c2575cArr, i10 + 1, c2575cArr, i10 + 1 + i11, this.f22402f);
            this.f22401e += i11;
        }
        return i11;
    }

    public final w8.i b(int i9) {
        if (i9 >= 0) {
            C2575c[] c2575cArr = f.f22412a;
            if (i9 <= c2575cArr.length - 1) {
                return c2575cArr[i9].f22396a;
            }
        }
        int length = this.f22401e + 1 + (i9 - f.f22412a.length);
        if (length >= 0) {
            C2575c[] c2575cArr2 = this.f22400d;
            if (length < c2575cArr2.length) {
                C2575c c2575c = c2575cArr2[length];
                G7.j.b(c2575c);
                return c2575c.f22396a;
            }
        }
        throw new IOException(G7.j.j(Integer.valueOf(i9 + 1), "Header index too large "));
    }

    public final void c(C2575c c2575c) {
        this.b.add(c2575c);
        int i9 = this.f22398a;
        int i10 = c2575c.f22397c;
        if (i10 > i9) {
            C2575c[] c2575cArr = this.f22400d;
            AbstractC2815f.y(c2575cArr, 0, c2575cArr.length);
            this.f22401e = this.f22400d.length - 1;
            this.f22402f = 0;
            this.f22403g = 0;
            return;
        }
        a((this.f22403g + i10) - i9);
        int i11 = this.f22402f + 1;
        C2575c[] c2575cArr2 = this.f22400d;
        if (i11 > c2575cArr2.length) {
            C2575c[] c2575cArr3 = new C2575c[c2575cArr2.length * 2];
            System.arraycopy(c2575cArr2, 0, c2575cArr3, c2575cArr2.length, c2575cArr2.length);
            this.f22401e = this.f22400d.length - 1;
            this.f22400d = c2575cArr3;
        }
        int i12 = this.f22401e;
        this.f22401e = i12 - 1;
        this.f22400d[i12] = c2575c;
        this.f22402f++;
        this.f22403g += i10;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, w8.f] */
    public final w8.i d() {
        boolean z8;
        int i9;
        w8.t tVar = this.f22399c;
        byte readByte = tVar.readByte();
        byte[] bArr = j8.b.f21214a;
        int i10 = readByte & 255;
        int i11 = 0;
        if ((readByte & 128) == 128) {
            z8 = true;
        } else {
            z8 = false;
        }
        long e4 = e(i10, 127);
        if (z8) {
            ?? obj = new Object();
            int[] iArr = B.f22379a;
            G7.j.e(tVar, "source");
            E.g gVar = B.f22380c;
            E.g gVar2 = gVar;
            long j7 = 0;
            int i12 = 0;
            while (j7 < e4) {
                j7++;
                byte readByte2 = tVar.readByte();
                byte[] bArr2 = j8.b.f21214a;
                i11 = (i11 << 8) | (readByte2 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    E.g[] gVarArr = (E.g[]) gVar2.f845f;
                    G7.j.b(gVarArr);
                    gVar2 = gVarArr[(i11 >>> (i12 - 8)) & 255];
                    G7.j.b(gVar2);
                    if (((E.g[]) gVar2.f845f) == null) {
                        obj.n(gVar2.f843c);
                        i12 -= gVar2.f844d;
                        gVar2 = gVar;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                E.g[] gVarArr2 = (E.g[]) gVar2.f845f;
                G7.j.b(gVarArr2);
                E.g gVar3 = gVarArr2[(i11 << (8 - i12)) & 255];
                G7.j.b(gVar3);
                if (((E.g[]) gVar3.f845f) != null || (i9 = gVar3.f844d) > i12) {
                    break;
                }
                obj.n(gVar3.f843c);
                i12 -= i9;
                gVar2 = gVar;
            }
            return obj.readByteString(obj.f24014c);
        }
        return tVar.readByteString(e4);
    }

    public final int e(int i9, int i10) {
        int i11 = i9 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte readByte = this.f22399c.readByte();
            byte[] bArr = j8.b.f21214a;
            int i13 = readByte & 255;
            if ((readByte & 128) != 0) {
                i10 += (readByte & Ascii.DEL) << i12;
                i12 += 7;
            } else {
                return i10 + (i13 << i12);
            }
        }
    }
}
