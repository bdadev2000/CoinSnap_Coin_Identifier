package d8;

import y7.a0;
import y7.n;
import y7.x;

/* loaded from: classes3.dex */
public final class e implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f16913b;

    /* renamed from: c, reason: collision with root package name */
    public final n f16914c;

    public e(long j3, n nVar) {
        this.f16913b = j3;
        this.f16914c = nVar;
    }

    @Override // y7.n
    public final void d(x xVar) {
        this.f16914c.d(new d(this, xVar));
    }

    @Override // y7.n
    public final void endTracks() {
        this.f16914c.endTracks();
    }

    @Override // y7.n
    public final a0 track(int i10, int i11) {
        return this.f16914c.track(i10, i11);
    }
}
