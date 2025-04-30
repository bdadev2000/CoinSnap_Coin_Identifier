package U3;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import h5.ViewTreeObserverOnDrawListenerC2321b;
import p.ViewOnKeyListenerC2520C;
import p.ViewOnKeyListenerC2527f;

/* loaded from: classes2.dex */
public final class n implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3168c;

    public /* synthetic */ n(Object obj, int i9) {
        this.b = i9;
        this.f3168c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.b) {
            case 0:
                o oVar = (o) this.f3168c;
                if (oVar.f3186w != null && (accessibilityManager = oVar.f3185v) != null && ViewCompat.isAttachedToWindow(oVar)) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new U.b(oVar.f3186w));
                    return;
                }
                return;
            case 1:
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserverOnDrawListenerC2321b) this.f3168c);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.b) {
            case 0:
                o oVar = (o) this.f3168c;
                F2.d dVar = oVar.f3186w;
                if (dVar != null && (accessibilityManager = oVar.f3185v) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new U.b(dVar));
                    return;
                }
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ViewOnKeyListenerC2527f viewOnKeyListenerC2527f = (ViewOnKeyListenerC2527f) this.f3168c;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2527f.f22066A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2527f.f22066A = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2527f.f22066A.removeGlobalOnLayoutListener(viewOnKeyListenerC2527f.l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC2520C viewOnKeyListenerC2520C = (ViewOnKeyListenerC2520C) this.f3168c;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2520C.f22042r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2520C.f22042r = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2520C.f22042r.removeGlobalOnLayoutListener(viewOnKeyListenerC2520C.l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
