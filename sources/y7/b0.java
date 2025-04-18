package y7;

import kotlin.UByte;

/* loaded from: classes3.dex */
public final class b0 {
    public final byte[] a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f27950b;

    /* renamed from: c, reason: collision with root package name */
    public int f27951c;

    /* renamed from: d, reason: collision with root package name */
    public long f27952d;

    /* renamed from: e, reason: collision with root package name */
    public int f27953e;

    /* renamed from: f, reason: collision with root package name */
    public int f27954f;

    /* renamed from: g, reason: collision with root package name */
    public int f27955g;

    public final void a(a0 a0Var, z zVar) {
        if (this.f27951c > 0) {
            a0Var.d(this.f27952d, this.f27953e, this.f27954f, this.f27955g, zVar);
            this.f27951c = 0;
        }
    }

    public final void b(a0 a0Var, long j3, int i10, int i11, int i12, z zVar) {
        boolean z10;
        if (this.f27955g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f27950b) {
                return;
            }
            int i13 = this.f27951c;
            int i14 = i13 + 1;
            this.f27951c = i14;
            if (i13 == 0) {
                this.f27952d = j3;
                this.f27953e = i10;
                this.f27954f = 0;
            }
            this.f27954f += i11;
            this.f27955g = i12;
            if (i14 >= 16) {
                a(a0Var, zVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(m mVar) {
        char c10;
        if (this.f27950b) {
            return;
        }
        byte[] bArr = this.a;
        int i10 = 0;
        mVar.peekFully(bArr, 0, 10);
        mVar.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                if ((b3 & UByte.MAX_VALUE) == 187) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    c10 = '\t';
                } else {
                    c10 = '\b';
                }
                i10 = 40 << ((bArr[c10] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f27950b = true;
    }
}
