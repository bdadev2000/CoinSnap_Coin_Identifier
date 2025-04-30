package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class j extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f22418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, s sVar, Object obj, int i9) {
        super(str, true);
        this.f22417e = i9;
        this.f22418f = sVar;
        this.f22419g = obj;
    }

    @Override // l8.a
    public final long a() {
        switch (this.f22417e) {
            case 0:
                s sVar = this.f22418f;
                sVar.f22448c.a(sVar, (D) ((G7.r) this.f22419g).b);
                return -1L;
            default:
                try {
                    this.f22418f.f22448c.b((z) this.f22419g);
                } catch (IOException e4) {
                    r8.m mVar = r8.m.f22950a;
                    r8.m mVar2 = r8.m.f22950a;
                    String j7 = G7.j.j(this.f22418f.f22450f, "Http2Connection.Listener failure for ");
                    mVar2.getClass();
                    r8.m.i(4, j7, e4);
                    try {
                        ((z) this.f22419g).c(EnumC2574b.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}
