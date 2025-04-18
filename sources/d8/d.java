package d8;

import y7.w;
import y7.x;
import y7.y;

/* loaded from: classes3.dex */
public final class d implements x {
    public final /* synthetic */ x a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16912b;

    public d(e eVar, x xVar) {
        this.f16912b = eVar;
        this.a = xVar;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        w seekPoints = this.a.getSeekPoints(j3);
        y yVar = seekPoints.a;
        long j10 = yVar.a;
        long j11 = yVar.f28013b;
        long j12 = this.f16912b.f16913b;
        y yVar2 = new y(j10, j11 + j12);
        y yVar3 = seekPoints.f28011b;
        return new w(yVar2, new y(yVar3.a, yVar3.f28013b + j12));
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }
}
