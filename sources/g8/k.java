package g8;

import kotlin.UByte;
import n9.h0;
import n9.x;
import y7.a0;

/* loaded from: classes3.dex */
public final class k {
    public final a0 a;

    /* renamed from: d, reason: collision with root package name */
    public t f18270d;

    /* renamed from: e, reason: collision with root package name */
    public h f18271e;

    /* renamed from: f, reason: collision with root package name */
    public int f18272f;

    /* renamed from: g, reason: collision with root package name */
    public int f18273g;

    /* renamed from: h, reason: collision with root package name */
    public int f18274h;

    /* renamed from: i, reason: collision with root package name */
    public int f18275i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18278l;

    /* renamed from: b, reason: collision with root package name */
    public final s f18268b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final x f18269c = new x();

    /* renamed from: j, reason: collision with root package name */
    public final x f18276j = new x(1);

    /* renamed from: k, reason: collision with root package name */
    public final x f18277k = new x();

    public k(a0 a0Var, t tVar, h hVar) {
        this.a = a0Var;
        this.f18270d = tVar;
        this.f18271e = hVar;
        this.f18270d = tVar;
        this.f18271e = hVar;
        a0Var.f(tVar.a.f18337f);
        d();
    }

    public final r a() {
        if (!this.f18278l) {
            return null;
        }
        s sVar = this.f18268b;
        h hVar = sVar.a;
        int i10 = h0.a;
        int i11 = hVar.a;
        r rVar = sVar.f18358m;
        if (rVar == null) {
            r[] rVarArr = this.f18270d.a.f18342k;
            if (rVarArr == null) {
                rVar = null;
            } else {
                rVar = rVarArr[i11];
            }
        }
        if (rVar == null || !rVar.a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f18272f++;
        if (!this.f18278l) {
            return false;
        }
        int i10 = this.f18273g + 1;
        this.f18273g = i10;
        int[] iArr = this.f18268b.f18352g;
        int i11 = this.f18274h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f18274h = i11 + 1;
        this.f18273g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        x xVar;
        boolean z10;
        boolean z11;
        int i12;
        r a = a();
        if (a == null) {
            return 0;
        }
        s sVar = this.f18268b;
        int i13 = a.f18345d;
        if (i13 != 0) {
            xVar = sVar.f18359n;
        } else {
            int i14 = h0.a;
            byte[] bArr = a.f18346e;
            int length = bArr.length;
            x xVar2 = this.f18277k;
            xVar2.E(bArr, length);
            i13 = bArr.length;
            xVar = xVar2;
        }
        int i15 = this.f18272f;
        if (sVar.f18356k && sVar.f18357l[i15]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        x xVar3 = this.f18276j;
        byte[] bArr2 = xVar3.a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        xVar3.G(0);
        a0 a0Var = this.a;
        a0Var.a(1, xVar3);
        a0Var.a(i13, xVar);
        if (!z11) {
            return i13 + 1;
        }
        x xVar4 = this.f18269c;
        if (!z10) {
            xVar4.D(8);
            byte[] bArr3 = xVar4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            a0Var.a(8, xVar4);
            return i13 + 1 + 8;
        }
        x xVar5 = sVar.f18359n;
        int A = xVar5.A();
        xVar5.H(-2);
        int i16 = (A * 6) + 2;
        if (i11 != 0) {
            xVar4.D(i16);
            byte[] bArr4 = xVar4.a;
            xVar5.d(bArr4, 0, i16);
            int i17 = (((bArr4[2] & UByte.MAX_VALUE) << 8) | (bArr4[3] & UByte.MAX_VALUE)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            xVar4 = xVar5;
        }
        a0Var.a(i16, xVar4);
        return i13 + 1 + i16;
    }

    public final void d() {
        s sVar = this.f18268b;
        sVar.f18349d = 0;
        sVar.f18361p = 0L;
        sVar.f18362q = false;
        sVar.f18356k = false;
        sVar.f18360o = false;
        sVar.f18358m = null;
        this.f18272f = 0;
        this.f18274h = 0;
        this.f18273g = 0;
        this.f18275i = 0;
        this.f18278l = false;
    }
}
