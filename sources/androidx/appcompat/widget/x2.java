package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class x2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f1080c;

    public /* synthetic */ x2(SearchView searchView, int i10) {
        this.f1079b = i10;
        this.f1080c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1079b;
        SearchView searchView = this.f1080c;
        switch (i10) {
            case 0:
                searchView.u();
                return;
            default:
                u0.b bVar = searchView.Q;
                if (bVar instanceof o3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
