package androidx.emoji2.text;

/* loaded from: classes.dex */
public final class f extends com.facebook.appevents.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1498c;

    public f(g gVar) {
        this.f1498c = gVar;
    }

    @Override // com.facebook.appevents.i
    public final void c(Throwable th2) {
        ((l) this.f1498c.f26021c).d(th2);
    }

    @Override // com.facebook.appevents.i
    public final void d(s2.h hVar) {
        g gVar = this.f1498c;
        gVar.f1500f = hVar;
        s2.h hVar2 = gVar.f1500f;
        ka.e eVar = new ka.e();
        Object obj = gVar.f26021c;
        e eVar2 = ((l) obj).f1511h;
        ((l) obj).getClass();
        gVar.f1499d = new t(hVar2, eVar, eVar2);
        ((l) gVar.f26021c).e();
    }
}
