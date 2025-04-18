package jb;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f19922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.l f19923d;

    public /* synthetic */ n(q qVar, m2.l lVar, int i10) {
        this.f19921b = i10;
        this.f19922c = qVar;
        this.f19923d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19921b;
        m2.l lVar = this.f19923d;
        q qVar = this.f19922c;
        switch (i10) {
            case 0:
                qVar.a(lVar);
                return;
            default:
                qVar.a(lVar);
                return;
        }
    }
}
