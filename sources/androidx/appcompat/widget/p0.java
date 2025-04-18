package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class p0 implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f989c;

    public p0(q0 q0Var, k.e eVar) {
        this.f989c = q0Var;
        this.f988b = eVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f989c.I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f988b);
        }
    }
}
