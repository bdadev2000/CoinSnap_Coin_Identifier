package ei;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class s extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f17455g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t tVar, int i10, long j3) {
        super(str, true);
        this.f17453e = tVar;
        this.f17454f = i10;
        this.f17455g = j3;
    }

    @Override // ai.a
    public final long a() {
        t tVar = this.f17453e;
        try {
            tVar.A.r(this.f17454f, this.f17455g);
            return -1L;
        } catch (IOException e2) {
            tVar.g(e2);
            return -1L;
        }
    }
}
