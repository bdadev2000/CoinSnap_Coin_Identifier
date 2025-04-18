package k;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f20183b;

    public y(a0 a0Var) {
        this.f20183b = a0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f20183b.c();
    }
}
