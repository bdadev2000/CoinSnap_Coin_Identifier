package he;

/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f19046c;

    public /* synthetic */ h(s sVar, int i10) {
        this.f19045b = i10;
        this.f19046c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19045b;
        s sVar = this.f19046c;
        switch (i10) {
            case 0:
                sVar.m0();
                return;
            case 1:
                sVar.o();
                return;
            default:
                s.V(sVar);
                return;
        }
    }
}
