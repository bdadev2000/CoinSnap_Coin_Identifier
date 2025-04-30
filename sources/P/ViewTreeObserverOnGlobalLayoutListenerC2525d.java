package p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import q.L;
import q.O;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2525d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22063c;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2525d(Object obj, int i9) {
        this.b = i9;
        this.f22063c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                ViewOnKeyListenerC2527f viewOnKeyListenerC2527f = (ViewOnKeyListenerC2527f) this.f22063c;
                if (viewOnKeyListenerC2527f.a()) {
                    ArrayList arrayList = viewOnKeyListenerC2527f.f22076k;
                    if (arrayList.size() > 0 && !((C2526e) arrayList.get(0)).f22064a.f22514A) {
                        View view = viewOnKeyListenerC2527f.f22081r;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C2526e) it.next()).f22064a.show();
                            }
                            return;
                        }
                        viewOnKeyListenerC2527f.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC2520C viewOnKeyListenerC2520C = (ViewOnKeyListenerC2520C) this.f22063c;
                if (viewOnKeyListenerC2520C.a() && !viewOnKeyListenerC2520C.f22037k.f22514A) {
                    View view2 = viewOnKeyListenerC2520C.f22040p;
                    if (view2 != null && view2.isShown()) {
                        viewOnKeyListenerC2520C.f22037k.show();
                        return;
                    } else {
                        viewOnKeyListenerC2520C.dismiss();
                        return;
                    }
                }
                return;
            case 2:
                O o3 = (O) this.f22063c;
                if (!o3.getInternalPopup().a()) {
                    o3.f22578h.l(o3.getTextDirection(), o3.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o3.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                L l = (L) this.f22063c;
                O o9 = l.f22565I;
                l.getClass();
                if (o9.isAttachedToWindow() && o9.getGlobalVisibleRect(l.f22563G)) {
                    l.r();
                    l.show();
                    return;
                } else {
                    l.dismiss();
                    return;
                }
        }
    }
}
