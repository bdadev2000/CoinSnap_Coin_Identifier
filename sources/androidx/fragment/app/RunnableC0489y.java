package androidx.fragment.app;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0489y implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f4804c;

    public /* synthetic */ RunnableC0489y(int i9, Fragment fragment) {
        this.b = i9;
        this.f4804c = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f4804c.startPostponedEnterTransition();
                return;
            default:
                this.f4804c.callStartTransitionListener(false);
                return;
        }
    }
}
