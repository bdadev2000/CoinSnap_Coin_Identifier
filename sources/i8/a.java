package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class a implements y7.l {
    public final b a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19202b = new n9.x(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f19203c;

    @Override // y7.l
    public final void a(y7.n nVar) {
        this.a.c(nVar, new h0(0, 1));
        nVar.endTracks();
        nVar.d(new y7.r(C.TIME_UNSET));
    }

    @Override // y7.l
    public final int b(y7.m mVar, y7.p pVar) {
        n9.x xVar = this.f19202b;
        int read = mVar.read(xVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.G(0);
        xVar.F(read);
        boolean z10 = this.f19203c;
        b bVar = this.a;
        if (!z10) {
            bVar.b(4, 0L);
            this.f19203c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        y7.h hVar;
        boolean z10;
        int u;
        n9.x xVar = new n9.x(10);
        int i10 = 0;
        while (true) {
            hVar = (y7.h) mVar;
            hVar.peekFully(xVar.a, 0, 10, false);
            xVar.G(0);
            if (xVar.x() != 4801587) {
                break;
            }
            xVar.H(3);
            int u4 = xVar.u();
            i10 += u4 + 10;
            hVar.advancePeekPosition(u4, false);
        }
        hVar.f27984f = 0;
        hVar.advancePeekPosition(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            hVar.peekFully(xVar.a, 0, 6, false);
            xVar.G(0);
            if (xVar.A() != 2935) {
                hVar.f27984f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 6) {
                    u = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        u = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                    } else {
                        byte b3 = bArr[4];
                        u = a6.k.u((b3 & 192) >> 6, b3 & 63);
                    }
                }
                if (u == -1) {
                    return false;
                }
                hVar.advancePeekPosition(u - 6, false);
            }
        }
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f19203c = false;
        this.a.seek();
    }
}
