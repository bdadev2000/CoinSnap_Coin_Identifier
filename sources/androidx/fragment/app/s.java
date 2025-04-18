package androidx.fragment.app;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1714c;

    public /* synthetic */ s(int i10, Fragment fragment) {
        this.f1713b = i10;
        this.f1714c = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1713b;
        Fragment fragment = this.f1714c;
        switch (i10) {
            case 0:
                fragment.startPostponedEnterTransition();
                return;
            default:
                fragment.callStartTransitionListener(false);
                return;
        }
    }
}
