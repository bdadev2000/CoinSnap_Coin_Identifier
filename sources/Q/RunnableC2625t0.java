package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: q.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2625t0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC2627u0 f22727c;

    public /* synthetic */ RunnableC2625t0(AbstractViewOnTouchListenerC2627u0 abstractViewOnTouchListenerC2627u0, int i9) {
        this.b = i9;
        this.f22727c = abstractViewOnTouchListenerC2627u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ViewParent parent = this.f22727c.f22731f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC2627u0 abstractViewOnTouchListenerC2627u0 = this.f22727c;
                abstractViewOnTouchListenerC2627u0.a();
                View view = abstractViewOnTouchListenerC2627u0.f22731f;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2627u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC2627u0.f22734i = true;
                    return;
                }
                return;
        }
    }
}
