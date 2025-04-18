package pe;

/* loaded from: classes4.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f23628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f23629d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f23630f;

    public /* synthetic */ i(j jVar, f fVar, Runnable runnable, int i10) {
        this.f23627b = i10;
        this.f23630f = jVar;
        this.f23628c = fVar;
        this.f23629d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        int i10 = this.f23627b;
        Runnable runnable = this.f23629d;
        f fVar = this.f23628c;
        j jVar = this.f23630f;
        switch (i10) {
            case 0:
                if (jVar.f23631f.f23619b < fVar.f23619b) {
                    z10 = false;
                }
                if (z10) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (jVar.f23631f.f23619b < fVar.f23619b) {
                    z10 = false;
                }
                if (z10) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
