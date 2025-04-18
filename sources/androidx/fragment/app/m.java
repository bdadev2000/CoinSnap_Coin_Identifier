package androidx.fragment.app;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1685c;

    public /* synthetic */ m(Object obj, int i10) {
        this.f1684b = i10;
        this.f1685c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1684b;
        Object obj = this.f1685c;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                r.access$100(rVar).onDismiss(r.access$000(rVar));
                return;
            default:
                ((FragmentManager) obj).execPendingActions(true);
                return;
        }
    }
}
