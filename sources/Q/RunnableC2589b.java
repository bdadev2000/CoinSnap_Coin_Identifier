package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2589b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f22626c;

    public /* synthetic */ RunnableC2589b(ActionBarOverlayLayout actionBarOverlayLayout, int i9) {
        this.b = i9;
        this.f22626c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f22626c;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4193y = actionBarOverlayLayout.f4176f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4194z);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f22626c;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4193y = actionBarOverlayLayout2.f4176f.animate().translationY(-actionBarOverlayLayout2.f4176f.getHeight()).setListener(actionBarOverlayLayout2.f4194z);
                return;
        }
    }
}
