package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class c implements y7.l {
    public final d a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19225b = new n9.x(JsonLexerKt.BATCH_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f19226c;

    @Override // y7.l
    public final void a(y7.n nVar) {
        this.a.c(nVar, new h0(0, 1));
        nVar.endTracks();
        nVar.d(new y7.r(C.TIME_UNSET));
    }

    @Override // y7.l
    public final int b(y7.m mVar, y7.p pVar) {
        n9.x xVar = this.f19225b;
        int read = mVar.read(xVar.a, 0, JsonLexerKt.BATCH_SIZE);
        if (read == -1) {
            return -1;
        }
        xVar.G(0);
        xVar.F(read);
        boolean z10 = this.f19226c;
        d dVar = this.a;
        if (!z10) {
            dVar.b(4, 0L);
            this.f19226c = true;
        }
        dVar.a(xVar);
        return 0;
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        y7.h hVar;
        int i10;
        n9.x xVar = new n9.x(10);
        int i11 = 0;
        while (true) {
            hVar = (y7.h) mVar;
            hVar.peekFully(xVar.a, 0, 10, false);
            xVar.G(0);
            if (xVar.x() != 4801587) {
                break;
            }
            xVar.H(3);
            int u = xVar.u();
            i11 += u + 10;
            hVar.advancePeekPosition(u, false);
        }
        hVar.f27984f = 0;
        hVar.advancePeekPosition(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            hVar.peekFully(xVar.a, 0, 7, false);
            xVar.G(0);
            int A = xVar.A();
            if (A != 44096 && A != 44097) {
                hVar.f27984f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                hVar.advancePeekPosition(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
                    } else {
                        i14 = 4;
                    }
                    if (A == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                hVar.advancePeekPosition(i10 - 7, false);
            }
        }
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f19226c = false;
        this.a.seek();
    }
}
