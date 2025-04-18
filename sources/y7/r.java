package y7;

import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public class r implements x {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27992b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27993c;

    public /* synthetic */ r(Object obj, long j3, int i10) {
        this.a = i10;
        this.f27993c = obj;
        this.f27992b = j3;
    }

    @Override // y7.x
    public final long getDurationUs() {
        switch (this.a) {
            case 0:
                return ((s) this.f27993c).b();
            default:
                return this.f27992b;
        }
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        long j10;
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.f27993c;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                u0.p(sVar.f28003k);
                r4.c cVar = sVar.f28003k;
                long[] jArr = (long[]) cVar.f23999c;
                long[] jArr2 = (long[]) cVar.f24000d;
                int f10 = h0.f(jArr, h0.i((sVar.f27997e * j3) / 1000000, 0L, sVar.f28002j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                long j12 = (j10 * 1000000) / ((s) obj).f27997e;
                long j13 = this.f27992b;
                y yVar = new y(j12, j11 + j13);
                if (j12 != j3 && f10 != jArr.length - 1) {
                    int i12 = f10 + 1;
                    return new w(yVar, new y((jArr[i12] * 1000000) / ((s) obj).f27997e, j13 + jArr2[i12]));
                }
                return new w(yVar, yVar);
            case 1:
                return (w) obj;
            default:
                a8.c cVar2 = (a8.c) obj;
                w b3 = cVar2.f317g[0].b(j3);
                while (true) {
                    a8.f[] fVarArr = cVar2.f317g;
                    if (i11 < fVarArr.length) {
                        w b10 = fVarArr[i11].b(j3);
                        if (b10.a.f28013b < b3.a.f28013b) {
                            b3 = b10;
                        }
                        i11++;
                    } else {
                        return b3;
                    }
                }
        }
    }

    @Override // y7.x
    public final boolean isSeekable() {
        switch (this.a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(long j3) {
        this(j3, 0L);
        this.a = 1;
    }

    public r(long j3, long j10) {
        this.a = 1;
        this.f27992b = j3;
        y yVar = j10 == 0 ? y.f28012c : new y(0L, j10);
        this.f27993c = new w(yVar, yVar);
    }
}
