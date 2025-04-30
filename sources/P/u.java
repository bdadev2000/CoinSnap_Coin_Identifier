package p;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v b;

    public u(v vVar) {
        this.b = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.b.c();
    }
}
