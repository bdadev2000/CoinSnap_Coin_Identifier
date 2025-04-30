package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class k extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f22420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, s sVar, int i9, int i10) {
        super(str, true);
        this.f22420e = sVar;
        this.f22421f = i9;
        this.f22422g = i10;
    }

    @Override // l8.a
    public final long a() {
        int i9 = this.f22421f;
        int i10 = this.f22422g;
        s sVar = this.f22420e;
        sVar.getClass();
        try {
            sVar.f22445A.i(true, i9, i10);
            return -1L;
        } catch (IOException e4) {
            sVar.b(e4);
            return -1L;
        }
    }
}
