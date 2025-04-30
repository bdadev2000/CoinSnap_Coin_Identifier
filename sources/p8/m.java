package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class m implements F7.a {
    public final w b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f22426c;

    public m(s sVar, w wVar) {
        G7.j.e(sVar, "this$0");
        this.f22426c = sVar;
        this.b = wVar;
    }

    @Override // F7.a
    public final Object invoke() {
        EnumC2574b enumC2574b;
        s sVar = this.f22426c;
        w wVar = this.b;
        EnumC2574b enumC2574b2 = EnumC2574b.INTERNAL_ERROR;
        IOException e4 = null;
        try {
            wVar.b(this);
            do {
            } while (wVar.a(false, this));
            enumC2574b = EnumC2574b.NO_ERROR;
        } catch (IOException e9) {
            e4 = e9;
            enumC2574b = enumC2574b2;
        } catch (Throwable th) {
            th = th;
            enumC2574b = enumC2574b2;
            sVar.a(enumC2574b, enumC2574b2, e4);
            j8.b.c(wVar);
            throw th;
        }
        try {
            try {
                sVar.a(enumC2574b, EnumC2574b.CANCEL, null);
            } catch (Throwable th2) {
                th = th2;
                sVar.a(enumC2574b, enumC2574b2, e4);
                j8.b.c(wVar);
                throw th;
            }
        } catch (IOException e10) {
            e4 = e10;
            EnumC2574b enumC2574b3 = EnumC2574b.PROTOCOL_ERROR;
            sVar.a(enumC2574b3, enumC2574b3, e4);
            j8.b.c(wVar);
            return t7.y.f23029a;
        }
        j8.b.c(wVar);
        return t7.y.f23029a;
    }
}
