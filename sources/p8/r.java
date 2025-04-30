package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class r extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f22441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, s sVar, int i9, long j7) {
        super(str, true);
        this.f22441e = sVar;
        this.f22442f = i9;
        this.f22443g = j7;
    }

    @Override // l8.a
    public final long a() {
        s sVar = this.f22441e;
        try {
            sVar.f22445A.k(this.f22442f, this.f22443g);
            return -1L;
        } catch (IOException e4) {
            sVar.b(e4);
            return -1L;
        }
    }
}
