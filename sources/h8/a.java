package h8;

import java.math.BigInteger;
import n9.h0;
import y7.w;
import y7.x;
import y7.y;

/* loaded from: classes3.dex */
public final class a implements x {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return (this.a.f18873h * 1000000) / r0.f18871f.f18908i;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        b bVar = this.a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f18871f.f18908i * j3) / 1000000);
        long j10 = bVar.f18870d;
        long j11 = bVar.f18869c;
        y yVar = new y(j3, h0.i((valueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(bVar.f18873h)).longValue() + j11) - 30000, bVar.f18869c, j10 - 1));
        return new w(yVar, yVar);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
