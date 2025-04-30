package q;

/* renamed from: q.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2637z0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0 f22745c;

    public /* synthetic */ RunnableC2637z0(C0 c02, int i9) {
        this.b = i9;
        this.f22745c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C2621r0 c2621r0 = this.f22745c.f22517d;
                if (c2621r0 != null) {
                    c2621r0.setListSelectionHidden(true);
                    c2621r0.requestLayout();
                    return;
                }
                return;
            default:
                C0 c02 = this.f22745c;
                C2621r0 c2621r02 = c02.f22517d;
                if (c2621r02 != null && c2621r02.isAttachedToWindow() && c02.f22517d.getCount() > c02.f22517d.getChildCount() && c02.f22517d.getChildCount() <= c02.f22525o) {
                    c02.f22515B.setInputMethodMode(2);
                    c02.show();
                    return;
                }
                return;
        }
    }
}
