package jb;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f19925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19926d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19927f;

    public /* synthetic */ p(q qVar, long j3, String str, int i10) {
        this.f19924b = i10;
        this.f19925c = qVar;
        this.f19926d = j3;
        this.f19927f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f19924b;
        q qVar = this.f19925c;
        switch (i10) {
            case 0:
                qVar.f19941o.f20634b.a(new p(qVar, this.f19926d, this.f19927f, 1));
                return;
            default:
                m mVar = qVar.f19933g;
                s sVar = mVar.f19917n;
                if (sVar != null && sVar.f19951e.get()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    mVar.f19912i.f21306b.h(this.f19926d, this.f19927f);
                    return;
                }
                return;
        }
    }
}
