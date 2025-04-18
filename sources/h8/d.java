package h8;

import java.util.Arrays;
import kotlin.UByte;
import n9.x;
import s7.r0;
import y7.s;

/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: n, reason: collision with root package name */
    public s f18884n;

    /* renamed from: o, reason: collision with root package name */
    public c f18885o;

    @Override // h8.j
    public final long b(x xVar) {
        boolean z10;
        byte[] bArr = xVar.a;
        if (bArr[0] == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return -1L;
        }
        int i10 = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i10 == 6 || i10 == 7) {
            xVar.H(4);
            xVar.B();
        }
        int Q = com.bumptech.glide.c.Q(i10, xVar);
        xVar.G(0);
        return Q;
    }

    @Override // h8.j
    public final boolean c(x xVar, long j3, r4.c cVar) {
        boolean z10;
        byte[] bArr = xVar.a;
        s sVar = this.f18884n;
        if (sVar == null) {
            s sVar2 = new s(bArr, 17);
            this.f18884n = sVar2;
            cVar.f23999c = sVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f22600c), null);
            return true;
        }
        byte b3 = bArr[0];
        if ((b3 & Byte.MAX_VALUE) == 3) {
            r4.c y4 = c6.c.y(xVar);
            s sVar3 = new s(sVar.a, sVar.f27994b, sVar.f27995c, sVar.f27996d, sVar.f27997e, sVar.f27999g, sVar.f28000h, sVar.f28002j, y4, sVar.f28004l);
            this.f18884n = sVar3;
            this.f18885o = new c(sVar3, y4);
            return true;
        }
        if (b3 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        c cVar2 = this.f18885o;
        if (cVar2 != null) {
            cVar2.f18882d = j3;
            cVar.f24000d = cVar2;
        }
        ((r0) cVar.f23999c).getClass();
        return false;
    }

    @Override // h8.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f18884n = null;
            this.f18885o = null;
        }
    }
}
