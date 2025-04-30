package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class p extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f22436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC2574b f22438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, s sVar, int i9, EnumC2574b enumC2574b, int i10) {
        super(str, true);
        this.f22435e = i10;
        this.f22436f = sVar;
        this.f22437g = i9;
        this.f22438h = enumC2574b;
    }

    @Override // l8.a
    public final long a() {
        switch (this.f22435e) {
            case 0:
                C c9 = this.f22436f.f22456n;
                EnumC2574b enumC2574b = this.f22438h;
                c9.getClass();
                G7.j.e(enumC2574b, "errorCode");
                synchronized (this.f22436f) {
                    this.f22436f.f22447C.remove(Integer.valueOf(this.f22437g));
                }
                return -1L;
            default:
                s sVar = this.f22436f;
                try {
                    int i9 = this.f22437g;
                    EnumC2574b enumC2574b2 = this.f22438h;
                    sVar.getClass();
                    G7.j.e(enumC2574b2, "statusCode");
                    sVar.f22445A.j(i9, enumC2574b2);
                    return -1L;
                } catch (IOException e4) {
                    sVar.b(e4);
                    return -1L;
                }
        }
    }
}
