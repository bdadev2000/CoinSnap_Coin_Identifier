package q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p.ViewTreeObserverOnGlobalLayoutListenerC2525d;

/* loaded from: classes.dex */
public final class K implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f22560c;

    public K(L l, ViewTreeObserverOnGlobalLayoutListenerC2525d viewTreeObserverOnGlobalLayoutListenerC2525d) {
        this.f22560c = l;
        this.b = viewTreeObserverOnGlobalLayoutListenerC2525d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f22560c.f22565I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.b);
        }
    }
}
