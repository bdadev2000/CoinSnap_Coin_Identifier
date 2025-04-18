package ei;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class l extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17434g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, t tVar, int i10, int i11) {
        super(str, true);
        this.f17432e = tVar;
        this.f17433f = i10;
        this.f17434g = i11;
    }

    @Override // ai.a
    public final long a() {
        int i10 = this.f17433f;
        int i11 = this.f17434g;
        t tVar = this.f17432e;
        tVar.getClass();
        try {
            tVar.A.p(true, i10, i11);
            return -1L;
        } catch (IOException e2) {
            tVar.g(e2);
            return -1L;
        }
    }
}
