package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1040c;

    public /* synthetic */ t3(Toolbar toolbar, int i10) {
        this.f1039b = i10;
        this.f1040c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.q qVar;
        int i10 = this.f1039b;
        Toolbar toolbar = this.f1040c;
        switch (i10) {
            case 0:
                toolbar.l();
                return;
            default:
                v3 v3Var = toolbar.N;
                if (v3Var == null) {
                    qVar = null;
                } else {
                    qVar = v3Var.f1064c;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
