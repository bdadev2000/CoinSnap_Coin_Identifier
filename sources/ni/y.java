package ni;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class y extends ki.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f22896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ki.k kVar) {
        super(kVar);
        this.f22896b = zVar;
    }

    @Override // ki.q, ki.k0
    public final long read(ki.i iVar, long j3) {
        try {
            return super.read(iVar, j3);
        } catch (IOException e2) {
            this.f22896b.f22902d = e2;
            throw e2;
        }
    }
}
