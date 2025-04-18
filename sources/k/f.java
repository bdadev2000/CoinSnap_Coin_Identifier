package k;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20059c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f20058b = i10;
        this.f20059c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f20058b) {
            case 0:
            case 1:
                return;
            default:
                na.m mVar = (na.m) this.f20059c;
                int i10 = na.m.f22634y;
                if (mVar.f22654w != null && (accessibilityManager = mVar.f22653v) != null && mVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new o0.b(mVar.f22654w));
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i10 = this.f20058b;
        Object obj = this.f20059c;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.A = view.getViewTreeObserver();
                    }
                    iVar.A.removeGlobalOnLayoutListener(iVar.f20095l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                h0 h0Var = (h0) obj;
                ViewTreeObserver viewTreeObserver2 = h0Var.f20082r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h0Var.f20082r = view.getViewTreeObserver();
                    }
                    h0Var.f20082r.removeGlobalOnLayoutListener(h0Var.f20076l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                na.m mVar = (na.m) obj;
                int i11 = na.m.f22634y;
                androidx.core.app.h hVar = mVar.f22654w;
                if (hVar != null && (accessibilityManager = mVar.f22653v) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new o0.b(hVar));
                    return;
                }
                return;
        }
    }
}
