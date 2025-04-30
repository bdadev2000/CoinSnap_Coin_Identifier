package z2;

import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {
    public final A2.c b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f24525c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f24526d;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnTouchListener f24527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24528g = true;

    public h(A2.c cVar, View view, View view2) {
        this.b = cVar;
        this.f24525c = new WeakReference(view2);
        this.f24526d = new WeakReference(view);
        this.f24527f = A2.g.f(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        G7.j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        G7.j.e(motionEvent, "motionEvent");
        View view2 = (View) this.f24526d.get();
        View view3 = (View) this.f24525c.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.c(this.b, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f24527f;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
