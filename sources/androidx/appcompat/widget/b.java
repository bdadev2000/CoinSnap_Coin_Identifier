package androidx.appcompat.widget;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1299b;

    public /* synthetic */ b(Toolbar toolbar, int i2) {
        this.f1298a = i2;
        this.f1299b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1298a;
        Toolbar toolbar = this.f1299b;
        switch (i2) {
            case 0:
                toolbar.invalidateMenu();
                return;
            default:
                toolbar.collapseActionView();
                return;
        }
    }
}
