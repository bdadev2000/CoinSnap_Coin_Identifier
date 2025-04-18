package z8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import n9.w;
import s7.r0;

/* loaded from: classes3.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final w f28649j;

    /* renamed from: k, reason: collision with root package name */
    public final w f28650k;

    /* renamed from: l, reason: collision with root package name */
    public final long f28651l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, w wVar, w wVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f28649j = wVar;
        this.f28650k = wVar2;
        this.f28651l = j12;
    }

    @Override // z8.s
    public final j a(m mVar) {
        w wVar = this.f28649j;
        if (wVar != null) {
            r0 r0Var = mVar.f28635b;
            return new j(wVar.b(r0Var.f24719j, r0Var.f24712b, 0L, 0L), 0L, -1L);
        }
        return this.a;
    }

    @Override // z8.n
    public final long d(long j3) {
        if (this.f28644f != null) {
            return r0.size();
        }
        long j10 = this.f28651l;
        if (j10 != -1) {
            return (j10 - this.f28642d) + 1;
        }
        if (j3 == C.TIME_UNSET) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f28655b));
        BigInteger multiply2 = BigInteger.valueOf(this.f28643e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = sa.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // z8.n
    public final j h(long j3, m mVar) {
        long j10;
        long j11 = this.f28642d;
        List list = this.f28644f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).a;
        } else {
            j10 = (j3 - j11) * this.f28643e;
        }
        long j12 = j10;
        w wVar = this.f28650k;
        r0 r0Var = mVar.f28635b;
        return new j(wVar.b(r0Var.f24719j, r0Var.f24712b, j3, j12), 0L, -1L);
    }
}
