package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f858c;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f857b = i10;
        this.f858c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f857b;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f858c;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f712y = actionBarOverlayLayout.f694f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f713z);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f712y = actionBarOverlayLayout.f694f.animate().translationY(-actionBarOverlayLayout.f694f.getHeight()).setListener(actionBarOverlayLayout.f713z);
                return;
        }
    }
}
